package com.njust.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 */
public class LlcNetMinin implements Serializable {
    private String svrtime;

    private BigDecimal mininIndex;

    private BigDecimal mininValue;

    private static final long serialVersionUID = 1L;

    public String getSvrtime() {
        return svrtime;
    }

    public void setSvrtime(String svrtime) {
        this.svrtime = svrtime;
    }

    public BigDecimal getMininIndex() {
        return mininIndex;
    }

    public void setMininIndex(BigDecimal mininIndex) {
        this.mininIndex = mininIndex;
    }

    public BigDecimal getMininValue() {
        return mininValue;
    }

    public void setMininValue(BigDecimal mininValue) {
        this.mininValue = mininValue;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        LlcNetMinin other = (LlcNetMinin) that;
        return (this.getSvrtime() == null ? other.getSvrtime() == null : this.getSvrtime().equals(other.getSvrtime()))
            && (this.getMininIndex() == null ? other.getMininIndex() == null : this.getMininIndex().equals(other.getMininIndex()))
            && (this.getMininValue() == null ? other.getMininValue() == null : this.getMininValue().equals(other.getMininValue()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSvrtime() == null) ? 0 : getSvrtime().hashCode());
        result = prime * result + ((getMininIndex() == null) ? 0 : getMininIndex().hashCode());
        result = prime * result + ((getMininValue() == null) ? 0 : getMininValue().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", svrtime=").append(svrtime);
        sb.append(", mininIndex=").append(mininIndex);
        sb.append(", mininValue=").append(mininValue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}