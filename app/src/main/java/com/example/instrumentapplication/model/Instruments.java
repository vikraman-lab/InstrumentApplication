package com.example.instrumentapplication.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Instruments implements Parcelable {

    @SerializedName("FCHI")
    @Expose
    private InnerInstruments FCHI;

    @SerializedName("USDRON")
    @Expose
    private InnerInstruments USDRON;

    @SerializedName("GBPPLN")
    @Expose
    private InnerInstruments GBPPLN;

    @SerializedName("XETJPY")
    @Expose
    private InnerInstruments XETJPY;

    @SerializedName("GBPCZK")
    @Expose
    private InnerInstruments GBPCZK;

    @SerializedName("GBPTRY")
    @Expose
    private InnerInstruments GBPTRY;

    @SerializedName("GBPAUD")
    @Expose
    private InnerInstruments GBPAUD;

    @SerializedName("XETUSD")
    @Expose
    private InnerInstruments XETUSD;

    @SerializedName("GBPNZD")
    @Expose
    private InnerInstruments GBPNZD;

    @SerializedName("USDSEK")
    @Expose
    private InnerInstruments USDSEK;

    @SerializedName("GBPSEK")
    @Expose
    private InnerInstruments GBPSEK;

    @SerializedName("USDJPY")
    @Expose
    private InnerInstruments USDJPY;

    @SerializedName("XBNUSD")
    @Expose
    private InnerInstruments XBNUSD;

    @SerializedName("USDDKK")
    @Expose
    private InnerInstruments USDDKK;

    @SerializedName("XNGUSD")
    @Expose
    private InnerInstruments XNGUSD;

    @SerializedName("XAUAUD")
    @Expose
    private InnerInstruments XAUAUD;

    @SerializedName("USDMXN")
    @Expose
    private InnerInstruments USDMXN;

    @SerializedName("HSI")
    @Expose
    private InnerInstruments HSI;

    @SerializedName("EURUSD")
    @Expose
    private InnerInstruments EURUSD;

    @SerializedName("EURSGD")
    @Expose
    private InnerInstruments EURSGD;

    @SerializedName("USDCAD")
    @Expose
    private InnerInstruments USDCAD;

    @SerializedName("AUDCHF")
    @Expose
    private InnerInstruments AUDCHF;

    @SerializedName("EURCHF")
    @Expose
    private InnerInstruments EURCHF;

    @SerializedName("USDTHB")
    @Expose
    private InnerInstruments USDTHB;

    @SerializedName("XLCJPY")
    @Expose
    private InnerInstruments XLCJPY;

    @SerializedName("USDCNH")
    @Expose
    private InnerInstruments USDCNH;

    @SerializedName("EURMXN")
    @Expose
    private InnerInstruments EURMXN;

    @SerializedName("GBPZAR")
    @Expose
    private InnerInstruments GBPZAR;

    @SerializedName("EURHUF")
    @Expose
    private InnerInstruments EURHUF;

    @SerializedName("EURAUD")
    @Expose
    private InnerInstruments EURAUD;

    @SerializedName("USDILS")
    @Expose
    private InnerInstruments USDILS;

    @SerializedName("XAGUSDm")
    @Expose
    private InnerInstruments XAGUSDm;

    @SerializedName("XBRUSD")
    @Expose
    private InnerInstruments XBRUSD;

    @SerializedName("EURNOK")
    @Expose
    private InnerInstruments EURNOK;

    @SerializedName("CADCHF")
    @Expose
    private InnerInstruments CADCHF;

    @SerializedName("XAUUSDm")
    @Expose
    private InnerInstruments XAUUSDm;

    @SerializedName("AUDJPY")
    @Expose
    private InnerInstruments AUDJPY;

    @SerializedName("EURNZD")
    @Expose
    private InnerInstruments EURNZD;

    @SerializedName("NDXm")
    @Expose
    private InnerInstruments NDXm;

    @SerializedName("AUDUSD")
    @Expose
    private InnerInstruments AUDUSD;

    @SerializedName("WS30")
    @Expose
    private InnerInstruments WS30;

    @SerializedName("EURGBP")
    @Expose
    private InnerInstruments EURGBP;

    @SerializedName("J225")
    @Expose
    private InnerInstruments J225;

    @SerializedName("GBPCHF")
    @Expose
    private InnerInstruments GBPCHF;

    @SerializedName("NDX")
    @Expose
    private InnerInstruments NDX;

    @SerializedName("SPX")
    @Expose
    private InnerInstruments SPX;

    @SerializedName("EURDKK")
    @Expose
    private InnerInstruments EURDKK;

    @SerializedName("USDSGD")
    @Expose
    private InnerInstruments USDSGD;

    @SerializedName("GBPHKD")
    @Expose
    private InnerInstruments GBPHKD;

    @SerializedName("GDAXIm")
    @Expose
    private InnerInstruments GDAXIm;

    @SerializedName("USDPLN")
    @Expose
    private InnerInstruments USDPLN;

    @SerializedName("EURPLN")
    @Expose
    private InnerInstruments EURPLN;

    @SerializedName("EURTRY")
    @Expose
    private InnerInstruments EURTRY;

    @SerializedName("EURJPY")
    @Expose
    private InnerInstruments EURJPY;

    @SerializedName("GBPMXN")
    @Expose
    private InnerInstruments GBPMXN;

    @SerializedName("EURCAD")
    @Expose
    private InnerInstruments EURCAD;

    @SerializedName("EURSEK")
    @Expose
    private InnerInstruments EURSEK;

    @SerializedName("EURRON")
    @Expose
    private InnerInstruments EURRON;

    @SerializedName("NZDSGD")
    @Expose
    private InnerInstruments NZDSGD;

    @SerializedName("XAUUSD")
    @Expose
    private InnerInstruments XAUUSD;

    @SerializedName("AUS200")
    @Expose
    private InnerInstruments AUS200;

    @SerializedName("USDHUF")
    @Expose
    private InnerInstruments USDHUF;

    @SerializedName("NOKSEK")
    @Expose
    private InnerInstruments NOKSEK;

    @SerializedName("USDTRY")
    @Expose
    private InnerInstruments USDTRY;

    @SerializedName("EURHKD")
    @Expose
    private InnerInstruments EURHKD;

    @SerializedName("NZDCHF")
    @Expose
    private InnerInstruments NZDCHF;

    @SerializedName("XRPUSD")
    @Expose
    private InnerInstruments XRPUSD;

    @SerializedName("GBPNOK")
    @Expose
    private InnerInstruments GBPNOK;

    @SerializedName("EURZAR")
    @Expose
    private InnerInstruments EURZAR;

    @SerializedName("STOXX50E")
    @Expose
    private InnerInstruments STOXX50E;

    @SerializedName("GBPSGD")
    @Expose
    private InnerInstruments GBPSGD;

    @SerializedName("NZDUSD")
    @Expose
    private InnerInstruments NZDUSD;

    @SerializedName("GBPCAD")
    @Expose
    private InnerInstruments GBPCAD;

    @SerializedName("NZDJPY")
    @Expose
    private InnerInstruments NZDJPY;

    @SerializedName("USDNOK")
    @Expose
    private InnerInstruments USDNOK;

    @SerializedName("XAUEUR")
    @Expose
    private InnerInstruments XAUEUR;

    @SerializedName("XAGUSD")
    @Expose
    private InnerInstruments XAGUSD;

    @SerializedName("CADJPY")
    @Expose
    private InnerInstruments CADJPY;

    @SerializedName("USDZAR")
    @Expose
    private InnerInstruments USDZAR;

    @SerializedName("UK100")
    @Expose
    private InnerInstruments UK100;

    @SerializedName("XTIUSD")
    @Expose
    private InnerInstruments XTIUSD;

    @SerializedName("CHFJPY")
    @Expose
    private InnerInstruments CHFJPY;

    @SerializedName("XAGAUD")
    @Expose
    private InnerInstruments XAGAUD;

    @SerializedName("AUDNZD")
    @Expose
    private InnerInstruments AUDNZD;

    @SerializedName("GDAXI")
    @Expose
    private InnerInstruments GDAXI;

    @SerializedName("XBTJPY")
    @Expose
    private InnerInstruments XBTJPY;

    @SerializedName("XBNJPY")
    @Expose
    private InnerInstruments XBNJPY;

    @SerializedName("SPN35")
    @Expose
    private InnerInstruments SPN35;

    @SerializedName("WS30m")
    @Expose
    private InnerInstruments WS30m;

    @SerializedName("USDCZK")
    @Expose
    private InnerInstruments USDCZK;

    @SerializedName("USDCHF")
    @Expose
    private InnerInstruments USDCHF;

    @SerializedName("XBTUSD")
    @Expose
    private InnerInstruments XBTUSD;

    @SerializedName("SPXm")
    @Expose
    private InnerInstruments SPXm;

    @SerializedName("NZDCAD")
    @Expose
    private InnerInstruments NZDCAD;

    @SerializedName("GBPJPY")
    @Expose
    private InnerInstruments GBPJPY;

    @SerializedName("XLCUSD")
    @Expose
    private InnerInstruments XLCUSD;

    @SerializedName("GBPDKK")
    @Expose
    private InnerInstruments GBPDKK;

    @SerializedName("GBPHUF")
    @Expose
    private InnerInstruments GBPHUF;

    @SerializedName("USDHKD")
    @Expose
    private InnerInstruments USDHKD;

    @SerializedName("EURCZK")
    @Expose
    private InnerInstruments EURCZK;

    @SerializedName("EURRUB")
    @Expose
    private InnerInstruments EURRUB;

    @SerializedName("USDRUB")
    @Expose
    private InnerInstruments USDRUB;

    @SerializedName("XRPJPY")
    @Expose
    private InnerInstruments XRPJPY;

    @SerializedName("AUDCAD")
    @Expose
    private InnerInstruments AUDCAD;

    @SerializedName("GBPUSD")
    @Expose
    private InnerInstruments GBPUSD;


    protected Instruments(Parcel in) {
        FCHI = in.readParcelable(InnerInstruments.class.getClassLoader());
        USDRON = in.readParcelable(InnerInstruments.class.getClassLoader());
        GBPPLN = in.readParcelable(InnerInstruments.class.getClassLoader());
        XETJPY = in.readParcelable(InnerInstruments.class.getClassLoader());
        GBPCZK = in.readParcelable(InnerInstruments.class.getClassLoader());
        GBPTRY = in.readParcelable(InnerInstruments.class.getClassLoader());
        GBPAUD = in.readParcelable(InnerInstruments.class.getClassLoader());
        XETUSD = in.readParcelable(InnerInstruments.class.getClassLoader());
        GBPNZD = in.readParcelable(InnerInstruments.class.getClassLoader());
        USDSEK = in.readParcelable(InnerInstruments.class.getClassLoader());
        GBPSEK = in.readParcelable(InnerInstruments.class.getClassLoader());
        USDJPY = in.readParcelable(InnerInstruments.class.getClassLoader());
        XBNUSD = in.readParcelable(InnerInstruments.class.getClassLoader());
        USDDKK = in.readParcelable(InnerInstruments.class.getClassLoader());
        XNGUSD = in.readParcelable(InnerInstruments.class.getClassLoader());
        XAUAUD = in.readParcelable(InnerInstruments.class.getClassLoader());
        USDMXN = in.readParcelable(InnerInstruments.class.getClassLoader());
        HSI = in.readParcelable(InnerInstruments.class.getClassLoader());
        EURUSD = in.readParcelable(InnerInstruments.class.getClassLoader());
        EURSGD = in.readParcelable(InnerInstruments.class.getClassLoader());
        USDCAD = in.readParcelable(InnerInstruments.class.getClassLoader());
        AUDCHF = in.readParcelable(InnerInstruments.class.getClassLoader());
        EURCHF = in.readParcelable(InnerInstruments.class.getClassLoader());
        USDTHB = in.readParcelable(InnerInstruments.class.getClassLoader());
        XLCJPY = in.readParcelable(InnerInstruments.class.getClassLoader());
        USDCNH = in.readParcelable(InnerInstruments.class.getClassLoader());
        EURMXN = in.readParcelable(InnerInstruments.class.getClassLoader());
        GBPZAR = in.readParcelable(InnerInstruments.class.getClassLoader());
        EURHUF = in.readParcelable(InnerInstruments.class.getClassLoader());
        EURAUD = in.readParcelable(InnerInstruments.class.getClassLoader());
        USDILS = in.readParcelable(InnerInstruments.class.getClassLoader());
        XAGUSDm = in.readParcelable(InnerInstruments.class.getClassLoader());
        XBRUSD = in.readParcelable(InnerInstruments.class.getClassLoader());
        EURNOK = in.readParcelable(InnerInstruments.class.getClassLoader());
        CADCHF = in.readParcelable(InnerInstruments.class.getClassLoader());
        XAUUSDm = in.readParcelable(InnerInstruments.class.getClassLoader());
        AUDJPY = in.readParcelable(InnerInstruments.class.getClassLoader());
        EURNZD = in.readParcelable(InnerInstruments.class.getClassLoader());
        NDXm = in.readParcelable(InnerInstruments.class.getClassLoader());
        AUDUSD = in.readParcelable(InnerInstruments.class.getClassLoader());
        WS30 = in.readParcelable(InnerInstruments.class.getClassLoader());
        EURGBP = in.readParcelable(InnerInstruments.class.getClassLoader());
        J225 = in.readParcelable(InnerInstruments.class.getClassLoader());
        GBPCHF = in.readParcelable(InnerInstruments.class.getClassLoader());
        NDX = in.readParcelable(InnerInstruments.class.getClassLoader());
        SPX = in.readParcelable(InnerInstruments.class.getClassLoader());
        EURDKK = in.readParcelable(InnerInstruments.class.getClassLoader());
        USDSGD = in.readParcelable(InnerInstruments.class.getClassLoader());
        GBPHKD = in.readParcelable(InnerInstruments.class.getClassLoader());
        GDAXIm = in.readParcelable(InnerInstruments.class.getClassLoader());
        USDPLN = in.readParcelable(InnerInstruments.class.getClassLoader());
        EURPLN = in.readParcelable(InnerInstruments.class.getClassLoader());
        EURTRY = in.readParcelable(InnerInstruments.class.getClassLoader());
        EURJPY = in.readParcelable(InnerInstruments.class.getClassLoader());
        GBPMXN = in.readParcelable(InnerInstruments.class.getClassLoader());
        EURCAD = in.readParcelable(InnerInstruments.class.getClassLoader());
        EURSEK = in.readParcelable(InnerInstruments.class.getClassLoader());
        EURRON = in.readParcelable(InnerInstruments.class.getClassLoader());
        NZDSGD = in.readParcelable(InnerInstruments.class.getClassLoader());
        XAUUSD = in.readParcelable(InnerInstruments.class.getClassLoader());
        AUS200 = in.readParcelable(InnerInstruments.class.getClassLoader());
        USDHUF = in.readParcelable(InnerInstruments.class.getClassLoader());
        NOKSEK = in.readParcelable(InnerInstruments.class.getClassLoader());
        USDTRY = in.readParcelable(InnerInstruments.class.getClassLoader());
        EURHKD = in.readParcelable(InnerInstruments.class.getClassLoader());
        NZDCHF = in.readParcelable(InnerInstruments.class.getClassLoader());
        XRPUSD = in.readParcelable(InnerInstruments.class.getClassLoader());
        GBPNOK = in.readParcelable(InnerInstruments.class.getClassLoader());
        EURZAR = in.readParcelable(InnerInstruments.class.getClassLoader());
        STOXX50E = in.readParcelable(InnerInstruments.class.getClassLoader());
        GBPSGD = in.readParcelable(InnerInstruments.class.getClassLoader());
        NZDUSD = in.readParcelable(InnerInstruments.class.getClassLoader());
        GBPCAD = in.readParcelable(InnerInstruments.class.getClassLoader());
        NZDJPY = in.readParcelable(InnerInstruments.class.getClassLoader());
        USDNOK = in.readParcelable(InnerInstruments.class.getClassLoader());
        XAUEUR = in.readParcelable(InnerInstruments.class.getClassLoader());
        XAGUSD = in.readParcelable(InnerInstruments.class.getClassLoader());
        CADJPY = in.readParcelable(InnerInstruments.class.getClassLoader());
        USDZAR = in.readParcelable(InnerInstruments.class.getClassLoader());
        UK100 = in.readParcelable(InnerInstruments.class.getClassLoader());
        XTIUSD = in.readParcelable(InnerInstruments.class.getClassLoader());
        CHFJPY = in.readParcelable(InnerInstruments.class.getClassLoader());
        XAGAUD = in.readParcelable(InnerInstruments.class.getClassLoader());
        AUDNZD = in.readParcelable(InnerInstruments.class.getClassLoader());
        GDAXI = in.readParcelable(InnerInstruments.class.getClassLoader());
        XBTJPY = in.readParcelable(InnerInstruments.class.getClassLoader());
        XBNJPY = in.readParcelable(InnerInstruments.class.getClassLoader());
        SPN35 = in.readParcelable(InnerInstruments.class.getClassLoader());
        WS30m = in.readParcelable(InnerInstruments.class.getClassLoader());
        USDCZK = in.readParcelable(InnerInstruments.class.getClassLoader());
        USDCHF = in.readParcelable(InnerInstruments.class.getClassLoader());
        XBTUSD = in.readParcelable(InnerInstruments.class.getClassLoader());
        SPXm = in.readParcelable(InnerInstruments.class.getClassLoader());
        NZDCAD = in.readParcelable(InnerInstruments.class.getClassLoader());
        GBPJPY = in.readParcelable(InnerInstruments.class.getClassLoader());
        XLCUSD = in.readParcelable(InnerInstruments.class.getClassLoader());
        GBPDKK = in.readParcelable(InnerInstruments.class.getClassLoader());
        GBPHUF = in.readParcelable(InnerInstruments.class.getClassLoader());
        USDHKD = in.readParcelable(InnerInstruments.class.getClassLoader());
        EURCZK = in.readParcelable(InnerInstruments.class.getClassLoader());
        EURRUB = in.readParcelable(InnerInstruments.class.getClassLoader());
        USDRUB = in.readParcelable(InnerInstruments.class.getClassLoader());
        XRPJPY = in.readParcelable(InnerInstruments.class.getClassLoader());
        AUDCAD = in.readParcelable(InnerInstruments.class.getClassLoader());
        GBPUSD = in.readParcelable(InnerInstruments.class.getClassLoader());
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(FCHI, flags);
        dest.writeParcelable(USDRON, flags);
        dest.writeParcelable(GBPPLN, flags);
        dest.writeParcelable(XETJPY, flags);
        dest.writeParcelable(GBPCZK, flags);
        dest.writeParcelable(GBPTRY, flags);
        dest.writeParcelable(GBPAUD, flags);
        dest.writeParcelable(XETUSD, flags);
        dest.writeParcelable(GBPNZD, flags);
        dest.writeParcelable(USDSEK, flags);
        dest.writeParcelable(GBPSEK, flags);
        dest.writeParcelable(USDJPY, flags);
        dest.writeParcelable(XBNUSD, flags);
        dest.writeParcelable(USDDKK, flags);
        dest.writeParcelable(XNGUSD, flags);
        dest.writeParcelable(XAUAUD, flags);
        dest.writeParcelable(USDMXN, flags);
        dest.writeParcelable(HSI, flags);
        dest.writeParcelable(EURUSD, flags);
        dest.writeParcelable(EURSGD, flags);
        dest.writeParcelable(USDCAD, flags);
        dest.writeParcelable(AUDCHF, flags);
        dest.writeParcelable(EURCHF, flags);
        dest.writeParcelable(USDTHB, flags);
        dest.writeParcelable(XLCJPY, flags);
        dest.writeParcelable(USDCNH, flags);
        dest.writeParcelable(EURMXN, flags);
        dest.writeParcelable(GBPZAR, flags);
        dest.writeParcelable(EURHUF, flags);
        dest.writeParcelable(EURAUD, flags);
        dest.writeParcelable(USDILS, flags);
        dest.writeParcelable(XAGUSDm, flags);
        dest.writeParcelable(XBRUSD, flags);
        dest.writeParcelable(EURNOK, flags);
        dest.writeParcelable(CADCHF, flags);
        dest.writeParcelable(XAUUSDm, flags);
        dest.writeParcelable(AUDJPY, flags);
        dest.writeParcelable(EURNZD, flags);
        dest.writeParcelable(NDXm, flags);
        dest.writeParcelable(AUDUSD, flags);
        dest.writeParcelable(WS30, flags);
        dest.writeParcelable(EURGBP, flags);
        dest.writeParcelable(J225, flags);
        dest.writeParcelable(GBPCHF, flags);
        dest.writeParcelable(NDX, flags);
        dest.writeParcelable(SPX, flags);
        dest.writeParcelable(EURDKK, flags);
        dest.writeParcelable(USDSGD, flags);
        dest.writeParcelable(GBPHKD, flags);
        dest.writeParcelable(GDAXIm, flags);
        dest.writeParcelable(USDPLN, flags);
        dest.writeParcelable(EURPLN, flags);
        dest.writeParcelable(EURTRY, flags);
        dest.writeParcelable(EURJPY, flags);
        dest.writeParcelable(GBPMXN, flags);
        dest.writeParcelable(EURCAD, flags);
        dest.writeParcelable(EURSEK, flags);
        dest.writeParcelable(EURRON, flags);
        dest.writeParcelable(NZDSGD, flags);
        dest.writeParcelable(XAUUSD, flags);
        dest.writeParcelable(AUS200, flags);
        dest.writeParcelable(USDHUF, flags);
        dest.writeParcelable(NOKSEK, flags);
        dest.writeParcelable(USDTRY, flags);
        dest.writeParcelable(EURHKD, flags);
        dest.writeParcelable(NZDCHF, flags);
        dest.writeParcelable(XRPUSD, flags);
        dest.writeParcelable(GBPNOK, flags);
        dest.writeParcelable(EURZAR, flags);
        dest.writeParcelable(STOXX50E, flags);
        dest.writeParcelable(GBPSGD, flags);
        dest.writeParcelable(NZDUSD, flags);
        dest.writeParcelable(GBPCAD, flags);
        dest.writeParcelable(NZDJPY, flags);
        dest.writeParcelable(USDNOK, flags);
        dest.writeParcelable(XAUEUR, flags);
        dest.writeParcelable(XAGUSD, flags);
        dest.writeParcelable(CADJPY, flags);
        dest.writeParcelable(USDZAR, flags);
        dest.writeParcelable(UK100, flags);
        dest.writeParcelable(XTIUSD, flags);
        dest.writeParcelable(CHFJPY, flags);
        dest.writeParcelable(XAGAUD, flags);
        dest.writeParcelable(AUDNZD, flags);
        dest.writeParcelable(GDAXI, flags);
        dest.writeParcelable(XBTJPY, flags);
        dest.writeParcelable(XBNJPY, flags);
        dest.writeParcelable(SPN35, flags);
        dest.writeParcelable(WS30m, flags);
        dest.writeParcelable(USDCZK, flags);
        dest.writeParcelable(USDCHF, flags);
        dest.writeParcelable(XBTUSD, flags);
        dest.writeParcelable(SPXm, flags);
        dest.writeParcelable(NZDCAD, flags);
        dest.writeParcelable(GBPJPY, flags);
        dest.writeParcelable(XLCUSD, flags);
        dest.writeParcelable(GBPDKK, flags);
        dest.writeParcelable(GBPHUF, flags);
        dest.writeParcelable(USDHKD, flags);
        dest.writeParcelable(EURCZK, flags);
        dest.writeParcelable(EURRUB, flags);
        dest.writeParcelable(USDRUB, flags);
        dest.writeParcelable(XRPJPY, flags);
        dest.writeParcelable(AUDCAD, flags);
        dest.writeParcelable(GBPUSD, flags);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Instruments> CREATOR = new Creator<Instruments>() {
        @Override
        public Instruments createFromParcel(Parcel in) {
            return new Instruments(in);
        }

        @Override
        public Instruments[] newArray(int size) {
            return new Instruments[size];
        }
    };

    public InnerInstruments getFCHI() {
        return FCHI;
    }

    public void setFCHI(InnerInstruments FCHI) {
        this.FCHI = FCHI;
    }

    public InnerInstruments getUSDRON() {
        return USDRON;
    }

    public void setUSDRON(InnerInstruments USDRON) {
        this.USDRON = USDRON;
    }

    public InnerInstruments getGBPPLN() {
        return GBPPLN;
    }

    public void setGBPPLN(InnerInstruments GBPPLN) {
        this.GBPPLN = GBPPLN;
    }

    public InnerInstruments getXETJPY() {
        return XETJPY;
    }

    public void setXETJPY(InnerInstruments XETJPY) {
        this.XETJPY = XETJPY;
    }

    public InnerInstruments getGBPCZK() {
        return GBPCZK;
    }

    public void setGBPCZK(InnerInstruments GBPCZK) {
        this.GBPCZK = GBPCZK;
    }

    public InnerInstruments getGBPTRY() {
        return GBPTRY;
    }

    public void setGBPTRY(InnerInstruments GBPTRY) {
        this.GBPTRY = GBPTRY;
    }

    public InnerInstruments getGBPAUD() {
        return GBPAUD;
    }

    public void setGBPAUD(InnerInstruments GBPAUD) {
        this.GBPAUD = GBPAUD;
    }

    public InnerInstruments getXETUSD() {
        return XETUSD;
    }

    public void setXETUSD(InnerInstruments XETUSD) {
        this.XETUSD = XETUSD;
    }

    public InnerInstruments getGBPNZD() {
        return GBPNZD;
    }

    public void setGBPNZD(InnerInstruments GBPNZD) {
        this.GBPNZD = GBPNZD;
    }

    public InnerInstruments getUSDSEK() {
        return USDSEK;
    }

    public void setUSDSEK(InnerInstruments USDSEK) {
        this.USDSEK = USDSEK;
    }

    public InnerInstruments getGBPSEK() {
        return GBPSEK;
    }

    public void setGBPSEK(InnerInstruments GBPSEK) {
        this.GBPSEK = GBPSEK;
    }

    public InnerInstruments getUSDJPY() {
        return USDJPY;
    }

    public void setUSDJPY(InnerInstruments USDJPY) {
        this.USDJPY = USDJPY;
    }

    public InnerInstruments getXBNUSD() {
        return XBNUSD;
    }

    public void setXBNUSD(InnerInstruments XBNUSD) {
        this.XBNUSD = XBNUSD;
    }

    public InnerInstruments getUSDDKK() {
        return USDDKK;
    }

    public void setUSDDKK(InnerInstruments USDDKK) {
        this.USDDKK = USDDKK;
    }

    public InnerInstruments getXNGUSD() {
        return XNGUSD;
    }

    public void setXNGUSD(InnerInstruments XNGUSD) {
        this.XNGUSD = XNGUSD;
    }

    public InnerInstruments getXAUAUD() {
        return XAUAUD;
    }

    public void setXAUAUD(InnerInstruments XAUAUD) {
        this.XAUAUD = XAUAUD;
    }

    public InnerInstruments getUSDMXN() {
        return USDMXN;
    }

    public void setUSDMXN(InnerInstruments USDMXN) {
        this.USDMXN = USDMXN;
    }

    public InnerInstruments getHSI() {
        return HSI;
    }

    public void setHSI(InnerInstruments HSI) {
        this.HSI = HSI;
    }

    public InnerInstruments getEURUSD() {
        return EURUSD;
    }

    public void setEURUSD(InnerInstruments EURUSD) {
        this.EURUSD = EURUSD;
    }

    public InnerInstruments getEURSGD() {
        return EURSGD;
    }

    public void setEURSGD(InnerInstruments EURSGD) {
        this.EURSGD = EURSGD;
    }

    public InnerInstruments getUSDCAD() {
        return USDCAD;
    }

    public void setUSDCAD(InnerInstruments USDCAD) {
        this.USDCAD = USDCAD;
    }

    public InnerInstruments getAUDCHF() {
        return AUDCHF;
    }

    public void setAUDCHF(InnerInstruments AUDCHF) {
        this.AUDCHF = AUDCHF;
    }

    public InnerInstruments getEURCHF() {
        return EURCHF;
    }

    public void setEURCHF(InnerInstruments EURCHF) {
        this.EURCHF = EURCHF;
    }

    public InnerInstruments getUSDTHB() {
        return USDTHB;
    }

    public void setUSDTHB(InnerInstruments USDTHB) {
        this.USDTHB = USDTHB;
    }

    public InnerInstruments getXLCJPY() {
        return XLCJPY;
    }

    public void setXLCJPY(InnerInstruments XLCJPY) {
        this.XLCJPY = XLCJPY;
    }

    public InnerInstruments getUSDCNH() {
        return USDCNH;
    }

    public void setUSDCNH(InnerInstruments USDCNH) {
        this.USDCNH = USDCNH;
    }

    public InnerInstruments getEURMXN() {
        return EURMXN;
    }

    public void setEURMXN(InnerInstruments EURMXN) {
        this.EURMXN = EURMXN;
    }

    public InnerInstruments getGBPZAR() {
        return GBPZAR;
    }

    public void setGBPZAR(InnerInstruments GBPZAR) {
        this.GBPZAR = GBPZAR;
    }

    public InnerInstruments getEURHUF() {
        return EURHUF;
    }

    public void setEURHUF(InnerInstruments EURHUF) {
        this.EURHUF = EURHUF;
    }

    public InnerInstruments getEURAUD() {
        return EURAUD;
    }

    public void setEURAUD(InnerInstruments EURAUD) {
        this.EURAUD = EURAUD;
    }

    public InnerInstruments getUSDILS() {
        return USDILS;
    }

    public void setUSDILS(InnerInstruments USDILS) {
        this.USDILS = USDILS;
    }

    public InnerInstruments getXAGUSDm() {
        return XAGUSDm;
    }

    public void setXAGUSDm(InnerInstruments XAGUSDm) {
        this.XAGUSDm = XAGUSDm;
    }

    public InnerInstruments getXBRUSD() {
        return XBRUSD;
    }

    public void setXBRUSD(InnerInstruments XBRUSD) {
        this.XBRUSD = XBRUSD;
    }

    public InnerInstruments getEURNOK() {
        return EURNOK;
    }

    public void setEURNOK(InnerInstruments EURNOK) {
        this.EURNOK = EURNOK;
    }

    public InnerInstruments getCADCHF() {
        return CADCHF;
    }

    public void setCADCHF(InnerInstruments CADCHF) {
        this.CADCHF = CADCHF;
    }

    public InnerInstruments getXAUUSDm() {
        return XAUUSDm;
    }

    public void setXAUUSDm(InnerInstruments XAUUSDm) {
        this.XAUUSDm = XAUUSDm;
    }

    public InnerInstruments getAUDJPY() {
        return AUDJPY;
    }

    public void setAUDJPY(InnerInstruments AUDJPY) {
        this.AUDJPY = AUDJPY;
    }

    public InnerInstruments getEURNZD() {
        return EURNZD;
    }

    public void setEURNZD(InnerInstruments EURNZD) {
        this.EURNZD = EURNZD;
    }

    public InnerInstruments getNDXm() {
        return NDXm;
    }

    public void setNDXm(InnerInstruments NDXm) {
        this.NDXm = NDXm;
    }

    public InnerInstruments getAUDUSD() {
        return AUDUSD;
    }

    public void setAUDUSD(InnerInstruments AUDUSD) {
        this.AUDUSD = AUDUSD;
    }

    public InnerInstruments getWS30() {
        return WS30;
    }

    public void setWS30(InnerInstruments WS30) {
        this.WS30 = WS30;
    }

    public InnerInstruments getEURGBP() {
        return EURGBP;
    }

    public void setEURGBP(InnerInstruments EURGBP) {
        this.EURGBP = EURGBP;
    }

    public InnerInstruments getJ225() {
        return J225;
    }

    public void setJ225(InnerInstruments j225) {
        J225 = j225;
    }

    public InnerInstruments getGBPCHF() {
        return GBPCHF;
    }

    public void setGBPCHF(InnerInstruments GBPCHF) {
        this.GBPCHF = GBPCHF;
    }

    public InnerInstruments getNDX() {
        return NDX;
    }

    public void setNDX(InnerInstruments NDX) {
        this.NDX = NDX;
    }

    public InnerInstruments getSPX() {
        return SPX;
    }

    public void setSPX(InnerInstruments SPX) {
        this.SPX = SPX;
    }

    public InnerInstruments getEURDKK() {
        return EURDKK;
    }

    public void setEURDKK(InnerInstruments EURDKK) {
        this.EURDKK = EURDKK;
    }

    public InnerInstruments getUSDSGD() {
        return USDSGD;
    }

    public void setUSDSGD(InnerInstruments USDSGD) {
        this.USDSGD = USDSGD;
    }

    public InnerInstruments getGBPHKD() {
        return GBPHKD;
    }

    public void setGBPHKD(InnerInstruments GBPHKD) {
        this.GBPHKD = GBPHKD;
    }

    public InnerInstruments getGDAXIm() {
        return GDAXIm;
    }

    public void setGDAXIm(InnerInstruments GDAXIm) {
        this.GDAXIm = GDAXIm;
    }

    public InnerInstruments getUSDPLN() {
        return USDPLN;
    }

    public void setUSDPLN(InnerInstruments USDPLN) {
        this.USDPLN = USDPLN;
    }

    public InnerInstruments getEURPLN() {
        return EURPLN;
    }

    public void setEURPLN(InnerInstruments EURPLN) {
        this.EURPLN = EURPLN;
    }

    public InnerInstruments getEURTRY() {
        return EURTRY;
    }

    public void setEURTRY(InnerInstruments EURTRY) {
        this.EURTRY = EURTRY;
    }

    public InnerInstruments getEURJPY() {
        return EURJPY;
    }

    public void setEURJPY(InnerInstruments EURJPY) {
        this.EURJPY = EURJPY;
    }

    public InnerInstruments getGBPMXN() {
        return GBPMXN;
    }

    public void setGBPMXN(InnerInstruments GBPMXN) {
        this.GBPMXN = GBPMXN;
    }

    public InnerInstruments getEURCAD() {
        return EURCAD;
    }

    public void setEURCAD(InnerInstruments EURCAD) {
        this.EURCAD = EURCAD;
    }

    public InnerInstruments getEURSEK() {
        return EURSEK;
    }

    public void setEURSEK(InnerInstruments EURSEK) {
        this.EURSEK = EURSEK;
    }

    public InnerInstruments getEURRON() {
        return EURRON;
    }

    public void setEURRON(InnerInstruments EURRON) {
        this.EURRON = EURRON;
    }

    public InnerInstruments getNZDSGD() {
        return NZDSGD;
    }

    public void setNZDSGD(InnerInstruments NZDSGD) {
        this.NZDSGD = NZDSGD;
    }

    public InnerInstruments getXAUUSD() {
        return XAUUSD;
    }

    public void setXAUUSD(InnerInstruments XAUUSD) {
        this.XAUUSD = XAUUSD;
    }

    public InnerInstruments getAUS200() {
        return AUS200;
    }

    public void setAUS200(InnerInstruments AUS200) {
        this.AUS200 = AUS200;
    }

    public InnerInstruments getUSDHUF() {
        return USDHUF;
    }

    public void setUSDHUF(InnerInstruments USDHUF) {
        this.USDHUF = USDHUF;
    }

    public InnerInstruments getNOKSEK() {
        return NOKSEK;
    }

    public void setNOKSEK(InnerInstruments NOKSEK) {
        this.NOKSEK = NOKSEK;
    }

    public InnerInstruments getUSDTRY() {
        return USDTRY;
    }

    public void setUSDTRY(InnerInstruments USDTRY) {
        this.USDTRY = USDTRY;
    }

    public InnerInstruments getEURHKD() {
        return EURHKD;
    }

    public void setEURHKD(InnerInstruments EURHKD) {
        this.EURHKD = EURHKD;
    }

    public InnerInstruments getNZDCHF() {
        return NZDCHF;
    }

    public void setNZDCHF(InnerInstruments NZDCHF) {
        this.NZDCHF = NZDCHF;
    }

    public InnerInstruments getXRPUSD() {
        return XRPUSD;
    }

    public void setXRPUSD(InnerInstruments XRPUSD) {
        this.XRPUSD = XRPUSD;
    }

    public InnerInstruments getGBPNOK() {
        return GBPNOK;
    }

    public void setGBPNOK(InnerInstruments GBPNOK) {
        this.GBPNOK = GBPNOK;
    }

    public InnerInstruments getEURZAR() {
        return EURZAR;
    }

    public void setEURZAR(InnerInstruments EURZAR) {
        this.EURZAR = EURZAR;
    }

    public InnerInstruments getSTOXX50E() {
        return STOXX50E;
    }

    public void setSTOXX50E(InnerInstruments STOXX50E) {
        this.STOXX50E = STOXX50E;
    }

    public InnerInstruments getGBPSGD() {
        return GBPSGD;
    }

    public void setGBPSGD(InnerInstruments GBPSGD) {
        this.GBPSGD = GBPSGD;
    }

    public InnerInstruments getNZDUSD() {
        return NZDUSD;
    }

    public void setNZDUSD(InnerInstruments NZDUSD) {
        this.NZDUSD = NZDUSD;
    }

    public InnerInstruments getGBPCAD() {
        return GBPCAD;
    }

    public void setGBPCAD(InnerInstruments GBPCAD) {
        this.GBPCAD = GBPCAD;
    }

    public InnerInstruments getNZDJPY() {
        return NZDJPY;
    }

    public void setNZDJPY(InnerInstruments NZDJPY) {
        this.NZDJPY = NZDJPY;
    }

    public InnerInstruments getUSDNOK() {
        return USDNOK;
    }

    public void setUSDNOK(InnerInstruments USDNOK) {
        this.USDNOK = USDNOK;
    }

    public InnerInstruments getXAUEUR() {
        return XAUEUR;
    }

    public void setXAUEUR(InnerInstruments XAUEUR) {
        this.XAUEUR = XAUEUR;
    }

    public InnerInstruments getXAGUSD() {
        return XAGUSD;
    }

    public void setXAGUSD(InnerInstruments XAGUSD) {
        this.XAGUSD = XAGUSD;
    }

    public InnerInstruments getCADJPY() {
        return CADJPY;
    }

    public void setCADJPY(InnerInstruments CADJPY) {
        this.CADJPY = CADJPY;
    }

    public InnerInstruments getUSDZAR() {
        return USDZAR;
    }

    public void setUSDZAR(InnerInstruments USDZAR) {
        this.USDZAR = USDZAR;
    }

    public InnerInstruments getUK100() {
        return UK100;
    }

    public void setUK100(InnerInstruments UK100) {
        this.UK100 = UK100;
    }

    public InnerInstruments getXTIUSD() {
        return XTIUSD;
    }

    public void setXTIUSD(InnerInstruments XTIUSD) {
        this.XTIUSD = XTIUSD;
    }

    public InnerInstruments getCHFJPY() {
        return CHFJPY;
    }

    public void setCHFJPY(InnerInstruments CHFJPY) {
        this.CHFJPY = CHFJPY;
    }

    public InnerInstruments getXAGAUD() {
        return XAGAUD;
    }

    public void setXAGAUD(InnerInstruments XAGAUD) {
        this.XAGAUD = XAGAUD;
    }

    public InnerInstruments getAUDNZD() {
        return AUDNZD;
    }

    public void setAUDNZD(InnerInstruments AUDNZD) {
        this.AUDNZD = AUDNZD;
    }

    public InnerInstruments getGDAXI() {
        return GDAXI;
    }

    public void setGDAXI(InnerInstruments GDAXI) {
        this.GDAXI = GDAXI;
    }

    public InnerInstruments getXBTJPY() {
        return XBTJPY;
    }

    public void setXBTJPY(InnerInstruments XBTJPY) {
        this.XBTJPY = XBTJPY;
    }

    public InnerInstruments getXBNJPY() {
        return XBNJPY;
    }

    public void setXBNJPY(InnerInstruments XBNJPY) {
        this.XBNJPY = XBNJPY;
    }

    public InnerInstruments getSPN35() {
        return SPN35;
    }

    public void setSPN35(InnerInstruments SPN35) {
        this.SPN35 = SPN35;
    }

    public InnerInstruments getWS30m() {
        return WS30m;
    }

    public void setWS30m(InnerInstruments WS30m) {
        this.WS30m = WS30m;
    }

    public InnerInstruments getUSDCZK() {
        return USDCZK;
    }

    public void setUSDCZK(InnerInstruments USDCZK) {
        this.USDCZK = USDCZK;
    }

    public InnerInstruments getUSDCHF() {
        return USDCHF;
    }

    public void setUSDCHF(InnerInstruments USDCHF) {
        this.USDCHF = USDCHF;
    }

    public InnerInstruments getXBTUSD() {
        return XBTUSD;
    }

    public void setXBTUSD(InnerInstruments XBTUSD) {
        this.XBTUSD = XBTUSD;
    }

    public InnerInstruments getSPXm() {
        return SPXm;
    }

    public void setSPXm(InnerInstruments SPXm) {
        this.SPXm = SPXm;
    }

    public InnerInstruments getNZDCAD() {
        return NZDCAD;
    }

    public void setNZDCAD(InnerInstruments NZDCAD) {
        this.NZDCAD = NZDCAD;
    }

    public InnerInstruments getGBPJPY() {
        return GBPJPY;
    }

    public void setGBPJPY(InnerInstruments GBPJPY) {
        this.GBPJPY = GBPJPY;
    }

    public InnerInstruments getXLCUSD() {
        return XLCUSD;
    }

    public void setXLCUSD(InnerInstruments XLCUSD) {
        this.XLCUSD = XLCUSD;
    }

    public InnerInstruments getGBPDKK() {
        return GBPDKK;
    }

    public void setGBPDKK(InnerInstruments GBPDKK) {
        this.GBPDKK = GBPDKK;
    }

    public InnerInstruments getGBPHUF() {
        return GBPHUF;
    }

    public void setGBPHUF(InnerInstruments GBPHUF) {
        this.GBPHUF = GBPHUF;
    }

    public InnerInstruments getUSDHKD() {
        return USDHKD;
    }

    public void setUSDHKD(InnerInstruments USDHKD) {
        this.USDHKD = USDHKD;
    }

    public InnerInstruments getEURCZK() {
        return EURCZK;
    }

    public void setEURCZK(InnerInstruments EURCZK) {
        this.EURCZK = EURCZK;
    }

    public InnerInstruments getEURRUB() {
        return EURRUB;
    }

    public void setEURRUB(InnerInstruments EURRUB) {
        this.EURRUB = EURRUB;
    }

    public InnerInstruments getUSDRUB() {
        return USDRUB;
    }

    public void setUSDRUB(InnerInstruments USDRUB) {
        this.USDRUB = USDRUB;
    }

    public InnerInstruments getXRPJPY() {
        return XRPJPY;
    }

    public void setXRPJPY(InnerInstruments XRPJPY) {
        this.XRPJPY = XRPJPY;
    }

    public InnerInstruments getAUDCAD() {
        return AUDCAD;
    }

    public void setAUDCAD(InnerInstruments AUDCAD) {
        this.AUDCAD = AUDCAD;
    }

    public InnerInstruments getGBPUSD() {
        return GBPUSD;
    }

    public void setGBPUSD(InnerInstruments GBPUSD) {
        this.GBPUSD = GBPUSD;
    }

    @Override
    public String toString() {
        return "Instruments{" +
                "FCHI=" + FCHI +
                ", USDRON=" + USDRON +
                ", GBPPLN=" + GBPPLN +
                ", XETJPY=" + XETJPY +
                ", GBPCZK=" + GBPCZK +
                ", GBPTRY=" + GBPTRY +
                ", GBPAUD=" + GBPAUD +
                ", XETUSD=" + XETUSD +
                ", GBPNZD=" + GBPNZD +
                ", USDSEK=" + USDSEK +
                ", GBPSEK=" + GBPSEK +
                ", USDJPY=" + USDJPY +
                ", XBNUSD=" + XBNUSD +
                ", USDDKK=" + USDDKK +
                ", XNGUSD=" + XNGUSD +
                ", XAUAUD=" + XAUAUD +
                ", USDMXN=" + USDMXN +
                ", HSI=" + HSI +
                ", EURUSD=" + EURUSD +
                ", EURSGD=" + EURSGD +
                ", USDCAD=" + USDCAD +
                ", AUDCHF=" + AUDCHF +
                ", EURCHF=" + EURCHF +
                ", USDTHB=" + USDTHB +
                ", XLCJPY=" + XLCJPY +
                ", USDCNH=" + USDCNH +
                ", EURMXN=" + EURMXN +
                ", GBPZAR=" + GBPZAR +
                ", EURHUF=" + EURHUF +
                ", EURAUD=" + EURAUD +
                ", USDILS=" + USDILS +
                ", XAGUSDm=" + XAGUSDm +
                ", XBRUSD=" + XBRUSD +
                ", EURNOK=" + EURNOK +
                ", CADCHF=" + CADCHF +
                ", XAUUSDm=" + XAUUSDm +
                ", AUDJPY=" + AUDJPY +
                ", EURNZD=" + EURNZD +
                ", NDXm=" + NDXm +
                ", AUDUSD=" + AUDUSD +
                ", WS30=" + WS30 +
                ", EURGBP=" + EURGBP +
                ", J225=" + J225 +
                ", GBPCHF=" + GBPCHF +
                ", NDX=" + NDX +
                ", SPX=" + SPX +
                ", EURDKK=" + EURDKK +
                ", USDSGD=" + USDSGD +
                ", GBPHKD=" + GBPHKD +
                ", GDAXIm=" + GDAXIm +
                ", USDPLN=" + USDPLN +
                ", EURPLN=" + EURPLN +
                ", EURTRY=" + EURTRY +
                ", EURJPY=" + EURJPY +
                ", GBPMXN=" + GBPMXN +
                ", EURCAD=" + EURCAD +
                ", EURSEK=" + EURSEK +
                ", EURRON=" + EURRON +
                ", NZDSGD=" + NZDSGD +
                ", XAUUSD=" + XAUUSD +
                ", AUS200=" + AUS200 +
                ", USDHUF=" + USDHUF +
                ", NOKSEK=" + NOKSEK +
                ", USDTRY=" + USDTRY +
                ", EURHKD=" + EURHKD +
                ", NZDCHF=" + NZDCHF +
                ", XRPUSD=" + XRPUSD +
                ", GBPNOK=" + GBPNOK +
                ", EURZAR=" + EURZAR +
                ", STOXX50E=" + STOXX50E +
                ", GBPSGD=" + GBPSGD +
                ", NZDUSD=" + NZDUSD +
                ", GBPCAD=" + GBPCAD +
                ", NZDJPY=" + NZDJPY +
                ", USDNOK=" + USDNOK +
                ", XAUEUR=" + XAUEUR +
                ", XAGUSD=" + XAGUSD +
                ", CADJPY=" + CADJPY +
                ", USDZAR=" + USDZAR +
                ", UK100=" + UK100 +
                ", XTIUSD=" + XTIUSD +
                ", CHFJPY=" + CHFJPY +
                ", XAGAUD=" + XAGAUD +
                ", AUDNZD=" + AUDNZD +
                ", GDAXI=" + GDAXI +
                ", XBTJPY=" + XBTJPY +
                ", XBNJPY=" + XBNJPY +
                ", SPN35=" + SPN35 +
                ", WS30m=" + WS30m +
                ", USDCZK=" + USDCZK +
                ", USDCHF=" + USDCHF +
                ", XBTUSD=" + XBTUSD +
                ", SPXm=" + SPXm +
                ", NZDCAD=" + NZDCAD +
                ", GBPJPY=" + GBPJPY +
                ", XLCUSD=" + XLCUSD +
                ", GBPDKK=" + GBPDKK +
                ", GBPHUF=" + GBPHUF +
                ", USDHKD=" + USDHKD +
                ", EURCZK=" + EURCZK +
                ", EURRUB=" + EURRUB +
                ", USDRUB=" + USDRUB +
                ", XRPJPY=" + XRPJPY +
                ", AUDCAD=" + AUDCAD +
                ", GBPUSD=" + GBPUSD +
                '}';
    }
}