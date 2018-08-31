package com.njust.model;

import java.io.Serializable;

/**
 * @author 
 */
public class LlcCostKey implements Serializable {
    /**
     * 费用树ID，表的主键
     */
    private Integer costTreeId;

    /**
     * 费用ID，表的主键
     */
    private Integer costId;

    private static final long serialVersionUID = 1L;

    public Integer getCostTreeId() {
        return costTreeId;
    }

    public void setCostTreeId(Integer costTreeId) {
        this.costTreeId = costTreeId;
    }

    public Integer getCostId() {
        return costId;
    }

    public void setCostId(Integer costId) {
        this.costId = costId;
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
        LlcCostKey other = (LlcCostKey) that;
        return (this.getCostTreeId() == null ? other.getCostTreeId() == null : this.getCostTreeId().equals(other.getCostTreeId()))
            && (this.getCostId() == null ? other.getCostId() == null : this.getCostId().equals(other.getCostId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCostTreeId() == null) ? 0 : getCostTreeId().hashCode());
        result = prime * result + ((getCostId() == null) ? 0 : getCostId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", costTreeId=").append(costTreeId);
        sb.append(", costId=").append(costId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}