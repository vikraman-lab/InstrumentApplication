package com.example.instrumentapplication.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MainDataResponseModel implements Parcelable {
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("_ip")
    @Expose
    private String ip;
    @SerializedName("_ips")
    @Expose
    private List<String> ips = null;
    @SerializedName("instruments")
    @Expose
    private Instruments instruments;
    @SerializedName("prices")
    @Expose
    private Prices prices;

    protected MainDataResponseModel(Parcel in) {
        status = in.readString();
        ip = in.readString();
        ips = in.createStringArrayList();
        instruments = in.readParcelable(Instruments.class.getClassLoader());
        prices = in.readParcelable(Prices.class.getClassLoader());
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(status);
        dest.writeString(ip);
        dest.writeStringList(ips);
        dest.writeParcelable(instruments, flags);
        dest.writeParcelable(prices, flags);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<MainDataResponseModel> CREATOR = new Creator<MainDataResponseModel>() {
        @Override
        public MainDataResponseModel createFromParcel(Parcel in) {
            return new MainDataResponseModel(in);
        }

        @Override
        public MainDataResponseModel[] newArray(int size) {
            return new MainDataResponseModel[size];
        }
    };

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public List<String> getIps() {
        return ips;
    }

    public void setIps(List<String> ips) {
        this.ips = ips;
    }

    public Instruments getInstruments() {
        return instruments;
    }

    public void setInstruments(Instruments instruments) {
        this.instruments = instruments;
    }

    public Prices getPrices() {
        return prices;
    }

    public void setPrices(Prices prices) {
        this.prices = prices;
    }

}

