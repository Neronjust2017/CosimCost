package com.njust.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 */
public class LzOptVersion implements Serializable {
    private BigDecimal optId;

    private BigDecimal proId;

    private String optName;

    private String optDescribe;

    private BigDecimal optFund;

    private String optBuildtime;

    private static final long serialVersionUID = 1L;

    public BigDecimal getOptId() {
        return optId;
    }

    public void setOptId(BigDecimal optId) {
        this.optId = optId;
    }

    public BigDecimal getProId() {
        return proId;
    }

    public void setProId(BigDecimal proId) {
        this.proId = proId;
    }

    public String getOptName() {
        return optName;
    }

    public void setOptName(String optName) {
        this.optName = optName;
    }

    public String getOptDescribe() {
        return optDescribe;
    }

    public void setOptDescribe(String optDescribe) {
        this.optDescribe = optDescribe;
    }

    public BigDecimal getOptFund() {
        return optFund;
    }

    public void setOptFund(BigDecimal optFund) {
        this.optFund = optFund;
    }

    public String getOptBuildtime() {
        return optBuildtime;
    }

    public void setOptBuildtime(String optBuildtime) {
        this.optBuildtime = optBuildtime;
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
        LzOptVersion other = (LzOptVersion) that;
        return (this.getOptId() == null ? other.getOptId() == null : this.getOptId().equals(other.getOptId()))
            && (this.getProId() == null ? other.getProId() == null : this.getProId().equals(other.getProId()))
            && (this.getOptName() == null ? other.getOptName() == null : this.getOptName().equals(other.getOptName()))
            && (this.getOptDescribe() == null ? other.getOptDescribe() == null : this.getOptDescribe().equals(other.getOptDescribe()))
            && (this.getOptFund() == null ? other.getOptFund() == null : this.getOptFund().equals(other.getOptFund()))
            && (this.getOptBuildtime() == null ? other.getOptBuildtime() == null : this.getOptBuildtime().equals(other.getOptBuildtime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOptId() == null) ? 0 : getOptId().hashCode());
        result = prime * result + ((getProId() == null) ? 0 : getProId().hashCode());
        result = prime * result + ((getOptName() == null) ? 0 : getOptName().hashCode());
        result = prime * result + ((getOptDescribe() == null) ? 0 : getOptDescribe().hashCode());
        result = prime * result + ((getOptFund() == null) ? 0 : getOptFund().hashCode());
        result = prime * result + ((getOptBuildtime() == null) ? 0 : getOptBuildtime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", optId=").append(optId);
        sb.append(", proId=").append(proId);
        sb.append(", optName=").append(optName);
        sb.append(", optDescribe=").append(optDescribe);
        sb.append(", optFund=").append(optFund);
        sb.append(", optBuildtime=").append(optBuildtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}