package com.example.instrumentapplication.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instrumentapplication.R;
import com.example.instrumentapplication.activity.MainActivityPresenter;
import com.example.instrumentapplication.databinding.ListItemFilterBinding;
import com.example.instrumentapplication.model.InnerInstruments;

import java.util.List;

public class PopUpFilteradapter extends RecyclerView.Adapter<PopUpFilteradapter.MyViewHolder> {


    private List<InnerInstruments> innerinstrumentsList;
    private ListItemFilterBinding binding;
    private Context mContext;
    private static final String TAG = "InstrumentRecyclerViewAdapter";


    @SuppressLint("LongLogTag")
    public PopUpFilteradapter(Context context, List<InnerInstruments> innerinstrumentsList) {
        this.mContext = context;
        this.innerinstrumentsList = innerinstrumentsList;



    }




    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public ListItemFilterBinding itemBinding;

        private MyViewHolder(ListItemFilterBinding listItemBinding) {
            super(listItemBinding.getRoot());
            this.itemBinding = listItemBinding;

        }
    }

    @Override
    public PopUpFilteradapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.list_item_filter, parent, false);
        return new MyViewHolder(binding);
    }

    @SuppressLint("LongLogTag")
    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        try {


            final InnerInstruments innerInstruments = innerinstrumentsList.get(position);

            Log.d(TAG, "stores-->" + innerInstruments.toString());


            if (innerInstruments.getBid() != null && innerInstruments.getAsk() != null) {
                innerInstruments.setmBid(String.valueOf(innerInstruments.getBid()));
                innerInstruments.setmAsk(String.valueOf(innerInstruments.getAsk()));
            }else {
                innerInstruments.setmBid("");
                innerInstruments.setmAsk("");

            }
            holder.itemBinding.cardStoreContainer.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    holder.itemBinding.chbContent.setChecked(true);
                    if(holder.itemBinding.chbContent.isChecked()){
                        onItemCheckListener.onItemCheck(innerInstruments);
                    }else {
                        onItemCheckListener.onItemUncheck(innerInstruments);
                    }
                }
            });


            holder.itemBinding.setInnerInstrment(innerInstruments);

        } catch (Exception e) {
        }
    }

    @Override
    public int getItemCount() {
        return innerinstrumentsList.size();
    }



    OnItemCheckListener onItemCheckListener;
    public  interface OnItemCheckListener {
        void onItemCheck(InnerInstruments item);
        void onItemUncheck(InnerInstruments item);
    }

    public void setOnItemCheckListener(OnItemCheckListener onItemCheckListener) {
        this.onItemCheckListener = onItemCheckListener;
    }
}
