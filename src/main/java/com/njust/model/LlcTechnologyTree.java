package com.njust.model;

import java.io.Serializable;

/**
 * @author 
 */
public class LlcTechnologyTree implements Serializable {
    /**
     * 技术树ID
     */
    private Integer technologyTreeId;

    /**
     * 技术树名称
     */
    private String technologyTreeName;

    private static final long serialVersionUID = 1L;

    public Integer getTechnologyTreeId() {
        return technologyTreeId;
    }

    public void setTechnologyTreeId(Integer technologyTreeId) {
        this.technologyTreeId = technologyTreeId;
    }

    public String getTechnologyTreeName() {
        return technologyTreeName;
    }

    public void setTechnologyTreeName(String technologyTreeName) {
        this.technologyTreeName = technologyTreeName;
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
        LlcTechnologyTree other = (LlcTechnologyTree) that;
        return (this.getTechnologyTreeId() == null ? other.getTechnologyTreeId() == null : this.getTechnologyTreeId().equals(other.getTechnologyTreeId()))
            && (this.getTechnologyTreeName() == null ? other.getTechnologyTreeName() == null : this.getTechnologyTreeName().equals(other.getTechnologyTreeName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTechnologyTreeId() == null) ? 0 : getTechnologyTreeId().hashCode());
        result = prime * result + ((getTechnologyTreeName() == null) ? 0 : getTechnologyTreeName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", technologyTreeId=").append(technologyTreeId);
        sb.append(", technologyTreeName=").append(technologyTreeName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}