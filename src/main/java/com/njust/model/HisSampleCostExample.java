package com.njust.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class HisSampleCostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public HisSampleCostExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(BigDecimal value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(BigDecimal value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(BigDecimal value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(BigDecimal value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<BigDecimal> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<BigDecimal> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSetIdIsNull() {
            addCriterion("SET_ID is null");
            return (Criteria) this;
        }

        public Criteria andSetIdIsNotNull() {
            addCriterion("SET_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSetIdEqualTo(BigDecimal value) {
            addCriterion("SET_ID =", value, "setId");
            return (Criteria) this;
        }

        public Criteria andSetIdNotEqualTo(BigDecimal value) {
            addCriterion("SET_ID <>", value, "setId");
            return (Criteria) this;
        }

        public Criteria andSetIdGreaterThan(BigDecimal value) {
            addCriterion("SET_ID >", value, "setId");
            return (Criteria) this;
        }

        public Criteria andSetIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SET_ID >=", value, "setId");
            return (Criteria) this;
        }

        public Criteria andSetIdLessThan(BigDecimal value) {
            addCriterion("SET_ID <", value, "setId");
            return (Criteria) this;
        }

        public Criteria andSetIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SET_ID <=", value, "setId");
            return (Criteria) this;
        }

        public Criteria andSetIdIn(List<BigDecimal> values) {
            addCriterion("SET_ID in", values, "setId");
            return (Criteria) this;
        }

        public Criteria andSetIdNotIn(List<BigDecimal> values) {
            addCriterion("SET_ID not in", values, "setId");
            return (Criteria) this;
        }

        public Criteria andSetIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SET_ID between", value1, value2, "setId");
            return (Criteria) this;
        }

        public Criteria andSetIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SET_ID not between", value1, value2, "setId");
            return (Criteria) this;
        }

        public Criteria andSampleIdIsNull() {
            addCriterion("SAMPLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andSampleIdIsNotNull() {
            addCriterion("SAMPLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSampleIdEqualTo(BigDecimal value) {
            addCriterion("SAMPLE_ID =", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdNotEqualTo(BigDecimal value) {
            addCriterion("SAMPLE_ID <>", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdGreaterThan(BigDecimal value) {
            addCriterion("SAMPLE_ID >", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SAMPLE_ID >=", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdLessThan(BigDecimal value) {
            addCriterion("SAMPLE_ID <", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SAMPLE_ID <=", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdIn(List<BigDecimal> values) {
            addCriterion("SAMPLE_ID in", values, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdNotIn(List<BigDecimal> values) {
            addCriterion("SAMPLE_ID not in", values, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SAMPLE_ID between", value1, value2, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SAMPLE_ID not between", value1, value2, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleNameIsNull() {
            addCriterion("SAMPLE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSampleNameIsNotNull() {
            addCriterion("SAMPLE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSampleNameEqualTo(String value) {
            addCriterion("SAMPLE_NAME =", value, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameNotEqualTo(String value) {
            addCriterion("SAMPLE_NAME <>", value, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameGreaterThan(String value) {
            addCriterion("SAMPLE_NAME >", value, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameGreaterThanOrEqualTo(String value) {
            addCriterion("SAMPLE_NAME >=", value, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameLessThan(String value) {
            addCriterion("SAMPLE_NAME <", value, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameLessThanOrEqualTo(String value) {
            addCriterion("SAMPLE_NAME <=", value, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameLike(String value) {
            addCriterion("SAMPLE_NAME like", value, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameNotLike(String value) {
            addCriterion("SAMPLE_NAME not like", value, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameIn(List<String> values) {
            addCriterion("SAMPLE_NAME in", values, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameNotIn(List<String> values) {
            addCriterion("SAMPLE_NAME not in", values, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameBetween(String value1, String value2) {
            addCriterion("SAMPLE_NAME between", value1, value2, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameNotBetween(String value1, String value2) {
            addCriterion("SAMPLE_NAME not between", value1, value2, "sampleName");
            return (Criteria) this;
        }

        public Criteria andHisCostIsNull() {
            addCriterion("HIS_COST is null");
            return (Criteria) this;
        }

        public Criteria andHisCostIsNotNull() {
            addCriterion("HIS_COST is not null");
            return (Criteria) this;
        }

        public Criteria andHisCostEqualTo(BigDecimal value) {
            addCriterion("HIS_COST =", value, "hisCost");
            return (Criteria) this;
        }

        public Criteria andHisCostNotEqualTo(BigDecimal value) {
            addCriterion("HIS_COST <>", value, "hisCost");
            return (Criteria) this;
        }

        public Criteria andHisCostGreaterThan(BigDecimal value) {
            addCriterion("HIS_COST >", value, "hisCost");
            return (Criteria) this;
        }

        public Criteria andHisCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HIS_COST >=", value, "hisCost");
            return (Criteria) this;
        }

        public Criteria andHisCostLessThan(BigDecimal value) {
            addCriterion("HIS_COST <", value, "hisCost");
            return (Criteria) this;
        }

        public Criteria andHisCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HIS_COST <=", value, "hisCost");
            return (Criteria) this;
        }

        public Criteria andHisCostIn(List<BigDecimal> values) {
            addCriterion("HIS_COST in", values, "hisCost");
            return (Criteria) this;
        }

        public Criteria andHisCostNotIn(List<BigDecimal> values) {
            addCriterion("HIS_COST not in", values, "hisCost");
            return (Criteria) this;
        }

        public Criteria andHisCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HIS_COST between", value1, value2, "hisCost");
            return (Criteria) this;
        }

        public Criteria andHisCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HIS_COST not between", value1, value2, "hisCost");
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