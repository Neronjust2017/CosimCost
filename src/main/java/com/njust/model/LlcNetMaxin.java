package com.njust.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 */
public class LlcNetMaxin implements Serializable {
    private String svrtime;

    private BigDecimal maxinIndex;

    private BigDecimal maxinValue;

    private static final long serialVersionUID = 1L;

    public String getSvrtime() {
        return svrtime;
    }

    public void setSvrtime(String svrtime) {
        this.svrtime = svrtime;
    }

    public BigDecimal getMaxinIndex() {
        return maxinIndex;
    }

    public void setMaxinIndex(BigDecimal maxinIndex) {
        this.maxinIndex = maxinIndex;
    }

    public BigDecimal getMaxinValue() {
        return maxinValue;
    }

    public void setMaxinValue(BigDecimal maxinValue) {
        this.maxinValue = maxinValue;
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
        LlcNetMaxin other = (LlcNetMaxin) that;
        return (this.getSvrtime() == null ? other.getSvrtime() == null : this.getSvrtime().equals(other.getSvrtime()))
            && (this.getMaxinIndex() == null ? other.getMaxinIndex() == null : this.getMaxinIndex().equals(other.getMaxinIndex()))
            && (this.getMaxinValue() == null ? other.getMaxinValue() == null : this.getMaxinValue().equals(other.getMaxinValue()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSvrtime() == null) ? 0 : getSvrtime().hashCode());
        result = prime * result + ((getMaxinIndex() == null) ? 0 : getMaxinIndex().hashCode());
        result = prime * result + ((getMaxinValue() == null) ? 0 : getMaxinValue().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", svrtime=").append(svrtime);
        sb.append(", maxinIndex=").append(maxinIndex);
        sb.append(", maxinValue=").append(maxinValue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}