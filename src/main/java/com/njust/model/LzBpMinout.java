package com.njust.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 */
public class LzBpMinout implements Serializable {
    /**
     * 模型生成时刻
     */
    private String modelTime;

    private BigDecimal minoutIndex;

    private BigDecimal minoutValue;

    private static final long serialVersionUID = 1L;

    public String getModelTime() {
        return modelTime;
    }

    public void setModelTime(String modelTime) {
        this.modelTime = modelTime;
    }

    public BigDecimal getMinoutIndex() {
        return minoutIndex;
    }

    public void setMinoutIndex(BigDecimal minoutIndex) {
        this.minoutIndex = minoutIndex;
    }

    public BigDecimal getMinoutValue() {
        return minoutValue;
    }

    public void setMinoutValue(BigDecimal minoutValue) {
        this.minoutValue = minoutValue;
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
        LzBpMinout other = (LzBpMinout) that;
        return (this.getModelTime() == null ? other.getModelTime() == null : this.getModelTime().equals(other.getModelTime()))
            && (this.getMinoutIndex() == null ? other.getMinoutIndex() == null : this.getMinoutIndex().equals(other.getMinoutIndex()))
            && (this.getMinoutValue() == null ? other.getMinoutValue() == null : this.getMinoutValue().equals(other.getMinoutValue()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getModelTime() == null) ? 0 : getModelTime().hashCode());
        result = prime * result + ((getMinoutIndex() == null) ? 0 : getMinoutIndex().hashCode());
        result = prime * result + ((getMinoutValue() == null) ? 0 : getMinoutValue().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", modelTime=").append(modelTime);
        sb.append(", minoutIndex=").append(minoutIndex);
        sb.append(", minoutValue=").append(minoutValue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}