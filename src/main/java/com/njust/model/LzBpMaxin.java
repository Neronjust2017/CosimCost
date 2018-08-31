package com.njust.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 */
public class LzBpMaxin implements Serializable {
    /**
     * 模型生成时刻
     */
    private String modelTime;

    private BigDecimal maxinIndex;

    private BigDecimal maxinValue;

    private static final long serialVersionUID = 1L;

    public String getModelTime() {
        return modelTime;
    }

    public void setModelTime(String modelTime) {
        this.modelTime = modelTime;
    }

    public BigDecimal getMaxinIndex() {
        return maxinIndex;
    }

    public void setMaxinIndex(BigDecimal maxinIndex) {
        this.maxinIndex = maxinIndex;
    }

    public BigDecimal getMaxinValue() {
        return maxinValue;
    }

    public void setMaxinValue(BigDecimal maxinValue) {
        this.maxinValue = maxinValue;
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
        LzBpMaxin other = (LzBpMaxin) that;
        return (this.getModelTime() == null ? other.getModelTime() == null : this.getModelTime().equals(other.getModelTime()))
            && (this.getMaxinIndex() == null ? other.getMaxinIndex() == null : this.getMaxinIndex().equals(other.getMaxinIndex()))
            && (this.getMaxinValue() == null ? other.getMaxinValue() == null : this.getMaxinValue().equals(other.getMaxinValue()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getModelTime() == null) ? 0 : getModelTime().hashCode());
        result = prime * result + ((getMaxinIndex() == null) ? 0 : getMaxinIndex().hashCode());
        result = prime * result + ((getMaxinValue() == null) ? 0 : getMaxinValue().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", modelTime=").append(modelTime);
        sb.append(", maxinIndex=").append(maxinIndex);
        sb.append(", maxinValue=").append(maxinValue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}