package com.njust.model;

import java.io.Serializable;

/**
 * @author 
 */
public class LlcTaskTree implements Serializable {
    /**
     * 任务树ID
     */
    private Integer taskTreeId;

    /**
     * 任务树名称
     */
    private String taskTreeName;

    private static final long serialVersionUID = 1L;

    public Integer getTaskTreeId() {
        return taskTreeId;
    }

    public void setTaskTreeId(Integer taskTreeId) {
        this.taskTreeId = taskTreeId;
    }

    public String getTaskTreeName() {
        return taskTreeName;
    }

    public void setTaskTreeName(String taskTreeName) {
        this.taskTreeName = taskTreeName;
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
        LlcTaskTree other = (LlcTaskTree) that;
        return (this.getTaskTreeId() == null ? other.getTaskTreeId() == null : this.getTaskTreeId().equals(other.getTaskTreeId()))
            && (this.getTaskTreeName() == null ? other.getTaskTreeName() == null : this.getTaskTreeName().equals(other.getTaskTreeName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTaskTreeId() == null) ? 0 : getTaskTreeId().hashCode());
        result = prime * result + ((getTaskTreeName() == null) ? 0 : getTaskTreeName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", taskTreeId=").append(taskTreeId);
        sb.append(", taskTreeName=").append(taskTreeName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}