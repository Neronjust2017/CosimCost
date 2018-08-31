package com.njust.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 */
public class LzSvrSvindics implements Serializable {
    /**
     * 模型生成时刻
     */
    private String modelTime;

    private BigDecimal svindicsIndex;

    private BigDecimal svindicsValue;

    private static final long serialVersionUID = 1L;

    public String getModelTime() {
        return modelTime;
    }

    public void setModelTime(String modelTime) {
        this.modelTime = modelTime;
    }

    public BigDecimal getSvindicsIndex() {
        return svindicsIndex;
    }

    public void setSvindicsIndex(BigDecimal svindicsIndex) {
        this.svindicsIndex = svindicsIndex;
    }

    public BigDecimal getSvindicsValue() {
        return svindicsValue;
    }

    public void setSvindicsValue(BigDecimal svindicsValue) {
        this.svindicsValue = svindicsValue;
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
        LzSvrSvindics other = (LzSvrSvindics) that;
        return (this.getModelTime() == null ? other.getModelTime() == null : this.getModelTime().equals(other.getModelTime()))
            && (this.getSvindicsIndex() == null ? other.getSvindicsIndex() == null : this.getSvindicsIndex().equals(other.getSvindicsIndex()))
            && (this.getSvindicsValue() == null ? other.getSvindicsValue() == null : this.getSvindicsValue().equals(other.getSvindicsValue()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getModelTime() == null) ? 0 : getModelTime().hashCode());
        result = prime * result + ((getSvindicsIndex() == null) ? 0 : getSvindicsIndex().hashCode());
        result = prime * result + ((getSvindicsValue() == null) ? 0 : getSvindicsValue().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", modelTime=").append(modelTime);
        sb.append(", svindicsIndex=").append(svindicsIndex);
        sb.append(", svindicsValue=").append(svindicsValue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}