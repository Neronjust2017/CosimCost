package com.njust.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 */
public class LlcSvrSvcoef implements Serializable {
    private String svrtime;

    private BigDecimal dataIndex;

    private BigDecimal svcoefIndex;

    private BigDecimal svcoefValue;

    private static final long serialVersionUID = 1L;

    public String getSvrtime() {
        return svrtime;
    }

    public void setSvrtime(String svrtime) {
        this.svrtime = svrtime;
    }

    public BigDecimal getDataIndex() {
        return dataIndex;
    }

    public void setDataIndex(BigDecimal dataIndex) {
        this.dataIndex = dataIndex;
    }

    public BigDecimal getSvcoefIndex() {
        return svcoefIndex;
    }

    public void setSvcoefIndex(BigDecimal svcoefIndex) {
        this.svcoefIndex = svcoefIndex;
    }

    public BigDecimal getSvcoefValue() {
        return svcoefValue;
    }

    public void setSvcoefValue(BigDecimal svcoefValue) {
        this.svcoefValue = svcoefValue;
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
        LlcSvrSvcoef other = (LlcSvrSvcoef) that;
        return (this.getSvrtime() == null ? other.getSvrtime() == null : this.getSvrtime().equals(other.getSvrtime()))
            && (this.getDataIndex() == null ? other.getDataIndex() == null : this.getDataIndex().equals(other.getDataIndex()))
            && (this.getSvcoefIndex() == null ? other.getSvcoefIndex() == null : this.getSvcoefIndex().equals(other.getSvcoefIndex()))
            && (this.getSvcoefValue() == null ? other.getSvcoefValue() == null : this.getSvcoefValue().equals(other.getSvcoefValue()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSvrtime() == null) ? 0 : getSvrtime().hashCode());
        result = prime * result + ((getDataIndex() == null) ? 0 : getDataIndex().hashCode());
        result = prime * result + ((getSvcoefIndex() == null) ? 0 : getSvcoefIndex().hashCode());
        result = prime * result + ((getSvcoefValue() == null) ? 0 : getSvcoefValue().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", svrtime=").append(svrtime);
        sb.append(", dataIndex=").append(dataIndex);
        sb.append(", svcoefIndex=").append(svcoefIndex);
        sb.append(", svcoefValue=").append(svcoefValue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}