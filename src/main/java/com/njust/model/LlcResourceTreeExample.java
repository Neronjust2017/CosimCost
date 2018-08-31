package com.njust.model;

import java.util.ArrayList;
import java.util.List;

public class LlcResourceTreeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public LlcResourceTreeExample() {
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

        public Criteria andResourceTreeIdIsNull() {
            addCriterion("RESOURCE_TREE_ID is null");
            return (Criteria) this;
        }

        public Criteria andResourceTreeIdIsNotNull() {
            addCriterion("RESOURCE_TREE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andResourceTreeIdEqualTo(Integer value) {
            addCriterion("RESOURCE_TREE_ID =", value, "resourceTreeId");
            return (Criteria) this;
        }

        public Criteria andResourceTreeIdNotEqualTo(Integer value) {
            addCriterion("RESOURCE_TREE_ID <>", value, "resourceTreeId");
            return (Criteria) this;
        }

        public Criteria andResourceTreeIdGreaterThan(Integer value) {
            addCriterion("RESOURCE_TREE_ID >", value, "resourceTreeId");
            return (Criteria) this;
        }

        public Criteria andResourceTreeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("RESOURCE_TREE_ID >=", value, "resourceTreeId");
            return (Criteria) this;
        }

        public Criteria andResourceTreeIdLessThan(Integer value) {
            addCriterion("RESOURCE_TREE_ID <", value, "resourceTreeId");
            return (Criteria) this;
        }

        public Criteria andResourceTreeIdLessThanOrEqualTo(Integer value) {
            addCriterion("RESOURCE_TREE_ID <=", value, "resourceTreeId");
            return (Criteria) this;
        }

        public Criteria andResourceTreeIdIn(List<Integer> values) {
            addCriterion("RESOURCE_TREE_ID in", values, "resourceTreeId");
            return (Criteria) this;
        }

        public Criteria andResourceTreeIdNotIn(List<Integer> values) {
            addCriterion("RESOURCE_TREE_ID not in", values, "resourceTreeId");
            return (Criteria) this;
        }

        public Criteria andResourceTreeIdBetween(Integer value1, Integer value2) {
            addCriterion("RESOURCE_TREE_ID between", value1, value2, "resourceTreeId");
            return (Criteria) this;
        }

        public Criteria andResourceTreeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("RESOURCE_TREE_ID not between", value1, value2, "resourceTreeId");
            return (Criteria) this;
        }

        public Criteria andResourceTreeNameIsNull() {
            addCriterion("RESOURCE_TREE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andResourceTreeNameIsNotNull() {
            addCriterion("RESOURCE_TREE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andResourceTreeNameEqualTo(String value) {
            addCriterion("RESOURCE_TREE_NAME =", value, "resourceTreeName");
            return (Criteria) this;
        }

        public Criteria andResourceTreeNameNotEqualTo(String value) {
            addCriterion("RESOURCE_TREE_NAME <>", value, "resourceTreeName");
            return (Criteria) this;
        }

        public Criteria andResourceTreeNameGreaterThan(String value) {
            addCriterion("RESOURCE_TREE_NAME >", value, "resourceTreeName");
            return (Criteria) this;
        }

        public Criteria andResourceTreeNameGreaterThanOrEqualTo(String value) {
            addCriterion("RESOURCE_TREE_NAME >=", value, "resourceTreeName");
            return (Criteria) this;
        }

        public Criteria andResourceTreeNameLessThan(String value) {
            addCriterion("RESOURCE_TREE_NAME <", value, "resourceTreeName");
            return (Criteria) this;
        }

        public Criteria andResourceTreeNameLessThanOrEqualTo(String value) {
            addCriterion("RESOURCE_TREE_NAME <=", value, "resourceTreeName");
            return (Criteria) this;
        }

        public Criteria andResourceTreeNameLike(String value) {
            addCriterion("RESOURCE_TREE_NAME like", value, "resourceTreeName");
            return (Criteria) this;
        }

        public Criteria andResourceTreeNameNotLike(String value) {
            addCriterion("RESOURCE_TREE_NAME not like", value, "resourceTreeName");
            return (Criteria) this;
        }

        public Criteria andResourceTreeNameIn(List<String> values) {
            addCriterion("RESOURCE_TREE_NAME in", values, "resourceTreeName");
            return (Criteria) this;
        }

        public Criteria andResourceTreeNameNotIn(List<String> values) {
            addCriterion("RESOURCE_TREE_NAME not in", values, "resourceTreeName");
            return (Criteria) this;
        }

        public Criteria andResourceTreeNameBetween(String value1, String value2) {
            addCriterion("RESOURCE_TREE_NAME between", value1, value2, "resourceTreeName");
            return (Criteria) this;
        }

        public Criteria andResourceTreeNameNotBetween(String value1, String value2) {
            addCriterion("RESOURCE_TREE_NAME not between", value1, value2, "resourceTreeName");
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