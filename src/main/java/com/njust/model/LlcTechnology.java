package com.njust.model;

import java.io.Serializable;

/**
 * @author 
 */
public class LlcTechnology extends LlcTechnologyKey implements Serializable {
    /**
     * 技术节点名称
     */
    private String technologyName;

    /**
     * 上级技术节点ID
     */
    private Integer superTechnologyId;

    private static final long serialVersionUID = 1L;

    public String getTechnologyName() {
        return technologyName;
    }

    public void setTechnologyName(String technologyName) {
        this.technologyName = technologyName;
    }

    public Integer getSuperTechnologyId() {
        return superTechnologyId;
    }

    public void setSuperTechnologyId(Integer superTechnologyId) {
        this.superTechnologyId = superTechnologyId;
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
        LlcTechnology other = (LlcTechnology) that;
        return (this.getTechnologyTreeId() == null ? other.getTechnologyTreeId() == null : this.getTechnologyTreeId().equals(other.getTechnologyTreeId()))
            && (this.getTechnologyId() == null ? other.getTechnologyId() == null : this.getTechnologyId().equals(other.getTechnologyId()))
            && (this.getTechnologyName() == null ? other.getTechnologyName() == null : this.getTechnologyName().equals(other.getTechnologyName()))
            && (this.getSuperTechnologyId() == null ? other.getSuperTechnologyId() == null : this.getSuperTechnologyId().equals(other.getSuperTechnologyId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTechnologyTreeId() == null) ? 0 : getTechnologyTreeId().hashCode());
        result = prime * result + ((getTechnologyId() == null) ? 0 : getTechnologyId().hashCode());
        result = prime * result + ((getTechnologyName() == null) ? 0 : getTechnologyName().hashCode());
        result = prime * result + ((getSuperTechnologyId() == null) ? 0 : getSuperTechnologyId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", technologyName=").append(technologyName);
        sb.append(", superTechnologyId=").append(superTechnologyId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}