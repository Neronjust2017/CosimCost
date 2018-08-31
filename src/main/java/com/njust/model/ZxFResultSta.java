package com.njust.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 */
public class ZxFResultSta implements Serializable {
    private BigDecimal vsId;

    private BigDecimal staId;

    private BigDecimal receiveEquipNum;

    private BigDecimal totalFillRate;

    private BigDecimal waitingCost;

    private Long fixEquipNum;

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

    public BigDecimal getReceiveEquipNum() {
        return receiveEquipNum;
    }

    public void setReceiveEquipNum(BigDecimal receiveEquipNum) {
        this.receiveEquipNum = receiveEquipNum;
    }

    public BigDecimal getTotalFillRate() {
        return totalFillRate;
    }

    public void setTotalFillRate(BigDecimal totalFillRate) {
        this.totalFillRate = totalFillRate;
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
        ZxFResultSta other = (ZxFResultSta) that;
        return (this.getVsId() == null ? other.getVsId() == null : this.getVsId().equals(other.getVsId()))
            && (this.getStaId() == null ? other.getStaId() == null : this.getStaId().equals(other.getStaId()))
            && (this.getReceiveEquipNum() == null ? other.getReceiveEquipNum() == null : this.getReceiveEquipNum().equals(other.getReceiveEquipNum()))
            && (this.getTotalFillRate() == null ? other.getTotalFillRate() == null : this.getTotalFillRate().equals(other.getTotalFillRate()))
            && (this.getWaitingCost() == null ? other.getWaitingCost() == null : this.getWaitingCost().equals(other.getWaitingCost()))
            && (this.getFixEquipNum() == null ? other.getFixEquipNum() == null : this.getFixEquipNum().equals(other.getFixEquipNum()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getVsId() == null) ? 0 : getVsId().hashCode());
        result = prime * result + ((getStaId() == null) ? 0 : getStaId().hashCode());
        result = prime * result + ((getReceiveEquipNum() == null) ? 0 : getReceiveEquipNum().hashCode());
        result = prime * result + ((getTotalFillRate() == null) ? 0 : getTotalFillRate().hashCode());
        result = prime * result + ((getWaitingCost() == null) ? 0 : getWaitingCost().hashCode());
        result = prime * result + ((getFixEquipNum() == null) ? 0 : getFixEquipNum().hashCode());
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
        sb.append(", receiveEquipNum=").append(receiveEquipNum);
        sb.append(", totalFillRate=").append(totalFillRate);
        sb.append(", waitingCost=").append(waitingCost);
        sb.append(", fixEquipNum=").append(fixEquipNum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}