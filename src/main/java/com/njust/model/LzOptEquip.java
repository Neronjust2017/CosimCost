package com.njust.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 */
public class LzOptEquip implements Serializable {
    private BigDecimal yEquipId;

    private BigDecimal optId;

    private BigDecimal staId;

    private BigDecimal equipId;

    private BigDecimal equipQuantity;

    private static final long serialVersionUID = 1L;

    public BigDecimal getyEquipId() {
        return yEquipId;
    }

    public void setyEquipId(BigDecimal yEquipId) {
        this.yEquipId = yEquipId;
    }

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

    public BigDecimal getEquipId() {
        return equipId;
    }

    public void setEquipId(BigDecimal equipId) {
        this.equipId = equipId;
    }

    public BigDecimal getEquipQuantity() {
        return equipQuantity;
    }

    public void setEquipQuantity(BigDecimal equipQuantity) {
        this.equipQuantity = equipQuantity;
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
        LzOptEquip other = (LzOptEquip) that;
        return (this.getyEquipId() == null ? other.getyEquipId() == null : this.getyEquipId().equals(other.getyEquipId()))
            && (this.getOptId() == null ? other.getOptId() == null : this.getOptId().equals(other.getOptId()))
            && (this.getStaId() == null ? other.getStaId() == null : this.getStaId().equals(other.getStaId()))
            && (this.getEquipId() == null ? other.getEquipId() == null : this.getEquipId().equals(other.getEquipId()))
            && (this.getEquipQuantity() == null ? other.getEquipQuantity() == null : this.getEquipQuantity().equals(other.getEquipQuantity()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getyEquipId() == null) ? 0 : getyEquipId().hashCode());
        result = prime * result + ((getOptId() == null) ? 0 : getOptId().hashCode());
        result = prime * result + ((getStaId() == null) ? 0 : getStaId().hashCode());
        result = prime * result + ((getEquipId() == null) ? 0 : getEquipId().hashCode());
        result = prime * result + ((getEquipQuantity() == null) ? 0 : getEquipQuantity().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", yEquipId=").append(yEquipId);
        sb.append(", optId=").append(optId);
        sb.append(", staId=").append(staId);
        sb.append(", equipId=").append(equipId);
        sb.append(", equipQuantity=").append(equipQuantity);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}