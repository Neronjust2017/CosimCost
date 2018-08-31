package com.njust.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 */
public class BpTrainParams implements Serializable {
    private BigDecimal id;

    /**
     * 模型生成时刻
     */
    private String modelTime;

    /**
     * bp参数之一
     */
    private BigDecimal alpha;

    /**
     * bp训练步长
     */
    private BigDecimal speed;

    /**
     * bp训练次数
     */
    private BigDecimal trainCount;

    /**
     * bp训练精度
     */
    private BigDecimal trainPrecision;

    /**
     * 标识符（取值为0）
     */
    private Integer flag;

    /**
     * 隐藏层 （只能为1）
     */
    private BigDecimal hlayersIndex;

    /**
     * 一个隐藏层里包含的神经元数
     */
    private BigDecimal hlayersValue;

    private BigDecimal costTreeId;

    private BigDecimal costId;

    private BigDecimal projectId;

    private BigDecimal schemeId;

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

    public BigDecimal getAlpha() {
        return alpha;
    }

    public void setAlpha(BigDecimal alpha) {
        this.alpha = alpha;
    }

    public BigDecimal getSpeed() {
        return speed;
    }

    public void setSpeed(BigDecimal speed) {
        this.speed = speed;
    }

    public BigDecimal getTrainCount() {
        return trainCount;
    }

    public void setTrainCount(BigDecimal trainCount) {
        this.trainCount = trainCount;
    }

    public BigDecimal getTrainPrecision() {
        return trainPrecision;
    }

    public void setTrainPrecision(BigDecimal trainPrecision) {
        this.trainPrecision = trainPrecision;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public BigDecimal getHlayersIndex() {
        return hlayersIndex;
    }

    public void setHlayersIndex(BigDecimal hlayersIndex) {
        this.hlayersIndex = hlayersIndex;
    }

    public BigDecimal getHlayersValue() {
        return hlayersValue;
    }

    public void setHlayersValue(BigDecimal hlayersValue) {
        this.hlayersValue = hlayersValue;
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
        BpTrainParams other = (BpTrainParams) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getModelTime() == null ? other.getModelTime() == null : this.getModelTime().equals(other.getModelTime()))
            && (this.getAlpha() == null ? other.getAlpha() == null : this.getAlpha().equals(other.getAlpha()))
            && (this.getSpeed() == null ? other.getSpeed() == null : this.getSpeed().equals(other.getSpeed()))
            && (this.getTrainCount() == null ? other.getTrainCount() == null : this.getTrainCount().equals(other.getTrainCount()))
            && (this.getTrainPrecision() == null ? other.getTrainPrecision() == null : this.getTrainPrecision().equals(other.getTrainPrecision()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getHlayersIndex() == null ? other.getHlayersIndex() == null : this.getHlayersIndex().equals(other.getHlayersIndex()))
            && (this.getHlayersValue() == null ? other.getHlayersValue() == null : this.getHlayersValue().equals(other.getHlayersValue()))
            && (this.getCostTreeId() == null ? other.getCostTreeId() == null : this.getCostTreeId().equals(other.getCostTreeId()))
            && (this.getCostId() == null ? other.getCostId() == null : this.getCostId().equals(other.getCostId()))
            && (this.getProjectId() == null ? other.getProjectId() == null : this.getProjectId().equals(other.getProjectId()))
            && (this.getSchemeId() == null ? other.getSchemeId() == null : this.getSchemeId().equals(other.getSchemeId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getModelTime() == null) ? 0 : getModelTime().hashCode());
        result = prime * result + ((getAlpha() == null) ? 0 : getAlpha().hashCode());
        result = prime * result + ((getSpeed() == null) ? 0 : getSpeed().hashCode());
        result = prime * result + ((getTrainCount() == null) ? 0 : getTrainCount().hashCode());
        result = prime * result + ((getTrainPrecision() == null) ? 0 : getTrainPrecision().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getHlayersIndex() == null) ? 0 : getHlayersIndex().hashCode());
        result = prime * result + ((getHlayersValue() == null) ? 0 : getHlayersValue().hashCode());
        result = prime * result + ((getCostTreeId() == null) ? 0 : getCostTreeId().hashCode());
        result = prime * result + ((getCostId() == null) ? 0 : getCostId().hashCode());
        result = prime * result + ((getProjectId() == null) ? 0 : getProjectId().hashCode());
        result = prime * result + ((getSchemeId() == null) ? 0 : getSchemeId().hashCode());
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
        sb.append(", alpha=").append(alpha);
        sb.append(", speed=").append(speed);
        sb.append(", trainCount=").append(trainCount);
        sb.append(", trainPrecision=").append(trainPrecision);
        sb.append(", flag=").append(flag);
        sb.append(", hlayersIndex=").append(hlayersIndex);
        sb.append(", hlayersValue=").append(hlayersValue);
        sb.append(", costTreeId=").append(costTreeId);
        sb.append(", costId=").append(costId);
        sb.append(", projectId=").append(projectId);
        sb.append(", schemeId=").append(schemeId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}