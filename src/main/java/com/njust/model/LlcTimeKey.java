package com.njust.model;

import java.io.Serializable;

/**
 * @author 
 */
public class LlcTimeKey implements Serializable {
    /**
     * 时间树ID
     */
    private Integer timeTreeId;

    /**
     * 时间节点ID
     */
    private Integer timeId;

    private static final long serialVersionUID = 1L;

    public Integer getTimeTreeId() {
        return timeTreeId;
    }

    public void setTimeTreeId(Integer timeTreeId) {
        this.timeTreeId = timeTreeId;
    }

    public Integer getTimeId() {
        return timeId;
    }

    public void setTimeId(Integer timeId) {
        this.timeId = timeId;
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
        LlcTimeKey other = (LlcTimeKey) that;
        return (this.getTimeTreeId() == null ? other.getTimeTreeId() == null : this.getTimeTreeId().equals(other.getTimeTreeId()))
            && (this.getTimeId() == null ? other.getTimeId() == null : this.getTimeId().equals(other.getTimeId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTimeTreeId() == null) ? 0 : getTimeTreeId().hashCode());
        result = prime * result + ((getTimeId() == null) ? 0 : getTimeId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", timeTreeId=").append(timeTreeId);
        sb.append(", timeId=").append(timeId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}