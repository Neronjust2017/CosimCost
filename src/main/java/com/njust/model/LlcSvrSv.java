package com.njust.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 */
public class LlcSvrSv implements Serializable {
    private String svrtime;

    private BigDecimal dataIndex;

    private BigDecimal nodeIndex;

    private BigDecimal nodeValue;

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

    public BigDecimal getNodeIndex() {
        return nodeIndex;
    }

    public void setNodeIndex(BigDecimal nodeIndex) {
        this.nodeIndex = nodeIndex;
    }

    public BigDecimal getNodeValue() {
        return nodeValue;
    }

    public void setNodeValue(BigDecimal nodeValue) {
        this.nodeValue = nodeValue;
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
        LlcSvrSv other = (LlcSvrSv) that;
        return (this.getSvrtime() == null ? other.getSvrtime() == null : this.getSvrtime().equals(other.getSvrtime()))
            && (this.getDataIndex() == null ? other.getDataIndex() == null : this.getDataIndex().equals(other.getDataIndex()))
            && (this.getNodeIndex() == null ? other.getNodeIndex() == null : this.getNodeIndex().equals(other.getNodeIndex()))
            && (this.getNodeValue() == null ? other.getNodeValue() == null : this.getNodeValue().equals(other.getNodeValue()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSvrtime() == null) ? 0 : getSvrtime().hashCode());
        result = prime * result + ((getDataIndex() == null) ? 0 : getDataIndex().hashCode());
        result = prime * result + ((getNodeIndex() == null) ? 0 : getNodeIndex().hashCode());
        result = prime * result + ((getNodeValue() == null) ? 0 : getNodeValue().hashCode());
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
        sb.append(", nodeIndex=").append(nodeIndex);
        sb.append(", nodeValue=").append(nodeValue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}