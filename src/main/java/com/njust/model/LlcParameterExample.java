package com.njust.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LlcParameterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public LlcParameterExample() {
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

        public Criteria andParameterIdIsNull() {
            addCriterion("PARAMETER_ID is null");
            return (Criteria) this;
        }

        public Criteria andParameterIdIsNotNull() {
            addCriterion("PARAMETER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParameterIdEqualTo(Integer value) {
            addCriterion("PARAMETER_ID =", value, "parameterId");
            return (Criteria) this;
        }

        public Criteria andParameterIdNotEqualTo(Integer value) {
            addCriterion("PARAMETER_ID <>", value, "parameterId");
            return (Criteria) this;
        }

        public Criteria andParameterIdGreaterThan(Integer value) {
            addCriterion("PARAMETER_ID >", value, "parameterId");
            return (Criteria) this;
        }

        public Criteria andParameterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PARAMETER_ID >=", value, "parameterId");
            return (Criteria) this;
        }

        public Criteria andParameterIdLessThan(Integer value) {
            addCriterion("PARAMETER_ID <", value, "parameterId");
            return (Criteria) this;
        }

        public Criteria andParameterIdLessThanOrEqualTo(Integer value) {
            addCriterion("PARAMETER_ID <=", value, "parameterId");
            return (Criteria) this;
        }

        public Criteria andParameterIdIn(List<Integer> values) {
            addCriterion("PARAMETER_ID in", values, "parameterId");
            return (Criteria) this;
        }

        public Criteria andParameterIdNotIn(List<Integer> values) {
            addCriterion("PARAMETER_ID not in", values, "parameterId");
            return (Criteria) this;
        }

        public Criteria andParameterIdBetween(Integer value1, Integer value2) {
            addCriterion("PARAMETER_ID between", value1, value2, "parameterId");
            return (Criteria) this;
        }

        public Criteria andParameterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PARAMETER_ID not between", value1, value2, "parameterId");
            return (Criteria) this;
        }

        public Criteria andParameterNameIsNull() {
            addCriterion("PARAMETER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andParameterNameIsNotNull() {
            addCriterion("PARAMETER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andParameterNameEqualTo(String value) {
            addCriterion("PARAMETER_NAME =", value, "parameterName");
            return (Criteria) this;
        }

        public Criteria andParameterNameNotEqualTo(String value) {
            addCriterion("PARAMETER_NAME <>", value, "parameterName");
            return (Criteria) this;
        }

        public Criteria andParameterNameGreaterThan(String value) {
            addCriterion("PARAMETER_NAME >", value, "parameterName");
            return (Criteria) this;
        }

        public Criteria andParameterNameGreaterThanOrEqualTo(String value) {
            addCriterion("PARAMETER_NAME >=", value, "parameterName");
            return (Criteria) this;
        }

        public Criteria andParameterNameLessThan(String value) {
            addCriterion("PARAMETER_NAME <", value, "parameterName");
            return (Criteria) this;
        }

        public Criteria andParameterNameLessThanOrEqualTo(String value) {
            addCriterion("PARAMETER_NAME <=", value, "parameterName");
            return (Criteria) this;
        }

        public Criteria andParameterNameLike(String value) {
            addCriterion("PARAMETER_NAME like", value, "parameterName");
            return (Criteria) this;
        }

        public Criteria andParameterNameNotLike(String value) {
            addCriterion("PARAMETER_NAME not like", value, "parameterName");
            return (Criteria) this;
        }

        public Criteria andParameterNameIn(List<String> values) {
            addCriterion("PARAMETER_NAME in", values, "parameterName");
            return (Criteria) this;
        }

        public Criteria andParameterNameNotIn(List<String> values) {
            addCriterion("PARAMETER_NAME not in", values, "parameterName");
            return (Criteria) this;
        }

        public Criteria andParameterNameBetween(String value1, String value2) {
            addCriterion("PARAMETER_NAME between", value1, value2, "parameterName");
            return (Criteria) this;
        }

        public Criteria andParameterNameNotBetween(String value1, String value2) {
            addCriterion("PARAMETER_NAME not between", value1, value2, "parameterName");
            return (Criteria) this;
        }

        public Criteria andParameterDesIsNull() {
            addCriterion("PARAMETER_DES is null");
            return (Criteria) this;
        }

        public Criteria andParameterDesIsNotNull() {
            addCriterion("PARAMETER_DES is not null");
            return (Criteria) this;
        }

        public Criteria andParameterDesEqualTo(String value) {
            addCriterion("PARAMETER_DES =", value, "parameterDes");
            return (Criteria) this;
        }

        public Criteria andParameterDesNotEqualTo(String value) {
            addCriterion("PARAMETER_DES <>", value, "parameterDes");
            return (Criteria) this;
        }

        public Criteria andParameterDesGreaterThan(String value) {
            addCriterion("PARAMETER_DES >", value, "parameterDes");
            return (Criteria) this;
        }

        public Criteria andParameterDesGreaterThanOrEqualTo(String value) {
            addCriterion("PARAMETER_DES >=", value, "parameterDes");
            return (Criteria) this;
        }

        public Criteria andParameterDesLessThan(String value) {
            addCriterion("PARAMETER_DES <", value, "parameterDes");
            return (Criteria) this;
        }

        public Criteria andParameterDesLessThanOrEqualTo(String value) {
            addCriterion("PARAMETER_DES <=", value, "parameterDes");
            return (Criteria) this;
        }

        public Criteria andParameterDesLike(String value) {
            addCriterion("PARAMETER_DES like", value, "parameterDes");
            return (Criteria) this;
        }

        public Criteria andParameterDesNotLike(String value) {
            addCriterion("PARAMETER_DES not like", value, "parameterDes");
            return (Criteria) this;
        }

        public Criteria andParameterDesIn(List<String> values) {
            addCriterion("PARAMETER_DES in", values, "parameterDes");
            return (Criteria) this;
        }

        public Criteria andParameterDesNotIn(List<String> values) {
            addCriterion("PARAMETER_DES not in", values, "parameterDes");
            return (Criteria) this;
        }

        public Criteria andParameterDesBetween(String value1, String value2) {
            addCriterion("PARAMETER_DES between", value1, value2, "parameterDes");
            return (Criteria) this;
        }

        public Criteria andParameterDesNotBetween(String value1, String value2) {
            addCriterion("PARAMETER_DES not between", value1, value2, "parameterDes");
            return (Criteria) this;
        }

        public Criteria andDefaultValueIsNull() {
            addCriterion("DEFAULT_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andDefaultValueIsNotNull() {
            addCriterion("DEFAULT_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultValueEqualTo(BigDecimal value) {
            addCriterion("DEFAULT_VALUE =", value, "defaultValue");
            return (Criteria) this;
        }

        public Criteria andDefaultValueNotEqualTo(BigDecimal value) {
            addCriterion("DEFAULT_VALUE <>", value, "defaultValue");
            return (Criteria) this;
        }

        public Criteria andDefaultValueGreaterThan(BigDecimal value) {
            addCriterion("DEFAULT_VALUE >", value, "defaultValue");
            return (Criteria) this;
        }

        public Criteria andDefaultValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DEFAULT_VALUE >=", value, "defaultValue");
            return (Criteria) this;
        }

        public Criteria andDefaultValueLessThan(BigDecimal value) {
            addCriterion("DEFAULT_VALUE <", value, "defaultValue");
            return (Criteria) this;
        }

        public Criteria andDefaultValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DEFAULT_VALUE <=", value, "defaultValue");
            return (Criteria) this;
        }

        public Criteria andDefaultValueIn(List<BigDecimal> values) {
            addCriterion("DEFAULT_VALUE in", values, "defaultValue");
            return (Criteria) this;
        }

        public Criteria andDefaultValueNotIn(List<BigDecimal> values) {
            addCriterion("DEFAULT_VALUE not in", values, "defaultValue");
            return (Criteria) this;
        }

        public Criteria andDefaultValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEFAULT_VALUE between", value1, value2, "defaultValue");
            return (Criteria) this;
        }

        public Criteria andDefaultValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEFAULT_VALUE not between", value1, value2, "defaultValue");
            return (Criteria) this;
        }

        public Criteria andSensitivityIsNull() {
            addCriterion("SENSITIVITY is null");
            return (Criteria) this;
        }

        public Criteria andSensitivityIsNotNull() {
            addCriterion("SENSITIVITY is not null");
            return (Criteria) this;
        }

        public Criteria andSensitivityEqualTo(BigDecimal value) {
            addCriterion("SENSITIVITY =", value, "sensitivity");
            return (Criteria) this;
        }

        public Criteria andSensitivityNotEqualTo(BigDecimal value) {
            addCriterion("SENSITIVITY <>", value, "sensitivity");
            return (Criteria) this;
        }

        public Criteria andSensitivityGreaterThan(BigDecimal value) {
            addCriterion("SENSITIVITY >", value, "sensitivity");
            return (Criteria) this;
        }

        public Criteria andSensitivityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SENSITIVITY >=", value, "sensitivity");
            return (Criteria) this;
        }

        public Criteria andSensitivityLessThan(BigDecimal value) {
            addCriterion("SENSITIVITY <", value, "sensitivity");
            return (Criteria) this;
        }

        public Criteria andSensitivityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SENSITIVITY <=", value, "sensitivity");
            return (Criteria) this;
        }

        public Criteria andSensitivityIn(List<BigDecimal> values) {
            addCriterion("SENSITIVITY in", values, "sensitivity");
            return (Criteria) this;
        }

        public Criteria andSensitivityNotIn(List<BigDecimal> values) {
            addCriterion("SENSITIVITY not in", values, "sensitivity");
            return (Criteria) this;
        }

        public Criteria andSensitivityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SENSITIVITY between", value1, value2, "sensitivity");
            return (Criteria) this;
        }

        public Criteria andSensitivityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SENSITIVITY not between", value1, value2, "sensitivity");
            return (Criteria) this;
        }

        public Criteria andParameterNameCalIsNull() {
            addCriterion("PARAMETER_NAME_CAL is null");
            return (Criteria) this;
        }

        public Criteria andParameterNameCalIsNotNull() {
            addCriterion("PARAMETER_NAME_CAL is not null");
            return (Criteria) this;
        }

        public Criteria andParameterNameCalEqualTo(String value) {
            addCriterion("PARAMETER_NAME_CAL =", value, "parameterNameCal");
            return (Criteria) this;
        }

        public Criteria andParameterNameCalNotEqualTo(String value) {
            addCriterion("PARAMETER_NAME_CAL <>", value, "parameterNameCal");
            return (Criteria) this;
        }

        public Criteria andParameterNameCalGreaterThan(String value) {
            addCriterion("PARAMETER_NAME_CAL >", value, "parameterNameCal");
            return (Criteria) this;
        }

        public Criteria andParameterNameCalGreaterThanOrEqualTo(String value) {
            addCriterion("PARAMETER_NAME_CAL >=", value, "parameterNameCal");
            return (Criteria) this;
        }

        public Criteria andParameterNameCalLessThan(String value) {
            addCriterion("PARAMETER_NAME_CAL <", value, "parameterNameCal");
            return (Criteria) this;
        }

        public Criteria andParameterNameCalLessThanOrEqualTo(String value) {
            addCriterion("PARAMETER_NAME_CAL <=", value, "parameterNameCal");
            return (Criteria) this;
        }

        public Criteria andParameterNameCalLike(String value) {
            addCriterion("PARAMETER_NAME_CAL like", value, "parameterNameCal");
            return (Criteria) this;
        }

        public Criteria andParameterNameCalNotLike(String value) {
            addCriterion("PARAMETER_NAME_CAL not like", value, "parameterNameCal");
            return (Criteria) this;
        }

        public Criteria andParameterNameCalIn(List<String> values) {
            addCriterion("PARAMETER_NAME_CAL in", values, "parameterNameCal");
            return (Criteria) this;
        }

        public Criteria andParameterNameCalNotIn(List<String> values) {
            addCriterion("PARAMETER_NAME_CAL not in", values, "parameterNameCal");
            return (Criteria) this;
        }

        public Criteria andParameterNameCalBetween(String value1, String value2) {
            addCriterion("PARAMETER_NAME_CAL between", value1, value2, "parameterNameCal");
            return (Criteria) this;
        }

        public Criteria andParameterNameCalNotBetween(String value1, String value2) {
            addCriterion("PARAMETER_NAME_CAL not between", value1, value2, "parameterNameCal");
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