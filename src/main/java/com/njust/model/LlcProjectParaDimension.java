package com.njust.model;

import java.io.Serializable;

/**
 * @author 
 */
public class LlcProjectParaDimension implements Serializable {
    private Integer projectId;

    private Integer costTreeId;

    private Integer productTreeId;

    private Integer belongProductId;

    private Integer taskTreeId;

    private Integer belongTaskId;

    private Integer resourceTreeId;

    private Integer belongResourceId;

    private Integer timeTreeId;

    private Integer belongTimeId;

    private Integer technologyTreeId;

    private Integer belongTechnologyId;

    private Integer parameterId;

    private String parameterName;

    private String parameterDes;

    private String variables;

    private String function;

    private static final long serialVersionUID = 1L;

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getCostTreeId() {
        return costTreeId;
    }

    public void setCostTreeId(Integer costTreeId) {
        this.costTreeId = costTreeId;
    }

    public Integer getProductTreeId() {
        return productTreeId;
    }

    public void setProductTreeId(Integer productTreeId) {
        this.productTreeId = productTreeId;
    }

    public Integer getBelongProductId() {
        return belongProductId;
    }

    public void setBelongProductId(Integer belongProductId) {
        this.belongProductId = belongProductId;
    }

    public Integer getTaskTreeId() {
        return taskTreeId;
    }

    public void setTaskTreeId(Integer taskTreeId) {
        this.taskTreeId = taskTreeId;
    }

    public Integer getBelongTaskId() {
        return belongTaskId;
    }

    public void setBelongTaskId(Integer belongTaskId) {
        this.belongTaskId = belongTaskId;
    }

    public Integer getResourceTreeId() {
        return resourceTreeId;
    }

    public void setResourceTreeId(Integer resourceTreeId) {
        this.resourceTreeId = resourceTreeId;
    }

    public Integer getBelongResourceId() {
        return belongResourceId;
    }

    public void setBelongResourceId(Integer belongResourceId) {
        this.belongResourceId = belongResourceId;
    }

    public Integer getTimeTreeId() {
        return timeTreeId;
    }

    public void setTimeTreeId(Integer timeTreeId) {
        this.timeTreeId = timeTreeId;
    }

    public Integer getBelongTimeId() {
        return belongTimeId;
    }

    public void setBelongTimeId(Integer belongTimeId) {
        this.belongTimeId = belongTimeId;
    }

    public Integer getTechnologyTreeId() {
        return technologyTreeId;
    }

    public void setTechnologyTreeId(Integer technologyTreeId) {
        this.technologyTreeId = technologyTreeId;
    }

    public Integer getBelongTechnologyId() {
        return belongTechnologyId;
    }

    public void setBelongTechnologyId(Integer belongTechnologyId) {
        this.belongTechnologyId = belongTechnologyId;
    }

    public Integer getParameterId() {
        return parameterId;
    }

    public void setParameterId(Integer parameterId) {
        this.parameterId = parameterId;
    }

    public String getParameterName() {
        return parameterName;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    public String getParameterDes() {
        return parameterDes;
    }

    public void setParameterDes(String parameterDes) {
        this.parameterDes = parameterDes;
    }

    public String getVariables() {
        return variables;
    }

    public void setVariables(String variables) {
        this.variables = variables;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
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
        LlcProjectParaDimension other = (LlcProjectParaDimension) that;
        return (this.getProjectId() == null ? other.getProjectId() == null : this.getProjectId().equals(other.getProjectId()))
            && (this.getCostTreeId() == null ? other.getCostTreeId() == null : this.getCostTreeId().equals(other.getCostTreeId()))
            && (this.getProductTreeId() == null ? other.getProductTreeId() == null : this.getProductTreeId().equals(other.getProductTreeId()))
            && (this.getBelongProductId() == null ? other.getBelongProductId() == null : this.getBelongProductId().equals(other.getBelongProductId()))
            && (this.getTaskTreeId() == null ? other.getTaskTreeId() == null : this.getTaskTreeId().equals(other.getTaskTreeId()))
            && (this.getBelongTaskId() == null ? other.getBelongTaskId() == null : this.getBelongTaskId().equals(other.getBelongTaskId()))
            && (this.getResourceTreeId() == null ? other.getResourceTreeId() == null : this.getResourceTreeId().equals(other.getResourceTreeId()))
            && (this.getBelongResourceId() == null ? other.getBelongResourceId() == null : this.getBelongResourceId().equals(other.getBelongResourceId()))
            && (this.getTimeTreeId() == null ? other.getTimeTreeId() == null : this.getTimeTreeId().equals(other.getTimeTreeId()))
            && (this.getBelongTimeId() == null ? other.getBelongTimeId() == null : this.getBelongTimeId().equals(other.getBelongTimeId()))
            && (this.getTechnologyTreeId() == null ? other.getTechnologyTreeId() == null : this.getTechnologyTreeId().equals(other.getTechnologyTreeId()))
            && (this.getBelongTechnologyId() == null ? other.getBelongTechnologyId() == null : this.getBelongTechnologyId().equals(other.getBelongTechnologyId()))
            && (this.getParameterId() == null ? other.getParameterId() == null : this.getParameterId().equals(other.getParameterId()))
            && (this.getParameterName() == null ? other.getParameterName() == null : this.getParameterName().equals(other.getParameterName()))
            && (this.getParameterDes() == null ? other.getParameterDes() == null : this.getParameterDes().equals(other.getParameterDes()))
            && (this.getVariables() == null ? other.getVariables() == null : this.getVariables().equals(other.getVariables()))
            && (this.getFunction() == null ? other.getFunction() == null : this.getFunction().equals(other.getFunction()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProjectId() == null) ? 0 : getProjectId().hashCode());
        result = prime * result + ((getCostTreeId() == null) ? 0 : getCostTreeId().hashCode());
        result = prime * result + ((getProductTreeId() == null) ? 0 : getProductTreeId().hashCode());
        result = prime * result + ((getBelongProductId() == null) ? 0 : getBelongProductId().hashCode());
        result = prime * result + ((getTaskTreeId() == null) ? 0 : getTaskTreeId().hashCode());
        result = prime * result + ((getBelongTaskId() == null) ? 0 : getBelongTaskId().hashCode());
        result = prime * result + ((getResourceTreeId() == null) ? 0 : getResourceTreeId().hashCode());
        result = prime * result + ((getBelongResourceId() == null) ? 0 : getBelongResourceId().hashCode());
        result = prime * result + ((getTimeTreeId() == null) ? 0 : getTimeTreeId().hashCode());
        result = prime * result + ((getBelongTimeId() == null) ? 0 : getBelongTimeId().hashCode());
        result = prime * result + ((getTechnologyTreeId() == null) ? 0 : getTechnologyTreeId().hashCode());
        result = prime * result + ((getBelongTechnologyId() == null) ? 0 : getBelongTechnologyId().hashCode());
        result = prime * result + ((getParameterId() == null) ? 0 : getParameterId().hashCode());
        result = prime * result + ((getParameterName() == null) ? 0 : getParameterName().hashCode());
        result = prime * result + ((getParameterDes() == null) ? 0 : getParameterDes().hashCode());
        result = prime * result + ((getVariables() == null) ? 0 : getVariables().hashCode());
        result = prime * result + ((getFunction() == null) ? 0 : getFunction().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", projectId=").append(projectId);
        sb.append(", costTreeId=").append(costTreeId);
        sb.append(", productTreeId=").append(productTreeId);
        sb.append(", belongProductId=").append(belongProductId);
        sb.append(", taskTreeId=").append(taskTreeId);
        sb.append(", belongTaskId=").append(belongTaskId);
        sb.append(", resourceTreeId=").append(resourceTreeId);
        sb.append(", belongResourceId=").append(belongResourceId);
        sb.append(", timeTreeId=").append(timeTreeId);
        sb.append(", belongTimeId=").append(belongTimeId);
        sb.append(", technologyTreeId=").append(technologyTreeId);
        sb.append(", belongTechnologyId=").append(belongTechnologyId);
        sb.append(", parameterId=").append(parameterId);
        sb.append(", parameterName=").append(parameterName);
        sb.append(", parameterDes=").append(parameterDes);
        sb.append(", variables=").append(variables);
        sb.append(", function=").append(function);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}