package com.njust.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 */
public class ZxItem implements Serializable {
    private BigDecimal itemId;

    private String itemOrder;

    private String itemName;

    private BigDecimal hItemId;

    private Long hNumber;

    private BigDecimal failWarmStandby;

    private BigDecimal itemCost;

    private BigDecimal repairTime;

    private String type;

    private BigDecimal failColdStandby;

    private static final long serialVersionUID = 1L;

    public BigDecimal getItemId() {
        return itemId;
    }

    public void setItemId(BigDecimal itemId) {
        this.itemId = itemId;
    }

    public String getItemOrder() {
        return itemOrder;
    }

    public void setItemOrder(String itemOrder) {
        this.itemOrder = itemOrder;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public BigDecimal gethItemId() {
        return hItemId;
    }

    public void sethItemId(BigDecimal hItemId) {
        this.hItemId = hItemId;
    }

    public Long gethNumber() {
        return hNumber;
    }

    public void sethNumber(Long hNumber) {
        this.hNumber = hNumber;
    }

    public BigDecimal getFailWarmStandby() {
        return failWarmStandby;
    }

    public void setFailWarmStandby(BigDecimal failWarmStandby) {
        this.failWarmStandby = failWarmStandby;
    }

    public BigDecimal getItemCost() {
        return itemCost;
    }

    public void setItemCost(BigDecimal itemCost) {
        this.itemCost = itemCost;
    }

    public BigDecimal getRepairTime() {
        return repairTime;
    }

    public void setRepairTime(BigDecimal repairTime) {
        this.repairTime = repairTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getFailColdStandby() {
        return failColdStandby;
    }

    public void setFailColdStandby(BigDecimal failColdStandby) {
        this.failColdStandby = failColdStandby;
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
        ZxItem other = (ZxItem) that;
        return (this.getItemId() == null ? other.getItemId() == null : this.getItemId().equals(other.getItemId()))
            && (this.getItemOrder() == null ? other.getItemOrder() == null : this.getItemOrder().equals(other.getItemOrder()))
            && (this.getItemName() == null ? other.getItemName() == null : this.getItemName().equals(other.getItemName()))
            && (this.gethItemId() == null ? other.gethItemId() == null : this.gethItemId().equals(other.gethItemId()))
            && (this.gethNumber() == null ? other.gethNumber() == null : this.gethNumber().equals(other.gethNumber()))
            && (this.getFailWarmStandby() == null ? other.getFailWarmStandby() == null : this.getFailWarmStandby().equals(other.getFailWarmStandby()))
            && (this.getItemCost() == null ? other.getItemCost() == null : this.getItemCost().equals(other.getItemCost()))
            && (this.getRepairTime() == null ? other.getRepairTime() == null : this.getRepairTime().equals(other.getRepairTime()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getFailColdStandby() == null ? other.getFailColdStandby() == null : this.getFailColdStandby().equals(other.getFailColdStandby()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getItemId() == null) ? 0 : getItemId().hashCode());
        result = prime * result + ((getItemOrder() == null) ? 0 : getItemOrder().hashCode());
        result = prime * result + ((getItemName() == null) ? 0 : getItemName().hashCode());
        result = prime * result + ((gethItemId() == null) ? 0 : gethItemId().hashCode());
        result = prime * result + ((gethNumber() == null) ? 0 : gethNumber().hashCode());
        result = prime * result + ((getFailWarmStandby() == null) ? 0 : getFailWarmStandby().hashCode());
        result = prime * result + ((getItemCost() == null) ? 0 : getItemCost().hashCode());
        result = prime * result + ((getRepairTime() == null) ? 0 : getRepairTime().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getFailColdStandby() == null) ? 0 : getFailColdStandby().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", itemId=").append(itemId);
        sb.append(", itemOrder=").append(itemOrder);
        sb.append(", itemName=").append(itemName);
        sb.append(", hItemId=").append(hItemId);
        sb.append(", hNumber=").append(hNumber);
        sb.append(", failWarmStandby=").append(failWarmStandby);
        sb.append(", itemCost=").append(itemCost);
        sb.append(", repairTime=").append(repairTime);
        sb.append(", type=").append(type);
        sb.append(", failColdStandby=").append(failColdStandby);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}