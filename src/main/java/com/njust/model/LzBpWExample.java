package com.njust.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LzBpWExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public LzBpWExample() {
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

        public Criteria andWWeightLayerindexIsNull() {
            addCriterion("W_WEIGHT_LAYERINDEX is null");
            return (Criteria) this;
        }

        public Criteria andWWeightLayerindexIsNotNull() {
            addCriterion("W_WEIGHT_LAYERINDEX is not null");
            return (Criteria) this;
        }

        public Criteria andWWeightLayerindexEqualTo(BigDecimal value) {
            addCriterion("W_WEIGHT_LAYERINDEX =", value, "wWeightLayerindex");
            return (Criteria) this;
        }

        public Criteria andWWeightLayerindexNotEqualTo(BigDecimal value) {
            addCriterion("W_WEIGHT_LAYERINDEX <>", value, "wWeightLayerindex");
            return (Criteria) this;
        }

        public Criteria andWWeightLayerindexGreaterThan(BigDecimal value) {
            addCriterion("W_WEIGHT_LAYERINDEX >", value, "wWeightLayerindex");
            return (Criteria) this;
        }

        public Criteria andWWeightLayerindexGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("W_WEIGHT_LAYERINDEX >=", value, "wWeightLayerindex");
            return (Criteria) this;
        }

        public Criteria andWWeightLayerindexLessThan(BigDecimal value) {
            addCriterion("W_WEIGHT_LAYERINDEX <", value, "wWeightLayerindex");
            return (Criteria) this;
        }

        public Criteria andWWeightLayerindexLessThanOrEqualTo(BigDecimal value) {
            addCriterion("W_WEIGHT_LAYERINDEX <=", value, "wWeightLayerindex");
            return (Criteria) this;
        }

        public Criteria andWWeightLayerindexIn(List<BigDecimal> values) {
            addCriterion("W_WEIGHT_LAYERINDEX in", values, "wWeightLayerindex");
            return (Criteria) this;
        }

        public Criteria andWWeightLayerindexNotIn(List<BigDecimal> values) {
            addCriterion("W_WEIGHT_LAYERINDEX not in", values, "wWeightLayerindex");
            return (Criteria) this;
        }

        public Criteria andWWeightLayerindexBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("W_WEIGHT_LAYERINDEX between", value1, value2, "wWeightLayerindex");
            return (Criteria) this;
        }

        public Criteria andWWeightLayerindexNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("W_WEIGHT_LAYERINDEX not between", value1, value2, "wWeightLayerindex");
            return (Criteria) this;
        }

        public Criteria andWFormPreindexIsNull() {
            addCriterion("W_FORM_PREINDEX is null");
            return (Criteria) this;
        }

        public Criteria andWFormPreindexIsNotNull() {
            addCriterion("W_FORM_PREINDEX is not null");
            return (Criteria) this;
        }

        public Criteria andWFormPreindexEqualTo(BigDecimal value) {
            addCriterion("W_FORM_PREINDEX =", value, "wFormPreindex");
            return (Criteria) this;
        }

        public Criteria andWFormPreindexNotEqualTo(BigDecimal value) {
            addCriterion("W_FORM_PREINDEX <>", value, "wFormPreindex");
            return (Criteria) this;
        }

        public Criteria andWFormPreindexGreaterThan(BigDecimal value) {
            addCriterion("W_FORM_PREINDEX >", value, "wFormPreindex");
            return (Criteria) this;
        }

        public Criteria andWFormPreindexGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("W_FORM_PREINDEX >=", value, "wFormPreindex");
            return (Criteria) this;
        }

        public Criteria andWFormPreindexLessThan(BigDecimal value) {
            addCriterion("W_FORM_PREINDEX <", value, "wFormPreindex");
            return (Criteria) this;
        }

        public Criteria andWFormPreindexLessThanOrEqualTo(BigDecimal value) {
            addCriterion("W_FORM_PREINDEX <=", value, "wFormPreindex");
            return (Criteria) this;
        }

        public Criteria andWFormPreindexIn(List<BigDecimal> values) {
            addCriterion("W_FORM_PREINDEX in", values, "wFormPreindex");
            return (Criteria) this;
        }

        public Criteria andWFormPreindexNotIn(List<BigDecimal> values) {
            addCriterion("W_FORM_PREINDEX not in", values, "wFormPreindex");
            return (Criteria) this;
        }

        public Criteria andWFormPreindexBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("W_FORM_PREINDEX between", value1, value2, "wFormPreindex");
            return (Criteria) this;
        }

        public Criteria andWFormPreindexNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("W_FORM_PREINDEX not between", value1, value2, "wFormPreindex");
            return (Criteria) this;
        }

        public Criteria andWFormNxtindexIsNull() {
            addCriterion("W_FORM_NXTINDEX is null");
            return (Criteria) this;
        }

        public Criteria andWFormNxtindexIsNotNull() {
            addCriterion("W_FORM_NXTINDEX is not null");
            return (Criteria) this;
        }

        public Criteria andWFormNxtindexEqualTo(BigDecimal value) {
            addCriterion("W_FORM_NXTINDEX =", value, "wFormNxtindex");
            return (Criteria) this;
        }

        public Criteria andWFormNxtindexNotEqualTo(BigDecimal value) {
            addCriterion("W_FORM_NXTINDEX <>", value, "wFormNxtindex");
            return (Criteria) this;
        }

        public Criteria andWFormNxtindexGreaterThan(BigDecimal value) {
            addCriterion("W_FORM_NXTINDEX >", value, "wFormNxtindex");
            return (Criteria) this;
        }

        public Criteria andWFormNxtindexGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("W_FORM_NXTINDEX >=", value, "wFormNxtindex");
            return (Criteria) this;
        }

        public Criteria andWFormNxtindexLessThan(BigDecimal value) {
            addCriterion("W_FORM_NXTINDEX <", value, "wFormNxtindex");
            return (Criteria) this;
        }

        public Criteria andWFormNxtindexLessThanOrEqualTo(BigDecimal value) {
            addCriterion("W_FORM_NXTINDEX <=", value, "wFormNxtindex");
            return (Criteria) this;
        }

        public Criteria andWFormNxtindexIn(List<BigDecimal> values) {
            addCriterion("W_FORM_NXTINDEX in", values, "wFormNxtindex");
            return (Criteria) this;
        }

        public Criteria andWFormNxtindexNotIn(List<BigDecimal> values) {
            addCriterion("W_FORM_NXTINDEX not in", values, "wFormNxtindex");
            return (Criteria) this;
        }

        public Criteria andWFormNxtindexBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("W_FORM_NXTINDEX between", value1, value2, "wFormNxtindex");
            return (Criteria) this;
        }

        public Criteria andWFormNxtindexNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("W_FORM_NXTINDEX not between", value1, value2, "wFormNxtindex");
            return (Criteria) this;
        }

        public Criteria andWValueIsNull() {
            addCriterion("W_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andWValueIsNotNull() {
            addCriterion("W_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andWValueEqualTo(BigDecimal value) {
            addCriterion("W_VALUE =", value, "wValue");
            return (Criteria) this;
        }

        public Criteria andWValueNotEqualTo(BigDecimal value) {
            addCriterion("W_VALUE <>", value, "wValue");
            return (Criteria) this;
        }

        public Criteria andWValueGreaterThan(BigDecimal value) {
            addCriterion("W_VALUE >", value, "wValue");
            return (Criteria) this;
        }

        public Criteria andWValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("W_VALUE >=", value, "wValue");
            return (Criteria) this;
        }

        public Criteria andWValueLessThan(BigDecimal value) {
            addCriterion("W_VALUE <", value, "wValue");
            return (Criteria) this;
        }

        public Criteria andWValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("W_VALUE <=", value, "wValue");
            return (Criteria) this;
        }

        public Criteria andWValueIn(List<BigDecimal> values) {
            addCriterion("W_VALUE in", values, "wValue");
            return (Criteria) this;
        }

        public Criteria andWValueNotIn(List<BigDecimal> values) {
            addCriterion("W_VALUE not in", values, "wValue");
            return (Criteria) this;
        }

        public Criteria andWValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("W_VALUE between", value1, value2, "wValue");
            return (Criteria) this;
        }

        public Criteria andWValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("W_VALUE not between", value1, value2, "wValue");
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