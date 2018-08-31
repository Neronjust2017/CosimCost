package com.njust.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 */
public class ZxFResultEquip implements Serializable {
    private BigDecimal vsId;

    private BigDecimal staId;

    private BigDecimal itemId;

    private BigDecimal revEquipNum;

    private BigDecimal equipFillRate;

    private BigDecimal equipLossRatio;

    private BigDecimal waitingCost;

    private Long fixEquipNum;

    private Long totalJourneyCost;

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

    public BigDecimal getRevEquipNum() {
        return revEquipNum;
    }

    public void setRevEquipNum(BigDecimal revEquipNum) {
        this.revEquipNum = revEquipNum;
    }

    public BigDecimal getEquipFillRate() {
        return equipFillRate;
    }

    public void setEquipFillRate(BigDecimal equipFillRate) {
        this.equipFillRate = equipFillRate;
    }

    public BigDecimal getEquipLossRatio() {
        return equipLossRatio;
    }

    public void setEquipLossRatio(BigDecimal equipLossRatio) {
        this.equipLossRatio = equipLossRatio;
    }

    public BigDecimal getWaitingCost() {
        return waitingCost;
    }

    public void setWaitingCost(BigDecimal waitingCost) {
        this.waitingCost = waitingCost;
    }

    public Long getFixEquipNum() {
        return fixEquipNum;
    }

    public void setFixEquipNum(Long fixEquipNum) {
        this.fixEquipNum = fixEquipNum;
    }

    public Long getTotalJourneyCost() {
        return totalJourneyCost;
    }

    public void setTotalJourneyCost(Long totalJourneyCost) {
        this.totalJourneyCost = totalJourneyCost;
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
        ZxFResultEquip other = (ZxFResultEquip) that;
        return (this.getVsId() == null ? other.getVsId() == null : this.getVsId().equals(other.getVsId()))
            && (this.getStaId() == null ? other.getStaId() == null : this.getStaId().equals(other.getStaId()))
            && (this.getItemId() == null ? other.getItemId() == null : this.getItemId().equals(other.getItemId()))
            && (this.getRevEquipNum() == null ? other.getRevEquipNum() == null : this.getRevEquipNum().equals(other.getRevEquipNum()))
            && (this.getEquipFillRate() == null ? other.getEquipFillRate() == null : this.getEquipFillRate().equals(other.getEquipFillRate()))
            && (this.getEquipLossRatio() == null ? other.getEquipLossRatio() == null : this.getEquipLossRatio().equals(other.getEquipLossRatio()))
            && (this.getWaitingCost() == null ? other.getWaitingCost() == null : this.getWaitingCost().equals(other.getWaitingCost()))
            && (this.getFixEquipNum() == null ? other.getFixEquipNum() == null : this.getFixEquipNum().equals(other.getFixEquipNum()))
            && (this.getTotalJourneyCost() == null ? other.getTotalJourneyCost() == null : this.getTotalJourneyCost().equals(other.getTotalJourneyCost()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getVsId() == null) ? 0 : getVsId().hashCode());
        result = prime * result + ((getStaId() == null) ? 0 : getStaId().hashCode());
        result = prime * result + ((getItemId() == null) ? 0 : getItemId().hashCode());
        result = prime * result + ((getRevEquipNum() == null) ? 0 : getRevEquipNum().hashCode());
        result = prime * result + ((getEquipFillRate() == null) ? 0 : getEquipFillRate().hashCode());
        result = prime * result + ((getEquipLossRatio() == null) ? 0 : getEquipLossRatio().hashCode());
        result = prime * result + ((getWaitingCost() == null) ? 0 : getWaitingCost().hashCode());
        result = prime * result + ((getFixEquipNum() == null) ? 0 : getFixEquipNum().hashCode());
        result = prime * result + ((getTotalJourneyCost() == null) ? 0 : getTotalJourneyCost().hashCode());
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
        sb.append(", revEquipNum=").append(revEquipNum);
        sb.append(", equipFillRate=").append(equipFillRate);
        sb.append(", equipLossRatio=").append(equipLossRatio);
        sb.append(", waitingCost=").append(waitingCost);
        sb.append(", fixEquipNum=").append(fixEquipNum);
        sb.append(", totalJourneyCost=").append(totalJourneyCost);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}