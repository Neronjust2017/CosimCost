package com.njust.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 */
public class LlcNetW implements Serializable {
    private String svrtime;

    private BigDecimal wWeightlayerindex;

    private BigDecimal wFormpreindex;

    private BigDecimal wFormnxtindex;

    private BigDecimal wValue;

    private static final long serialVersionUID = 1L;

    public String getSvrtime() {
        return svrtime;
    }

    public void setSvrtime(String svrtime) {
        this.svrtime = svrtime;
    }

    public BigDecimal getwWeightlayerindex() {
        return wWeightlayerindex;
    }

    public void setwWeightlayerindex(BigDecimal wWeightlayerindex) {
        this.wWeightlayerindex = wWeightlayerindex;
    }

    public BigDecimal getwFormpreindex() {
        return wFormpreindex;
    }

    public void setwFormpreindex(BigDecimal wFormpreindex) {
        this.wFormpreindex = wFormpreindex;
    }

    public BigDecimal getwFormnxtindex() {
        return wFormnxtindex;
    }

    public void setwFormnxtindex(BigDecimal wFormnxtindex) {
        this.wFormnxtindex = wFormnxtindex;
    }

    public BigDecimal getwValue() {
        return wValue;
    }

    public void setwValue(BigDecimal wValue) {
        this.wValue = wValue;
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
        LlcNetW other = (LlcNetW) that;
        return (this.getSvrtime() == null ? other.getSvrtime() == null : this.getSvrtime().equals(other.getSvrtime()))
            && (this.getwWeightlayerindex() == null ? other.getwWeightlayerindex() == null : this.getwWeightlayerindex().equals(other.getwWeightlayerindex()))
            && (this.getwFormpreindex() == null ? other.getwFormpreindex() == null : this.getwFormpreindex().equals(other.getwFormpreindex()))
            && (this.getwFormnxtindex() == null ? other.getwFormnxtindex() == null : this.getwFormnxtindex().equals(other.getwFormnxtindex()))
            && (this.getwValue() == null ? other.getwValue() == null : this.getwValue().equals(other.getwValue()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSvrtime() == null) ? 0 : getSvrtime().hashCode());
        result = prime * result + ((getwWeightlayerindex() == null) ? 0 : getwWeightlayerindex().hashCode());
        result = prime * result + ((getwFormpreindex() == null) ? 0 : getwFormpreindex().hashCode());
        result = prime * result + ((getwFormnxtindex() == null) ? 0 : getwFormnxtindex().hashCode());
        result = prime * result + ((getwValue() == null) ? 0 : getwValue().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", svrtime=").append(svrtime);
        sb.append(", wWeightlayerindex=").append(wWeightlayerindex);
        sb.append(", wFormpreindex=").append(wFormpreindex);
        sb.append(", wFormnxtindex=").append(wFormnxtindex);
        sb.append(", wValue=").append(wValue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}