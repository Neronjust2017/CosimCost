package com.njust.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 */
public class LlcNetFormarray implements Serializable {
    private String svrtime;

    private BigDecimal formarrayLayeroutindex;

    private BigDecimal formarrayLayernodeindex;

    private BigDecimal formarrayLayernodevalue;

    private static final long serialVersionUID = 1L;

    public String getSvrtime() {
        return svrtime;
    }

    public void setSvrtime(String svrtime) {
        this.svrtime = svrtime;
    }

    public BigDecimal getFormarrayLayeroutindex() {
        return formarrayLayeroutindex;
    }

    public void setFormarrayLayeroutindex(BigDecimal formarrayLayeroutindex) {
        this.formarrayLayeroutindex = formarrayLayeroutindex;
    }

    public BigDecimal getFormarrayLayernodeindex() {
        return formarrayLayernodeindex;
    }

    public void setFormarrayLayernodeindex(BigDecimal formarrayLayernodeindex) {
        this.formarrayLayernodeindex = formarrayLayernodeindex;
    }

    public BigDecimal getFormarrayLayernodevalue() {
        return formarrayLayernodevalue;
    }

    public void setFormarrayLayernodevalue(BigDecimal formarrayLayernodevalue) {
        this.formarrayLayernodevalue = formarrayLayernodevalue;
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
        LlcNetFormarray other = (LlcNetFormarray) that;
        return (this.getSvrtime() == null ? other.getSvrtime() == null : this.getSvrtime().equals(other.getSvrtime()))
            && (this.getFormarrayLayeroutindex() == null ? other.getFormarrayLayeroutindex() == null : this.getFormarrayLayeroutindex().equals(other.getFormarrayLayeroutindex()))
            && (this.getFormarrayLayernodeindex() == null ? other.getFormarrayLayernodeindex() == null : this.getFormarrayLayernodeindex().equals(other.getFormarrayLayernodeindex()))
            && (this.getFormarrayLayernodevalue() == null ? other.getFormarrayLayernodevalue() == null : this.getFormarrayLayernodevalue().equals(other.getFormarrayLayernodevalue()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSvrtime() == null) ? 0 : getSvrtime().hashCode());
        result = prime * result + ((getFormarrayLayeroutindex() == null) ? 0 : getFormarrayLayeroutindex().hashCode());
        result = prime * result + ((getFormarrayLayernodeindex() == null) ? 0 : getFormarrayLayernodeindex().hashCode());
        result = prime * result + ((getFormarrayLayernodevalue() == null) ? 0 : getFormarrayLayernodevalue().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", svrtime=").append(svrtime);
        sb.append(", formarrayLayeroutindex=").append(formarrayLayeroutindex);
        sb.append(", formarrayLayernodeindex=").append(formarrayLayernodeindex);
        sb.append(", formarrayLayernodevalue=").append(formarrayLayernodevalue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}