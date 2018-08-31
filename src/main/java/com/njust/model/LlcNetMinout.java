package com.njust.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 */
public class LlcNetMinout implements Serializable {
    private String svrtime;

    private BigDecimal minoutIndex;

    private BigDecimal minoutValue;

    private static final long serialVersionUID = 1L;

    public String getSvrtime() {
        return svrtime;
    }

    public void setSvrtime(String svrtime) {
        this.svrtime = svrtime;
    }

    public BigDecimal getMinoutIndex() {
        return minoutIndex;
    }

    public void setMinoutIndex(BigDecimal minoutIndex) {
        this.minoutIndex = minoutIndex;
    }

    public BigDecimal getMinoutValue() {
        return minoutValue;
    }

    public void setMinoutValue(BigDecimal minoutValue) {
        this.minoutValue = minoutValue;
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
        LlcNetMinout other = (LlcNetMinout) that;
        return (this.getSvrtime() == null ? other.getSvrtime() == null : this.getSvrtime().equals(other.getSvrtime()))
            && (this.getMinoutIndex() == null ? other.getMinoutIndex() == null : this.getMinoutIndex().equals(other.getMinoutIndex()))
            && (this.getMinoutValue() == null ? other.getMinoutValue() == null : this.getMinoutValue().equals(other.getMinoutValue()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSvrtime() == null) ? 0 : getSvrtime().hashCode());
        result = prime * result + ((getMinoutIndex() == null) ? 0 : getMinoutIndex().hashCode());
        result = prime * result + ((getMinoutValue() == null) ? 0 : getMinoutValue().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", svrtime=").append(svrtime);
        sb.append(", minoutIndex=").append(minoutIndex);
        sb.append(", minoutValue=").append(minoutValue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}