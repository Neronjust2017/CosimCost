package com.njust.model;

import java.io.Serializable;

/**
 * @author 
 */
public class LlcResourceTree implements Serializable {
    /**
     * 资源树ID
     */
    private Integer resourceTreeId;

    /**
     * 资源树名称
     */
    private String resourceTreeName;

    private static final long serialVersionUID = 1L;

    public Integer getResourceTreeId() {
        return resourceTreeId;
    }

    public void setResourceTreeId(Integer resourceTreeId) {
        this.resourceTreeId = resourceTreeId;
    }

    public String getResourceTreeName() {
        return resourceTreeName;
    }

    public void setResourceTreeName(String resourceTreeName) {
        this.resourceTreeName = resourceTreeName;
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
        LlcResourceTree other = (LlcResourceTree) that;
        return (this.getResourceTreeId() == null ? other.getResourceTreeId() == null : this.getResourceTreeId().equals(other.getResourceTreeId()))
            && (this.getResourceTreeName() == null ? other.getResourceTreeName() == null : this.getResourceTreeName().equals(other.getResourceTreeName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getResourceTreeId() == null) ? 0 : getResourceTreeId().hashCode());
        result = prime * result + ((getResourceTreeName() == null) ? 0 : getResourceTreeName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", resourceTreeId=").append(resourceTreeId);
        sb.append(", resourceTreeName=").append(resourceTreeName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}