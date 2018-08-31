package com.njust.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class UnknownModeResultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public UnknownModeResultExample() {
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

        public Criteria andProjectIdIsNull() {
            addCriterion("PROJECT_ID is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("PROJECT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(BigDecimal value) {
            addCriterion("PROJECT_ID =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(BigDecimal value) {
            addCriterion("PROJECT_ID <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(BigDecimal value) {
            addCriterion("PROJECT_ID >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PROJECT_ID >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(BigDecimal value) {
            addCriterion("PROJECT_ID <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PROJECT_ID <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<BigDecimal> values) {
            addCriterion("PROJECT_ID in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<BigDecimal> values) {
            addCriterion("PROJECT_ID not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROJECT_ID between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROJECT_ID not between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdIsNull() {
            addCriterion("SCHEME_ID is null");
            return (Criteria) this;
        }

        public Criteria andSchemeIdIsNotNull() {
            addCriterion("SCHEME_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSchemeIdEqualTo(BigDecimal value) {
            addCriterion("SCHEME_ID =", value, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdNotEqualTo(BigDecimal value) {
            addCriterion("SCHEME_ID <>", value, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdGreaterThan(BigDecimal value) {
            addCriterion("SCHEME_ID >", value, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SCHEME_ID >=", value, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdLessThan(BigDecimal value) {
            addCriterion("SCHEME_ID <", value, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SCHEME_ID <=", value, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdIn(List<BigDecimal> values) {
            addCriterion("SCHEME_ID in", values, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdNotIn(List<BigDecimal> values) {
            addCriterion("SCHEME_ID not in", values, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCHEME_ID between", value1, value2, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCHEME_ID not between", value1, value2, "schemeId");
            return (Criteria) this;
        }

        public Criteria andCostIdIsNull() {
            addCriterion("COST_ID is null");
            return (Criteria) this;
        }

        public Criteria andCostIdIsNotNull() {
            addCriterion("COST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCostIdEqualTo(BigDecimal value) {
            addCriterion("COST_ID =", value, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdNotEqualTo(BigDecimal value) {
            addCriterion("COST_ID <>", value, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdGreaterThan(BigDecimal value) {
            addCriterion("COST_ID >", value, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COST_ID >=", value, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdLessThan(BigDecimal value) {
            addCriterion("COST_ID <", value, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COST_ID <=", value, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdIn(List<BigDecimal> values) {
            addCriterion("COST_ID in", values, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdNotIn(List<BigDecimal> values) {
            addCriterion("COST_ID not in", values, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COST_ID between", value1, value2, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COST_ID not between", value1, value2, "costId");
            return (Criteria) this;
        }

        public Criteria andCostTreeIdIsNull() {
            addCriterion("COST_TREE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCostTreeIdIsNotNull() {
            addCriterion("COST_TREE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCostTreeIdEqualTo(BigDecimal value) {
            addCriterion("COST_TREE_ID =", value, "costTreeId");
            return (Criteria) this;
        }

        public Criteria andCostTreeIdNotEqualTo(BigDecimal value) {
            addCriterion("COST_TREE_ID <>", value, "costTreeId");
            return (Criteria) this;
        }

        public Criteria andCostTreeIdGreaterThan(BigDecimal value) {
            addCriterion("COST_TREE_ID >", value, "costTreeId");
            return (Criteria) this;
        }

        public Criteria andCostTreeIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COST_TREE_ID >=", value, "costTreeId");
            return (Criteria) this;
        }

        public Criteria andCostTreeIdLessThan(BigDecimal value) {
            addCriterion("COST_TREE_ID <", value, "costTreeId");
            return (Criteria) this;
        }

        public Criteria andCostTreeIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COST_TREE_ID <=", value, "costTreeId");
            return (Criteria) this;
        }

        public Criteria andCostTreeIdIn(List<BigDecimal> values) {
            addCriterion("COST_TREE_ID in", values, "costTreeId");
            return (Criteria) this;
        }

        public Criteria andCostTreeIdNotIn(List<BigDecimal> values) {
            addCriterion("COST_TREE_ID not in", values, "costTreeId");
            return (Criteria) this;
        }

        public Criteria andCostTreeIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COST_TREE_ID between", value1, value2, "costTreeId");
            return (Criteria) this;
        }

        public Criteria andCostTreeIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COST_TREE_ID not between", value1, value2, "costTreeId");
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

        public Criteria andTrainMethodIsNull() {
            addCriterion("TRAIN_METHOD is null");
            return (Criteria) this;
        }

        public Criteria andTrainMethodIsNotNull() {
            addCriterion("TRAIN_METHOD is not null");
            return (Criteria) this;
        }

        public Criteria andTrainMethodEqualTo(Integer value) {
            addCriterion("TRAIN_METHOD =", value, "trainMethod");
            return (Criteria) this;
        }

        public Criteria andTrainMethodNotEqualTo(Integer value) {
            addCriterion("TRAIN_METHOD <>", value, "trainMethod");
            return (Criteria) this;
        }

        public Criteria andTrainMethodGreaterThan(Integer value) {
            addCriterion("TRAIN_METHOD >", value, "trainMethod");
            return (Criteria) this;
        }

        public Criteria andTrainMethodGreaterThanOrEqualTo(Integer value) {
            addCriterion("TRAIN_METHOD >=", value, "trainMethod");
            return (Criteria) this;
        }

        public Criteria andTrainMethodLessThan(Integer value) {
            addCriterion("TRAIN_METHOD <", value, "trainMethod");
            return (Criteria) this;
        }

        public Criteria andTrainMethodLessThanOrEqualTo(Integer value) {
            addCriterion("TRAIN_METHOD <=", value, "trainMethod");
            return (Criteria) this;
        }

        public Criteria andTrainMethodIn(List<Integer> values) {
            addCriterion("TRAIN_METHOD in", values, "trainMethod");
            return (Criteria) this;
        }

        public Criteria andTrainMethodNotIn(List<Integer> values) {
            addCriterion("TRAIN_METHOD not in", values, "trainMethod");
            return (Criteria) this;
        }

        public Criteria andTrainMethodBetween(Integer value1, Integer value2) {
            addCriterion("TRAIN_METHOD between", value1, value2, "trainMethod");
            return (Criteria) this;
        }

        public Criteria andTrainMethodNotBetween(Integer value1, Integer value2) {
            addCriterion("TRAIN_METHOD not between", value1, value2, "trainMethod");
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