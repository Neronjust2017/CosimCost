package com.njust.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 */
public class LzSvrRho implements Serializable {
    /**
     * 模型生成时刻
     */
    private String modelTime;

    private BigDecimal rhoIndex;

    private BigDecimal rhoValue;

    private static final long serialVersionUID = 1L;

    public String getModelTime() {
        return modelTime;
    }

    public void setModelTime(String modelTime) {
        this.modelTime = modelTime;
    }

    public BigDecimal getRhoIndex() {
        return rhoIndex;
    }

    public void setRhoIndex(BigDecimal rhoIndex) {
        this.rhoIndex = rhoIndex;
    }

    public BigDecimal getRhoValue() {
        return rhoValue;
    }

    public void setRhoValue(BigDecimal rhoValue) {
        this.rhoValue = rhoValue;
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
        LzSvrRho other = (LzSvrRho) that;
        return (this.getModelTime() == null ? other.getModelTime() == null : this.getModelTime().equals(other.getModelTime()))
            && (this.getRhoIndex() == null ? other.getRhoIndex() == null : this.getRhoIndex().equals(other.getRhoIndex()))
            && (this.getRhoValue() == null ? other.getRhoValue() == null : this.getRhoValue().equals(other.getRhoValue()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getModelTime() == null) ? 0 : getModelTime().hashCode());
        result = prime * result + ((getRhoIndex() == null) ? 0 : getRhoIndex().hashCode());
        result = prime * result + ((getRhoValue() == null) ? 0 : getRhoValue().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", modelTime=").append(modelTime);
        sb.append(", rhoIndex=").append(rhoIndex);
        sb.append(", rhoValue=").append(rhoValue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}