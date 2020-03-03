package com.example.instrumentapplication.activity;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.icu.text.Edits;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instrumentapplication.APIinterface.Api;
import com.example.instrumentapplication.R;
import com.example.instrumentapplication.adapter.InstrumentRecyclerViewAdapter;
import com.example.instrumentapplication.adapter.PopUpFilteradapter;
import com.example.instrumentapplication.databinding.ActivityMainBinding;
import com.example.instrumentapplication.databinding.PopWindowBinding;
import com.example.instrumentapplication.model.InnerInstruments;
import com.example.instrumentapplication.model.InnerPrices;
import com.example.instrumentapplication.model.Instruments;
import com.example.instrumentapplication.model.MainDataResponseModel;
import com.example.instrumentapplication.model.Prices;
import com.google.android.material.button.MaterialButton;
import com.google.gson.JsonArray;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.security.PrivilegedExceptionAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivityPresenter implements InstrumentRecyclerViewAdapter.AdapterCallBack, PopUpFilteradapter.OnItemCheckListener {
    private static final String TAG = "MainActivityPresenter";
    private MainActivity mActivity;
    private ActivityMainBinding mBinding;
    private List<InnerInstruments> innerInstrumentsList1 = new ArrayList<>();
    private PopupWindow popUp;
    private LinearLayout layout;
    private InstrumentRecyclerViewAdapter adapter;
    private PopUpFilteradapter popUpFilteradapter;


    public MainActivityPresenter(MainActivity mainActivity, ActivityMainBinding binding) {
        this.mActivity = mainActivity;
        this.mBinding = binding;
        callApiString();

        mBinding.liSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mActivity, "Sorted By Name", Toast.LENGTH_LONG).show();
                Collections.sort(innerInstrumentsList1, InnerInstruments.BY_NAME_WISE);
                adapter.notifyDataSetChanged();
            }
        });
        mBinding.liFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                createFilterDialog();
            }
        });
    }


    private void callApiString() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .addConverterFactory(ScalarsConverterFactory.create())
                .build();
        Api api = retrofit.create(Api.class);
        Call<String> stringModelCall = api.getMainDataResponseString();
        stringModelCall.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                Log.d(TAG, "responseModel-->" + response.body());
                if (response.isSuccessful()) {
                    if (response.body() != null) {
                        String jsonResponse = response.body();
                        accessJSON(jsonResponse);
                    }
                }
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                Log.d(TAG, "onFailure-->" + t.toString());
            }
        });
    }

    private void accessJSON(String respose) {
        try {


            List<InnerPrices> innerPricesArrayList = new ArrayList<>();
            JSONObject jsonObject = new JSONObject(respose);
            JSONArray jsonArray = null;
            JSONArray jsonArrayPrice = null;
            JSONObject instrument = jsonObject.getJSONObject("instruments");
            Iterator x = instrument.keys();
            while (x.hasNext()) {
                jsonArray = new JSONArray();
                String key = (String) x.next();
                jsonArray.put(instrument.get(key));
                for (int i = 0; i < jsonArray.length(); i++) {
                    InnerInstruments innerInstruments = new InnerInstruments();
                    innerInstruments.setId(String.valueOf(jsonArray.getJSONObject(i).get("id")));
                    innerInstruments.setName(String.valueOf(jsonArray.getJSONObject(i).get("name")));
                    innerInstruments.setSourceSymbol(String.valueOf(jsonArray.getJSONObject(i).get("source_symbol")));
                    innerInstruments.setCanonicalSymbol(String.valueOf(jsonArray.getJSONObject(i).get("canonical_symbol")));
                    innerInstruments.setAssetClass(String.valueOf(jsonArray.getJSONObject(i).get("assetClass")));
                    innerInstruments.setQuantityIncrement(String.valueOf(jsonArray.getJSONObject(i).get("quantityIncrement")));
                    innerInstruments.setPriceIncrement(String.valueOf(jsonArray.getJSONObject(i).get("priceIncrement")));
                    innerInstrumentsList1.add(innerInstruments);

                }
            }
            JSONObject jsonPriceObject = new JSONObject(respose);
            JSONObject prices = jsonPriceObject.getJSONObject("prices");
            Iterator xPrices = prices.keys();
            while (xPrices.hasNext()) {
                jsonArrayPrice = new JSONArray();
                String key = (String) xPrices.next();
                jsonArrayPrice.put(prices.get(key));
                Log.d(TAG, "jsonArrayPrice-->" + jsonArrayPrice.toString());
                Log.d(TAG, "bidbidbid-->" + jsonArrayPrice.getJSONObject(0).get("bid").toString());
                for (int i = 0; i < jsonArrayPrice.length(); i++) {
                    InnerPrices innerprices = new InnerPrices();
                    innerprices.setBid(Double.valueOf(String.valueOf(jsonArrayPrice.getJSONObject(i).get("bid"))));
                    innerprices.setAsk(Double.valueOf(String.valueOf(jsonArrayPrice.getJSONObject(i).get("ask"))));
                    innerPricesArrayList.add(innerprices);

                }

            }

            setAdapter(innerInstrumentsList1, innerPricesArrayList);
        } catch (JSONException e) {
            e.printStackTrace();
            Log.d(TAG, "JSONException-->" + e.toString());
        }

    }


    private void setAdapter(List<InnerInstruments> innerInstruments, List<InnerPrices> innerPricesArrayList) {

        for (int i = 0; i < innerInstruments.size(); i++) {
            for (int j = 0; j < innerPricesArrayList.size(); j++) {
                innerInstruments.get(j).setBid(innerPricesArrayList.get(j).getBid());
                innerInstruments.get(j).setAsk(innerPricesArrayList.get(j).getAsk());
            }
        }
        Collections.sort(innerInstruments, InnerInstruments.BY_ASSETCLASS_WISE);
        adapter = new InstrumentRecyclerViewAdapter(mActivity, innerInstruments);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(mActivity);
        mBinding.recyclerView.setLayoutManager(mLayoutManager);
        adapter.setmAdapterCallBackListener(this);
        mBinding.recyclerView.setAdapter(adapter);

    }

    @Override
    public void onItemClick(InnerInstruments innerInstruments) {

        LayoutInflater layoutInflater = (LayoutInflater) mActivity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View customView = layoutInflater.inflate(R.layout.pop_window, null);
        LinearLayout linearLayout1 = (LinearLayout) customView.findViewById(R.id.li_popup);
        Button button = (Button) customView.findViewById(R.id.btn_ok);
        TextView instrument_name = (TextView) customView.findViewById(R.id.instrument_name);
        TextView instrument_symbol = (TextView) customView.findViewById(R.id.instrument_symbol);
        TextView instrument_id = (TextView) customView.findViewById(R.id.instrument_id);
        TextView instrument_quantityincrement = (TextView) customView.findViewById(R.id.instrument_quantityincrement);
        TextView instrument_priceIncrement = (TextView) customView.findViewById(R.id.instrument_priceIncrement);
        TextView instrument_assetclass = (TextView) customView.findViewById(R.id.instrument_assetclass);
        instrument_name.setText(innerInstruments.getName());
        instrument_symbol.setText(innerInstruments.getCanonicalSymbol());
        instrument_id.setText(innerInstruments.getId());
        instrument_quantityincrement.setText(innerInstruments.getQuantityIncrement());
        instrument_assetclass.setText(innerInstruments.getAssetClass());
        instrument_priceIncrement.setText(innerInstruments.getPriceIncrement());

        //instantiate popup window
        popUp = new PopupWindow(customView, LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        popUp.setBackgroundDrawable(null);
        popUp.setFocusable(true);
        popUp.setOutsideTouchable(true);
        //display the popup window
        popUp.showAtLocation(linearLayout1, Gravity.CENTER, 0, 0);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popUp.dismiss();
            }
        });
    }

    private void createFilterDialog() {

        LayoutInflater layoutInflater = (LayoutInflater) mActivity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View customView = layoutInflater.inflate(R.layout.filter_pop_up, null);
        RelativeLayout relativeLayout = (RelativeLayout) customView.findViewById(R.id.li_filter);
        RecyclerView recyclerView = (RecyclerView) customView.findViewById(R.id.recycler_view_pop_up);
        Button close = (Button) customView.findViewById(R.id.btn_get);
        popUp = new PopupWindow(customView, LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        //popUp.setBackgroundDrawable(new ColorDrawable(0x7fff0000));
        popUp.setFocusable(true);
        popUp.setOutsideTouchable(true);
        //display the popup window
        popUp.showAtLocation(relativeLayout, Gravity.CENTER, 0, 0);
        popUpFilteradapter = new PopUpFilteradapter(mActivity, innerInstrumentsList1);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(mActivity);
        recyclerView.setLayoutManager(mLayoutManager);
        popUpFilteradapter.setOnItemCheckListener(this);
        recyclerView.setAdapter(popUpFilteradapter);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popUp.dismiss();
            }
        });


    }

    @Override
    public void onItemCheck(InnerInstruments item) {
        innerInstrumentsList1.clear();
        innerInstrumentsList1.add(item);

        adapter.notifyDataSetChanged();
    }

    @Override
    public void onItemUncheck(InnerInstruments item) {
        innerInstrumentsList1.clear();
        innerInstrumentsList1.add(item);
        adapter.notifyDataSetChanged();


    }
}
