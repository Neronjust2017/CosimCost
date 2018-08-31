package com.njust.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 */
public class LlcTrainModel implements Serializable {
    private String svrtime;

    private BigDecimal paramsnum;

    private String params;

    private String paramsalias;

    private BigDecimal trmodeltype;

    private String trmodeltypealias;

    private static final long serialVersionUID = 1L;

    public String getSvrtime() {
        return svrtime;
    }

    public void setSvrtime(String svrtime) {
        this.svrtime = svrtime;
    }

    public BigDecimal getParamsnum() {
        return paramsnum;
    }

    public void setParamsnum(BigDecimal paramsnum) {
        this.paramsnum = paramsnum;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public String getParamsalias() {
        return paramsalias;
    }

    public void setParamsalias(String paramsalias) {
        this.paramsalias = paramsalias;
    }

    public BigDecimal getTrmodeltype() {
        return trmodeltype;
    }

    public void setTrmodeltype(BigDecimal trmodeltype) {
        this.trmodeltype = trmodeltype;
    }

    public String getTrmodeltypealias() {
        return trmodeltypealias;
    }

    public void setTrmodeltypealias(String trmodeltypealias) {
        this.trmodeltypealias = trmodeltypealias;
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
        LlcTrainModel other = (LlcTrainModel) that;
        return (this.getSvrtime() == null ? other.getSvrtime() == null : this.getSvrtime().equals(other.getSvrtime()))
            && (this.getParamsnum() == null ? other.getParamsnum() == null : this.getParamsnum().equals(other.getParamsnum()))
            && (this.getParams() == null ? other.getParams() == null : this.getParams().equals(other.getParams()))
            && (this.getParamsalias() == null ? other.getParamsalias() == null : this.getParamsalias().equals(other.getParamsalias()))
            && (this.getTrmodeltype() == null ? other.getTrmodeltype() == null : this.getTrmodeltype().equals(other.getTrmodeltype()))
            && (this.getTrmodeltypealias() == null ? other.getTrmodeltypealias() == null : this.getTrmodeltypealias().equals(other.getTrmodeltypealias()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSvrtime() == null) ? 0 : getSvrtime().hashCode());
        result = prime * result + ((getParamsnum() == null) ? 0 : getParamsnum().hashCode());
        result = prime * result + ((getParams() == null) ? 0 : getParams().hashCode());
        result = prime * result + ((getParamsalias() == null) ? 0 : getParamsalias().hashCode());
        result = prime * result + ((getTrmodeltype() == null) ? 0 : getTrmodeltype().hashCode());
        result = prime * result + ((getTrmodeltypealias() == null) ? 0 : getTrmodeltypealias().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", svrtime=").append(svrtime);
        sb.append(", paramsnum=").append(paramsnum);
        sb.append(", params=").append(params);
        sb.append(", paramsalias=").append(paramsalias);
        sb.append(", trmodeltype=").append(trmodeltype);
        sb.append(", trmodeltypealias=").append(trmodeltypealias);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}