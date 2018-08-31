package com.njust.model;

import java.io.Serializable;

/**
 * @author 
 */
public class LlcResourceKey implements Serializable {
    /**
     * 资源树ID
     */
    private Integer resourceTreeId;

    /**
     * 资源节点ID
     */
    private Integer resourceId;

    private static final long serialVersionUID = 1L;

    public Integer getResourceTreeId() {
        return resourceTreeId;
    }

    public void setResourceTreeId(Integer resourceTreeId) {
        this.resourceTreeId = resourceTreeId;
    }

    public Integer getResourceId() {
        return resourceId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
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
        LlcResourceKey other = (LlcResourceKey) that;
        return (this.getResourceTreeId() == null ? other.getResourceTreeId() == null : this.getResourceTreeId().equals(other.getResourceTreeId()))
            && (this.getResourceId() == null ? other.getResourceId() == null : this.getResourceId().equals(other.getResourceId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getResourceTreeId() == null) ? 0 : getResourceTreeId().hashCode());
        result = prime * result + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", resourceTreeId=").append(resourceTreeId);
        sb.append(", resourceId=").append(resourceId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}