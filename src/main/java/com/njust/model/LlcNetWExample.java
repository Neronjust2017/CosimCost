package com.njust.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LlcNetWExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public LlcNetWExample() {
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

        public Criteria andWWeightlayerindexIsNull() {
            addCriterion("W_WeightLayerIndex is null");
            return (Criteria) this;
        }

        public Criteria andWWeightlayerindexIsNotNull() {
            addCriterion("W_WeightLayerIndex is not null");
            return (Criteria) this;
        }

        public Criteria andWWeightlayerindexEqualTo(BigDecimal value) {
            addCriterion("W_WeightLayerIndex =", value, "wWeightlayerindex");
            return (Criteria) this;
        }

        public Criteria andWWeightlayerindexNotEqualTo(BigDecimal value) {
            addCriterion("W_WeightLayerIndex <>", value, "wWeightlayerindex");
            return (Criteria) this;
        }

        public Criteria andWWeightlayerindexGreaterThan(BigDecimal value) {
            addCriterion("W_WeightLayerIndex >", value, "wWeightlayerindex");
            return (Criteria) this;
        }

        public Criteria andWWeightlayerindexGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("W_WeightLayerIndex >=", value, "wWeightlayerindex");
            return (Criteria) this;
        }

        public Criteria andWWeightlayerindexLessThan(BigDecimal value) {
            addCriterion("W_WeightLayerIndex <", value, "wWeightlayerindex");
            return (Criteria) this;
        }

        public Criteria andWWeightlayerindexLessThanOrEqualTo(BigDecimal value) {
            addCriterion("W_WeightLayerIndex <=", value, "wWeightlayerindex");
            return (Criteria) this;
        }

        public Criteria andWWeightlayerindexIn(List<BigDecimal> values) {
            addCriterion("W_WeightLayerIndex in", values, "wWeightlayerindex");
            return (Criteria) this;
        }

        public Criteria andWWeightlayerindexNotIn(List<BigDecimal> values) {
            addCriterion("W_WeightLayerIndex not in", values, "wWeightlayerindex");
            return (Criteria) this;
        }

        public Criteria andWWeightlayerindexBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("W_WeightLayerIndex between", value1, value2, "wWeightlayerindex");
            return (Criteria) this;
        }

        public Criteria andWWeightlayerindexNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("W_WeightLayerIndex not between", value1, value2, "wWeightlayerindex");
            return (Criteria) this;
        }

        public Criteria andWFormpreindexIsNull() {
            addCriterion("W_FormPreIndex is null");
            return (Criteria) this;
        }

        public Criteria andWFormpreindexIsNotNull() {
            addCriterion("W_FormPreIndex is not null");
            return (Criteria) this;
        }

        public Criteria andWFormpreindexEqualTo(BigDecimal value) {
            addCriterion("W_FormPreIndex =", value, "wFormpreindex");
            return (Criteria) this;
        }

        public Criteria andWFormpreindexNotEqualTo(BigDecimal value) {
            addCriterion("W_FormPreIndex <>", value, "wFormpreindex");
            return (Criteria) this;
        }

        public Criteria andWFormpreindexGreaterThan(BigDecimal value) {
            addCriterion("W_FormPreIndex >", value, "wFormpreindex");
            return (Criteria) this;
        }

        public Criteria andWFormpreindexGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("W_FormPreIndex >=", value, "wFormpreindex");
            return (Criteria) this;
        }

        public Criteria andWFormpreindexLessThan(BigDecimal value) {
            addCriterion("W_FormPreIndex <", value, "wFormpreindex");
            return (Criteria) this;
        }

        public Criteria andWFormpreindexLessThanOrEqualTo(BigDecimal value) {
            addCriterion("W_FormPreIndex <=", value, "wFormpreindex");
            return (Criteria) this;
        }

        public Criteria andWFormpreindexIn(List<BigDecimal> values) {
            addCriterion("W_FormPreIndex in", values, "wFormpreindex");
            return (Criteria) this;
        }

        public Criteria andWFormpreindexNotIn(List<BigDecimal> values) {
            addCriterion("W_FormPreIndex not in", values, "wFormpreindex");
            return (Criteria) this;
        }

        public Criteria andWFormpreindexBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("W_FormPreIndex between", value1, value2, "wFormpreindex");
            return (Criteria) this;
        }

        public Criteria andWFormpreindexNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("W_FormPreIndex not between", value1, value2, "wFormpreindex");
            return (Criteria) this;
        }

        public Criteria andWFormnxtindexIsNull() {
            addCriterion("W_FormNxtIndex is null");
            return (Criteria) this;
        }

        public Criteria andWFormnxtindexIsNotNull() {
            addCriterion("W_FormNxtIndex is not null");
            return (Criteria) this;
        }

        public Criteria andWFormnxtindexEqualTo(BigDecimal value) {
            addCriterion("W_FormNxtIndex =", value, "wFormnxtindex");
            return (Criteria) this;
        }

        public Criteria andWFormnxtindexNotEqualTo(BigDecimal value) {
            addCriterion("W_FormNxtIndex <>", value, "wFormnxtindex");
            return (Criteria) this;
        }

        public Criteria andWFormnxtindexGreaterThan(BigDecimal value) {
            addCriterion("W_FormNxtIndex >", value, "wFormnxtindex");
            return (Criteria) this;
        }

        public Criteria andWFormnxtindexGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("W_FormNxtIndex >=", value, "wFormnxtindex");
            return (Criteria) this;
        }

        public Criteria andWFormnxtindexLessThan(BigDecimal value) {
            addCriterion("W_FormNxtIndex <", value, "wFormnxtindex");
            return (Criteria) this;
        }

        public Criteria andWFormnxtindexLessThanOrEqualTo(BigDecimal value) {
            addCriterion("W_FormNxtIndex <=", value, "wFormnxtindex");
            return (Criteria) this;
        }

        public Criteria andWFormnxtindexIn(List<BigDecimal> values) {
            addCriterion("W_FormNxtIndex in", values, "wFormnxtindex");
            return (Criteria) this;
        }

        public Criteria andWFormnxtindexNotIn(List<BigDecimal> values) {
            addCriterion("W_FormNxtIndex not in", values, "wFormnxtindex");
            return (Criteria) this;
        }

        public Criteria andWFormnxtindexBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("W_FormNxtIndex between", value1, value2, "wFormnxtindex");
            return (Criteria) this;
        }

        public Criteria andWFormnxtindexNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("W_FormNxtIndex not between", value1, value2, "wFormnxtindex");
            return (Criteria) this;
        }

        public Criteria andWValueIsNull() {
            addCriterion("W_Value is null");
            return (Criteria) this;
        }

        public Criteria andWValueIsNotNull() {
            addCriterion("W_Value is not null");
            return (Criteria) this;
        }

        public Criteria andWValueEqualTo(BigDecimal value) {
            addCriterion("W_Value =", value, "wValue");
            return (Criteria) this;
        }

        public Criteria andWValueNotEqualTo(BigDecimal value) {
            addCriterion("W_Value <>", value, "wValue");
            return (Criteria) this;
        }

        public Criteria andWValueGreaterThan(BigDecimal value) {
            addCriterion("W_Value >", value, "wValue");
            return (Criteria) this;
        }

        public Criteria andWValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("W_Value >=", value, "wValue");
            return (Criteria) this;
        }

        public Criteria andWValueLessThan(BigDecimal value) {
            addCriterion("W_Value <", value, "wValue");
            return (Criteria) this;
        }

        public Criteria andWValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("W_Value <=", value, "wValue");
            return (Criteria) this;
        }

        public Criteria andWValueIn(List<BigDecimal> values) {
            addCriterion("W_Value in", values, "wValue");
            return (Criteria) this;
        }

        public Criteria andWValueNotIn(List<BigDecimal> values) {
            addCriterion("W_Value not in", values, "wValue");
            return (Criteria) this;
        }

        public Criteria andWValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("W_Value between", value1, value2, "wValue");
            return (Criteria) this;
        }

        public Criteria andWValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("W_Value not between", value1, value2, "wValue");
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