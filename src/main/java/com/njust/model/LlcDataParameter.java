package com.njust.model;

import java.io.Serializable;

/**
 * @author 
 */
public class LlcDataParameter implements Serializable {
    private String dataparameterid;

    private Short flagIschecked;

    private String dataparametername;

    private Short type;

    private static final long serialVersionUID = 1L;

    public String getDataparameterid() {
        return dataparameterid;
    }

    public void setDataparameterid(String dataparameterid) {
        this.dataparameterid = dataparameterid;
    }

    public Short getFlagIschecked() {
        return flagIschecked;
    }

    public void setFlagIschecked(Short flagIschecked) {
        this.flagIschecked = flagIschecked;
    }

    public String getDataparametername() {
        return dataparametername;
    }

    public void setDataparametername(String dataparametername) {
        this.dataparametername = dataparametername;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
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
        LlcDataParameter other = (LlcDataParameter) that;
        return (this.getDataparameterid() == null ? other.getDataparameterid() == null : this.getDataparameterid().equals(other.getDataparameterid()))
            && (this.getFlagIschecked() == null ? other.getFlagIschecked() == null : this.getFlagIschecked().equals(other.getFlagIschecked()))
            && (this.getDataparametername() == null ? other.getDataparametername() == null : this.getDataparametername().equals(other.getDataparametername()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDataparameterid() == null) ? 0 : getDataparameterid().hashCode());
        result = prime * result + ((getFlagIschecked() == null) ? 0 : getFlagIschecked().hashCode());
        result = prime * result + ((getDataparametername() == null) ? 0 : getDataparametername().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dataparameterid=").append(dataparameterid);
        sb.append(", flagIschecked=").append(flagIschecked);
        sb.append(", dataparametername=").append(dataparametername);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}