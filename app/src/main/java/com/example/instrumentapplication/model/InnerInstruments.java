package com.example.instrumentapplication.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Comparator;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class InnerInstruments implements Parcelable  {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("assetClass")
    @Expose
    private String assetClass;
    @SerializedName("canonical_symbol")
    @Expose
    private String canonicalSymbol;
    @SerializedName("volatilityBandPercentage")
    @Expose
    private String volatilityBandPercentage;
    @SerializedName("quantityIncrement")
    @Expose
    private String quantityIncrement;
    @SerializedName("priceIncrement")
    @Expose
    private String priceIncrement;
    @SerializedName("_priceMultiplier")
    @Expose
    private Long priceMultiplier;
    @SerializedName("source_symbol")
    @Expose
    private String sourceSymbol;
    @SerializedName("tradingStatus")
    @Expose
    private String tradingStatus;
    @SerializedName("tradingStatusChanged")
    @Expose
    private Boolean tradingStatusChanged;
    @SerializedName("tradingShouldBeOpen")
    @Expose
    private Boolean tradingShouldBeOpen;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("timestamp")
    @Expose
    private Long timestamp;
    @SerializedName("minimumOrderQuantity")
    @Expose
    private String minimumOrderQuantity;
    @SerializedName("trustedSpread")
    @Expose
    private Double trustedSpread;
    @SerializedName("unitPrice")
    @Expose
    private Double unitPrice;
    @SerializedName("margin")
    @Expose
    private Float margin;
    @SerializedName("contractSize")
    @Expose
    private Double contractSize;
    @SerializedName("contractInfoCurrency")
    @Expose
    private String contractInfoCurrency;
    @SerializedName("contractUnitOfMeasure")
    @Expose
    private String contractUnitOfMeasure;
    @SerializedName("tradingDays")
    @Expose
    private List<String> tradingDays = null;
    @SerializedName("tradingFrom")
    @Expose
    private Long tradingFrom;
    @SerializedName("tradingTo")
    @Expose
    private Long tradingTo;
    @SerializedName("tradingTimezone")
    @Expose
    private String tradingTimezone;
    @SerializedName("startTime")
    @Expose
    private String startTime;
    @SerializedName("endTime")
    @Expose
    private Long endTime;
    @SerializedName("_lastClose")
    @Expose
    private Double lastClose;
    @SerializedName("_open")
    @Expose
    private Double open;
    @SerializedName("_altGroups")
    @Expose
    private List<String> altGroups = null;
    @SerializedName("_tdKey")
    @Expose
    private Long tdKey;
    @SerializedName("_group")
    @Expose
    private String group;
    @SerializedName("_rank")
    @Expose
    private Long rank;
    @SerializedName("_count")
    @Expose
    private Long count;

    private Double bid;
    private Double ask;
    public String mBid;
    public String mAsk;
    public InnerInstruments() {

    }


    protected InnerInstruments(Parcel in) {
        id = in.readString();
        name = in.readString();
        assetClass = in.readString();
        canonicalSymbol = in.readString();
        volatilityBandPercentage = in.readString();
        quantityIncrement = in.readString();
        priceIncrement = in.readString();
        if (in.readByte() == 0) {
            priceMultiplier = null;
        } else {
            priceMultiplier = in.readLong();
        }
        sourceSymbol = in.readString();
        tradingStatus = in.readString();
        byte tmpTradingStatusChanged = in.readByte();
        tradingStatusChanged = tmpTradingStatusChanged == 0 ? null : tmpTradingStatusChanged == 1;
        byte tmpTradingShouldBeOpen = in.readByte();
        tradingShouldBeOpen = tmpTradingShouldBeOpen == 0 ? null : tmpTradingShouldBeOpen == 1;
        source = in.readString();
        if (in.readByte() == 0) {
            timestamp = null;
        } else {
            timestamp = in.readLong();
        }
        minimumOrderQuantity = in.readString();
        if (in.readByte() == 0) {
            trustedSpread = null;
        } else {
            trustedSpread = in.readDouble();
        }
        if (in.readByte() == 0) {
            unitPrice = null;
        } else {
            unitPrice = in.readDouble();
        }
        if (in.readByte() == 0) {
            margin = null;
        } else {
            margin = in.readFloat();
        }
        if (in.readByte() == 0) {
            contractSize = null;
        } else {
            contractSize = in.readDouble();
        }
        contractInfoCurrency = in.readString();
        contractUnitOfMeasure = in.readString();
        tradingDays = in.createStringArrayList();
        if (in.readByte() == 0) {
            tradingFrom = null;
        } else {
            tradingFrom = in.readLong();
        }
        if (in.readByte() == 0) {
            tradingTo = null;
        } else {
            tradingTo = in.readLong();
        }
        tradingTimezone = in.readString();
        startTime = in.readString();
        if (in.readByte() == 0) {
            endTime = null;
        } else {
            endTime = in.readLong();
        }
        if (in.readByte() == 0) {
            lastClose = null;
        } else {
            lastClose = in.readDouble();
        }
        if (in.readByte() == 0) {
            open = null;
        } else {
            open = in.readDouble();
        }
        altGroups = in.createStringArrayList();
        if (in.readByte() == 0) {
            tdKey = null;
        } else {
            tdKey = in.readLong();
        }
        group = in.readString();
        if (in.readByte() == 0) {
            rank = null;
        } else {
            rank = in.readLong();
        }
        if (in.readByte() == 0) {
            count = null;
        } else {
            count = in.readLong();
        }
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
        mBid = in.readString();
        mAsk = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(id);
        dest.writeString(name);
        dest.writeString(assetClass);
        dest.writeString(canonicalSymbol);
        dest.writeString(volatilityBandPercentage);
        dest.writeString(quantityIncrement);
        dest.writeString(priceIncrement);
        if (priceMultiplier == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeLong(priceMultiplier);
        }
        dest.writeString(sourceSymbol);
        dest.writeString(tradingStatus);
        dest.writeByte((byte) (tradingStatusChanged == null ? 0 : tradingStatusChanged ? 1 : 2));
        dest.writeByte((byte) (tradingShouldBeOpen == null ? 0 : tradingShouldBeOpen ? 1 : 2));
        dest.writeString(source);
        if (timestamp == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeLong(timestamp);
        }
        dest.writeString(minimumOrderQuantity);
        if (trustedSpread == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeDouble(trustedSpread);
        }
        if (unitPrice == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeDouble(unitPrice);
        }
        if (margin == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeFloat(margin);
        }
        if (contractSize == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeDouble(contractSize);
        }
        dest.writeString(contractInfoCurrency);
        dest.writeString(contractUnitOfMeasure);
        dest.writeStringList(tradingDays);
        if (tradingFrom == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeLong(tradingFrom);
        }
        if (tradingTo == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeLong(tradingTo);
        }
        dest.writeString(tradingTimezone);
        dest.writeString(startTime);
        if (endTime == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeLong(endTime);
        }
        if (lastClose == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeDouble(lastClose);
        }
        if (open == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeDouble(open);
        }
        dest.writeStringList(altGroups);
        if (tdKey == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeLong(tdKey);
        }
        dest.writeString(group);
        if (rank == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeLong(rank);
        }
        if (count == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeLong(count);
        }
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
        dest.writeString(mBid);
        dest.writeString(mAsk);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<InnerInstruments> CREATOR = new Creator<InnerInstruments>() {
        @Override
        public InnerInstruments createFromParcel(Parcel in) {
            return new InnerInstruments(in);
        }

        @Override
        public InnerInstruments[] newArray(int size) {
            return new InnerInstruments[size];
        }
    };


    public static final Comparator<InnerInstruments> BY_ASSETCLASS_WISE=new Comparator<InnerInstruments>() {
        @Override
        public int compare(InnerInstruments innerInstruments1, InnerInstruments o2) {
            return innerInstruments1.assetClass.compareTo(o2.assetClass);
        }
    };

    public static final Comparator<InnerInstruments> BY_NAME_WISE=new Comparator<InnerInstruments>() {
        @Override
        public int compare(InnerInstruments innerInstruments1, InnerInstruments o2) {
            return innerInstruments1.name.compareTo(o2.name);
        }
    };
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAssetClass() {
        return assetClass;
    }

    public void setAssetClass(String assetClass) {
        this.assetClass = assetClass;
    }

    public String getCanonicalSymbol() {
        return canonicalSymbol;
    }

    public void setCanonicalSymbol(String canonicalSymbol) {
        this.canonicalSymbol = canonicalSymbol;
    }

    public String getVolatilityBandPercentage() {
        return volatilityBandPercentage;
    }

    public void setVolatilityBandPercentage(String volatilityBandPercentage) {
        this.volatilityBandPercentage = volatilityBandPercentage;
    }

    public String getQuantityIncrement() {
        return quantityIncrement;
    }

    public void setQuantityIncrement(String quantityIncrement) {
        this.quantityIncrement = quantityIncrement;
    }

    public String getPriceIncrement() {
        return priceIncrement;
    }

    public void setPriceIncrement(String priceIncrement) {
        this.priceIncrement = priceIncrement;
    }

    public Long getPriceMultiplier() {
        return priceMultiplier;
    }

    public void setPriceMultiplier(Long priceMultiplier) {
        this.priceMultiplier = priceMultiplier;
    }

    public String getSourceSymbol() {
        return sourceSymbol;
    }

    public void setSourceSymbol(String sourceSymbol) {
        this.sourceSymbol = sourceSymbol;
    }

    public String getTradingStatus() {
        return tradingStatus;
    }

    public void setTradingStatus(String tradingStatus) {
        this.tradingStatus = tradingStatus;
    }

    public Boolean getTradingStatusChanged() {
        return tradingStatusChanged;
    }

    public void setTradingStatusChanged(Boolean tradingStatusChanged) {
        this.tradingStatusChanged = tradingStatusChanged;
    }

    public Boolean getTradingShouldBeOpen() {
        return tradingShouldBeOpen;
    }

    public void setTradingShouldBeOpen(Boolean tradingShouldBeOpen) {
        this.tradingShouldBeOpen = tradingShouldBeOpen;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getMinimumOrderQuantity() {
        return minimumOrderQuantity;
    }

    public void setMinimumOrderQuantity(String minimumOrderQuantity) {
        this.minimumOrderQuantity = minimumOrderQuantity;
    }

    public Double getTrustedSpread() {
        return trustedSpread;
    }

    public void setTrustedSpread(Double trustedSpread) {
        this.trustedSpread = trustedSpread;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Float getMargin() {
        return margin;
    }

    public void setMargin(Float margin) {
        this.margin = margin;
    }

    public Double getContractSize() {
        return contractSize;
    }

    public void setContractSize(Double contractSize) {
        this.contractSize = contractSize;
    }

    public String getContractInfoCurrency() {
        return contractInfoCurrency;
    }

    public void setContractInfoCurrency(String contractInfoCurrency) {
        this.contractInfoCurrency = contractInfoCurrency;
    }

    public String getContractUnitOfMeasure() {
        return contractUnitOfMeasure;
    }

    public void setContractUnitOfMeasure(String contractUnitOfMeasure) {
        this.contractUnitOfMeasure = contractUnitOfMeasure;
    }

    public List<String> getTradingDays() {
        return tradingDays;
    }

    public void setTradingDays(List<String> tradingDays) {
        this.tradingDays = tradingDays;
    }

    public Long getTradingFrom() {
        return tradingFrom;
    }

    public void setTradingFrom(Long tradingFrom) {
        this.tradingFrom = tradingFrom;
    }

    public Long getTradingTo() {
        return tradingTo;
    }

    public void setTradingTo(Long tradingTo) {
        this.tradingTo = tradingTo;
    }

    public String getTradingTimezone() {
        return tradingTimezone;
    }

    public void setTradingTimezone(String tradingTimezone) {
        this.tradingTimezone = tradingTimezone;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public Double getLastClose() {
        return lastClose;
    }

    public void setLastClose(Double lastClose) {
        this.lastClose = lastClose;
    }

    public Double getOpen() {
        return open;
    }

    public void setOpen(Double open) {
        this.open = open;
    }

    public List<String> getAltGroups() {
        return altGroups;
    }

    public void setAltGroups(List<String> altGroups) {
        this.altGroups = altGroups;
    }

    public Long getTdKey() {
        return tdKey;
    }

    public void setTdKey(Long tdKey) {
        this.tdKey = tdKey;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Long getRank() {
        return rank;
    }

    public void setRank(Long rank) {
        this.rank = rank;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "InnerInstruments{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", assetClass='" + assetClass + '\'' +
                ", canonicalSymbol='" + canonicalSymbol + '\'' +
                ", volatilityBandPercentage='" + volatilityBandPercentage + '\'' +
                ", quantityIncrement='" + quantityIncrement + '\'' +
                ", priceIncrement='" + priceIncrement + '\'' +
                ", priceMultiplier=" + priceMultiplier +
                ", sourceSymbol='" + sourceSymbol + '\'' +
                ", tradingStatus='" + tradingStatus + '\'' +
                ", tradingStatusChanged=" + tradingStatusChanged +
                ", tradingShouldBeOpen=" + tradingShouldBeOpen +
                ", source='" + source + '\'' +
                ", timestamp=" + timestamp +
                ", minimumOrderQuantity='" + minimumOrderQuantity + '\'' +
                ", trustedSpread=" + trustedSpread +
                ", unitPrice=" + unitPrice +
                ", margin=" + margin +
                ", contractSize=" + contractSize +
                ", contractInfoCurrency='" + contractInfoCurrency + '\'' +
                ", contractUnitOfMeasure='" + contractUnitOfMeasure + '\'' +
                ", tradingDays=" + tradingDays +
                ", tradingFrom=" + tradingFrom +
                ", tradingTo=" + tradingTo +
                ", tradingTimezone='" + tradingTimezone + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime=" + endTime +
                ", lastClose=" + lastClose +
                ", open=" + open +
                ", altGroups=" + altGroups +
                ", tdKey=" + tdKey +
                ", group='" + group + '\'' +
                ", rank=" + rank +
                ", count=" + count +
                ", bid=" + bid +
                ", ask=" + ask +
                ", mBid='" + mBid + '\'' +
                ", mAsk='" + mAsk + '\'' +
                '}';
    }
}

