package com.njust.model;

import java.util.ArrayList;
import java.util.List;

public class LlcTaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public LlcTaskExample() {
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

        public Criteria andTaskTreeIdIsNull() {
            addCriterion("TASK_TREE_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaskTreeIdIsNotNull() {
            addCriterion("TASK_TREE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTreeIdEqualTo(Integer value) {
            addCriterion("TASK_TREE_ID =", value, "taskTreeId");
            return (Criteria) this;
        }

        public Criteria andTaskTreeIdNotEqualTo(Integer value) {
            addCriterion("TASK_TREE_ID <>", value, "taskTreeId");
            return (Criteria) this;
        }

        public Criteria andTaskTreeIdGreaterThan(Integer value) {
            addCriterion("TASK_TREE_ID >", value, "taskTreeId");
            return (Criteria) this;
        }

        public Criteria andTaskTreeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TASK_TREE_ID >=", value, "taskTreeId");
            return (Criteria) this;
        }

        public Criteria andTaskTreeIdLessThan(Integer value) {
            addCriterion("TASK_TREE_ID <", value, "taskTreeId");
            return (Criteria) this;
        }

        public Criteria andTaskTreeIdLessThanOrEqualTo(Integer value) {
            addCriterion("TASK_TREE_ID <=", value, "taskTreeId");
            return (Criteria) this;
        }

        public Criteria andTaskTreeIdIn(List<Integer> values) {
            addCriterion("TASK_TREE_ID in", values, "taskTreeId");
            return (Criteria) this;
        }

        public Criteria andTaskTreeIdNotIn(List<Integer> values) {
            addCriterion("TASK_TREE_ID not in", values, "taskTreeId");
            return (Criteria) this;
        }

        public Criteria andTaskTreeIdBetween(Integer value1, Integer value2) {
            addCriterion("TASK_TREE_ID between", value1, value2, "taskTreeId");
            return (Criteria) this;
        }

        public Criteria andTaskTreeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TASK_TREE_ID not between", value1, value2, "taskTreeId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNull() {
            addCriterion("TASK_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("TASK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(Integer value) {
            addCriterion("TASK_ID =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(Integer value) {
            addCriterion("TASK_ID <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(Integer value) {
            addCriterion("TASK_ID >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TASK_ID >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(Integer value) {
            addCriterion("TASK_ID <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(Integer value) {
            addCriterion("TASK_ID <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<Integer> values) {
            addCriterion("TASK_ID in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<Integer> values) {
            addCriterion("TASK_ID not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(Integer value1, Integer value2) {
            addCriterion("TASK_ID between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TASK_ID not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNull() {
            addCriterion("TASK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNotNull() {
            addCriterion("TASK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTaskNameEqualTo(String value) {
            addCriterion("TASK_NAME =", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotEqualTo(String value) {
            addCriterion("TASK_NAME <>", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThan(String value) {
            addCriterion("TASK_NAME >", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_NAME >=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThan(String value) {
            addCriterion("TASK_NAME <", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThanOrEqualTo(String value) {
            addCriterion("TASK_NAME <=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLike(String value) {
            addCriterion("TASK_NAME like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotLike(String value) {
            addCriterion("TASK_NAME not like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameIn(List<String> values) {
            addCriterion("TASK_NAME in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotIn(List<String> values) {
            addCriterion("TASK_NAME not in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameBetween(String value1, String value2) {
            addCriterion("TASK_NAME between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotBetween(String value1, String value2) {
            addCriterion("TASK_NAME not between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andSuperTaskIdIsNull() {
            addCriterion("SUPER_TASK_ID is null");
            return (Criteria) this;
        }

        public Criteria andSuperTaskIdIsNotNull() {
            addCriterion("SUPER_TASK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSuperTaskIdEqualTo(Integer value) {
            addCriterion("SUPER_TASK_ID =", value, "superTaskId");
            return (Criteria) this;
        }

        public Criteria andSuperTaskIdNotEqualTo(Integer value) {
            addCriterion("SUPER_TASK_ID <>", value, "superTaskId");
            return (Criteria) this;
        }

        public Criteria andSuperTaskIdGreaterThan(Integer value) {
            addCriterion("SUPER_TASK_ID >", value, "superTaskId");
            return (Criteria) this;
        }

        public Criteria andSuperTaskIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SUPER_TASK_ID >=", value, "superTaskId");
            return (Criteria) this;
        }

        public Criteria andSuperTaskIdLessThan(Integer value) {
            addCriterion("SUPER_TASK_ID <", value, "superTaskId");
            return (Criteria) this;
        }

        public Criteria andSuperTaskIdLessThanOrEqualTo(Integer value) {
            addCriterion("SUPER_TASK_ID <=", value, "superTaskId");
            return (Criteria) this;
        }

        public Criteria andSuperTaskIdIn(List<Integer> values) {
            addCriterion("SUPER_TASK_ID in", values, "superTaskId");
            return (Criteria) this;
        }

        public Criteria andSuperTaskIdNotIn(List<Integer> values) {
            addCriterion("SUPER_TASK_ID not in", values, "superTaskId");
            return (Criteria) this;
        }

        public Criteria andSuperTaskIdBetween(Integer value1, Integer value2) {
            addCriterion("SUPER_TASK_ID between", value1, value2, "superTaskId");
            return (Criteria) this;
        }

        public Criteria andSuperTaskIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SUPER_TASK_ID not between", value1, value2, "superTaskId");
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