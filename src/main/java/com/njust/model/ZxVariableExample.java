package com.njust.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ZxVariableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ZxVariableExample() {
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

        public Criteria andNoIsNull() {
            addCriterion("NO is null");
            return (Criteria) this;
        }

        public Criteria andNoIsNotNull() {
            addCriterion("NO is not null");
            return (Criteria) this;
        }

        public Criteria andNoEqualTo(BigDecimal value) {
            addCriterion("NO =", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotEqualTo(BigDecimal value) {
            addCriterion("NO <>", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThan(BigDecimal value) {
            addCriterion("NO >", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NO >=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThan(BigDecimal value) {
            addCriterion("NO <", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NO <=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoIn(List<BigDecimal> values) {
            addCriterion("NO in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotIn(List<BigDecimal> values) {
            addCriterion("NO not in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NO between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NO not between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andStaPicIsNull() {
            addCriterion("STA_PIC is null");
            return (Criteria) this;
        }

        public Criteria andStaPicIsNotNull() {
            addCriterion("STA_PIC is not null");
            return (Criteria) this;
        }

        public Criteria andStaPicEqualTo(BigDecimal value) {
            addCriterion("STA_PIC =", value, "staPic");
            return (Criteria) this;
        }

        public Criteria andStaPicNotEqualTo(BigDecimal value) {
            addCriterion("STA_PIC <>", value, "staPic");
            return (Criteria) this;
        }

        public Criteria andStaPicGreaterThan(BigDecimal value) {
            addCriterion("STA_PIC >", value, "staPic");
            return (Criteria) this;
        }

        public Criteria andStaPicGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("STA_PIC >=", value, "staPic");
            return (Criteria) this;
        }

        public Criteria andStaPicLessThan(BigDecimal value) {
            addCriterion("STA_PIC <", value, "staPic");
            return (Criteria) this;
        }

        public Criteria andStaPicLessThanOrEqualTo(BigDecimal value) {
            addCriterion("STA_PIC <=", value, "staPic");
            return (Criteria) this;
        }

        public Criteria andStaPicIn(List<BigDecimal> values) {
            addCriterion("STA_PIC in", values, "staPic");
            return (Criteria) this;
        }

        public Criteria andStaPicNotIn(List<BigDecimal> values) {
            addCriterion("STA_PIC not in", values, "staPic");
            return (Criteria) this;
        }

        public Criteria andStaPicBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STA_PIC between", value1, value2, "staPic");
            return (Criteria) this;
        }

        public Criteria andStaPicNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STA_PIC not between", value1, value2, "staPic");
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