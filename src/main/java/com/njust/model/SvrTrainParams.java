package com.njust.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 */
public class SvrTrainParams implements Serializable {
    private BigDecimal id;

    /**
     * 模型生成时刻
     */
    private String modelTime;

    private BigDecimal projectId;

    private BigDecimal schemeId;

    private BigDecimal costTreeId;

    private BigDecimal costId;

    private BigDecimal svrL;

    /**
     * 惩罚系数
     */
    private BigDecimal svrC;

    /**
     * Gamma系数
     */
    private BigDecimal svrGamma;

    /**
     * 精度值
     */
    private BigDecimal svrEps;

    private static final long serialVersionUID = 1L;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getModelTime() {
        return modelTime;
    }

    public void setModelTime(String modelTime) {
        this.modelTime = modelTime;
    }

    public BigDecimal getProjectId() {
        return projectId;
    }

    public void setProjectId(BigDecimal projectId) {
        this.projectId = projectId;
    }

    public BigDecimal getSchemeId() {
        return schemeId;
    }

    public void setSchemeId(BigDecimal schemeId) {
        this.schemeId = schemeId;
    }

    public BigDecimal getCostTreeId() {
        return costTreeId;
    }

    public void setCostTreeId(BigDecimal costTreeId) {
        this.costTreeId = costTreeId;
    }

    public BigDecimal getCostId() {
        return costId;
    }

    public void setCostId(BigDecimal costId) {
        this.costId = costId;
    }

    public BigDecimal getSvrL() {
        return svrL;
    }

    public void setSvrL(BigDecimal svrL) {
        this.svrL = svrL;
    }

    public BigDecimal getSvrC() {
        return svrC;
    }

    public void setSvrC(BigDecimal svrC) {
        this.svrC = svrC;
    }

    public BigDecimal getSvrGamma() {
        return svrGamma;
    }

    public void setSvrGamma(BigDecimal svrGamma) {
        this.svrGamma = svrGamma;
    }

    public BigDecimal getSvrEps() {
        return svrEps;
    }

    public void setSvrEps(BigDecimal svrEps) {
        this.svrEps = svrEps;
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
        SvrTrainParams other = (SvrTrainParams) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getModelTime() == null ? other.getModelTime() == null : this.getModelTime().equals(other.getModelTime()))
            && (this.getProjectId() == null ? other.getProjectId() == null : this.getProjectId().equals(other.getProjectId()))
            && (this.getSchemeId() == null ? other.getSchemeId() == null : this.getSchemeId().equals(other.getSchemeId()))
            && (this.getCostTreeId() == null ? other.getCostTreeId() == null : this.getCostTreeId().equals(other.getCostTreeId()))
            && (this.getCostId() == null ? other.getCostId() == null : this.getCostId().equals(other.getCostId()))
            && (this.getSvrL() == null ? other.getSvrL() == null : this.getSvrL().equals(other.getSvrL()))
            && (this.getSvrC() == null ? other.getSvrC() == null : this.getSvrC().equals(other.getSvrC()))
            && (this.getSvrGamma() == null ? other.getSvrGamma() == null : this.getSvrGamma().equals(other.getSvrGamma()))
            && (this.getSvrEps() == null ? other.getSvrEps() == null : this.getSvrEps().equals(other.getSvrEps()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getModelTime() == null) ? 0 : getModelTime().hashCode());
        result = prime * result + ((getProjectId() == null) ? 0 : getProjectId().hashCode());
        result = prime * result + ((getSchemeId() == null) ? 0 : getSchemeId().hashCode());
        result = prime * result + ((getCostTreeId() == null) ? 0 : getCostTreeId().hashCode());
        result = prime * result + ((getCostId() == null) ? 0 : getCostId().hashCode());
        result = prime * result + ((getSvrL() == null) ? 0 : getSvrL().hashCode());
        result = prime * result + ((getSvrC() == null) ? 0 : getSvrC().hashCode());
        result = prime * result + ((getSvrGamma() == null) ? 0 : getSvrGamma().hashCode());
        result = prime * result + ((getSvrEps() == null) ? 0 : getSvrEps().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", modelTime=").append(modelTime);
        sb.append(", projectId=").append(projectId);
        sb.append(", schemeId=").append(schemeId);
        sb.append(", costTreeId=").append(costTreeId);
        sb.append(", costId=").append(costId);
        sb.append(", svrL=").append(svrL);
        sb.append(", svrC=").append(svrC);
        sb.append(", svrGamma=").append(svrGamma);
        sb.append(", svrEps=").append(svrEps);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}