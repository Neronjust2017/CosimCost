package com.njust.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 */
public class ZxFItem implements Serializable {
    private BigDecimal fItemId;

    private BigDecimal itemId;

    private BigDecimal staId;

    private BigDecimal itemNumber;

    private BigDecimal vsId;

    private static final long serialVersionUID = 1L;

    public BigDecimal getfItemId() {
        return fItemId;
    }

    public void setfItemId(BigDecimal fItemId) {
        this.fItemId = fItemId;
    }

    public BigDecimal getItemId() {
        return itemId;
    }

    public void setItemId(BigDecimal itemId) {
        this.itemId = itemId;
    }

    public BigDecimal getStaId() {
        return staId;
    }

    public void setStaId(BigDecimal staId) {
        this.staId = staId;
    }

    public BigDecimal getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(BigDecimal itemNumber) {
        this.itemNumber = itemNumber;
    }

    public BigDecimal getVsId() {
        return vsId;
    }

    public void setVsId(BigDecimal vsId) {
        this.vsId = vsId;
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
        ZxFItem other = (ZxFItem) that;
        return (this.getfItemId() == null ? other.getfItemId() == null : this.getfItemId().equals(other.getfItemId()))
            && (this.getItemId() == null ? other.getItemId() == null : this.getItemId().equals(other.getItemId()))
            && (this.getStaId() == null ? other.getStaId() == null : this.getStaId().equals(other.getStaId()))
            && (this.getItemNumber() == null ? other.getItemNumber() == null : this.getItemNumber().equals(other.getItemNumber()))
            && (this.getVsId() == null ? other.getVsId() == null : this.getVsId().equals(other.getVsId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getfItemId() == null) ? 0 : getfItemId().hashCode());
        result = prime * result + ((getItemId() == null) ? 0 : getItemId().hashCode());
        result = prime * result + ((getStaId() == null) ? 0 : getStaId().hashCode());
        result = prime * result + ((getItemNumber() == null) ? 0 : getItemNumber().hashCode());
        result = prime * result + ((getVsId() == null) ? 0 : getVsId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fItemId=").append(fItemId);
        sb.append(", itemId=").append(itemId);
        sb.append(", staId=").append(staId);
        sb.append(", itemNumber=").append(itemNumber);
        sb.append(", vsId=").append(vsId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}