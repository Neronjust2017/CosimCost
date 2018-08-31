package com.njust.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 */
public class EboChange implements Serializable {
    private BigDecimal id;

    private BigDecimal optId;

    private BigDecimal ebo;

    private BigDecimal generation;

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

    public BigDecimal getEbo() {
        return ebo;
    }

    public void setEbo(BigDecimal ebo) {
        this.ebo = ebo;
    }

    public BigDecimal getGeneration() {
        return generation;
    }

    public void setGeneration(BigDecimal generation) {
        this.generation = generation;
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
        EboChange other = (EboChange) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOptId() == null ? other.getOptId() == null : this.getOptId().equals(other.getOptId()))
            && (this.getEbo() == null ? other.getEbo() == null : this.getEbo().equals(other.getEbo()))
            && (this.getGeneration() == null ? other.getGeneration() == null : this.getGeneration().equals(other.getGeneration()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOptId() == null) ? 0 : getOptId().hashCode());
        result = prime * result + ((getEbo() == null) ? 0 : getEbo().hashCode());
        result = prime * result + ((getGeneration() == null) ? 0 : getGeneration().hashCode());
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
        sb.append(", ebo=").append(ebo);
        sb.append(", generation=").append(generation);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}