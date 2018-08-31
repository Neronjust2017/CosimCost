package com.njust.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 */
public class ZxStation implements Serializable {
    private BigDecimal staId;

    private String staName;

    private BigDecimal hStaId;

    private BigDecimal hTime;

    private BigDecimal lTime;

    private BigDecimal type;

    private BigDecimal proId;

    private static final long serialVersionUID = 1L;

    public BigDecimal getStaId() {
        return staId;
    }

    public void setStaId(BigDecimal staId) {
        this.staId = staId;
    }

    public String getStaName() {
        return staName;
    }

    public void setStaName(String staName) {
        this.staName = staName;
    }

    public BigDecimal gethStaId() {
        return hStaId;
    }

    public void sethStaId(BigDecimal hStaId) {
        this.hStaId = hStaId;
    }

    public BigDecimal gethTime() {
        return hTime;
    }

    public void sethTime(BigDecimal hTime) {
        this.hTime = hTime;
    }

    public BigDecimal getlTime() {
        return lTime;
    }

    public void setlTime(BigDecimal lTime) {
        this.lTime = lTime;
    }

    public BigDecimal getType() {
        return type;
    }

    public void setType(BigDecimal type) {
        this.type = type;
    }

    public BigDecimal getProId() {
        return proId;
    }

    public void setProId(BigDecimal proId) {
        this.proId = proId;
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
        ZxStation other = (ZxStation) that;
        return (this.getStaId() == null ? other.getStaId() == null : this.getStaId().equals(other.getStaId()))
            && (this.getStaName() == null ? other.getStaName() == null : this.getStaName().equals(other.getStaName()))
            && (this.gethStaId() == null ? other.gethStaId() == null : this.gethStaId().equals(other.gethStaId()))
            && (this.gethTime() == null ? other.gethTime() == null : this.gethTime().equals(other.gethTime()))
            && (this.getlTime() == null ? other.getlTime() == null : this.getlTime().equals(other.getlTime()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getProId() == null ? other.getProId() == null : this.getProId().equals(other.getProId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStaId() == null) ? 0 : getStaId().hashCode());
        result = prime * result + ((getStaName() == null) ? 0 : getStaName().hashCode());
        result = prime * result + ((gethStaId() == null) ? 0 : gethStaId().hashCode());
        result = prime * result + ((gethTime() == null) ? 0 : gethTime().hashCode());
        result = prime * result + ((getlTime() == null) ? 0 : getlTime().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getProId() == null) ? 0 : getProId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", staId=").append(staId);
        sb.append(", staName=").append(staName);
        sb.append(", hStaId=").append(hStaId);
        sb.append(", hTime=").append(hTime);
        sb.append(", lTime=").append(lTime);
        sb.append(", type=").append(type);
        sb.append(", proId=").append(proId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}