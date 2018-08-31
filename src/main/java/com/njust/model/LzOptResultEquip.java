package com.njust.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 */
public class LzOptResultEquip implements Serializable {
    private BigDecimal optId;

    private BigDecimal staId;

    private BigDecimal resultEquipId;

    private BigDecimal equipAvailability;

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

    public BigDecimal getResultEquipId() {
        return resultEquipId;
    }

    public void setResultEquipId(BigDecimal resultEquipId) {
        this.resultEquipId = resultEquipId;
    }

    public BigDecimal getEquipAvailability() {
        return equipAvailability;
    }

    public void setEquipAvailability(BigDecimal equipAvailability) {
        this.equipAvailability = equipAvailability;
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
        LzOptResultEquip other = (LzOptResultEquip) that;
        return (this.getOptId() == null ? other.getOptId() == null : this.getOptId().equals(other.getOptId()))
            && (this.getStaId() == null ? other.getStaId() == null : this.getStaId().equals(other.getStaId()))
            && (this.getResultEquipId() == null ? other.getResultEquipId() == null : this.getResultEquipId().equals(other.getResultEquipId()))
            && (this.getEquipAvailability() == null ? other.getEquipAvailability() == null : this.getEquipAvailability().equals(other.getEquipAvailability()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOptId() == null) ? 0 : getOptId().hashCode());
        result = prime * result + ((getStaId() == null) ? 0 : getStaId().hashCode());
        result = prime * result + ((getResultEquipId() == null) ? 0 : getResultEquipId().hashCode());
        result = prime * result + ((getEquipAvailability() == null) ? 0 : getEquipAvailability().hashCode());
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
        sb.append(", resultEquipId=").append(resultEquipId);
        sb.append(", equipAvailability=").append(equipAvailability);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}