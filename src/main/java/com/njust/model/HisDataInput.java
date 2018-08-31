package com.njust.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 */
public class HisDataInput implements Serializable {
    /**
     * 数据ID
     */
    private BigDecimal dataId;

    /**
     * 样本ID
     */
    private BigDecimal sampleId;

    /**
     * 属性ID
     */
    private BigDecimal attrId;

    /**
     * 历史库ID
     */
    private BigDecimal setId;

    /**
     * 属性值
     */
    private BigDecimal attrValue;

    private static final long serialVersionUID = 1L;

    public BigDecimal getDataId() {
        return dataId;
    }

    public void setDataId(BigDecimal dataId) {
        this.dataId = dataId;
    }

    public BigDecimal getSampleId() {
        return sampleId;
    }

    public void setSampleId(BigDecimal sampleId) {
        this.sampleId = sampleId;
    }

    public BigDecimal getAttrId() {
        return attrId;
    }

    public void setAttrId(BigDecimal attrId) {
        this.attrId = attrId;
    }

    public BigDecimal getSetId() {
        return setId;
    }

    public void setSetId(BigDecimal setId) {
        this.setId = setId;
    }

    public BigDecimal getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(BigDecimal attrValue) {
        this.attrValue = attrValue;
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
        HisDataInput other = (HisDataInput) that;
        return (this.getDataId() == null ? other.getDataId() == null : this.getDataId().equals(other.getDataId()))
            && (this.getSampleId() == null ? other.getSampleId() == null : this.getSampleId().equals(other.getSampleId()))
            && (this.getAttrId() == null ? other.getAttrId() == null : this.getAttrId().equals(other.getAttrId()))
            && (this.getSetId() == null ? other.getSetId() == null : this.getSetId().equals(other.getSetId()))
            && (this.getAttrValue() == null ? other.getAttrValue() == null : this.getAttrValue().equals(other.getAttrValue()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDataId() == null) ? 0 : getDataId().hashCode());
        result = prime * result + ((getSampleId() == null) ? 0 : getSampleId().hashCode());
        result = prime * result + ((getAttrId() == null) ? 0 : getAttrId().hashCode());
        result = prime * result + ((getSetId() == null) ? 0 : getSetId().hashCode());
        result = prime * result + ((getAttrValue() == null) ? 0 : getAttrValue().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dataId=").append(dataId);
        sb.append(", sampleId=").append(sampleId);
        sb.append(", attrId=").append(attrId);
        sb.append(", setId=").append(setId);
        sb.append(", attrValue=").append(attrValue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}