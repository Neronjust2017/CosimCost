package com.njust.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 */
public class ZxVersion implements Serializable {
    private BigDecimal vsId;

    private BigDecimal vsNb;

    private String vsName;

    private String vsCtime;

    private BigDecimal vsTime;

    private BigDecimal vsSimcount;

    private BigDecimal proId;

    private BigDecimal vsStep;

    private Short vsState;

    private static final long serialVersionUID = 1L;

    public BigDecimal getVsId() {
        return vsId;
    }

    public void setVsId(BigDecimal vsId) {
        this.vsId = vsId;
    }

    public BigDecimal getVsNb() {
        return vsNb;
    }

    public void setVsNb(BigDecimal vsNb) {
        this.vsNb = vsNb;
    }

    public String getVsName() {
        return vsName;
    }

    public void setVsName(String vsName) {
        this.vsName = vsName;
    }

    public String getVsCtime() {
        return vsCtime;
    }

    public void setVsCtime(String vsCtime) {
        this.vsCtime = vsCtime;
    }

    public BigDecimal getVsTime() {
        return vsTime;
    }

    public void setVsTime(BigDecimal vsTime) {
        this.vsTime = vsTime;
    }

    public BigDecimal getVsSimcount() {
        return vsSimcount;
    }

    public void setVsSimcount(BigDecimal vsSimcount) {
        this.vsSimcount = vsSimcount;
    }

    public BigDecimal getProId() {
        return proId;
    }

    public void setProId(BigDecimal proId) {
        this.proId = proId;
    }

    public BigDecimal getVsStep() {
        return vsStep;
    }

    public void setVsStep(BigDecimal vsStep) {
        this.vsStep = vsStep;
    }

    public Short getVsState() {
        return vsState;
    }

    public void setVsState(Short vsState) {
        this.vsState = vsState;
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
        ZxVersion other = (ZxVersion) that;
        return (this.getVsId() == null ? other.getVsId() == null : this.getVsId().equals(other.getVsId()))
            && (this.getVsNb() == null ? other.getVsNb() == null : this.getVsNb().equals(other.getVsNb()))
            && (this.getVsName() == null ? other.getVsName() == null : this.getVsName().equals(other.getVsName()))
            && (this.getVsCtime() == null ? other.getVsCtime() == null : this.getVsCtime().equals(other.getVsCtime()))
            && (this.getVsTime() == null ? other.getVsTime() == null : this.getVsTime().equals(other.getVsTime()))
            && (this.getVsSimcount() == null ? other.getVsSimcount() == null : this.getVsSimcount().equals(other.getVsSimcount()))
            && (this.getProId() == null ? other.getProId() == null : this.getProId().equals(other.getProId()))
            && (this.getVsStep() == null ? other.getVsStep() == null : this.getVsStep().equals(other.getVsStep()))
            && (this.getVsState() == null ? other.getVsState() == null : this.getVsState().equals(other.getVsState()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getVsId() == null) ? 0 : getVsId().hashCode());
        result = prime * result + ((getVsNb() == null) ? 0 : getVsNb().hashCode());
        result = prime * result + ((getVsName() == null) ? 0 : getVsName().hashCode());
        result = prime * result + ((getVsCtime() == null) ? 0 : getVsCtime().hashCode());
        result = prime * result + ((getVsTime() == null) ? 0 : getVsTime().hashCode());
        result = prime * result + ((getVsSimcount() == null) ? 0 : getVsSimcount().hashCode());
        result = prime * result + ((getProId() == null) ? 0 : getProId().hashCode());
        result = prime * result + ((getVsStep() == null) ? 0 : getVsStep().hashCode());
        result = prime * result + ((getVsState() == null) ? 0 : getVsState().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", vsId=").append(vsId);
        sb.append(", vsNb=").append(vsNb);
        sb.append(", vsName=").append(vsName);
        sb.append(", vsCtime=").append(vsCtime);
        sb.append(", vsTime=").append(vsTime);
        sb.append(", vsSimcount=").append(vsSimcount);
        sb.append(", proId=").append(proId);
        sb.append(", vsStep=").append(vsStep);
        sb.append(", vsState=").append(vsState);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}