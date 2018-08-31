package com.njust.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 */
public class ZxFResultReplacementEquip implements Serializable {
    private Long vsId;

    private Long staId;

    private Long itemId;

    private Long orgEquipNum;

    private Long remainEquipNum;

    private BigDecimal equipLossRatio;

    private static final long serialVersionUID = 1L;

    public Long getVsId() {
        return vsId;
    }

    public void setVsId(Long vsId) {
        this.vsId = vsId;
    }

    public Long getStaId() {
        return staId;
    }

    public void setStaId(Long staId) {
        this.staId = staId;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getOrgEquipNum() {
        return orgEquipNum;
    }

    public void setOrgEquipNum(Long orgEquipNum) {
        this.orgEquipNum = orgEquipNum;
    }

    public Long getRemainEquipNum() {
        return remainEquipNum;
    }

    public void setRemainEquipNum(Long remainEquipNum) {
        this.remainEquipNum = remainEquipNum;
    }

    public BigDecimal getEquipLossRatio() {
        return equipLossRatio;
    }

    public void setEquipLossRatio(BigDecimal equipLossRatio) {
        this.equipLossRatio = equipLossRatio;
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
        ZxFResultReplacementEquip other = (ZxFResultReplacementEquip) that;
        return (this.getVsId() == null ? other.getVsId() == null : this.getVsId().equals(other.getVsId()))
            && (this.getStaId() == null ? other.getStaId() == null : this.getStaId().equals(other.getStaId()))
            && (this.getItemId() == null ? other.getItemId() == null : this.getItemId().equals(other.getItemId()))
            && (this.getOrgEquipNum() == null ? other.getOrgEquipNum() == null : this.getOrgEquipNum().equals(other.getOrgEquipNum()))
            && (this.getRemainEquipNum() == null ? other.getRemainEquipNum() == null : this.getRemainEquipNum().equals(other.getRemainEquipNum()))
            && (this.getEquipLossRatio() == null ? other.getEquipLossRatio() == null : this.getEquipLossRatio().equals(other.getEquipLossRatio()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getVsId() == null) ? 0 : getVsId().hashCode());
        result = prime * result + ((getStaId() == null) ? 0 : getStaId().hashCode());
        result = prime * result + ((getItemId() == null) ? 0 : getItemId().hashCode());
        result = prime * result + ((getOrgEquipNum() == null) ? 0 : getOrgEquipNum().hashCode());
        result = prime * result + ((getRemainEquipNum() == null) ? 0 : getRemainEquipNum().hashCode());
        result = prime * result + ((getEquipLossRatio() == null) ? 0 : getEquipLossRatio().hashCode());
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
        sb.append(", orgEquipNum=").append(orgEquipNum);
        sb.append(", remainEquipNum=").append(remainEquipNum);
        sb.append(", equipLossRatio=").append(equipLossRatio);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}