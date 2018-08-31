package com.njust.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 */
public class EquipAvailabilityChange implements Serializable {
    private BigDecimal id;

    private BigDecimal optId;

    private BigDecimal equipId;

    private BigDecimal equipAvailability;

    private BigDecimal generation;

    private BigDecimal staId;

    private static final long serialVersionUID = 1L;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getOptId() {
        return optId;
    }

    public void setOptId(BigDecimal optId) {
        this.optId = optId;
    }

    public BigDecimal getEquipId() {
        return equipId;
    }

    public void setEquipId(BigDecimal equipId) {
        this.equipId = equipId;
    }

    public BigDecimal getEquipAvailability() {
        return equipAvailability;
    }

    public void setEquipAvailability(BigDecimal equipAvailability) {
        this.equipAvailability = equipAvailability;
    }

    public BigDecimal getGeneration() {
        return generation;
    }

    public void setGeneration(BigDecimal generation) {
        this.generation = generation;
    }

    public BigDecimal getStaId() {
        return staId;
    }

    public void setStaId(BigDecimal staId) {
        this.staId = staId;
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
        EquipAvailabilityChange other = (EquipAvailabilityChange) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOptId() == null ? other.getOptId() == null : this.getOptId().equals(other.getOptId()))
            && (this.getEquipId() == null ? other.getEquipId() == null : this.getEquipId().equals(other.getEquipId()))
            && (this.getEquipAvailability() == null ? other.getEquipAvailability() == null : this.getEquipAvailability().equals(other.getEquipAvailability()))
            && (this.getGeneration() == null ? other.getGeneration() == null : this.getGeneration().equals(other.getGeneration()))
            && (this.getStaId() == null ? other.getStaId() == null : this.getStaId().equals(other.getStaId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOptId() == null) ? 0 : getOptId().hashCode());
        result = prime * result + ((getEquipId() == null) ? 0 : getEquipId().hashCode());
        result = prime * result + ((getEquipAvailability() == null) ? 0 : getEquipAvailability().hashCode());
        result = prime * result + ((getGeneration() == null) ? 0 : getGeneration().hashCode());
        result = prime * result + ((getStaId() == null) ? 0 : getStaId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", optId=").append(optId);
        sb.append(", equipId=").append(equipId);
        sb.append(", equipAvailability=").append(equipAvailability);
        sb.append(", generation=").append(generation);
        sb.append(", staId=").append(staId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}