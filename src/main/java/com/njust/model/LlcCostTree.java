package com.njust.model;

import java.io.Serializable;

/**
 * @author 
 */
public class LlcCostTree implements Serializable {
    /**
     * 费用树ID，表的主键
     */
    private Integer costTreeId;

    /**
     * 费用树名称
     */
    private String costTreeName;

    private static final long serialVersionUID = 1L;

    public Integer getCostTreeId() {
        return costTreeId;
    }

    public void setCostTreeId(Integer costTreeId) {
        this.costTreeId = costTreeId;
    }

    public String getCostTreeName() {
        return costTreeName;
    }

    public void setCostTreeName(String costTreeName) {
        this.costTreeName = costTreeName;
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
        LlcCostTree other = (LlcCostTree) that;
        return (this.getCostTreeId() == null ? other.getCostTreeId() == null : this.getCostTreeId().equals(other.getCostTreeId()))
            && (this.getCostTreeName() == null ? other.getCostTreeName() == null : this.getCostTreeName().equals(other.getCostTreeName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCostTreeId() == null) ? 0 : getCostTreeId().hashCode());
        result = prime * result + ((getCostTreeName() == null) ? 0 : getCostTreeName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", costTreeId=").append(costTreeId);
        sb.append(", costTreeName=").append(costTreeName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}