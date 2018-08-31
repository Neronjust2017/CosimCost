package com.njust.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 */
public class HisDataStructure implements Serializable {
    /**
     * 属性ID
     */
    private BigDecimal attrId;

    /**
     * 历史库ID
     */
    private BigDecimal setId;

    /**
     * 属性名称
     */
    private String attrName;

    /**
     * 属性单位
     */
    private String attrUnit;

    /**
     * 属性类型
     */
    private String attrType;

    private static final long serialVersionUID = 1L;

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

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public String getAttrUnit() {
        return attrUnit;
    }

    public void setAttrUnit(String attrUnit) {
        this.attrUnit = attrUnit;
    }

    public String getAttrType() {
        return attrType;
    }

    public void setAttrType(String attrType) {
        this.attrType = attrType;
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
        HisDataStructure other = (HisDataStructure) that;
        return (this.getAttrId() == null ? other.getAttrId() == null : this.getAttrId().equals(other.getAttrId()))
            && (this.getSetId() == null ? other.getSetId() == null : this.getSetId().equals(other.getSetId()))
            && (this.getAttrName() == null ? other.getAttrName() == null : this.getAttrName().equals(other.getAttrName()))
            && (this.getAttrUnit() == null ? other.getAttrUnit() == null : this.getAttrUnit().equals(other.getAttrUnit()))
            && (this.getAttrType() == null ? other.getAttrType() == null : this.getAttrType().equals(other.getAttrType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAttrId() == null) ? 0 : getAttrId().hashCode());
        result = prime * result + ((getSetId() == null) ? 0 : getSetId().hashCode());
        result = prime * result + ((getAttrName() == null) ? 0 : getAttrName().hashCode());
        result = prime * result + ((getAttrUnit() == null) ? 0 : getAttrUnit().hashCode());
        result = prime * result + ((getAttrType() == null) ? 0 : getAttrType().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", attrId=").append(attrId);
        sb.append(", setId=").append(setId);
        sb.append(", attrName=").append(attrName);
        sb.append(", attrUnit=").append(attrUnit);
        sb.append(", attrType=").append(attrType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}