package com.njust.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 */
public class LlcTrainData implements Serializable {
    private Long id;

    private BigDecimal maxrange;

    private BigDecimal maxheight;

    private BigDecimal maxspeed;

    private BigDecimal mass;

    private BigDecimal maxload;

    private BigDecimal mlength;

    private BigDecimal mdiameter;

    private BigDecimal mwinglength;

    private BigDecimal mkillposibility;

    private String year;

    private String cpi;

    private BigDecimal expense;

    private BigDecimal netExpSame;

    private BigDecimal netExpDiff;

    private String name;

    private String country;

    private BigDecimal bzExpense;

    private BigDecimal yzExpense;

    private BigDecimal cgExpense;

    private BigDecimal lzExpense;

    private BigDecimal bfExpense;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getMaxrange() {
        return maxrange;
    }

    public void setMaxrange(BigDecimal maxrange) {
        this.maxrange = maxrange;
    }

    public BigDecimal getMaxheight() {
        return maxheight;
    }

    public void setMaxheight(BigDecimal maxheight) {
        this.maxheight = maxheight;
    }

    public BigDecimal getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(BigDecimal maxspeed) {
        this.maxspeed = maxspeed;
    }

    public BigDecimal getMass() {
        return mass;
    }

    public void setMass(BigDecimal mass) {
        this.mass = mass;
    }

    public BigDecimal getMaxload() {
        return maxload;
    }

    public void setMaxload(BigDecimal maxload) {
        this.maxload = maxload;
    }

    public BigDecimal getMlength() {
        return mlength;
    }

    public void setMlength(BigDecimal mlength) {
        this.mlength = mlength;
    }

    public BigDecimal getMdiameter() {
        return mdiameter;
    }

    public void setMdiameter(BigDecimal mdiameter) {
        this.mdiameter = mdiameter;
    }

    public BigDecimal getMwinglength() {
        return mwinglength;
    }

    public void setMwinglength(BigDecimal mwinglength) {
        this.mwinglength = mwinglength;
    }

    public BigDecimal getMkillposibility() {
        return mkillposibility;
    }

    public void setMkillposibility(BigDecimal mkillposibility) {
        this.mkillposibility = mkillposibility;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCpi() {
        return cpi;
    }

    public void setCpi(String cpi) {
        this.cpi = cpi;
    }

    public BigDecimal getExpense() {
        return expense;
    }

    public void setExpense(BigDecimal expense) {
        this.expense = expense;
    }

    public BigDecimal getNetExpSame() {
        return netExpSame;
    }

    public void setNetExpSame(BigDecimal netExpSame) {
        this.netExpSame = netExpSame;
    }

    public BigDecimal getNetExpDiff() {
        return netExpDiff;
    }

    public void setNetExpDiff(BigDecimal netExpDiff) {
        this.netExpDiff = netExpDiff;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public BigDecimal getBzExpense() {
        return bzExpense;
    }

    public void setBzExpense(BigDecimal bzExpense) {
        this.bzExpense = bzExpense;
    }

    public BigDecimal getYzExpense() {
        return yzExpense;
    }

    public void setYzExpense(BigDecimal yzExpense) {
        this.yzExpense = yzExpense;
    }

    public BigDecimal getCgExpense() {
        return cgExpense;
    }

    public void setCgExpense(BigDecimal cgExpense) {
        this.cgExpense = cgExpense;
    }

    public BigDecimal getLzExpense() {
        return lzExpense;
    }

    public void setLzExpense(BigDecimal lzExpense) {
        this.lzExpense = lzExpense;
    }

    public BigDecimal getBfExpense() {
        return bfExpense;
    }

    public void setBfExpense(BigDecimal bfExpense) {
        this.bfExpense = bfExpense;
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
        LlcTrainData other = (LlcTrainData) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMaxrange() == null ? other.getMaxrange() == null : this.getMaxrange().equals(other.getMaxrange()))
            && (this.getMaxheight() == null ? other.getMaxheight() == null : this.getMaxheight().equals(other.getMaxheight()))
            && (this.getMaxspeed() == null ? other.getMaxspeed() == null : this.getMaxspeed().equals(other.getMaxspeed()))
            && (this.getMass() == null ? other.getMass() == null : this.getMass().equals(other.getMass()))
            && (this.getMaxload() == null ? other.getMaxload() == null : this.getMaxload().equals(other.getMaxload()))
            && (this.getMlength() == null ? other.getMlength() == null : this.getMlength().equals(other.getMlength()))
            && (this.getMdiameter() == null ? other.getMdiameter() == null : this.getMdiameter().equals(other.getMdiameter()))
            && (this.getMwinglength() == null ? other.getMwinglength() == null : this.getMwinglength().equals(other.getMwinglength()))
            && (this.getMkillposibility() == null ? other.getMkillposibility() == null : this.getMkillposibility().equals(other.getMkillposibility()))
            && (this.getYear() == null ? other.getYear() == null : this.getYear().equals(other.getYear()))
            && (this.getCpi() == null ? other.getCpi() == null : this.getCpi().equals(other.getCpi()))
            && (this.getExpense() == null ? other.getExpense() == null : this.getExpense().equals(other.getExpense()))
            && (this.getNetExpSame() == null ? other.getNetExpSame() == null : this.getNetExpSame().equals(other.getNetExpSame()))
            && (this.getNetExpDiff() == null ? other.getNetExpDiff() == null : this.getNetExpDiff().equals(other.getNetExpDiff()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getCountry() == null ? other.getCountry() == null : this.getCountry().equals(other.getCountry()))
            && (this.getBzExpense() == null ? other.getBzExpense() == null : this.getBzExpense().equals(other.getBzExpense()))
            && (this.getYzExpense() == null ? other.getYzExpense() == null : this.getYzExpense().equals(other.getYzExpense()))
            && (this.getCgExpense() == null ? other.getCgExpense() == null : this.getCgExpense().equals(other.getCgExpense()))
            && (this.getLzExpense() == null ? other.getLzExpense() == null : this.getLzExpense().equals(other.getLzExpense()))
            && (this.getBfExpense() == null ? other.getBfExpense() == null : this.getBfExpense().equals(other.getBfExpense()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMaxrange() == null) ? 0 : getMaxrange().hashCode());
        result = prime * result + ((getMaxheight() == null) ? 0 : getMaxheight().hashCode());
        result = prime * result + ((getMaxspeed() == null) ? 0 : getMaxspeed().hashCode());
        result = prime * result + ((getMass() == null) ? 0 : getMass().hashCode());
        result = prime * result + ((getMaxload() == null) ? 0 : getMaxload().hashCode());
        result = prime * result + ((getMlength() == null) ? 0 : getMlength().hashCode());
        result = prime * result + ((getMdiameter() == null) ? 0 : getMdiameter().hashCode());
        result = prime * result + ((getMwinglength() == null) ? 0 : getMwinglength().hashCode());
        result = prime * result + ((getMkillposibility() == null) ? 0 : getMkillposibility().hashCode());
        result = prime * result + ((getYear() == null) ? 0 : getYear().hashCode());
        result = prime * result + ((getCpi() == null) ? 0 : getCpi().hashCode());
        result = prime * result + ((getExpense() == null) ? 0 : getExpense().hashCode());
        result = prime * result + ((getNetExpSame() == null) ? 0 : getNetExpSame().hashCode());
        result = prime * result + ((getNetExpDiff() == null) ? 0 : getNetExpDiff().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getCountry() == null) ? 0 : getCountry().hashCode());
        result = prime * result + ((getBzExpense() == null) ? 0 : getBzExpense().hashCode());
        result = prime * result + ((getYzExpense() == null) ? 0 : getYzExpense().hashCode());
        result = prime * result + ((getCgExpense() == null) ? 0 : getCgExpense().hashCode());
        result = prime * result + ((getLzExpense() == null) ? 0 : getLzExpense().hashCode());
        result = prime * result + ((getBfExpense() == null) ? 0 : getBfExpense().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", maxrange=").append(maxrange);
        sb.append(", maxheight=").append(maxheight);
        sb.append(", maxspeed=").append(maxspeed);
        sb.append(", mass=").append(mass);
        sb.append(", maxload=").append(maxload);
        sb.append(", mlength=").append(mlength);
        sb.append(", mdiameter=").append(mdiameter);
        sb.append(", mwinglength=").append(mwinglength);
        sb.append(", mkillposibility=").append(mkillposibility);
        sb.append(", year=").append(year);
        sb.append(", cpi=").append(cpi);
        sb.append(", expense=").append(expense);
        sb.append(", netExpSame=").append(netExpSame);
        sb.append(", netExpDiff=").append(netExpDiff);
        sb.append(", name=").append(name);
        sb.append(", country=").append(country);
        sb.append(", bzExpense=").append(bzExpense);
        sb.append(", yzExpense=").append(yzExpense);
        sb.append(", cgExpense=").append(cgExpense);
        sb.append(", lzExpense=").append(lzExpense);
        sb.append(", bfExpense=").append(bfExpense);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}