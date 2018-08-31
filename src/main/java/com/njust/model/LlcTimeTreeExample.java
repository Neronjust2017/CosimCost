package com.njust.model;

import java.util.ArrayList;
import java.util.List;

public class LlcTimeTreeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public LlcTimeTreeExample() {
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

        public Criteria andTimeTreeIdIsNull() {
            addCriterion("TIME_TREE_ID is null");
            return (Criteria) this;
        }

        public Criteria andTimeTreeIdIsNotNull() {
            addCriterion("TIME_TREE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTimeTreeIdEqualTo(Integer value) {
            addCriterion("TIME_TREE_ID =", value, "timeTreeId");
            return (Criteria) this;
        }

        public Criteria andTimeTreeIdNotEqualTo(Integer value) {
            addCriterion("TIME_TREE_ID <>", value, "timeTreeId");
            return (Criteria) this;
        }

        public Criteria andTimeTreeIdGreaterThan(Integer value) {
            addCriterion("TIME_TREE_ID >", value, "timeTreeId");
            return (Criteria) this;
        }

        public Criteria andTimeTreeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TIME_TREE_ID >=", value, "timeTreeId");
            return (Criteria) this;
        }

        public Criteria andTimeTreeIdLessThan(Integer value) {
            addCriterion("TIME_TREE_ID <", value, "timeTreeId");
            return (Criteria) this;
        }

        public Criteria andTimeTreeIdLessThanOrEqualTo(Integer value) {
            addCriterion("TIME_TREE_ID <=", value, "timeTreeId");
            return (Criteria) this;
        }

        public Criteria andTimeTreeIdIn(List<Integer> values) {
            addCriterion("TIME_TREE_ID in", values, "timeTreeId");
            return (Criteria) this;
        }

        public Criteria andTimeTreeIdNotIn(List<Integer> values) {
            addCriterion("TIME_TREE_ID not in", values, "timeTreeId");
            return (Criteria) this;
        }

        public Criteria andTimeTreeIdBetween(Integer value1, Integer value2) {
            addCriterion("TIME_TREE_ID between", value1, value2, "timeTreeId");
            return (Criteria) this;
        }

        public Criteria andTimeTreeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TIME_TREE_ID not between", value1, value2, "timeTreeId");
            return (Criteria) this;
        }

        public Criteria andTimeTreeNameIsNull() {
            addCriterion("TIME_TREE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTimeTreeNameIsNotNull() {
            addCriterion("TIME_TREE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTimeTreeNameEqualTo(String value) {
            addCriterion("TIME_TREE_NAME =", value, "timeTreeName");
            return (Criteria) this;
        }

        public Criteria andTimeTreeNameNotEqualTo(String value) {
            addCriterion("TIME_TREE_NAME <>", value, "timeTreeName");
            return (Criteria) this;
        }

        public Criteria andTimeTreeNameGreaterThan(String value) {
            addCriterion("TIME_TREE_NAME >", value, "timeTreeName");
            return (Criteria) this;
        }

        public Criteria andTimeTreeNameGreaterThanOrEqualTo(String value) {
            addCriterion("TIME_TREE_NAME >=", value, "timeTreeName");
            return (Criteria) this;
        }

        public Criteria andTimeTreeNameLessThan(String value) {
            addCriterion("TIME_TREE_NAME <", value, "timeTreeName");
            return (Criteria) this;
        }

        public Criteria andTimeTreeNameLessThanOrEqualTo(String value) {
            addCriterion("TIME_TREE_NAME <=", value, "timeTreeName");
            return (Criteria) this;
        }

        public Criteria andTimeTreeNameLike(String value) {
            addCriterion("TIME_TREE_NAME like", value, "timeTreeName");
            return (Criteria) this;
        }

        public Criteria andTimeTreeNameNotLike(String value) {
            addCriterion("TIME_TREE_NAME not like", value, "timeTreeName");
            return (Criteria) this;
        }

        public Criteria andTimeTreeNameIn(List<String> values) {
            addCriterion("TIME_TREE_NAME in", values, "timeTreeName");
            return (Criteria) this;
        }

        public Criteria andTimeTreeNameNotIn(List<String> values) {
            addCriterion("TIME_TREE_NAME not in", values, "timeTreeName");
            return (Criteria) this;
        }

        public Criteria andTimeTreeNameBetween(String value1, String value2) {
            addCriterion("TIME_TREE_NAME between", value1, value2, "timeTreeName");
            return (Criteria) this;
        }

        public Criteria andTimeTreeNameNotBetween(String value1, String value2) {
            addCriterion("TIME_TREE_NAME not between", value1, value2, "timeTreeName");
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