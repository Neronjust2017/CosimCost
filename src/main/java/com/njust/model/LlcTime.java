package com.njust.model;

import java.io.Serializable;

/**
 * @author 
 */
public class LlcTime extends LlcTimeKey implements Serializable {
    /**
     * 时间节点名称
     */
    private String timeName;

    private static final long serialVersionUID = 1L;

    public String getTimeName() {
        return timeName;
    }

    public void setTimeName(String timeName) {
        this.timeName = timeName;
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
        LlcTime other = (LlcTime) that;
        return (this.getTimeTreeId() == null ? other.getTimeTreeId() == null : this.getTimeTreeId().equals(other.getTimeTreeId()))
            && (this.getTimeId() == null ? other.getTimeId() == null : this.getTimeId().equals(other.getTimeId()))
            && (this.getTimeName() == null ? other.getTimeName() == null : this.getTimeName().equals(other.getTimeName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTimeTreeId() == null) ? 0 : getTimeTreeId().hashCode());
        result = prime * result + ((getTimeId() == null) ? 0 : getTimeId().hashCode());
        result = prime * result + ((getTimeName() == null) ? 0 : getTimeName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", timeName=").append(timeName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}