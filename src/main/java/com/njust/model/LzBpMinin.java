package com.njust.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 */
public class LzBpMinin implements Serializable {
    /**
     * 模型生成时刻
     */
    private String modelTime;

    private BigDecimal mininIndex;

    private BigDecimal mininValue;

    private static final long serialVersionUID = 1L;

    public String getModelTime() {
        return modelTime;
    }

    public void setModelTime(String modelTime) {
        this.modelTime = modelTime;
    }

    public BigDecimal getMininIndex() {
        return mininIndex;
    }

    public void setMininIndex(BigDecimal mininIndex) {
        this.mininIndex = mininIndex;
    }

    public BigDecimal getMininValue() {
        return mininValue;
    }

    public void setMininValue(BigDecimal mininValue) {
        this.mininValue = mininValue;
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
        LzBpMinin other = (LzBpMinin) that;
        return (this.getModelTime() == null ? other.getModelTime() == null : this.getModelTime().equals(other.getModelTime()))
            && (this.getMininIndex() == null ? other.getMininIndex() == null : this.getMininIndex().equals(other.getMininIndex()))
            && (this.getMininValue() == null ? other.getMininValue() == null : this.getMininValue().equals(other.getMininValue()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getModelTime() == null) ? 0 : getModelTime().hashCode());
        result = prime * result + ((getMininIndex() == null) ? 0 : getMininIndex().hashCode());
        result = prime * result + ((getMininValue() == null) ? 0 : getMininValue().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", modelTime=").append(modelTime);
        sb.append(", mininIndex=").append(mininIndex);
        sb.append(", mininValue=").append(mininValue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}