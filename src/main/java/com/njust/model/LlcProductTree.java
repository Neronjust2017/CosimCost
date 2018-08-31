package com.njust.model;

import java.io.Serializable;

/**
 * @author 
 */
public class LlcProductTree implements Serializable {
    /**
     * 产品树ID
     */
    private Integer productTreeId;

    /**
     * 产品树名称
     */
    private String productTreeName;

    private static final long serialVersionUID = 1L;

    public Integer getProductTreeId() {
        return productTreeId;
    }

    public void setProductTreeId(Integer productTreeId) {
        this.productTreeId = productTreeId;
    }

    public String getProductTreeName() {
        return productTreeName;
    }

    public void setProductTreeName(String productTreeName) {
        this.productTreeName = productTreeName;
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
        LlcProductTree other = (LlcProductTree) that;
        return (this.getProductTreeId() == null ? other.getProductTreeId() == null : this.getProductTreeId().equals(other.getProductTreeId()))
            && (this.getProductTreeName() == null ? other.getProductTreeName() == null : this.getProductTreeName().equals(other.getProductTreeName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProductTreeId() == null) ? 0 : getProductTreeId().hashCode());
        result = prime * result + ((getProductTreeName() == null) ? 0 : getProductTreeName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", productTreeId=").append(productTreeId);
        sb.append(", productTreeName=").append(productTreeName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}