package com.njust.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 */
public class LlcSvrRho implements Serializable {
    private String svrtime;

    private BigDecimal rhoIndex;

    private BigDecimal rhoValue;

    private static final long serialVersionUID = 1L;

    public String getSvrtime() {
        return svrtime;
    }

    public void setSvrtime(String svrtime) {
        this.svrtime = svrtime;
    }

    public BigDecimal getRhoIndex() {
        return rhoIndex;
    }

    public void setRhoIndex(BigDecimal rhoIndex) {
        this.rhoIndex = rhoIndex;
    }

    public BigDecimal getRhoValue() {
        return rhoValue;
    }

    public void setRhoValue(BigDecimal rhoValue) {
        this.rhoValue = rhoValue;
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
        LlcSvrRho other = (LlcSvrRho) that;
        return (this.getSvrtime() == null ? other.getSvrtime() == null : this.getSvrtime().equals(other.getSvrtime()))
            && (this.getRhoIndex() == null ? other.getRhoIndex() == null : this.getRhoIndex().equals(other.getRhoIndex()))
            && (this.getRhoValue() == null ? other.getRhoValue() == null : this.getRhoValue().equals(other.getRhoValue()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSvrtime() == null) ? 0 : getSvrtime().hashCode());
        result = prime * result + ((getRhoIndex() == null) ? 0 : getRhoIndex().hashCode());
        result = prime * result + ((getRhoValue() == null) ? 0 : getRhoValue().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", svrtime=").append(svrtime);
        sb.append(", rhoIndex=").append(rhoIndex);
        sb.append(", rhoValue=").append(rhoValue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}