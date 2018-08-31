package com.njust.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 */
public class LzOptItem implements Serializable {
    private BigDecimal yItemId;

    private BigDecimal optId;

    private BigDecimal staType;

    private BigDecimal spareId;

    private BigDecimal repairRate;

    private static final long serialVersionUID = 1L;

    public BigDecimal getyItemId() {
        return yItemId;
    }

    public void setyItemId(BigDecimal yItemId) {
        this.yItemId = yItemId;
    }

    public BigDecimal getOptId() {
        return optId;
    }

    public void setOptId(BigDecimal optId) {
        this.optId = optId;
    }

    public BigDecimal getStaType() {
        return staType;
    }

    public void setStaType(BigDecimal staType) {
        this.staType = staType;
    }

    public BigDecimal getSpareId() {
        return spareId;
    }

    public void setSpareId(BigDecimal spareId) {
        this.spareId = spareId;
    }

    public BigDecimal getRepairRate() {
        return repairRate;
    }

    public void setRepairRate(BigDecimal repairRate) {
        this.repairRate = repairRate;
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
        LzOptItem other = (LzOptItem) that;
        return (this.getyItemId() == null ? other.getyItemId() == null : this.getyItemId().equals(other.getyItemId()))
            && (this.getOptId() == null ? other.getOptId() == null : this.getOptId().equals(other.getOptId()))
            && (this.getStaType() == null ? other.getStaType() == null : this.getStaType().equals(other.getStaType()))
            && (this.getSpareId() == null ? other.getSpareId() == null : this.getSpareId().equals(other.getSpareId()))
            && (this.getRepairRate() == null ? other.getRepairRate() == null : this.getRepairRate().equals(other.getRepairRate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getyItemId() == null) ? 0 : getyItemId().hashCode());
        result = prime * result + ((getOptId() == null) ? 0 : getOptId().hashCode());
        result = prime * result + ((getStaType() == null) ? 0 : getStaType().hashCode());
        result = prime * result + ((getSpareId() == null) ? 0 : getSpareId().hashCode());
        result = prime * result + ((getRepairRate() == null) ? 0 : getRepairRate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", yItemId=").append(yItemId);
        sb.append(", optId=").append(optId);
        sb.append(", staType=").append(staType);
        sb.append(", spareId=").append(spareId);
        sb.append(", repairRate=").append(repairRate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}