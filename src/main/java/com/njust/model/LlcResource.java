package com.njust.model;

import java.io.Serializable;

/**
 * @author 
 */
public class LlcResource extends LlcResourceKey implements Serializable {
    /**
     * 资源节点名称
     */
    private String resourceName;

    /**
     * 上级资源节点ID
     */
    private Integer superResourceId;

    private static final long serialVersionUID = 1L;

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public Integer getSuperResourceId() {
        return superResourceId;
    }

    public void setSuperResourceId(Integer superResourceId) {
        this.superResourceId = superResourceId;
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
        LlcResource other = (LlcResource) that;
        return (this.getResourceTreeId() == null ? other.getResourceTreeId() == null : this.getResourceTreeId().equals(other.getResourceTreeId()))
            && (this.getResourceId() == null ? other.getResourceId() == null : this.getResourceId().equals(other.getResourceId()))
            && (this.getResourceName() == null ? other.getResourceName() == null : this.getResourceName().equals(other.getResourceName()))
            && (this.getSuperResourceId() == null ? other.getSuperResourceId() == null : this.getSuperResourceId().equals(other.getSuperResourceId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getResourceTreeId() == null) ? 0 : getResourceTreeId().hashCode());
        result = prime * result + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        result = prime * result + ((getResourceName() == null) ? 0 : getResourceName().hashCode());
        result = prime * result + ((getSuperResourceId() == null) ? 0 : getSuperResourceId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", resourceName=").append(resourceName);
        sb.append(", superResourceId=").append(superResourceId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}