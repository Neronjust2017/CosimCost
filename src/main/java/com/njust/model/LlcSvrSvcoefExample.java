package com.njust.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LlcSvrSvcoefExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public LlcSvrSvcoefExample() {
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

        public Criteria andSvrtimeIsNull() {
            addCriterion("SvrTime is null");
            return (Criteria) this;
        }

        public Criteria andSvrtimeIsNotNull() {
            addCriterion("SvrTime is not null");
            return (Criteria) this;
        }

        public Criteria andSvrtimeEqualTo(String value) {
            addCriterion("SvrTime =", value, "svrtime");
            return (Criteria) this;
        }

        public Criteria andSvrtimeNotEqualTo(String value) {
            addCriterion("SvrTime <>", value, "svrtime");
            return (Criteria) this;
        }

        public Criteria andSvrtimeGreaterThan(String value) {
            addCriterion("SvrTime >", value, "svrtime");
            return (Criteria) this;
        }

        public Criteria andSvrtimeGreaterThanOrEqualTo(String value) {
            addCriterion("SvrTime >=", value, "svrtime");
            return (Criteria) this;
        }

        public Criteria andSvrtimeLessThan(String value) {
            addCriterion("SvrTime <", value, "svrtime");
            return (Criteria) this;
        }

        public Criteria andSvrtimeLessThanOrEqualTo(String value) {
            addCriterion("SvrTime <=", value, "svrtime");
            return (Criteria) this;
        }

        public Criteria andSvrtimeLike(String value) {
            addCriterion("SvrTime like", value, "svrtime");
            return (Criteria) this;
        }

        public Criteria andSvrtimeNotLike(String value) {
            addCriterion("SvrTime not like", value, "svrtime");
            return (Criteria) this;
        }

        public Criteria andSvrtimeIn(List<String> values) {
            addCriterion("SvrTime in", values, "svrtime");
            return (Criteria) this;
        }

        public Criteria andSvrtimeNotIn(List<String> values) {
            addCriterion("SvrTime not in", values, "svrtime");
            return (Criteria) this;
        }

        public Criteria andSvrtimeBetween(String value1, String value2) {
            addCriterion("SvrTime between", value1, value2, "svrtime");
            return (Criteria) this;
        }

        public Criteria andSvrtimeNotBetween(String value1, String value2) {
            addCriterion("SvrTime not between", value1, value2, "svrtime");
            return (Criteria) this;
        }

        public Criteria andDataIndexIsNull() {
            addCriterion("Data_Index is null");
            return (Criteria) this;
        }

        public Criteria andDataIndexIsNotNull() {
            addCriterion("Data_Index is not null");
            return (Criteria) this;
        }

        public Criteria andDataIndexEqualTo(BigDecimal value) {
            addCriterion("Data_Index =", value, "dataIndex");
            return (Criteria) this;
        }

        public Criteria andDataIndexNotEqualTo(BigDecimal value) {
            addCriterion("Data_Index <>", value, "dataIndex");
            return (Criteria) this;
        }

        public Criteria andDataIndexGreaterThan(BigDecimal value) {
            addCriterion("Data_Index >", value, "dataIndex");
            return (Criteria) this;
        }

        public Criteria andDataIndexGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Data_Index >=", value, "dataIndex");
            return (Criteria) this;
        }

        public Criteria andDataIndexLessThan(BigDecimal value) {
            addCriterion("Data_Index <", value, "dataIndex");
            return (Criteria) this;
        }

        public Criteria andDataIndexLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Data_Index <=", value, "dataIndex");
            return (Criteria) this;
        }

        public Criteria andDataIndexIn(List<BigDecimal> values) {
            addCriterion("Data_Index in", values, "dataIndex");
            return (Criteria) this;
        }

        public Criteria andDataIndexNotIn(List<BigDecimal> values) {
            addCriterion("Data_Index not in", values, "dataIndex");
            return (Criteria) this;
        }

        public Criteria andDataIndexBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Data_Index between", value1, value2, "dataIndex");
            return (Criteria) this;
        }

        public Criteria andDataIndexNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Data_Index not between", value1, value2, "dataIndex");
            return (Criteria) this;
        }

        public Criteria andSvcoefIndexIsNull() {
            addCriterion("SVCoef_Index is null");
            return (Criteria) this;
        }

        public Criteria andSvcoefIndexIsNotNull() {
            addCriterion("SVCoef_Index is not null");
            return (Criteria) this;
        }

        public Criteria andSvcoefIndexEqualTo(BigDecimal value) {
            addCriterion("SVCoef_Index =", value, "svcoefIndex");
            return (Criteria) this;
        }

        public Criteria andSvcoefIndexNotEqualTo(BigDecimal value) {
            addCriterion("SVCoef_Index <>", value, "svcoefIndex");
            return (Criteria) this;
        }

        public Criteria andSvcoefIndexGreaterThan(BigDecimal value) {
            addCriterion("SVCoef_Index >", value, "svcoefIndex");
            return (Criteria) this;
        }

        public Criteria andSvcoefIndexGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SVCoef_Index >=", value, "svcoefIndex");
            return (Criteria) this;
        }

        public Criteria andSvcoefIndexLessThan(BigDecimal value) {
            addCriterion("SVCoef_Index <", value, "svcoefIndex");
            return (Criteria) this;
        }

        public Criteria andSvcoefIndexLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SVCoef_Index <=", value, "svcoefIndex");
            return (Criteria) this;
        }

        public Criteria andSvcoefIndexIn(List<BigDecimal> values) {
            addCriterion("SVCoef_Index in", values, "svcoefIndex");
            return (Criteria) this;
        }

        public Criteria andSvcoefIndexNotIn(List<BigDecimal> values) {
            addCriterion("SVCoef_Index not in", values, "svcoefIndex");
            return (Criteria) this;
        }

        public Criteria andSvcoefIndexBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SVCoef_Index between", value1, value2, "svcoefIndex");
            return (Criteria) this;
        }

        public Criteria andSvcoefIndexNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SVCoef_Index not between", value1, value2, "svcoefIndex");
            return (Criteria) this;
        }

        public Criteria andSvcoefValueIsNull() {
            addCriterion("SVCoef_Value is null");
            return (Criteria) this;
        }

        public Criteria andSvcoefValueIsNotNull() {
            addCriterion("SVCoef_Value is not null");
            return (Criteria) this;
        }

        public Criteria andSvcoefValueEqualTo(BigDecimal value) {
            addCriterion("SVCoef_Value =", value, "svcoefValue");
            return (Criteria) this;
        }

        public Criteria andSvcoefValueNotEqualTo(BigDecimal value) {
            addCriterion("SVCoef_Value <>", value, "svcoefValue");
            return (Criteria) this;
        }

        public Criteria andSvcoefValueGreaterThan(BigDecimal value) {
            addCriterion("SVCoef_Value >", value, "svcoefValue");
            return (Criteria) this;
        }

        public Criteria andSvcoefValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SVCoef_Value >=", value, "svcoefValue");
            return (Criteria) this;
        }

        public Criteria andSvcoefValueLessThan(BigDecimal value) {
            addCriterion("SVCoef_Value <", value, "svcoefValue");
            return (Criteria) this;
        }

        public Criteria andSvcoefValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SVCoef_Value <=", value, "svcoefValue");
            return (Criteria) this;
        }

        public Criteria andSvcoefValueIn(List<BigDecimal> values) {
            addCriterion("SVCoef_Value in", values, "svcoefValue");
            return (Criteria) this;
        }

        public Criteria andSvcoefValueNotIn(List<BigDecimal> values) {
            addCriterion("SVCoef_Value not in", values, "svcoefValue");
            return (Criteria) this;
        }

        public Criteria andSvcoefValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SVCoef_Value between", value1, value2, "svcoefValue");
            return (Criteria) this;
        }

        public Criteria andSvcoefValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SVCoef_Value not between", value1, value2, "svcoefValue");
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