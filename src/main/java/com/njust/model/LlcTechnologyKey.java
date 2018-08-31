package com.njust.model;

import java.io.Serializable;

/**
 * @author 
 */
public class LlcTechnologyKey implements Serializable {
    /**
     * 技术树ID
     */
    private Integer technologyTreeId;

    /**
     * 技术节点ID
     */
    private Integer technologyId;

    private static final long serialVersionUID = 1L;

    public Integer getTechnologyTreeId() {
        return technologyTreeId;
    }

    public void setTechnologyTreeId(Integer technologyTreeId) {
        this.technologyTreeId = technologyTreeId;
    }

    public Integer getTechnologyId() {
        return technologyId;
    }

    public void setTechnologyId(Integer technologyId) {
        this.technologyId = technologyId;
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
        LlcTechnologyKey other = (LlcTechnologyKey) that;
        return (this.getTechnologyTreeId() == null ? other.getTechnologyTreeId() == null : this.getTechnologyTreeId().equals(other.getTechnologyTreeId()))
            && (this.getTechnologyId() == null ? other.getTechnologyId() == null : this.getTechnologyId().equals(other.getTechnologyId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTechnologyTreeId() == null) ? 0 : getTechnologyTreeId().hashCode());
        result = prime * result + ((getTechnologyId() == null) ? 0 : getTechnologyId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", technologyTreeId=").append(technologyTreeId);
        sb.append(", technologyId=").append(technologyId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}