package com.njust.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 */
public class ZxFResultProd implements Serializable {
    private BigDecimal vsId;

    private BigDecimal staId;

    private BigDecimal itemId;

    private BigDecimal perfectnessRatio;

    private Long orgProdNum;

    private Long remainProdNum;

    private static final long serialVersionUID = 1L;

    public BigDecimal getVsId() {
        return vsId;
    }

    public void setVsId(BigDecimal vsId) {
        this.vsId = vsId;
    }

    public BigDecimal getStaId() {
        return staId;
    }

    public void setStaId(BigDecimal staId) {
        this.staId = staId;
    }

    public BigDecimal getItemId() {
        return itemId;
    }

    public void setItemId(BigDecimal itemId) {
        this.itemId = itemId;
    }

    public BigDecimal getPerfectnessRatio() {
        return perfectnessRatio;
    }

    public void setPerfectnessRatio(BigDecimal perfectnessRatio) {
        this.perfectnessRatio = perfectnessRatio;
    }

    public Long getOrgProdNum() {
        return orgProdNum;
    }

    public void setOrgProdNum(Long orgProdNum) {
        this.orgProdNum = orgProdNum;
    }

    public Long getRemainProdNum() {
        return remainProdNum;
    }

    public void setRemainProdNum(Long remainProdNum) {
        this.remainProdNum = remainProdNum;
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
        ZxFResultProd other = (ZxFResultProd) that;
        return (this.getVsId() == null ? other.getVsId() == null : this.getVsId().equals(other.getVsId()))
            && (this.getStaId() == null ? other.getStaId() == null : this.getStaId().equals(other.getStaId()))
            && (this.getItemId() == null ? other.getItemId() == null : this.getItemId().equals(other.getItemId()))
            && (this.getPerfectnessRatio() == null ? other.getPerfectnessRatio() == null : this.getPerfectnessRatio().equals(other.getPerfectnessRatio()))
            && (this.getOrgProdNum() == null ? other.getOrgProdNum() == null : this.getOrgProdNum().equals(other.getOrgProdNum()))
            && (this.getRemainProdNum() == null ? other.getRemainProdNum() == null : this.getRemainProdNum().equals(other.getRemainProdNum()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getVsId() == null) ? 0 : getVsId().hashCode());
        result = prime * result + ((getStaId() == null) ? 0 : getStaId().hashCode());
        result = prime * result + ((getItemId() == null) ? 0 : getItemId().hashCode());
        result = prime * result + ((getPerfectnessRatio() == null) ? 0 : getPerfectnessRatio().hashCode());
        result = prime * result + ((getOrgProdNum() == null) ? 0 : getOrgProdNum().hashCode());
        result = prime * result + ((getRemainProdNum() == null) ? 0 : getRemainProdNum().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", vsId=").append(vsId);
        sb.append(", staId=").append(staId);
        sb.append(", itemId=").append(itemId);
        sb.append(", perfectnessRatio=").append(perfectnessRatio);
        sb.append(", orgProdNum=").append(orgProdNum);
        sb.append(", remainProdNum=").append(remainProdNum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}