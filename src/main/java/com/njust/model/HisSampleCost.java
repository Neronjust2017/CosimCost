package com.njust.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 */
public class HisSampleCost implements Serializable {
    /**
     * 虚拟的
     */
    private BigDecimal id;

    /**
     * 历史库下样本ID
     */
    private BigDecimal setId;

    /**
     * 历史库下样本ID
     */
    private BigDecimal sampleId;

    /**
     * 历史库下各样本名称
     */
    private String sampleName;

    /**
     * 样本对应费用（单位是元）
     */
    private BigDecimal hisCost;

    private static final long serialVersionUID = 1L;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getSetId() {
        return setId;
    }

    public void setSetId(BigDecimal setId) {
        this.setId = setId;
    }

    public BigDecimal getSampleId() {
        return sampleId;
    }

    public void setSampleId(BigDecimal sampleId) {
        this.sampleId = sampleId;
    }

    public String getSampleName() {
        return sampleName;
    }

    public void setSampleName(String sampleName) {
        this.sampleName = sampleName;
    }

    public BigDecimal getHisCost() {
        return hisCost;
    }

    public void setHisCost(BigDecimal hisCost) {
        this.hisCost = hisCost;
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
        HisSampleCost other = (HisSampleCost) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSetId() == null ? other.getSetId() == null : this.getSetId().equals(other.getSetId()))
            && (this.getSampleId() == null ? other.getSampleId() == null : this.getSampleId().equals(other.getSampleId()))
            && (this.getSampleName() == null ? other.getSampleName() == null : this.getSampleName().equals(other.getSampleName()))
            && (this.getHisCost() == null ? other.getHisCost() == null : this.getHisCost().equals(other.getHisCost()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSetId() == null) ? 0 : getSetId().hashCode());
        result = prime * result + ((getSampleId() == null) ? 0 : getSampleId().hashCode());
        result = prime * result + ((getSampleName() == null) ? 0 : getSampleName().hashCode());
        result = prime * result + ((getHisCost() == null) ? 0 : getHisCost().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", setId=").append(setId);
        sb.append(", sampleId=").append(sampleId);
        sb.append(", sampleName=").append(sampleName);
        sb.append(", hisCost=").append(hisCost);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}