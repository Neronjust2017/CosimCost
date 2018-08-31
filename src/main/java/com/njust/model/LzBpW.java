package com.njust.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 */
public class LzBpW implements Serializable {
    private String modelTime;

    private BigDecimal wWeightLayerindex;

    private BigDecimal wFormPreindex;

    private BigDecimal wFormNxtindex;

    private BigDecimal wValue;

    private static final long serialVersionUID = 1L;

    public String getModelTime() {
        return modelTime;
    }

    public void setModelTime(String modelTime) {
        this.modelTime = modelTime;
    }

    public BigDecimal getwWeightLayerindex() {
        return wWeightLayerindex;
    }

    public void setwWeightLayerindex(BigDecimal wWeightLayerindex) {
        this.wWeightLayerindex = wWeightLayerindex;
    }

    public BigDecimal getwFormPreindex() {
        return wFormPreindex;
    }

    public void setwFormPreindex(BigDecimal wFormPreindex) {
        this.wFormPreindex = wFormPreindex;
    }

    public BigDecimal getwFormNxtindex() {
        return wFormNxtindex;
    }

    public void setwFormNxtindex(BigDecimal wFormNxtindex) {
        this.wFormNxtindex = wFormNxtindex;
    }

    public BigDecimal getwValue() {
        return wValue;
    }

    public void setwValue(BigDecimal wValue) {
        this.wValue = wValue;
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
        LzBpW other = (LzBpW) that;
        return (this.getModelTime() == null ? other.getModelTime() == null : this.getModelTime().equals(other.getModelTime()))
            && (this.getwWeightLayerindex() == null ? other.getwWeightLayerindex() == null : this.getwWeightLayerindex().equals(other.getwWeightLayerindex()))
            && (this.getwFormPreindex() == null ? other.getwFormPreindex() == null : this.getwFormPreindex().equals(other.getwFormPreindex()))
            && (this.getwFormNxtindex() == null ? other.getwFormNxtindex() == null : this.getwFormNxtindex().equals(other.getwFormNxtindex()))
            && (this.getwValue() == null ? other.getwValue() == null : this.getwValue().equals(other.getwValue()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getModelTime() == null) ? 0 : getModelTime().hashCode());
        result = prime * result + ((getwWeightLayerindex() == null) ? 0 : getwWeightLayerindex().hashCode());
        result = prime * result + ((getwFormPreindex() == null) ? 0 : getwFormPreindex().hashCode());
        result = prime * result + ((getwFormNxtindex() == null) ? 0 : getwFormNxtindex().hashCode());
        result = prime * result + ((getwValue() == null) ? 0 : getwValue().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", modelTime=").append(modelTime);
        sb.append(", wWeightLayerindex=").append(wWeightLayerindex);
        sb.append(", wFormPreindex=").append(wFormPreindex);
        sb.append(", wFormNxtindex=").append(wFormNxtindex);
        sb.append(", wValue=").append(wValue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}