package com.njust.model;

import java.io.Serializable;

/**
 * @author 
 */
public class LlcTaskKey implements Serializable {
    /**
     * 任务树ID
     */
    private Integer taskTreeId;

    /**
     * 任务节点ID
     */
    private Integer taskId;

    private static final long serialVersionUID = 1L;

    public Integer getTaskTreeId() {
        return taskTreeId;
    }

    public void setTaskTreeId(Integer taskTreeId) {
        this.taskTreeId = taskTreeId;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
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
        LlcTaskKey other = (LlcTaskKey) that;
        return (this.getTaskTreeId() == null ? other.getTaskTreeId() == null : this.getTaskTreeId().equals(other.getTaskTreeId()))
            && (this.getTaskId() == null ? other.getTaskId() == null : this.getTaskId().equals(other.getTaskId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTaskTreeId() == null) ? 0 : getTaskTreeId().hashCode());
        result = prime * result + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", taskTreeId=").append(taskTreeId);
        sb.append(", taskId=").append(taskId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}