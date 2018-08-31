package com.njust.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LlcCostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public LlcCostExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCostTreeIdIsNull() {
            addCriterion("COST_TREE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCostTreeIdIsNotNull() {
            addCriterion("COST_TREE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCostTreeIdEqualTo(Integer value) {
            addCriterion("COST_TREE_ID =", value, "costTreeId");
            return (Criteria) this;
        }

        public Criteria andCostTreeIdNotEqualTo(Integer value) {
            addCriterion("COST_TREE_ID <>", value, "costTreeId");
            return (Criteria) this;
        }

        public Criteria andCostTreeIdGreaterThan(Integer value) {
            addCriterion("COST_TREE_ID >", value, "costTreeId");
            return (Criteria) this;
        }

        public Criteria andCostTreeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("COST_TREE_ID >=", value, "costTreeId");
            return (Criteria) this;
        }

        public Criteria andCostTreeIdLessThan(Integer value) {
            addCriterion("COST_TREE_ID <", value, "costTreeId");
            return (Criteria) this;
        }

        public Criteria andCostTreeIdLessThanOrEqualTo(Integer value) {
            addCriterion("COST_TREE_ID <=", value, "costTreeId");
            return (Criteria) this;
        }

        public Criteria andCostTreeIdIn(List<Integer> values) {
            addCriterion("COST_TREE_ID in", values, "costTreeId");
            return (Criteria) this;
        }

        public Criteria andCostTreeIdNotIn(List<Integer> values) {
            addCriterion("COST_TREE_ID not in", values, "costTreeId");
            return (Criteria) this;
        }

        public Criteria andCostTreeIdBetween(Integer value1, Integer value2) {
            addCriterion("COST_TREE_ID between", value1, value2, "costTreeId");
            return (Criteria) this;
        }

        public Criteria andCostTreeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("COST_TREE_ID not between", value1, value2, "costTreeId");
            return (Criteria) this;
        }

        public Criteria andCostIdIsNull() {
            addCriterion("COST_ID is null");
            return (Criteria) this;
        }

        public Criteria andCostIdIsNotNull() {
            addCriterion("COST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCostIdEqualTo(Integer value) {
            addCriterion("COST_ID =", value, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdNotEqualTo(Integer value) {
            addCriterion("COST_ID <>", value, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdGreaterThan(Integer value) {
            addCriterion("COST_ID >", value, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("COST_ID >=", value, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdLessThan(Integer value) {
            addCriterion("COST_ID <", value, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdLessThanOrEqualTo(Integer value) {
            addCriterion("COST_ID <=", value, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdIn(List<Integer> values) {
            addCriterion("COST_ID in", values, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdNotIn(List<Integer> values) {
            addCriterion("COST_ID not in", values, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdBetween(Integer value1, Integer value2) {
            addCriterion("COST_ID between", value1, value2, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdNotBetween(Integer value1, Integer value2) {
            addCriterion("COST_ID not between", value1, value2, "costId");
            return (Criteria) this;
        }

        public Criteria andCostNameIsNull() {
            addCriterion("COST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCostNameIsNotNull() {
            addCriterion("COST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCostNameEqualTo(String value) {
            addCriterion("COST_NAME =", value, "costName");
            return (Criteria) this;
        }

        public Criteria andCostNameNotEqualTo(String value) {
            addCriterion("COST_NAME <>", value, "costName");
            return (Criteria) this;
        }

        public Criteria andCostNameGreaterThan(String value) {
            addCriterion("COST_NAME >", value, "costName");
            return (Criteria) this;
        }

        public Criteria andCostNameGreaterThanOrEqualTo(String value) {
            addCriterion("COST_NAME >=", value, "costName");
            return (Criteria) this;
        }

        public Criteria andCostNameLessThan(String value) {
            addCriterion("COST_NAME <", value, "costName");
            return (Criteria) this;
        }

        public Criteria andCostNameLessThanOrEqualTo(String value) {
            addCriterion("COST_NAME <=", value, "costName");
            return (Criteria) this;
        }

        public Criteria andCostNameLike(String value) {
            addCriterion("COST_NAME like", value, "costName");
            return (Criteria) this;
        }

        public Criteria andCostNameNotLike(String value) {
            addCriterion("COST_NAME not like", value, "costName");
            return (Criteria) this;
        }

        public Criteria andCostNameIn(List<String> values) {
            addCriterion("COST_NAME in", values, "costName");
            return (Criteria) this;
        }

        public Criteria andCostNameNotIn(List<String> values) {
            addCriterion("COST_NAME not in", values, "costName");
            return (Criteria) this;
        }

        public Criteria andCostNameBetween(String value1, String value2) {
            addCriterion("COST_NAME between", value1, value2, "costName");
            return (Criteria) this;
        }

        public Criteria andCostNameNotBetween(String value1, String value2) {
            addCriterion("COST_NAME not between", value1, value2, "costName");
            return (Criteria) this;
        }

        public Criteria andSuperCostIdIsNull() {
            addCriterion("SUPER_COST_ID is null");
            return (Criteria) this;
        }

        public Criteria andSuperCostIdIsNotNull() {
            addCriterion("SUPER_COST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSuperCostIdEqualTo(Integer value) {
            addCriterion("SUPER_COST_ID =", value, "superCostId");
            return (Criteria) this;
        }

        public Criteria andSuperCostIdNotEqualTo(Integer value) {
            addCriterion("SUPER_COST_ID <>", value, "superCostId");
            return (Criteria) this;
        }

        public Criteria andSuperCostIdGreaterThan(Integer value) {
            addCriterion("SUPER_COST_ID >", value, "superCostId");
            return (Criteria) this;
        }

        public Criteria andSuperCostIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SUPER_COST_ID >=", value, "superCostId");
            return (Criteria) this;
        }

        public Criteria andSuperCostIdLessThan(Integer value) {
            addCriterion("SUPER_COST_ID <", value, "superCostId");
            return (Criteria) this;
        }

        public Criteria andSuperCostIdLessThanOrEqualTo(Integer value) {
            addCriterion("SUPER_COST_ID <=", value, "superCostId");
            return (Criteria) this;
        }

        public Criteria andSuperCostIdIn(List<Integer> values) {
            addCriterion("SUPER_COST_ID in", values, "superCostId");
            return (Criteria) this;
        }

        public Criteria andSuperCostIdNotIn(List<Integer> values) {
            addCriterion("SUPER_COST_ID not in", values, "superCostId");
            return (Criteria) this;
        }

        public Criteria andSuperCostIdBetween(Integer value1, Integer value2) {
            addCriterion("SUPER_COST_ID between", value1, value2, "superCostId");
            return (Criteria) this;
        }

        public Criteria andSuperCostIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SUPER_COST_ID not between", value1, value2, "superCostId");
            return (Criteria) this;
        }

        public Criteria andIsatomIsNull() {
            addCriterion("ISATOM is null");
            return (Criteria) this;
        }

        public Criteria andIsatomIsNotNull() {
            addCriterion("ISATOM is not null");
            return (Criteria) this;
        }

        public Criteria andIsatomEqualTo(Short value) {
            addCriterion("ISATOM =", value, "isatom");
            return (Criteria) this;
        }

        public Criteria andIsatomNotEqualTo(Short value) {
            addCriterion("ISATOM <>", value, "isatom");
            return (Criteria) this;
        }

        public Criteria andIsatomGreaterThan(Short value) {
            addCriterion("ISATOM >", value, "isatom");
            return (Criteria) this;
        }

        public Criteria andIsatomGreaterThanOrEqualTo(Short value) {
            addCriterion("ISATOM >=", value, "isatom");
            return (Criteria) this;
        }

        public Criteria andIsatomLessThan(Short value) {
            addCriterion("ISATOM <", value, "isatom");
            return (Criteria) this;
        }

        public Criteria andIsatomLessThanOrEqualTo(Short value) {
            addCriterion("ISATOM <=", value, "isatom");
            return (Criteria) this;
        }

        public Criteria andIsatomIn(List<Short> values) {
            addCriterion("ISATOM in", values, "isatom");
            return (Criteria) this;
        }

        public Criteria andIsatomNotIn(List<Short> values) {
            addCriterion("ISATOM not in", values, "isatom");
            return (Criteria) this;
        }

        public Criteria andIsatomBetween(Short value1, Short value2) {
            addCriterion("ISATOM between", value1, value2, "isatom");
            return (Criteria) this;
        }

        public Criteria andIsatomNotBetween(Short value1, Short value2) {
            addCriterion("ISATOM not between", value1, value2, "isatom");
            return (Criteria) this;
        }

        public Criteria andVariablesIsNull() {
            addCriterion("VARIABLES is null");
            return (Criteria) this;
        }

        public Criteria andVariablesIsNotNull() {
            addCriterion("VARIABLES is not null");
            return (Criteria) this;
        }

        public Criteria andVariablesEqualTo(String value) {
            addCriterion("VARIABLES =", value, "variables");
            return (Criteria) this;
        }

        public Criteria andVariablesNotEqualTo(String value) {
            addCriterion("VARIABLES <>", value, "variables");
            return (Criteria) this;
        }

        public Criteria andVariablesGreaterThan(String value) {
            addCriterion("VARIABLES >", value, "variables");
            return (Criteria) this;
        }

        public Criteria andVariablesGreaterThanOrEqualTo(String value) {
            addCriterion("VARIABLES >=", value, "variables");
            return (Criteria) this;
        }

        public Criteria andVariablesLessThan(String value) {
            addCriterion("VARIABLES <", value, "variables");
            return (Criteria) this;
        }

        public Criteria andVariablesLessThanOrEqualTo(String value) {
            addCriterion("VARIABLES <=", value, "variables");
            return (Criteria) this;
        }

        public Criteria andVariablesLike(String value) {
            addCriterion("VARIABLES like", value, "variables");
            return (Criteria) this;
        }

        public Criteria andVariablesNotLike(String value) {
            addCriterion("VARIABLES not like", value, "variables");
            return (Criteria) this;
        }

        public Criteria andVariablesIn(List<String> values) {
            addCriterion("VARIABLES in", values, "variables");
            return (Criteria) this;
        }

        public Criteria andVariablesNotIn(List<String> values) {
            addCriterion("VARIABLES not in", values, "variables");
            return (Criteria) this;
        }

        public Criteria andVariablesBetween(String value1, String value2) {
            addCriterion("VARIABLES between", value1, value2, "variables");
            return (Criteria) this;
        }

        public Criteria andVariablesNotBetween(String value1, String value2) {
            addCriterion("VARIABLES not between", value1, value2, "variables");
            return (Criteria) this;
        }

        public Criteria andFunctionIsNull() {
            addCriterion("FUNCTION is null");
            return (Criteria) this;
        }

        public Criteria andFunctionIsNotNull() {
            addCriterion("FUNCTION is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionEqualTo(String value) {
            addCriterion("FUNCTION =", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionNotEqualTo(String value) {
            addCriterion("FUNCTION <>", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionGreaterThan(String value) {
            addCriterion("FUNCTION >", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionGreaterThanOrEqualTo(String value) {
            addCriterion("FUNCTION >=", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionLessThan(String value) {
            addCriterion("FUNCTION <", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionLessThanOrEqualTo(String value) {
            addCriterion("FUNCTION <=", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionLike(String value) {
            addCriterion("FUNCTION like", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionNotLike(String value) {
            addCriterion("FUNCTION not like", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionIn(List<String> values) {
            addCriterion("FUNCTION in", values, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionNotIn(List<String> values) {
            addCriterion("FUNCTION not in", values, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionBetween(String value1, String value2) {
            addCriterion("FUNCTION between", value1, value2, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionNotBetween(String value1, String value2) {
            addCriterion("FUNCTION not between", value1, value2, "function");
            return (Criteria) this;
        }

        public Criteria andValueIsNull() {
            addCriterion("VALUE is null");
            return (Criteria) this;
        }

        public Criteria andValueIsNotNull() {
            addCriterion("VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andValueEqualTo(BigDecimal value) {
            addCriterion("VALUE =", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotEqualTo(BigDecimal value) {
            addCriterion("VALUE <>", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThan(BigDecimal value) {
            addCriterion("VALUE >", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VALUE >=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThan(BigDecimal value) {
            addCriterion("VALUE <", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VALUE <=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueIn(List<BigDecimal> values) {
            addCriterion("VALUE in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotIn(List<BigDecimal> values) {
            addCriterion("VALUE not in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VALUE between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VALUE not between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andFunctionCalIsNull() {
            addCriterion("FUNCTION_CAL is null");
            return (Criteria) this;
        }

        public Criteria andFunctionCalIsNotNull() {
            addCriterion("FUNCTION_CAL is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionCalEqualTo(String value) {
            addCriterion("FUNCTION_CAL =", value, "functionCal");
            return (Criteria) this;
        }

        public Criteria andFunctionCalNotEqualTo(String value) {
            addCriterion("FUNCTION_CAL <>", value, "functionCal");
            return (Criteria) this;
        }

        public Criteria andFunctionCalGreaterThan(String value) {
            addCriterion("FUNCTION_CAL >", value, "functionCal");
            return (Criteria) this;
        }

        public Criteria andFunctionCalGreaterThanOrEqualTo(String value) {
            addCriterion("FUNCTION_CAL >=", value, "functionCal");
            return (Criteria) this;
        }

        public Criteria andFunctionCalLessThan(String value) {
            addCriterion("FUNCTION_CAL <", value, "functionCal");
            return (Criteria) this;
        }

        public Criteria andFunctionCalLessThanOrEqualTo(String value) {
            addCriterion("FUNCTION_CAL <=", value, "functionCal");
            return (Criteria) this;
        }

        public Criteria andFunctionCalLike(String value) {
            addCriterion("FUNCTION_CAL like", value, "functionCal");
            return (Criteria) this;
        }

        public Criteria andFunctionCalNotLike(String value) {
            addCriterion("FUNCTION_CAL not like", value, "functionCal");
            return (Criteria) this;
        }

        public Criteria andFunctionCalIn(List<String> values) {
            addCriterion("FUNCTION_CAL in", values, "functionCal");
            return (Criteria) this;
        }

        public Criteria andFunctionCalNotIn(List<String> values) {
            addCriterion("FUNCTION_CAL not in", values, "functionCal");
            return (Criteria) this;
        }

        public Criteria andFunctionCalBetween(String value1, String value2) {
            addCriterion("FUNCTION_CAL between", value1, value2, "functionCal");
            return (Criteria) this;
        }

        public Criteria andFunctionCalNotBetween(String value1, String value2) {
            addCriterion("FUNCTION_CAL not between", value1, value2, "functionCal");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}