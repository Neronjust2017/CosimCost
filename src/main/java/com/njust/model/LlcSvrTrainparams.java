package com.njust.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 */
public class LlcSvrTrainparams implements Serializable {
    private String svrTime;

    private BigDecimal svrL;

    private BigDecimal svrC;

    private BigDecimal svrGamma;

    private BigDecimal svrEps;

    private BigDecimal tLatestcpi;

    private BigDecimal tLatestyear;

    private static final long serialVersionUID = 1L;

    public String getSvrTime() {
        return svrTime;
    }

    public void setSvrTime(String svrTime) {
        this.svrTime = svrTime;
    }

    public BigDecimal getSvrL() {
        return svrL;
    }

    public void setSvrL(BigDecimal svrL) {
        this.svrL = svrL;
    }

    public BigDecimal getSvrC() {
        return svrC;
    }

    public void setSvrC(BigDecimal svrC) {
        this.svrC = svrC;
    }

    public BigDecimal getSvrGamma() {
        return svrGamma;
    }

    public void setSvrGamma(BigDecimal svrGamma) {
        this.svrGamma = svrGamma;
    }

    public BigDecimal getSvrEps() {
        return svrEps;
    }

    public void setSvrEps(BigDecimal svrEps) {
        this.svrEps = svrEps;
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
        LlcSvrTrainparams other = (LlcSvrTrainparams) that;
        return (this.getSvrTime() == null ? other.getSvrTime() == null : this.getSvrTime().equals(other.getSvrTime()))
            && (this.getSvrL() == null ? other.getSvrL() == null : this.getSvrL().equals(other.getSvrL()))
            && (this.getSvrC() == null ? other.getSvrC() == null : this.getSvrC().equals(other.getSvrC()))
            && (this.getSvrGamma() == null ? other.getSvrGamma() == null : this.getSvrGamma().equals(other.getSvrGamma()))
            && (this.getSvrEps() == null ? other.getSvrEps() == null : this.getSvrEps().equals(other.getSvrEps()))
            && (this.gettLatestcpi() == null ? other.gettLatestcpi() == null : this.gettLatestcpi().equals(other.gettLatestcpi()))
            && (this.gettLatestyear() == null ? other.gettLatestyear() == null : this.gettLatestyear().equals(other.gettLatestyear()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSvrTime() == null) ? 0 : getSvrTime().hashCode());
        result = prime * result + ((getSvrL() == null) ? 0 : getSvrL().hashCode());
        result = prime * result + ((getSvrC() == null) ? 0 : getSvrC().hashCode());
        result = prime * result + ((getSvrGamma() == null) ? 0 : getSvrGamma().hashCode());
        result = prime * result + ((getSvrEps() == null) ? 0 : getSvrEps().hashCode());
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
        sb.append(", svrTime=").append(svrTime);
        sb.append(", svrL=").append(svrL);
        sb.append(", svrC=").append(svrC);
        sb.append(", svrGamma=").append(svrGamma);
        sb.append(", svrEps=").append(svrEps);
        sb.append(", tLatestcpi=").append(tLatestcpi);
        sb.append(", tLatestyear=").append(tLatestyear);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}