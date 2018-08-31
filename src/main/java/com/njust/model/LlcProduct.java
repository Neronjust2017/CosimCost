package com.njust.model;

import java.io.Serializable;

/**
 * @author 
 */
public class LlcProduct extends LlcProductKey implements Serializable {
    /**
     * 产品节点名称
     */
    private String productName;

    /**
     * 上级产品节点ID
     */
    private Integer superProductId;

    private static final long serialVersionUID = 1L;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getSuperProductId() {
        return superProductId;
    }

    public void setSuperProductId(Integer superProductId) {
        this.superProductId = superProductId;
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
        LlcProduct other = (LlcProduct) that;
        return (this.getProductTreeId() == null ? other.getProductTreeId() == null : this.getProductTreeId().equals(other.getProductTreeId()))
            && (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getProductName() == null ? other.getProductName() == null : this.getProductName().equals(other.getProductName()))
            && (this.getSuperProductId() == null ? other.getSuperProductId() == null : this.getSuperProductId().equals(other.getSuperProductId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProductTreeId() == null) ? 0 : getProductTreeId().hashCode());
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getProductName() == null) ? 0 : getProductName().hashCode());
        result = prime * result + ((getSuperProductId() == null) ? 0 : getSuperProductId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", productName=").append(productName);
        sb.append(", superProductId=").append(superProductId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}