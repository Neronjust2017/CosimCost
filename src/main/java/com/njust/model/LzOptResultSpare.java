package com.njust.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 */
public class LzOptResultSpare implements Serializable {
    private BigDecimal optId;

    private BigDecimal staId;

    private BigDecimal spareId;

    private BigDecimal spareQuantity;

    private BigDecimal spareCost;

    private static final long serialVersionUID = 1L;

    public BigDecimal getOptId() {
        return optId;
    }

    public void setOptId(BigDecimal optId) {
        this.optId = optId;
    }

    public BigDecimal getStaId() {
        return staId;
    }

    public void setStaId(BigDecimal staId) {
        this.staId = staId;
    }

    public BigDecimal getSpareId() {
        return spareId;
    }

    public void setSpareId(BigDecimal spareId) {
        this.spareId = spareId;
    }

    public BigDecimal getSpareQuantity() {
        return spareQuantity;
    }

    public void setSpareQuantity(BigDecimal spareQuantity) {
        this.spareQuantity = spareQuantity;
    }

    public BigDecimal getSpareCost() {
        return spareCost;
    }

    public void setSpareCost(BigDecimal spareCost) {
        this.spareCost = spareCost;
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
        LzOptResultSpare other = (LzOptResultSpare) that;
        return (this.getOptId() == null ? other.getOptId() == null : this.getOptId().equals(other.getOptId()))
            && (this.getStaId() == null ? other.getStaId() == null : this.getStaId().equals(other.getStaId()))
            && (this.getSpareId() == null ? other.getSpareId() == null : this.getSpareId().equals(other.getSpareId()))
            && (this.getSpareQuantity() == null ? other.getSpareQuantity() == null : this.getSpareQuantity().equals(other.getSpareQuantity()))
            && (this.getSpareCost() == null ? other.getSpareCost() == null : this.getSpareCost().equals(other.getSpareCost()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOptId() == null) ? 0 : getOptId().hashCode());
        result = prime * result + ((getStaId() == null) ? 0 : getStaId().hashCode());
        result = prime * result + ((getSpareId() == null) ? 0 : getSpareId().hashCode());
        result = prime * result + ((getSpareQuantity() == null) ? 0 : getSpareQuantity().hashCode());
        result = prime * result + ((getSpareCost() == null) ? 0 : getSpareCost().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", optId=").append(optId);
        sb.append(", staId=").append(staId);
        sb.append(", spareId=").append(spareId);
        sb.append(", spareQuantity=").append(spareQuantity);
        sb.append(", spareCost=").append(spareCost);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}