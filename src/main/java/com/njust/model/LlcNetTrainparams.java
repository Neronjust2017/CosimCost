package com.njust.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 */
public class LlcNetTrainparams implements Serializable {
    private String svrtime;

    private BigDecimal netAlpha;

    private BigDecimal netSpeed;

    private BigDecimal netTrainc;

    private BigDecimal netPrecision;

    private BigDecimal netFlag;

    private BigDecimal tLatestcpi;

    private BigDecimal tLatestyear;

    private static final long serialVersionUID = 1L;

    public String getSvrtime() {
        return svrtime;
    }

    public void setSvrtime(String svrtime) {
        this.svrtime = svrtime;
    }

    public BigDecimal getNetAlpha() {
        return netAlpha;
    }

    public void setNetAlpha(BigDecimal netAlpha) {
        this.netAlpha = netAlpha;
    }

    public BigDecimal getNetSpeed() {
        return netSpeed;
    }

    public void setNetSpeed(BigDecimal netSpeed) {
        this.netSpeed = netSpeed;
    }

    public BigDecimal getNetTrainc() {
        return netTrainc;
    }

    public void setNetTrainc(BigDecimal netTrainc) {
        this.netTrainc = netTrainc;
    }

    public BigDecimal getNetPrecision() {
        return netPrecision;
    }

    public void setNetPrecision(BigDecimal netPrecision) {
        this.netPrecision = netPrecision;
    }

    public BigDecimal getNetFlag() {
        return netFlag;
    }

    public void setNetFlag(BigDecimal netFlag) {
        this.netFlag = netFlag;
    }

    public BigDecimal gettLatestcpi() {
        return tLatestcpi;
    }

    public void settLatestcpi(BigDecimal tLatestcpi) {
        this.tLatestcpi = tLatestcpi;
    }

    public BigDecimal gettLatestyear() {
        return tLatestyear;
    }

    public void settLatestyear(BigDecimal tLatestyear) {
        this.tLatestyear = tLatestyear;
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
        LlcNetTrainparams other = (LlcNetTrainparams) that;
        return (this.getSvrtime() == null ? other.getSvrtime() == null : this.getSvrtime().equals(other.getSvrtime()))
            && (this.getNetAlpha() == null ? other.getNetAlpha() == null : this.getNetAlpha().equals(other.getNetAlpha()))
            && (this.getNetSpeed() == null ? other.getNetSpeed() == null : this.getNetSpeed().equals(other.getNetSpeed()))
            && (this.getNetTrainc() == null ? other.getNetTrainc() == null : this.getNetTrainc().equals(other.getNetTrainc()))
            && (this.getNetPrecision() == null ? other.getNetPrecision() == null : this.getNetPrecision().equals(other.getNetPrecision()))
            && (this.getNetFlag() == null ? other.getNetFlag() == null : this.getNetFlag().equals(other.getNetFlag()))
            && (this.gettLatestcpi() == null ? other.gettLatestcpi() == null : this.gettLatestcpi().equals(other.gettLatestcpi()))
            && (this.gettLatestyear() == null ? other.gettLatestyear() == null : this.gettLatestyear().equals(other.gettLatestyear()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSvrtime() == null) ? 0 : getSvrtime().hashCode());
        result = prime * result + ((getNetAlpha() == null) ? 0 : getNetAlpha().hashCode());
        result = prime * result + ((getNetSpeed() == null) ? 0 : getNetSpeed().hashCode());
        result = prime * result + ((getNetTrainc() == null) ? 0 : getNetTrainc().hashCode());
        result = prime * result + ((getNetPrecision() == null) ? 0 : getNetPrecision().hashCode());
        result = prime * result + ((getNetFlag() == null) ? 0 : getNetFlag().hashCode());
        result = prime * result + ((gettLatestcpi() == null) ? 0 : gettLatestcpi().hashCode());
        result = prime * result + ((gettLatestyear() == null) ? 0 : gettLatestyear().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", svrtime=").append(svrtime);
        sb.append(", netAlpha=").append(netAlpha);
        sb.append(", netSpeed=").append(netSpeed);
        sb.append(", netTrainc=").append(netTrainc);
        sb.append(", netPrecision=").append(netPrecision);
        sb.append(", netFlag=").append(netFlag);
        sb.append(", tLatestcpi=").append(tLatestcpi);
        sb.append(", tLatestyear=").append(tLatestyear);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}