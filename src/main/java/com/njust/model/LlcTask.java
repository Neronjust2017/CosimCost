package com.njust.model;

import java.io.Serializable;

/**
 * @author 
 */
public class LlcTask extends LlcTaskKey implements Serializable {
    /**
     * 任务节点名称
     */
    private String taskName;

    /**
     * 上级任务节点ID
     */
    private Integer superTaskId;

    private static final long serialVersionUID = 1L;

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Integer getSuperTaskId() {
        return superTaskId;
    }

    public void setSuperTaskId(Integer superTaskId) {
        this.superTaskId = superTaskId;
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
        LlcTask other = (LlcTask) that;
        return (this.getTaskTreeId() == null ? other.getTaskTreeId() == null : this.getTaskTreeId().equals(other.getTaskTreeId()))
            && (this.getTaskId() == null ? other.getTaskId() == null : this.getTaskId().equals(other.getTaskId()))
            && (this.getTaskName() == null ? other.getTaskName() == null : this.getTaskName().equals(other.getTaskName()))
            && (this.getSuperTaskId() == null ? other.getSuperTaskId() == null : this.getSuperTaskId().equals(other.getSuperTaskId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTaskTreeId() == null) ? 0 : getTaskTreeId().hashCode());
        result = prime * result + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        result = prime * result + ((getTaskName() == null) ? 0 : getTaskName().hashCode());
        result = prime * result + ((getSuperTaskId() == null) ? 0 : getSuperTaskId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", taskName=").append(taskName);
        sb.append(", superTaskId=").append(superTaskId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}