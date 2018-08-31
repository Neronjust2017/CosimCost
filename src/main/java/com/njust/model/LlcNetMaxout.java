package com.njust.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 */
public class LlcNetMaxout implements Serializable {
    private String svrtime;

    private BigDecimal maxoutIndex;

    private BigDecimal maxoutValue;

    private static final long serialVersionUID = 1L;

    public String getSvrtime() {
        return svrtime;
    }

    public void setSvrtime(String svrtime) {
        this.svrtime = svrtime;
    }

    public BigDecimal getMaxoutIndex() {
        return maxoutIndex;
    }

    public void setMaxoutIndex(BigDecimal maxoutIndex) {
        this.maxoutIndex = maxoutIndex;
    }

    public BigDecimal getMaxoutValue() {
        return maxoutValue;
    }

    public void setMaxoutValue(BigDecimal maxoutValue) {
        this.maxoutValue = maxoutValue;
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
        LlcNetMaxout other = (LlcNetMaxout) that;
        return (this.getSvrtime() == null ? other.getSvrtime() == null : this.getSvrtime().equals(other.getSvrtime()))
            && (this.getMaxoutIndex() == null ? other.getMaxoutIndex() == null : this.getMaxoutIndex().equals(other.getMaxoutIndex()))
            && (this.getMaxoutValue() == null ? other.getMaxoutValue() == null : this.getMaxoutValue().equals(other.getMaxoutValue()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSvrtime() == null) ? 0 : getSvrtime().hashCode());
        result = prime * result + ((getMaxoutIndex() == null) ? 0 : getMaxoutIndex().hashCode());
        result = prime * result + ((getMaxoutValue() == null) ? 0 : getMaxoutValue().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", svrtime=").append(svrtime);
        sb.append(", maxoutIndex=").append(maxoutIndex);
        sb.append(", maxoutValue=").append(maxoutValue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}