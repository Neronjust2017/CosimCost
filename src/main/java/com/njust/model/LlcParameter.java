package com.njust.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 */
public class LlcParameter implements Serializable {
    /**
     * 参数ID，表的主键
     */
    private Integer parameterId;

    /**
     * 参数名称
     */
    private String parameterName;

    /**
     * 参数描述
     */
    private String parameterDes;

    /**
     * 参数默认值
     */
    private BigDecimal defaultValue;

    /**
     * 参数敏感系数
     */
    private BigDecimal sensitivity;

    private String parameterNameCal;

    private static final long serialVersionUID = 1L;

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

    public BigDecimal getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(BigDecimal defaultValue) {
        this.defaultValue = defaultValue;
    }

    public BigDecimal getSensitivity() {
        return sensitivity;
    }

    public void setSensitivity(BigDecimal sensitivity) {
        this.sensitivity = sensitivity;
    }

    public String getParameterNameCal() {
        return parameterNameCal;
    }

    public void setParameterNameCal(String parameterNameCal) {
        this.parameterNameCal = parameterNameCal;
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
        LlcParameter other = (LlcParameter) that;
        return (this.getParameterId() == null ? other.getParameterId() == null : this.getParameterId().equals(other.getParameterId()))
            && (this.getParameterName() == null ? other.getParameterName() == null : this.getParameterName().equals(other.getParameterName()))
            && (this.getParameterDes() == null ? other.getParameterDes() == null : this.getParameterDes().equals(other.getParameterDes()))
            && (this.getDefaultValue() == null ? other.getDefaultValue() == null : this.getDefaultValue().equals(other.getDefaultValue()))
            && (this.getSensitivity() == null ? other.getSensitivity() == null : this.getSensitivity().equals(other.getSensitivity()))
            && (this.getParameterNameCal() == null ? other.getParameterNameCal() == null : this.getParameterNameCal().equals(other.getParameterNameCal()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getParameterId() == null) ? 0 : getParameterId().hashCode());
        result = prime * result + ((getParameterName() == null) ? 0 : getParameterName().hashCode());
        result = prime * result + ((getParameterDes() == null) ? 0 : getParameterDes().hashCode());
        result = prime * result + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode());
        result = prime * result + ((getSensitivity() == null) ? 0 : getSensitivity().hashCode());
        result = prime * result + ((getParameterNameCal() == null) ? 0 : getParameterNameCal().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", parameterId=").append(parameterId);
        sb.append(", parameterName=").append(parameterName);
        sb.append(", parameterDes=").append(parameterDes);
        sb.append(", defaultValue=").append(defaultValue);
        sb.append(", sensitivity=").append(sensitivity);
        sb.append(", parameterNameCal=").append(parameterNameCal);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}