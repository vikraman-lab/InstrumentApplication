package com.example.instrumentapplication.APIinterface;

import com.example.instrumentapplication.model.MainDataResponseModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    String BASE_URL = "https://data-fix.smt-data.com/fixprof/instruments/";

    @GET("prices")
    Call<MainDataResponseModel> getMainDataResponse();



    @GET("prices")
    Call<String> getMainDataResponseString();





}
