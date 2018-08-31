package com.njust.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 */
public class LlcNetHlayers implements Serializable {
    private String svrtime;

    private BigDecimal hlayersIndex;

    private BigDecimal hlayersValue;

    private static final long serialVersionUID = 1L;

    public String getSvrtime() {
        return svrtime;
    }

    public void setSvrtime(String svrtime) {
        this.svrtime = svrtime;
    }

    public BigDecimal getHlayersIndex() {
        return hlayersIndex;
    }

    public void setHlayersIndex(BigDecimal hlayersIndex) {
        this.hlayersIndex = hlayersIndex;
    }

    public BigDecimal getHlayersValue() {
        return hlayersValue;
    }

    public void setHlayersValue(BigDecimal hlayersValue) {
        this.hlayersValue = hlayersValue;
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
        LlcNetHlayers other = (LlcNetHlayers) that;
        return (this.getSvrtime() == null ? other.getSvrtime() == null : this.getSvrtime().equals(other.getSvrtime()))
            && (this.getHlayersIndex() == null ? other.getHlayersIndex() == null : this.getHlayersIndex().equals(other.getHlayersIndex()))
            && (this.getHlayersValue() == null ? other.getHlayersValue() == null : this.getHlayersValue().equals(other.getHlayersValue()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSvrtime() == null) ? 0 : getSvrtime().hashCode());
        result = prime * result + ((getHlayersIndex() == null) ? 0 : getHlayersIndex().hashCode());
        result = prime * result + ((getHlayersValue() == null) ? 0 : getHlayersValue().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", svrtime=").append(svrtime);
        sb.append(", hlayersIndex=").append(hlayersIndex);
        sb.append(", hlayersValue=").append(hlayersValue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}