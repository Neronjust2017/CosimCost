package com.njust.model;

import java.io.Serializable;

/**
 * @author 
 */
public class LlcSchemeParaDimension implements Serializable {
    /**
     * 方案ID
     */
    private Integer schemeId;

    /**
     * 参数ID
     */
    private Integer parameterId;

    /**
     * 对应产品ID
     */
    private Integer belongProductId;

    /**
     * 对应任务ID
     */
    private Integer belongTaskId;

    /**
     * 对应资源ID
     */
    private Integer belongResourceId;

    /**
     * 对应时间ID
     */
    private Integer belongTimeId;

    /**
     * 对应技术ID
     */
    private Integer belongTechnologyId;

    /**
     * 变量集合
     */
    private String variables;

    /**
     * 函数表达式
     */
    private String function;

    private static final long serialVersionUID = 1L;

    public Integer getSchemeId() {
        return schemeId;
    }

    public void setSchemeId(Integer schemeId) {
        this.schemeId = schemeId;
    }

    public Integer getParameterId() {
        return parameterId;
    }

    public void setParameterId(Integer parameterId) {
        this.parameterId = parameterId;
    }

    public Integer getBelongProductId() {
        return belongProductId;
    }

    public void setBelongProductId(Integer belongProductId) {
        this.belongProductId = belongProductId;
    }

    public Integer getBelongTaskId() {
        return belongTaskId;
    }

    public void setBelongTaskId(Integer belongTaskId) {
        this.belongTaskId = belongTaskId;
    }

    public Integer getBelongResourceId() {
        return belongResourceId;
    }

    public void setBelongResourceId(Integer belongResourceId) {
        this.belongResourceId = belongResourceId;
    }

    public Integer getBelongTimeId() {
        return belongTimeId;
    }

    public void setBelongTimeId(Integer belongTimeId) {
        this.belongTimeId = belongTimeId;
    }

    public Integer getBelongTechnologyId() {
        return belongTechnologyId;
    }

    public void setBelongTechnologyId(Integer belongTechnologyId) {
        this.belongTechnologyId = belongTechnologyId;
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
        LlcSchemeParaDimension other = (LlcSchemeParaDimension) that;
        return (this.getSchemeId() == null ? other.getSchemeId() == null : this.getSchemeId().equals(other.getSchemeId()))
            && (this.getParameterId() == null ? other.getParameterId() == null : this.getParameterId().equals(other.getParameterId()))
            && (this.getBelongProductId() == null ? other.getBelongProductId() == null : this.getBelongProductId().equals(other.getBelongProductId()))
            && (this.getBelongTaskId() == null ? other.getBelongTaskId() == null : this.getBelongTaskId().equals(other.getBelongTaskId()))
            && (this.getBelongResourceId() == null ? other.getBelongResourceId() == null : this.getBelongResourceId().equals(other.getBelongResourceId()))
            && (this.getBelongTimeId() == null ? other.getBelongTimeId() == null : this.getBelongTimeId().equals(other.getBelongTimeId()))
            && (this.getBelongTechnologyId() == null ? other.getBelongTechnologyId() == null : this.getBelongTechnologyId().equals(other.getBelongTechnologyId()))
            && (this.getVariables() == null ? other.getVariables() == null : this.getVariables().equals(other.getVariables()))
            && (this.getFunction() == null ? other.getFunction() == null : this.getFunction().equals(other.getFunction()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSchemeId() == null) ? 0 : getSchemeId().hashCode());
        result = prime * result + ((getParameterId() == null) ? 0 : getParameterId().hashCode());
        result = prime * result + ((getBelongProductId() == null) ? 0 : getBelongProductId().hashCode());
        result = prime * result + ((getBelongTaskId() == null) ? 0 : getBelongTaskId().hashCode());
        result = prime * result + ((getBelongResourceId() == null) ? 0 : getBelongResourceId().hashCode());
        result = prime * result + ((getBelongTimeId() == null) ? 0 : getBelongTimeId().hashCode());
        result = prime * result + ((getBelongTechnologyId() == null) ? 0 : getBelongTechnologyId().hashCode());
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
        sb.append(", schemeId=").append(schemeId);
        sb.append(", parameterId=").append(parameterId);
        sb.append(", belongProductId=").append(belongProductId);
        sb.append(", belongTaskId=").append(belongTaskId);
        sb.append(", belongResourceId=").append(belongResourceId);
        sb.append(", belongTimeId=").append(belongTimeId);
        sb.append(", belongTechnologyId=").append(belongTechnologyId);
        sb.append(", variables=").append(variables);
        sb.append(", function=").append(function);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}