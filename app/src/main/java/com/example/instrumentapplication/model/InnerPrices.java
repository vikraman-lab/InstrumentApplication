package com.example.instrumentapplication.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class InnerPrices implements Parcelable {
    @SerializedName("symbol")
    @Expose
    private String symbol;
    @SerializedName("bid")
    @Expose
    private Double bid;
    @SerializedName("ask")
    @Expose
    private Double ask;
    @SerializedName("bidq")
    @Expose
    private Double bidq;
    @SerializedName("askq")
    @Expose
    private Double askq;
    @SerializedName("open")
    @Expose
    private Double open;
    @SerializedName("timestamp")
    @Expose
    private Long timestamp;

    public String mBid="0";
    public String mAsk="0";



    public InnerPrices() {

    }


    protected InnerPrices(Parcel in) {
        symbol = in.readString();
        if (in.readByte() == 0) {
            bid = null;
        } else {
            bid = in.readDouble();
        }
        if (in.readByte() == 0) {
            ask = null;
        } else {
            ask = in.readDouble();
        }
        if (in.readByte() == 0) {
            bidq = null;
        } else {
            bidq = in.readDouble();
        }
        if (in.readByte() == 0) {
            askq = null;
        } else {
            askq = in.readDouble();
        }
        if (in.readByte() == 0) {
            open = null;
        } else {
            open = in.readDouble();
        }
        if (in.readByte() == 0) {
            timestamp = null;
        } else {
            timestamp = in.readLong();
        }
        mBid = in.readString();
        mAsk = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(symbol);
        if (bid == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeDouble(bid);
        }
        if (ask == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeDouble(ask);
        }
        if (bidq == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeDouble(bidq);
        }
        if (askq == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeDouble(askq);
        }
        if (open == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeDouble(open);
        }
        if (timestamp == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeLong(timestamp);
        }
        dest.writeString(mBid);
        dest.writeString(mAsk);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<InnerPrices> CREATOR = new Creator<InnerPrices>() {
        @Override
        public InnerPrices createFromParcel(Parcel in) {
            return new InnerPrices(in);
        }

        @Override
        public InnerPrices[] newArray(int size) {
            return new InnerPrices[size];
        }
    };

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Double getBid() {
        return bid;
    }

    public void setBid(Double bid) {
        this.bid = bid;
    }

    public Double getAsk() {
        return ask;
    }

    public void setAsk(Double ask) {
        this.ask = ask;
    }

    public Double getBidq() {
        return bidq;
    }

    public void setBidq(Double bidq) {
        this.bidq = bidq;
    }

    public Double getAskq() {
        return askq;
    }

    public void setAskq(Double askq) {
        this.askq = askq;
    }

    public Double getOpen() {
        return open;
    }

    public void setOpen(Double open) {
        this.open = open;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getmBid() {
        return mBid;
    }

    public void setmBid(String mBid) {
        this.mBid = mBid;
    }

    public String getmAsk() {
        return mAsk;
    }

    public void setmAsk(String mAsk) {
        this.mAsk = mAsk;
    }

    @Override
    public String toString() {
        return "InnerPrices{" +
                "symbol='" + symbol + '\'' +
                ", bid=" + bid +
                ", ask=" + ask +
                ", bidq=" + bidq +
                ", askq=" + askq +
                ", open=" + open +
                ", timestamp=" + timestamp +
                '}';
    }
}
