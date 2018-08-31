package com.njust.model;

import java.io.Serializable;

/**
 * @author 
 */
public class LlcScheme implements Serializable {
    /**
     * 方案ID，表的主键
     */
    private Integer schemeId;

    /**
     * 项目ID，表的主键
     */
    private Integer projectId;

    /**
     * 产品树ID
     */
    private Integer productTreeId;

    /**
     * 任务树ID
     */
    private Integer taskTreeId;

    /**
     * 资源树ID
     */
    private Integer resourceTreeId;

    /**
     * 时间树ID
     */
    private Integer timeTreeId;

    /**
     * 技术树ID
     */
    private Integer technologyTreeId;

    /**
     * 费用树ID
     */
    private Integer costTreeId;

    private static final long serialVersionUID = 1L;

    public Integer getSchemeId() {
        return schemeId;
    }

    public void setSchemeId(Integer schemeId) {
        this.schemeId = schemeId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getProductTreeId() {
        return productTreeId;
    }

    public void setProductTreeId(Integer productTreeId) {
        this.productTreeId = productTreeId;
    }

    public Integer getTaskTreeId() {
        return taskTreeId;
    }

    public void setTaskTreeId(Integer taskTreeId) {
        this.taskTreeId = taskTreeId;
    }

    public Integer getResourceTreeId() {
        return resourceTreeId;
    }

    public void setResourceTreeId(Integer resourceTreeId) {
        this.resourceTreeId = resourceTreeId;
    }

    public Integer getTimeTreeId() {
        return timeTreeId;
    }

    public void setTimeTreeId(Integer timeTreeId) {
        this.timeTreeId = timeTreeId;
    }

    public Integer getTechnologyTreeId() {
        return technologyTreeId;
    }

    public void setTechnologyTreeId(Integer technologyTreeId) {
        this.technologyTreeId = technologyTreeId;
    }

    public Integer getCostTreeId() {
        return costTreeId;
    }

    public void setCostTreeId(Integer costTreeId) {
        this.costTreeId = costTreeId;
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
        LlcScheme other = (LlcScheme) that;
        return (this.getSchemeId() == null ? other.getSchemeId() == null : this.getSchemeId().equals(other.getSchemeId()))
            && (this.getProjectId() == null ? other.getProjectId() == null : this.getProjectId().equals(other.getProjectId()))
            && (this.getProductTreeId() == null ? other.getProductTreeId() == null : this.getProductTreeId().equals(other.getProductTreeId()))
            && (this.getTaskTreeId() == null ? other.getTaskTreeId() == null : this.getTaskTreeId().equals(other.getTaskTreeId()))
            && (this.getResourceTreeId() == null ? other.getResourceTreeId() == null : this.getResourceTreeId().equals(other.getResourceTreeId()))
            && (this.getTimeTreeId() == null ? other.getTimeTreeId() == null : this.getTimeTreeId().equals(other.getTimeTreeId()))
            && (this.getTechnologyTreeId() == null ? other.getTechnologyTreeId() == null : this.getTechnologyTreeId().equals(other.getTechnologyTreeId()))
            && (this.getCostTreeId() == null ? other.getCostTreeId() == null : this.getCostTreeId().equals(other.getCostTreeId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSchemeId() == null) ? 0 : getSchemeId().hashCode());
        result = prime * result + ((getProjectId() == null) ? 0 : getProjectId().hashCode());
        result = prime * result + ((getProductTreeId() == null) ? 0 : getProductTreeId().hashCode());
        result = prime * result + ((getTaskTreeId() == null) ? 0 : getTaskTreeId().hashCode());
        result = prime * result + ((getResourceTreeId() == null) ? 0 : getResourceTreeId().hashCode());
        result = prime * result + ((getTimeTreeId() == null) ? 0 : getTimeTreeId().hashCode());
        result = prime * result + ((getTechnologyTreeId() == null) ? 0 : getTechnologyTreeId().hashCode());
        result = prime * result + ((getCostTreeId() == null) ? 0 : getCostTreeId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", schemeId=").append(schemeId);
        sb.append(", projectId=").append(projectId);
        sb.append(", productTreeId=").append(productTreeId);
        sb.append(", taskTreeId=").append(taskTreeId);
        sb.append(", resourceTreeId=").append(resourceTreeId);
        sb.append(", timeTreeId=").append(timeTreeId);
        sb.append(", technologyTreeId=").append(technologyTreeId);
        sb.append(", costTreeId=").append(costTreeId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}