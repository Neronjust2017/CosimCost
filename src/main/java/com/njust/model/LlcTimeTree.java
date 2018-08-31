package com.njust.model;

import java.io.Serializable;

/**
 * @author 
 */
public class LlcTimeTree implements Serializable {
    /**
     * 时间树ID
     */
    private Integer timeTreeId;

    /**
     * 时间树名称
     */
    private String timeTreeName;

    private static final long serialVersionUID = 1L;

    public Integer getTimeTreeId() {
        return timeTreeId;
    }

    public void setTimeTreeId(Integer timeTreeId) {
        this.timeTreeId = timeTreeId;
    }

    public String getTimeTreeName() {
        return timeTreeName;
    }

    public void setTimeTreeName(String timeTreeName) {
        this.timeTreeName = timeTreeName;
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
        LlcTimeTree other = (LlcTimeTree) that;
        return (this.getTimeTreeId() == null ? other.getTimeTreeId() == null : this.getTimeTreeId().equals(other.getTimeTreeId()))
            && (this.getTimeTreeName() == null ? other.getTimeTreeName() == null : this.getTimeTreeName().equals(other.getTimeTreeName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTimeTreeId() == null) ? 0 : getTimeTreeId().hashCode());
        result = prime * result + ((getTimeTreeName() == null) ? 0 : getTimeTreeName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", timeTreeId=").append(timeTreeId);
        sb.append(", timeTreeName=").append(timeTreeName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}