package com.njust.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LzBpFormarrayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public LzBpFormarrayExample() {
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

        public Criteria andFormarrayLayeroutindexIsNull() {
            addCriterion("FORMARRAY_LAYEROUTINDEX is null");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayeroutindexIsNotNull() {
            addCriterion("FORMARRAY_LAYEROUTINDEX is not null");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayeroutindexEqualTo(BigDecimal value) {
            addCriterion("FORMARRAY_LAYEROUTINDEX =", value, "formarrayLayeroutindex");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayeroutindexNotEqualTo(BigDecimal value) {
            addCriterion("FORMARRAY_LAYEROUTINDEX <>", value, "formarrayLayeroutindex");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayeroutindexGreaterThan(BigDecimal value) {
            addCriterion("FORMARRAY_LAYEROUTINDEX >", value, "formarrayLayeroutindex");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayeroutindexGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FORMARRAY_LAYEROUTINDEX >=", value, "formarrayLayeroutindex");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayeroutindexLessThan(BigDecimal value) {
            addCriterion("FORMARRAY_LAYEROUTINDEX <", value, "formarrayLayeroutindex");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayeroutindexLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FORMARRAY_LAYEROUTINDEX <=", value, "formarrayLayeroutindex");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayeroutindexIn(List<BigDecimal> values) {
            addCriterion("FORMARRAY_LAYEROUTINDEX in", values, "formarrayLayeroutindex");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayeroutindexNotIn(List<BigDecimal> values) {
            addCriterion("FORMARRAY_LAYEROUTINDEX not in", values, "formarrayLayeroutindex");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayeroutindexBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORMARRAY_LAYEROUTINDEX between", value1, value2, "formarrayLayeroutindex");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayeroutindexNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORMARRAY_LAYEROUTINDEX not between", value1, value2, "formarrayLayeroutindex");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayernodeindexIsNull() {
            addCriterion("FORMARRAY_LAYERNODEINDEX is null");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayernodeindexIsNotNull() {
            addCriterion("FORMARRAY_LAYERNODEINDEX is not null");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayernodeindexEqualTo(BigDecimal value) {
            addCriterion("FORMARRAY_LAYERNODEINDEX =", value, "formarrayLayernodeindex");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayernodeindexNotEqualTo(BigDecimal value) {
            addCriterion("FORMARRAY_LAYERNODEINDEX <>", value, "formarrayLayernodeindex");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayernodeindexGreaterThan(BigDecimal value) {
            addCriterion("FORMARRAY_LAYERNODEINDEX >", value, "formarrayLayernodeindex");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayernodeindexGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FORMARRAY_LAYERNODEINDEX >=", value, "formarrayLayernodeindex");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayernodeindexLessThan(BigDecimal value) {
            addCriterion("FORMARRAY_LAYERNODEINDEX <", value, "formarrayLayernodeindex");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayernodeindexLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FORMARRAY_LAYERNODEINDEX <=", value, "formarrayLayernodeindex");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayernodeindexIn(List<BigDecimal> values) {
            addCriterion("FORMARRAY_LAYERNODEINDEX in", values, "formarrayLayernodeindex");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayernodeindexNotIn(List<BigDecimal> values) {
            addCriterion("FORMARRAY_LAYERNODEINDEX not in", values, "formarrayLayernodeindex");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayernodeindexBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORMARRAY_LAYERNODEINDEX between", value1, value2, "formarrayLayernodeindex");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayernodeindexNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORMARRAY_LAYERNODEINDEX not between", value1, value2, "formarrayLayernodeindex");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayernodevalueIsNull() {
            addCriterion("FORMARRAY_LAYERNODEVALUE is null");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayernodevalueIsNotNull() {
            addCriterion("FORMARRAY_LAYERNODEVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayernodevalueEqualTo(BigDecimal value) {
            addCriterion("FORMARRAY_LAYERNODEVALUE =", value, "formarrayLayernodevalue");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayernodevalueNotEqualTo(BigDecimal value) {
            addCriterion("FORMARRAY_LAYERNODEVALUE <>", value, "formarrayLayernodevalue");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayernodevalueGreaterThan(BigDecimal value) {
            addCriterion("FORMARRAY_LAYERNODEVALUE >", value, "formarrayLayernodevalue");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayernodevalueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FORMARRAY_LAYERNODEVALUE >=", value, "formarrayLayernodevalue");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayernodevalueLessThan(BigDecimal value) {
            addCriterion("FORMARRAY_LAYERNODEVALUE <", value, "formarrayLayernodevalue");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayernodevalueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FORMARRAY_LAYERNODEVALUE <=", value, "formarrayLayernodevalue");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayernodevalueIn(List<BigDecimal> values) {
            addCriterion("FORMARRAY_LAYERNODEVALUE in", values, "formarrayLayernodevalue");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayernodevalueNotIn(List<BigDecimal> values) {
            addCriterion("FORMARRAY_LAYERNODEVALUE not in", values, "formarrayLayernodevalue");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayernodevalueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORMARRAY_LAYERNODEVALUE between", value1, value2, "formarrayLayernodevalue");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayernodevalueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORMARRAY_LAYERNODEVALUE not between", value1, value2, "formarrayLayernodevalue");
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