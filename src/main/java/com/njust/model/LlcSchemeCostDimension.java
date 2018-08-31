package com.njust.model;

import java.io.Serializable;

/**
 * @author 
 */
public class LlcSchemeCostDimension implements Serializable {
    /**
     * 方案ID
     */
    private Integer schemeId;

    /**
     * 费用ID
     */
    private Integer costId;

    /**
     * 上级费用ID
     */
    private Integer superCostId;

    /**
     * 对应产品ID
     */
    private Integer belongProductId;

    /**
     * 对应任务ID
     */
    private Integer belongTaskId;

    /**
     * 对应资源ID
     */
    private Integer belongResourceId;

    /**
     * 对应时间ID
     */
    private Integer belongTimeId;

    /**
     * 对应技术ID
     */
    private Integer belongTechnologyId;

    private static final long serialVersionUID = 1L;

    public Integer getSchemeId() {
        return schemeId;
    }

    public void setSchemeId(Integer schemeId) {
        this.schemeId = schemeId;
    }

    public Integer getCostId() {
        return costId;
    }

    public void setCostId(Integer costId) {
        this.costId = costId;
    }

    public Integer getSuperCostId() {
        return superCostId;
    }

    public void setSuperCostId(Integer superCostId) {
        this.superCostId = superCostId;
    }

    public Integer getBelongProductId() {
        return belongProductId;
    }

    public void setBelongProductId(Integer belongProductId) {
        this.belongProductId = belongProductId;
    }

    public Integer getBelongTaskId() {
        return belongTaskId;
    }

    public void setBelongTaskId(Integer belongTaskId) {
        this.belongTaskId = belongTaskId;
    }

    public Integer getBelongResourceId() {
        return belongResourceId;
    }

    public void setBelongResourceId(Integer belongResourceId) {
        this.belongResourceId = belongResourceId;
    }

    public Integer getBelongTimeId() {
        return belongTimeId;
    }

    public void setBelongTimeId(Integer belongTimeId) {
        this.belongTimeId = belongTimeId;
    }

    public Integer getBelongTechnologyId() {
        return belongTechnologyId;
    }

    public void setBelongTechnologyId(Integer belongTechnologyId) {
        this.belongTechnologyId = belongTechnologyId;
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
        LlcSchemeCostDimension other = (LlcSchemeCostDimension) that;
        return (this.getSchemeId() == null ? other.getSchemeId() == null : this.getSchemeId().equals(other.getSchemeId()))
            && (this.getCostId() == null ? other.getCostId() == null : this.getCostId().equals(other.getCostId()))
            && (this.getSuperCostId() == null ? other.getSuperCostId() == null : this.getSuperCostId().equals(other.getSuperCostId()))
            && (this.getBelongProductId() == null ? other.getBelongProductId() == null : this.getBelongProductId().equals(other.getBelongProductId()))
            && (this.getBelongTaskId() == null ? other.getBelongTaskId() == null : this.getBelongTaskId().equals(other.getBelongTaskId()))
            && (this.getBelongResourceId() == null ? other.getBelongResourceId() == null : this.getBelongResourceId().equals(other.getBelongResourceId()))
            && (this.getBelongTimeId() == null ? other.getBelongTimeId() == null : this.getBelongTimeId().equals(other.getBelongTimeId()))
            && (this.getBelongTechnologyId() == null ? other.getBelongTechnologyId() == null : this.getBelongTechnologyId().equals(other.getBelongTechnologyId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSchemeId() == null) ? 0 : getSchemeId().hashCode());
        result = prime * result + ((getCostId() == null) ? 0 : getCostId().hashCode());
        result = prime * result + ((getSuperCostId() == null) ? 0 : getSuperCostId().hashCode());
        result = prime * result + ((getBelongProductId() == null) ? 0 : getBelongProductId().hashCode());
        result = prime * result + ((getBelongTaskId() == null) ? 0 : getBelongTaskId().hashCode());
        result = prime * result + ((getBelongResourceId() == null) ? 0 : getBelongResourceId().hashCode());
        result = prime * result + ((getBelongTimeId() == null) ? 0 : getBelongTimeId().hashCode());
        result = prime * result + ((getBelongTechnologyId() == null) ? 0 : getBelongTechnologyId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", schemeId=").append(schemeId);
        sb.append(", costId=").append(costId);
        sb.append(", superCostId=").append(superCostId);
        sb.append(", belongProductId=").append(belongProductId);
        sb.append(", belongTaskId=").append(belongTaskId);
        sb.append(", belongResourceId=").append(belongResourceId);
        sb.append(", belongTimeId=").append(belongTimeId);
        sb.append(", belongTechnologyId=").append(belongTechnologyId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}