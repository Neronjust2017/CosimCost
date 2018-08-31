package com.njust.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 */
public class ZxFResultRevEquip implements Serializable {
    private Long vsId;

    private Long staId;

    private Long itemId;

    private Long revEquipNum;

    private Long fixEquipNum;

    private BigDecimal equipFillRate;

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

    public Long getRevEquipNum() {
        return revEquipNum;
    }

    public void setRevEquipNum(Long revEquipNum) {
        this.revEquipNum = revEquipNum;
    }

    public Long getFixEquipNum() {
        return fixEquipNum;
    }

    public void setFixEquipNum(Long fixEquipNum) {
        this.fixEquipNum = fixEquipNum;
    }

    public BigDecimal getEquipFillRate() {
        return equipFillRate;
    }

    public void setEquipFillRate(BigDecimal equipFillRate) {
        this.equipFillRate = equipFillRate;
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
        ZxFResultRevEquip other = (ZxFResultRevEquip) that;
        return (this.getVsId() == null ? other.getVsId() == null : this.getVsId().equals(other.getVsId()))
            && (this.getStaId() == null ? other.getStaId() == null : this.getStaId().equals(other.getStaId()))
            && (this.getItemId() == null ? other.getItemId() == null : this.getItemId().equals(other.getItemId()))
            && (this.getRevEquipNum() == null ? other.getRevEquipNum() == null : this.getRevEquipNum().equals(other.getRevEquipNum()))
            && (this.getFixEquipNum() == null ? other.getFixEquipNum() == null : this.getFixEquipNum().equals(other.getFixEquipNum()))
            && (this.getEquipFillRate() == null ? other.getEquipFillRate() == null : this.getEquipFillRate().equals(other.getEquipFillRate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getVsId() == null) ? 0 : getVsId().hashCode());
        result = prime * result + ((getStaId() == null) ? 0 : getStaId().hashCode());
        result = prime * result + ((getItemId() == null) ? 0 : getItemId().hashCode());
        result = prime * result + ((getRevEquipNum() == null) ? 0 : getRevEquipNum().hashCode());
        result = prime * result + ((getFixEquipNum() == null) ? 0 : getFixEquipNum().hashCode());
        result = prime * result + ((getEquipFillRate() == null) ? 0 : getEquipFillRate().hashCode());
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
        sb.append(", fixEquipNum=").append(fixEquipNum);
        sb.append(", equipFillRate=").append(equipFillRate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}