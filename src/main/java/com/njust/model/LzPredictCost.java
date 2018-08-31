package com.njust.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 */
public class LzPredictCost implements Serializable {
    /**
     * 项目ID
     */
    private BigDecimal projectId;

    /**
     * 方案ID
     */
    private BigDecimal schemeId;

    /**
     * 费用ID
     */
    private BigDecimal costId;

    /**
     * 费用树ID
     */
    private BigDecimal costTreeId;

    /**
     * 历史库
     */
    private BigDecimal setId;

    /**
     * 训练方法（0：神经网络 1：SVR）
     */
    private Integer trainMethod;

    /**
     * 预测费用
     */
    private BigDecimal predictCost;

    private static final long serialVersionUID = 1L;

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

    public BigDecimal getCostId() {
        return costId;
    }

    public void setCostId(BigDecimal costId) {
        this.costId = costId;
    }

    public BigDecimal getCostTreeId() {
        return costTreeId;
    }

    public void setCostTreeId(BigDecimal costTreeId) {
        this.costTreeId = costTreeId;
    }

    public BigDecimal getSetId() {
        return setId;
    }

    public void setSetId(BigDecimal setId) {
        this.setId = setId;
    }

    public Integer getTrainMethod() {
        return trainMethod;
    }

    public void setTrainMethod(Integer trainMethod) {
        this.trainMethod = trainMethod;
    }

    public BigDecimal getPredictCost() {
        return predictCost;
    }

    public void setPredictCost(BigDecimal predictCost) {
        this.predictCost = predictCost;
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
        LzPredictCost other = (LzPredictCost) that;
        return (this.getProjectId() == null ? other.getProjectId() == null : this.getProjectId().equals(other.getProjectId()))
            && (this.getSchemeId() == null ? other.getSchemeId() == null : this.getSchemeId().equals(other.getSchemeId()))
            && (this.getCostId() == null ? other.getCostId() == null : this.getCostId().equals(other.getCostId()))
            && (this.getCostTreeId() == null ? other.getCostTreeId() == null : this.getCostTreeId().equals(other.getCostTreeId()))
            && (this.getSetId() == null ? other.getSetId() == null : this.getSetId().equals(other.getSetId()))
            && (this.getTrainMethod() == null ? other.getTrainMethod() == null : this.getTrainMethod().equals(other.getTrainMethod()))
            && (this.getPredictCost() == null ? other.getPredictCost() == null : this.getPredictCost().equals(other.getPredictCost()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProjectId() == null) ? 0 : getProjectId().hashCode());
        result = prime * result + ((getSchemeId() == null) ? 0 : getSchemeId().hashCode());
        result = prime * result + ((getCostId() == null) ? 0 : getCostId().hashCode());
        result = prime * result + ((getCostTreeId() == null) ? 0 : getCostTreeId().hashCode());
        result = prime * result + ((getSetId() == null) ? 0 : getSetId().hashCode());
        result = prime * result + ((getTrainMethod() == null) ? 0 : getTrainMethod().hashCode());
        result = prime * result + ((getPredictCost() == null) ? 0 : getPredictCost().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", projectId=").append(projectId);
        sb.append(", schemeId=").append(schemeId);
        sb.append(", costId=").append(costId);
        sb.append(", costTreeId=").append(costTreeId);
        sb.append(", setId=").append(setId);
        sb.append(", trainMethod=").append(trainMethod);
        sb.append(", predictCost=").append(predictCost);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}