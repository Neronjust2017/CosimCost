package com.njust.model;

import java.io.Serializable;

/**
 * @author 
 */
public class LlcProductKey implements Serializable {
    /**
     * 产品树ID
     */
    private Integer productTreeId;

    /**
     * 产品节点ID
     */
    private Integer productId;

    private static final long serialVersionUID = 1L;

    public Integer getProductTreeId() {
        return productTreeId;
    }

    public void setProductTreeId(Integer productTreeId) {
        this.productTreeId = productTreeId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
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
        LlcProductKey other = (LlcProductKey) that;
        return (this.getProductTreeId() == null ? other.getProductTreeId() == null : this.getProductTreeId().equals(other.getProductTreeId()))
            && (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProductTreeId() == null) ? 0 : getProductTreeId().hashCode());
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", productTreeId=").append(productTreeId);
        sb.append(", productId=").append(productId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}