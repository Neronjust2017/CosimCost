package com.njust.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ZxFProdExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ZxFProdExample() {
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

        public Criteria andFProdIdIsNull() {
            addCriterion("F_PROD_ID is null");
            return (Criteria) this;
        }

        public Criteria andFProdIdIsNotNull() {
            addCriterion("F_PROD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFProdIdEqualTo(BigDecimal value) {
            addCriterion("F_PROD_ID =", value, "fProdId");
            return (Criteria) this;
        }

        public Criteria andFProdIdNotEqualTo(BigDecimal value) {
            addCriterion("F_PROD_ID <>", value, "fProdId");
            return (Criteria) this;
        }

        public Criteria andFProdIdGreaterThan(BigDecimal value) {
            addCriterion("F_PROD_ID >", value, "fProdId");
            return (Criteria) this;
        }

        public Criteria andFProdIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("F_PROD_ID >=", value, "fProdId");
            return (Criteria) this;
        }

        public Criteria andFProdIdLessThan(BigDecimal value) {
            addCriterion("F_PROD_ID <", value, "fProdId");
            return (Criteria) this;
        }

        public Criteria andFProdIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("F_PROD_ID <=", value, "fProdId");
            return (Criteria) this;
        }

        public Criteria andFProdIdIn(List<BigDecimal> values) {
            addCriterion("F_PROD_ID in", values, "fProdId");
            return (Criteria) this;
        }

        public Criteria andFProdIdNotIn(List<BigDecimal> values) {
            addCriterion("F_PROD_ID not in", values, "fProdId");
            return (Criteria) this;
        }

        public Criteria andFProdIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("F_PROD_ID between", value1, value2, "fProdId");
            return (Criteria) this;
        }

        public Criteria andFProdIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("F_PROD_ID not between", value1, value2, "fProdId");
            return (Criteria) this;
        }

        public Criteria andProdIdIsNull() {
            addCriterion("PROD_ID is null");
            return (Criteria) this;
        }

        public Criteria andProdIdIsNotNull() {
            addCriterion("PROD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProdIdEqualTo(BigDecimal value) {
            addCriterion("PROD_ID =", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdNotEqualTo(BigDecimal value) {
            addCriterion("PROD_ID <>", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdGreaterThan(BigDecimal value) {
            addCriterion("PROD_ID >", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PROD_ID >=", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdLessThan(BigDecimal value) {
            addCriterion("PROD_ID <", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PROD_ID <=", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdIn(List<BigDecimal> values) {
            addCriterion("PROD_ID in", values, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdNotIn(List<BigDecimal> values) {
            addCriterion("PROD_ID not in", values, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROD_ID between", value1, value2, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROD_ID not between", value1, value2, "prodId");
            return (Criteria) this;
        }

        public Criteria andStaIdIsNull() {
            addCriterion("STA_ID is null");
            return (Criteria) this;
        }

        public Criteria andStaIdIsNotNull() {
            addCriterion("STA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStaIdEqualTo(BigDecimal value) {
            addCriterion("STA_ID =", value, "staId");
            return (Criteria) this;
        }

        public Criteria andStaIdNotEqualTo(BigDecimal value) {
            addCriterion("STA_ID <>", value, "staId");
            return (Criteria) this;
        }

        public Criteria andStaIdGreaterThan(BigDecimal value) {
            addCriterion("STA_ID >", value, "staId");
            return (Criteria) this;
        }

        public Criteria andStaIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("STA_ID >=", value, "staId");
            return (Criteria) this;
        }

        public Criteria andStaIdLessThan(BigDecimal value) {
            addCriterion("STA_ID <", value, "staId");
            return (Criteria) this;
        }

        public Criteria andStaIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("STA_ID <=", value, "staId");
            return (Criteria) this;
        }

        public Criteria andStaIdIn(List<BigDecimal> values) {
            addCriterion("STA_ID in", values, "staId");
            return (Criteria) this;
        }

        public Criteria andStaIdNotIn(List<BigDecimal> values) {
            addCriterion("STA_ID not in", values, "staId");
            return (Criteria) this;
        }

        public Criteria andStaIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STA_ID between", value1, value2, "staId");
            return (Criteria) this;
        }

        public Criteria andStaIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STA_ID not between", value1, value2, "staId");
            return (Criteria) this;
        }

        public Criteria andProdNumberIsNull() {
            addCriterion("PROD_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andProdNumberIsNotNull() {
            addCriterion("PROD_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andProdNumberEqualTo(BigDecimal value) {
            addCriterion("PROD_NUMBER =", value, "prodNumber");
            return (Criteria) this;
        }

        public Criteria andProdNumberNotEqualTo(BigDecimal value) {
            addCriterion("PROD_NUMBER <>", value, "prodNumber");
            return (Criteria) this;
        }

        public Criteria andProdNumberGreaterThan(BigDecimal value) {
            addCriterion("PROD_NUMBER >", value, "prodNumber");
            return (Criteria) this;
        }

        public Criteria andProdNumberGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PROD_NUMBER >=", value, "prodNumber");
            return (Criteria) this;
        }

        public Criteria andProdNumberLessThan(BigDecimal value) {
            addCriterion("PROD_NUMBER <", value, "prodNumber");
            return (Criteria) this;
        }

        public Criteria andProdNumberLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PROD_NUMBER <=", value, "prodNumber");
            return (Criteria) this;
        }

        public Criteria andProdNumberIn(List<BigDecimal> values) {
            addCriterion("PROD_NUMBER in", values, "prodNumber");
            return (Criteria) this;
        }

        public Criteria andProdNumberNotIn(List<BigDecimal> values) {
            addCriterion("PROD_NUMBER not in", values, "prodNumber");
            return (Criteria) this;
        }

        public Criteria andProdNumberBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROD_NUMBER between", value1, value2, "prodNumber");
            return (Criteria) this;
        }

        public Criteria andProdNumberNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROD_NUMBER not between", value1, value2, "prodNumber");
            return (Criteria) this;
        }

        public Criteria andVsIdIsNull() {
            addCriterion("VS_ID is null");
            return (Criteria) this;
        }

        public Criteria andVsIdIsNotNull() {
            addCriterion("VS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVsIdEqualTo(BigDecimal value) {
            addCriterion("VS_ID =", value, "vsId");
            return (Criteria) this;
        }

        public Criteria andVsIdNotEqualTo(BigDecimal value) {
            addCriterion("VS_ID <>", value, "vsId");
            return (Criteria) this;
        }

        public Criteria andVsIdGreaterThan(BigDecimal value) {
            addCriterion("VS_ID >", value, "vsId");
            return (Criteria) this;
        }

        public Criteria andVsIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VS_ID >=", value, "vsId");
            return (Criteria) this;
        }

        public Criteria andVsIdLessThan(BigDecimal value) {
            addCriterion("VS_ID <", value, "vsId");
            return (Criteria) this;
        }

        public Criteria andVsIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VS_ID <=", value, "vsId");
            return (Criteria) this;
        }

        public Criteria andVsIdIn(List<BigDecimal> values) {
            addCriterion("VS_ID in", values, "vsId");
            return (Criteria) this;
        }

        public Criteria andVsIdNotIn(List<BigDecimal> values) {
            addCriterion("VS_ID not in", values, "vsId");
            return (Criteria) this;
        }

        public Criteria andVsIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VS_ID between", value1, value2, "vsId");
            return (Criteria) this;
        }

        public Criteria andVsIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VS_ID not between", value1, value2, "vsId");
            return (Criteria) this;
        }

        public Criteria andWorkingHourIsNull() {
            addCriterion("WORKING_HOUR is null");
            return (Criteria) this;
        }

        public Criteria andWorkingHourIsNotNull() {
            addCriterion("WORKING_HOUR is not null");
            return (Criteria) this;
        }

        public Criteria andWorkingHourEqualTo(Long value) {
            addCriterion("WORKING_HOUR =", value, "workingHour");
            return (Criteria) this;
        }

        public Criteria andWorkingHourNotEqualTo(Long value) {
            addCriterion("WORKING_HOUR <>", value, "workingHour");
            return (Criteria) this;
        }

        public Criteria andWorkingHourGreaterThan(Long value) {
            addCriterion("WORKING_HOUR >", value, "workingHour");
            return (Criteria) this;
        }

        public Criteria andWorkingHourGreaterThanOrEqualTo(Long value) {
            addCriterion("WORKING_HOUR >=", value, "workingHour");
            return (Criteria) this;
        }

        public Criteria andWorkingHourLessThan(Long value) {
            addCriterion("WORKING_HOUR <", value, "workingHour");
            return (Criteria) this;
        }

        public Criteria andWorkingHourLessThanOrEqualTo(Long value) {
            addCriterion("WORKING_HOUR <=", value, "workingHour");
            return (Criteria) this;
        }

        public Criteria andWorkingHourIn(List<Long> values) {
            addCriterion("WORKING_HOUR in", values, "workingHour");
            return (Criteria) this;
        }

        public Criteria andWorkingHourNotIn(List<Long> values) {
            addCriterion("WORKING_HOUR not in", values, "workingHour");
            return (Criteria) this;
        }

        public Criteria andWorkingHourBetween(Long value1, Long value2) {
            addCriterion("WORKING_HOUR between", value1, value2, "workingHour");
            return (Criteria) this;
        }

        public Criteria andWorkingHourNotBetween(Long value1, Long value2) {
            addCriterion("WORKING_HOUR not between", value1, value2, "workingHour");
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