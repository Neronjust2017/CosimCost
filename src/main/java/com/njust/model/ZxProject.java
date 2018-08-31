package com.njust.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 */
public class ZxProject implements Serializable {
    private BigDecimal proId;

    private String proName;

    private String proCtime;

    private String proRemark;

    private Short proState;

    private Short proSimulated;

    private static final long serialVersionUID = 1L;

    public BigDecimal getProId() {
        return proId;
    }

    public void setProId(BigDecimal proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getProCtime() {
        return proCtime;
    }

    public void setProCtime(String proCtime) {
        this.proCtime = proCtime;
    }

    public String getProRemark() {
        return proRemark;
    }

    public void setProRemark(String proRemark) {
        this.proRemark = proRemark;
    }

    public Short getProState() {
        return proState;
    }

    public void setProState(Short proState) {
        this.proState = proState;
    }

    public Short getProSimulated() {
        return proSimulated;
    }

    public void setProSimulated(Short proSimulated) {
        this.proSimulated = proSimulated;
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
        ZxProject other = (ZxProject) that;
        return (this.getProId() == null ? other.getProId() == null : this.getProId().equals(other.getProId()))
            && (this.getProName() == null ? other.getProName() == null : this.getProName().equals(other.getProName()))
            && (this.getProCtime() == null ? other.getProCtime() == null : this.getProCtime().equals(other.getProCtime()))
            && (this.getProRemark() == null ? other.getProRemark() == null : this.getProRemark().equals(other.getProRemark()))
            && (this.getProState() == null ? other.getProState() == null : this.getProState().equals(other.getProState()))
            && (this.getProSimulated() == null ? other.getProSimulated() == null : this.getProSimulated().equals(other.getProSimulated()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProId() == null) ? 0 : getProId().hashCode());
        result = prime * result + ((getProName() == null) ? 0 : getProName().hashCode());
        result = prime * result + ((getProCtime() == null) ? 0 : getProCtime().hashCode());
        result = prime * result + ((getProRemark() == null) ? 0 : getProRemark().hashCode());
        result = prime * result + ((getProState() == null) ? 0 : getProState().hashCode());
        result = prime * result + ((getProSimulated() == null) ? 0 : getProSimulated().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", proId=").append(proId);
        sb.append(", proName=").append(proName);
        sb.append(", proCtime=").append(proCtime);
        sb.append(", proRemark=").append(proRemark);
        sb.append(", proState=").append(proState);
        sb.append(", proSimulated=").append(proSimulated);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}