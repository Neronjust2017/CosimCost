package com.njust.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ZxFItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ZxFItemExample() {
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

        public Criteria andFItemIdIsNull() {
            addCriterion("F_ITEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andFItemIdIsNotNull() {
            addCriterion("F_ITEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFItemIdEqualTo(BigDecimal value) {
            addCriterion("F_ITEM_ID =", value, "fItemId");
            return (Criteria) this;
        }

        public Criteria andFItemIdNotEqualTo(BigDecimal value) {
            addCriterion("F_ITEM_ID <>", value, "fItemId");
            return (Criteria) this;
        }

        public Criteria andFItemIdGreaterThan(BigDecimal value) {
            addCriterion("F_ITEM_ID >", value, "fItemId");
            return (Criteria) this;
        }

        public Criteria andFItemIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("F_ITEM_ID >=", value, "fItemId");
            return (Criteria) this;
        }

        public Criteria andFItemIdLessThan(BigDecimal value) {
            addCriterion("F_ITEM_ID <", value, "fItemId");
            return (Criteria) this;
        }

        public Criteria andFItemIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("F_ITEM_ID <=", value, "fItemId");
            return (Criteria) this;
        }

        public Criteria andFItemIdIn(List<BigDecimal> values) {
            addCriterion("F_ITEM_ID in", values, "fItemId");
            return (Criteria) this;
        }

        public Criteria andFItemIdNotIn(List<BigDecimal> values) {
            addCriterion("F_ITEM_ID not in", values, "fItemId");
            return (Criteria) this;
        }

        public Criteria andFItemIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("F_ITEM_ID between", value1, value2, "fItemId");
            return (Criteria) this;
        }

        public Criteria andFItemIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("F_ITEM_ID not between", value1, value2, "fItemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNull() {
            addCriterion("ITEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("ITEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(BigDecimal value) {
            addCriterion("ITEM_ID =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(BigDecimal value) {
            addCriterion("ITEM_ID <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(BigDecimal value) {
            addCriterion("ITEM_ID >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ITEM_ID >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(BigDecimal value) {
            addCriterion("ITEM_ID <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ITEM_ID <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<BigDecimal> values) {
            addCriterion("ITEM_ID in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<BigDecimal> values) {
            addCriterion("ITEM_ID not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ITEM_ID between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ITEM_ID not between", value1, value2, "itemId");
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

        public Criteria andItemNumberIsNull() {
            addCriterion("ITEM_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andItemNumberIsNotNull() {
            addCriterion("ITEM_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andItemNumberEqualTo(BigDecimal value) {
            addCriterion("ITEM_NUMBER =", value, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andItemNumberNotEqualTo(BigDecimal value) {
            addCriterion("ITEM_NUMBER <>", value, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andItemNumberGreaterThan(BigDecimal value) {
            addCriterion("ITEM_NUMBER >", value, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andItemNumberGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ITEM_NUMBER >=", value, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andItemNumberLessThan(BigDecimal value) {
            addCriterion("ITEM_NUMBER <", value, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andItemNumberLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ITEM_NUMBER <=", value, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andItemNumberIn(List<BigDecimal> values) {
            addCriterion("ITEM_NUMBER in", values, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andItemNumberNotIn(List<BigDecimal> values) {
            addCriterion("ITEM_NUMBER not in", values, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andItemNumberBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ITEM_NUMBER between", value1, value2, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andItemNumberNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ITEM_NUMBER not between", value1, value2, "itemNumber");
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