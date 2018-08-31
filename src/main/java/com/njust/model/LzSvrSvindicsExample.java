package com.njust.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LzSvrSvindicsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public LzSvrSvindicsExample() {
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

        public Criteria andModelTimeIsNull() {
            addCriterion("MODEL_TIME is null");
            return (Criteria) this;
        }

        public Criteria andModelTimeIsNotNull() {
            addCriterion("MODEL_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andModelTimeEqualTo(String value) {
            addCriterion("MODEL_TIME =", value, "modelTime");
            return (Criteria) this;
        }

        public Criteria andModelTimeNotEqualTo(String value) {
            addCriterion("MODEL_TIME <>", value, "modelTime");
            return (Criteria) this;
        }

        public Criteria andModelTimeGreaterThan(String value) {
            addCriterion("MODEL_TIME >", value, "modelTime");
            return (Criteria) this;
        }

        public Criteria andModelTimeGreaterThanOrEqualTo(String value) {
            addCriterion("MODEL_TIME >=", value, "modelTime");
            return (Criteria) this;
        }

        public Criteria andModelTimeLessThan(String value) {
            addCriterion("MODEL_TIME <", value, "modelTime");
            return (Criteria) this;
        }

        public Criteria andModelTimeLessThanOrEqualTo(String value) {
            addCriterion("MODEL_TIME <=", value, "modelTime");
            return (Criteria) this;
        }

        public Criteria andModelTimeLike(String value) {
            addCriterion("MODEL_TIME like", value, "modelTime");
            return (Criteria) this;
        }

        public Criteria andModelTimeNotLike(String value) {
            addCriterion("MODEL_TIME not like", value, "modelTime");
            return (Criteria) this;
        }

        public Criteria andModelTimeIn(List<String> values) {
            addCriterion("MODEL_TIME in", values, "modelTime");
            return (Criteria) this;
        }

        public Criteria andModelTimeNotIn(List<String> values) {
            addCriterion("MODEL_TIME not in", values, "modelTime");
            return (Criteria) this;
        }

        public Criteria andModelTimeBetween(String value1, String value2) {
            addCriterion("MODEL_TIME between", value1, value2, "modelTime");
            return (Criteria) this;
        }

        public Criteria andModelTimeNotBetween(String value1, String value2) {
            addCriterion("MODEL_TIME not between", value1, value2, "modelTime");
            return (Criteria) this;
        }

        public Criteria andSvindicsIndexIsNull() {
            addCriterion("SVINDICS_INDEX is null");
            return (Criteria) this;
        }

        public Criteria andSvindicsIndexIsNotNull() {
            addCriterion("SVINDICS_INDEX is not null");
            return (Criteria) this;
        }

        public Criteria andSvindicsIndexEqualTo(BigDecimal value) {
            addCriterion("SVINDICS_INDEX =", value, "svindicsIndex");
            return (Criteria) this;
        }

        public Criteria andSvindicsIndexNotEqualTo(BigDecimal value) {
            addCriterion("SVINDICS_INDEX <>", value, "svindicsIndex");
            return (Criteria) this;
        }

        public Criteria andSvindicsIndexGreaterThan(BigDecimal value) {
            addCriterion("SVINDICS_INDEX >", value, "svindicsIndex");
            return (Criteria) this;
        }

        public Criteria andSvindicsIndexGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SVINDICS_INDEX >=", value, "svindicsIndex");
            return (Criteria) this;
        }

        public Criteria andSvindicsIndexLessThan(BigDecimal value) {
            addCriterion("SVINDICS_INDEX <", value, "svindicsIndex");
            return (Criteria) this;
        }

        public Criteria andSvindicsIndexLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SVINDICS_INDEX <=", value, "svindicsIndex");
            return (Criteria) this;
        }

        public Criteria andSvindicsIndexIn(List<BigDecimal> values) {
            addCriterion("SVINDICS_INDEX in", values, "svindicsIndex");
            return (Criteria) this;
        }

        public Criteria andSvindicsIndexNotIn(List<BigDecimal> values) {
            addCriterion("SVINDICS_INDEX not in", values, "svindicsIndex");
            return (Criteria) this;
        }

        public Criteria andSvindicsIndexBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SVINDICS_INDEX between", value1, value2, "svindicsIndex");
            return (Criteria) this;
        }

        public Criteria andSvindicsIndexNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SVINDICS_INDEX not between", value1, value2, "svindicsIndex");
            return (Criteria) this;
        }

        public Criteria andSvindicsValueIsNull() {
            addCriterion("SVINDICS_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andSvindicsValueIsNotNull() {
            addCriterion("SVINDICS_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andSvindicsValueEqualTo(BigDecimal value) {
            addCriterion("SVINDICS_VALUE =", value, "svindicsValue");
            return (Criteria) this;
        }

        public Criteria andSvindicsValueNotEqualTo(BigDecimal value) {
            addCriterion("SVINDICS_VALUE <>", value, "svindicsValue");
            return (Criteria) this;
        }

        public Criteria andSvindicsValueGreaterThan(BigDecimal value) {
            addCriterion("SVINDICS_VALUE >", value, "svindicsValue");
            return (Criteria) this;
        }

        public Criteria andSvindicsValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SVINDICS_VALUE >=", value, "svindicsValue");
            return (Criteria) this;
        }

        public Criteria andSvindicsValueLessThan(BigDecimal value) {
            addCriterion("SVINDICS_VALUE <", value, "svindicsValue");
            return (Criteria) this;
        }

        public Criteria andSvindicsValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SVINDICS_VALUE <=", value, "svindicsValue");
            return (Criteria) this;
        }

        public Criteria andSvindicsValueIn(List<BigDecimal> values) {
            addCriterion("SVINDICS_VALUE in", values, "svindicsValue");
            return (Criteria) this;
        }

        public Criteria andSvindicsValueNotIn(List<BigDecimal> values) {
            addCriterion("SVINDICS_VALUE not in", values, "svindicsValue");
            return (Criteria) this;
        }

        public Criteria andSvindicsValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SVINDICS_VALUE between", value1, value2, "svindicsValue");
            return (Criteria) this;
        }

        public Criteria andSvindicsValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SVINDICS_VALUE not between", value1, value2, "svindicsValue");
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