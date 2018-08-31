package com.njust.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 */
public class ZxProd implements Serializable {
    private BigDecimal prodId;

    private String prodOrder;

    private String prodName;

    private BigDecimal prodCost;

    private static final long serialVersionUID = 1L;

    public BigDecimal getProdId() {
        return prodId;
    }

    public void setProdId(BigDecimal prodId) {
        this.prodId = prodId;
    }

    public String getProdOrder() {
        return prodOrder;
    }

    public void setProdOrder(String prodOrder) {
        this.prodOrder = prodOrder;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public BigDecimal getProdCost() {
        return prodCost;
    }

    public void setProdCost(BigDecimal prodCost) {
        this.prodCost = prodCost;
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
        ZxProd other = (ZxProd) that;
        return (this.getProdId() == null ? other.getProdId() == null : this.getProdId().equals(other.getProdId()))
            && (this.getProdOrder() == null ? other.getProdOrder() == null : this.getProdOrder().equals(other.getProdOrder()))
            && (this.getProdName() == null ? other.getProdName() == null : this.getProdName().equals(other.getProdName()))
            && (this.getProdCost() == null ? other.getProdCost() == null : this.getProdCost().equals(other.getProdCost()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProdId() == null) ? 0 : getProdId().hashCode());
        result = prime * result + ((getProdOrder() == null) ? 0 : getProdOrder().hashCode());
        result = prime * result + ((getProdName() == null) ? 0 : getProdName().hashCode());
        result = prime * result + ((getProdCost() == null) ? 0 : getProdCost().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", prodId=").append(prodId);
        sb.append(", prodOrder=").append(prodOrder);
        sb.append(", prodName=").append(prodName);
        sb.append(", prodCost=").append(prodCost);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}