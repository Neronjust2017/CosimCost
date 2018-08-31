package com.njust.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 */
public class ZxFProd implements Serializable {
    private BigDecimal fProdId;

    private BigDecimal prodId;

    private BigDecimal staId;

    private BigDecimal prodNumber;

    private BigDecimal vsId;

    private Long workingHour;

    private static final long serialVersionUID = 1L;

    public BigDecimal getfProdId() {
        return fProdId;
    }

    public void setfProdId(BigDecimal fProdId) {
        this.fProdId = fProdId;
    }

    public BigDecimal getProdId() {
        return prodId;
    }

    public void setProdId(BigDecimal prodId) {
        this.prodId = prodId;
    }

    public BigDecimal getStaId() {
        return staId;
    }

    public void setStaId(BigDecimal staId) {
        this.staId = staId;
    }

    public BigDecimal getProdNumber() {
        return prodNumber;
    }

    public void setProdNumber(BigDecimal prodNumber) {
        this.prodNumber = prodNumber;
    }

    public BigDecimal getVsId() {
        return vsId;
    }

    public void setVsId(BigDecimal vsId) {
        this.vsId = vsId;
    }

    public Long getWorkingHour() {
        return workingHour;
    }

    public void setWorkingHour(Long workingHour) {
        this.workingHour = workingHour;
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
        ZxFProd other = (ZxFProd) that;
        return (this.getfProdId() == null ? other.getfProdId() == null : this.getfProdId().equals(other.getfProdId()))
            && (this.getProdId() == null ? other.getProdId() == null : this.getProdId().equals(other.getProdId()))
            && (this.getStaId() == null ? other.getStaId() == null : this.getStaId().equals(other.getStaId()))
            && (this.getProdNumber() == null ? other.getProdNumber() == null : this.getProdNumber().equals(other.getProdNumber()))
            && (this.getVsId() == null ? other.getVsId() == null : this.getVsId().equals(other.getVsId()))
            && (this.getWorkingHour() == null ? other.getWorkingHour() == null : this.getWorkingHour().equals(other.getWorkingHour()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getfProdId() == null) ? 0 : getfProdId().hashCode());
        result = prime * result + ((getProdId() == null) ? 0 : getProdId().hashCode());
        result = prime * result + ((getStaId() == null) ? 0 : getStaId().hashCode());
        result = prime * result + ((getProdNumber() == null) ? 0 : getProdNumber().hashCode());
        result = prime * result + ((getVsId() == null) ? 0 : getVsId().hashCode());
        result = prime * result + ((getWorkingHour() == null) ? 0 : getWorkingHour().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fProdId=").append(fProdId);
        sb.append(", prodId=").append(prodId);
        sb.append(", staId=").append(staId);
        sb.append(", prodNumber=").append(prodNumber);
        sb.append(", vsId=").append(vsId);
        sb.append(", workingHour=").append(workingHour);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}