package com.njust.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 */
public class LzBpMaxout implements Serializable {
    /**
     * 模型生成时刻
     */
    private String modelTime;

    private BigDecimal maxoutIndex;

    private BigDecimal maxoutValue;

    private static final long serialVersionUID = 1L;

    public String getModelTime() {
        return modelTime;
    }

    public void setModelTime(String modelTime) {
        this.modelTime = modelTime;
    }

    public BigDecimal getMaxoutIndex() {
        return maxoutIndex;
    }

    public void setMaxoutIndex(BigDecimal maxoutIndex) {
        this.maxoutIndex = maxoutIndex;
    }

    public BigDecimal getMaxoutValue() {
        return maxoutValue;
    }

    public void setMaxoutValue(BigDecimal maxoutValue) {
        this.maxoutValue = maxoutValue;
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
        LzBpMaxout other = (LzBpMaxout) that;
        return (this.getModelTime() == null ? other.getModelTime() == null : this.getModelTime().equals(other.getModelTime()))
            && (this.getMaxoutIndex() == null ? other.getMaxoutIndex() == null : this.getMaxoutIndex().equals(other.getMaxoutIndex()))
            && (this.getMaxoutValue() == null ? other.getMaxoutValue() == null : this.getMaxoutValue().equals(other.getMaxoutValue()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getModelTime() == null) ? 0 : getModelTime().hashCode());
        result = prime * result + ((getMaxoutIndex() == null) ? 0 : getMaxoutIndex().hashCode());
        result = prime * result + ((getMaxoutValue() == null) ? 0 : getMaxoutValue().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", modelTime=").append(modelTime);
        sb.append(", maxoutIndex=").append(maxoutIndex);
        sb.append(", maxoutValue=").append(maxoutValue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}