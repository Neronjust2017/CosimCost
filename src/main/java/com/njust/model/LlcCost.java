package com.njust.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 */
public class LlcCost extends LlcCostKey implements Serializable {
    /**
     * 费用名称
     */
    private String costName;

    /**
     * 上级费用ID
     */
    private Integer superCostId;

    /**
     * 是否为原子费用
     */
    private Short isatom;

    /**
     * 费用计算所需变量集合
     */
    private String variables;

    /**
     * 费用计算函数表达式
     */
    private String function;

    /**
     * 费用值
     */
    private BigDecimal value;

    private String functionCal;

    private static final long serialVersionUID = 1L;

    public String getCostName() {
        return costName;
    }

    public void setCostName(String costName) {
        this.costName = costName;
    }

    public Integer getSuperCostId() {
        return superCostId;
    }

    public void setSuperCostId(Integer superCostId) {
        this.superCostId = superCostId;
    }

    public Short getIsatom() {
        return isatom;
    }

    public void setIsatom(Short isatom) {
        this.isatom = isatom;
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

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public String getFunctionCal() {
        return functionCal;
    }

    public void setFunctionCal(String functionCal) {
        this.functionCal = functionCal;
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
        LlcCost other = (LlcCost) that;
        return (this.getCostTreeId() == null ? other.getCostTreeId() == null : this.getCostTreeId().equals(other.getCostTreeId()))
            && (this.getCostId() == null ? other.getCostId() == null : this.getCostId().equals(other.getCostId()))
            && (this.getCostName() == null ? other.getCostName() == null : this.getCostName().equals(other.getCostName()))
            && (this.getSuperCostId() == null ? other.getSuperCostId() == null : this.getSuperCostId().equals(other.getSuperCostId()))
            && (this.getIsatom() == null ? other.getIsatom() == null : this.getIsatom().equals(other.getIsatom()))
            && (this.getVariables() == null ? other.getVariables() == null : this.getVariables().equals(other.getVariables()))
            && (this.getFunction() == null ? other.getFunction() == null : this.getFunction().equals(other.getFunction()))
            && (this.getValue() == null ? other.getValue() == null : this.getValue().equals(other.getValue()))
            && (this.getFunctionCal() == null ? other.getFunctionCal() == null : this.getFunctionCal().equals(other.getFunctionCal()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCostTreeId() == null) ? 0 : getCostTreeId().hashCode());
        result = prime * result + ((getCostId() == null) ? 0 : getCostId().hashCode());
        result = prime * result + ((getCostName() == null) ? 0 : getCostName().hashCode());
        result = prime * result + ((getSuperCostId() == null) ? 0 : getSuperCostId().hashCode());
        result = prime * result + ((getIsatom() == null) ? 0 : getIsatom().hashCode());
        result = prime * result + ((getVariables() == null) ? 0 : getVariables().hashCode());
        result = prime * result + ((getFunction() == null) ? 0 : getFunction().hashCode());
        result = prime * result + ((getValue() == null) ? 0 : getValue().hashCode());
        result = prime * result + ((getFunctionCal() == null) ? 0 : getFunctionCal().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", costName=").append(costName);
        sb.append(", superCostId=").append(superCostId);
        sb.append(", isatom=").append(isatom);
        sb.append(", variables=").append(variables);
        sb.append(", function=").append(function);
        sb.append(", value=").append(value);
        sb.append(", functionCal=").append(functionCal);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}