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
import com.example.instrumentapplication.activity.MainActivity;
import com.example.instrumentapplication.databinding.ListItemBinding;
import com.example.instrumentapplication.model.InnerInstruments;
import com.example.instrumentapplication.model.InnerPrices;
import com.example.instrumentapplication.model.Instruments;
import com.example.instrumentapplication.model.MainDataResponseModel;


import java.util.ArrayList;
import java.util.List;

public class InstrumentRecyclerViewAdapter extends RecyclerView.Adapter<InstrumentRecyclerViewAdapter.MyViewHolder> {


    private List<InnerInstruments> innerinstrumentsList;
    private List<InnerPrices> innerPricesList;
    private Context mContext;
    private static final String TAG = "InstrumentRecyclerViewAdapter";
    private ListItemBinding binding;

    @SuppressLint("LongLogTag")
    public InstrumentRecyclerViewAdapter(Context context, List<InnerInstruments> innerinstrumentsList) {
        this.mContext = context;
        this.innerinstrumentsList = innerinstrumentsList;
        //this.innerPricesList=innerPricesArrayList;
        Log.d(TAG, "innerinstrumentsList-->" + innerinstrumentsList.toString());


    }


    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public ListItemBinding itemBinding;

        private MyViewHolder(ListItemBinding listItemBinding) {
            super(listItemBinding.getRoot());
            this.itemBinding = listItemBinding;

        }
    }

    @Override
    public InstrumentRecyclerViewAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.list_item, parent, false);
        return new MyViewHolder(binding);
    }

    @SuppressLint("LongLogTag")
    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
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

                    mAdapterCallBackListener.onItemClick(innerinstrumentsList.get(position));
                }
            });



            holder.itemBinding.setInnerInstrument(innerInstruments);

        } catch (Exception e) {
        }
    }

    @Override
    public int getItemCount() {
        return innerinstrumentsList.size();
    }

    AdapterCallBack mAdapterCallBackListener;

    public interface AdapterCallBack {
        void onItemClick(InnerInstruments stores);
    }

    public void setmAdapterCallBackListener(AdapterCallBack mAdapterCallBackListener) {
        this.mAdapterCallBackListener = mAdapterCallBackListener;
    }
}
