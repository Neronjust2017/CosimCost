package com.njust.model;

import java.util.ArrayList;
import java.util.List;

public class LlcTechnologyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public LlcTechnologyExample() {
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

        public Criteria andTechnologyTreeIdIsNull() {
            addCriterion("TECHNOLOGY_TREE_ID is null");
            return (Criteria) this;
        }

        public Criteria andTechnologyTreeIdIsNotNull() {
            addCriterion("TECHNOLOGY_TREE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTechnologyTreeIdEqualTo(Integer value) {
            addCriterion("TECHNOLOGY_TREE_ID =", value, "technologyTreeId");
            return (Criteria) this;
        }

        public Criteria andTechnologyTreeIdNotEqualTo(Integer value) {
            addCriterion("TECHNOLOGY_TREE_ID <>", value, "technologyTreeId");
            return (Criteria) this;
        }

        public Criteria andTechnologyTreeIdGreaterThan(Integer value) {
            addCriterion("TECHNOLOGY_TREE_ID >", value, "technologyTreeId");
            return (Criteria) this;
        }

        public Criteria andTechnologyTreeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TECHNOLOGY_TREE_ID >=", value, "technologyTreeId");
            return (Criteria) this;
        }

        public Criteria andTechnologyTreeIdLessThan(Integer value) {
            addCriterion("TECHNOLOGY_TREE_ID <", value, "technologyTreeId");
            return (Criteria) this;
        }

        public Criteria andTechnologyTreeIdLessThanOrEqualTo(Integer value) {
            addCriterion("TECHNOLOGY_TREE_ID <=", value, "technologyTreeId");
            return (Criteria) this;
        }

        public Criteria andTechnologyTreeIdIn(List<Integer> values) {
            addCriterion("TECHNOLOGY_TREE_ID in", values, "technologyTreeId");
            return (Criteria) this;
        }

        public Criteria andTechnologyTreeIdNotIn(List<Integer> values) {
            addCriterion("TECHNOLOGY_TREE_ID not in", values, "technologyTreeId");
            return (Criteria) this;
        }

        public Criteria andTechnologyTreeIdBetween(Integer value1, Integer value2) {
            addCriterion("TECHNOLOGY_TREE_ID between", value1, value2, "technologyTreeId");
            return (Criteria) this;
        }

        public Criteria andTechnologyTreeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TECHNOLOGY_TREE_ID not between", value1, value2, "technologyTreeId");
            return (Criteria) this;
        }

        public Criteria andTechnologyIdIsNull() {
            addCriterion("TECHNOLOGY_ID is null");
            return (Criteria) this;
        }

        public Criteria andTechnologyIdIsNotNull() {
            addCriterion("TECHNOLOGY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTechnologyIdEqualTo(Integer value) {
            addCriterion("TECHNOLOGY_ID =", value, "technologyId");
            return (Criteria) this;
        }

        public Criteria andTechnologyIdNotEqualTo(Integer value) {
            addCriterion("TECHNOLOGY_ID <>", value, "technologyId");
            return (Criteria) this;
        }

        public Criteria andTechnologyIdGreaterThan(Integer value) {
            addCriterion("TECHNOLOGY_ID >", value, "technologyId");
            return (Criteria) this;
        }

        public Criteria andTechnologyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TECHNOLOGY_ID >=", value, "technologyId");
            return (Criteria) this;
        }

        public Criteria andTechnologyIdLessThan(Integer value) {
            addCriterion("TECHNOLOGY_ID <", value, "technologyId");
            return (Criteria) this;
        }

        public Criteria andTechnologyIdLessThanOrEqualTo(Integer value) {
            addCriterion("TECHNOLOGY_ID <=", value, "technologyId");
            return (Criteria) this;
        }

        public Criteria andTechnologyIdIn(List<Integer> values) {
            addCriterion("TECHNOLOGY_ID in", values, "technologyId");
            return (Criteria) this;
        }

        public Criteria andTechnologyIdNotIn(List<Integer> values) {
            addCriterion("TECHNOLOGY_ID not in", values, "technologyId");
            return (Criteria) this;
        }

        public Criteria andTechnologyIdBetween(Integer value1, Integer value2) {
            addCriterion("TECHNOLOGY_ID between", value1, value2, "technologyId");
            return (Criteria) this;
        }

        public Criteria andTechnologyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TECHNOLOGY_ID not between", value1, value2, "technologyId");
            return (Criteria) this;
        }

        public Criteria andTechnologyNameIsNull() {
            addCriterion("TECHNOLOGY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTechnologyNameIsNotNull() {
            addCriterion("TECHNOLOGY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTechnologyNameEqualTo(String value) {
            addCriterion("TECHNOLOGY_NAME =", value, "technologyName");
            return (Criteria) this;
        }

        public Criteria andTechnologyNameNotEqualTo(String value) {
            addCriterion("TECHNOLOGY_NAME <>", value, "technologyName");
            return (Criteria) this;
        }

        public Criteria andTechnologyNameGreaterThan(String value) {
            addCriterion("TECHNOLOGY_NAME >", value, "technologyName");
            return (Criteria) this;
        }

        public Criteria andTechnologyNameGreaterThanOrEqualTo(String value) {
            addCriterion("TECHNOLOGY_NAME >=", value, "technologyName");
            return (Criteria) this;
        }

        public Criteria andTechnologyNameLessThan(String value) {
            addCriterion("TECHNOLOGY_NAME <", value, "technologyName");
            return (Criteria) this;
        }

        public Criteria andTechnologyNameLessThanOrEqualTo(String value) {
            addCriterion("TECHNOLOGY_NAME <=", value, "technologyName");
            return (Criteria) this;
        }

        public Criteria andTechnologyNameLike(String value) {
            addCriterion("TECHNOLOGY_NAME like", value, "technologyName");
            return (Criteria) this;
        }

        public Criteria andTechnologyNameNotLike(String value) {
            addCriterion("TECHNOLOGY_NAME not like", value, "technologyName");
            return (Criteria) this;
        }

        public Criteria andTechnologyNameIn(List<String> values) {
            addCriterion("TECHNOLOGY_NAME in", values, "technologyName");
            return (Criteria) this;
        }

        public Criteria andTechnologyNameNotIn(List<String> values) {
            addCriterion("TECHNOLOGY_NAME not in", values, "technologyName");
            return (Criteria) this;
        }

        public Criteria andTechnologyNameBetween(String value1, String value2) {
            addCriterion("TECHNOLOGY_NAME between", value1, value2, "technologyName");
            return (Criteria) this;
        }

        public Criteria andTechnologyNameNotBetween(String value1, String value2) {
            addCriterion("TECHNOLOGY_NAME not between", value1, value2, "technologyName");
            return (Criteria) this;
        }

        public Criteria andSuperTechnologyIdIsNull() {
            addCriterion("SUPER_TECHNOLOGY_ID is null");
            return (Criteria) this;
        }

        public Criteria andSuperTechnologyIdIsNotNull() {
            addCriterion("SUPER_TECHNOLOGY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSuperTechnologyIdEqualTo(Integer value) {
            addCriterion("SUPER_TECHNOLOGY_ID =", value, "superTechnologyId");
            return (Criteria) this;
        }

        public Criteria andSuperTechnologyIdNotEqualTo(Integer value) {
            addCriterion("SUPER_TECHNOLOGY_ID <>", value, "superTechnologyId");
            return (Criteria) this;
        }

        public Criteria andSuperTechnologyIdGreaterThan(Integer value) {
            addCriterion("SUPER_TECHNOLOGY_ID >", value, "superTechnologyId");
            return (Criteria) this;
        }

        public Criteria andSuperTechnologyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SUPER_TECHNOLOGY_ID >=", value, "superTechnologyId");
            return (Criteria) this;
        }

        public Criteria andSuperTechnologyIdLessThan(Integer value) {
            addCriterion("SUPER_TECHNOLOGY_ID <", value, "superTechnologyId");
            return (Criteria) this;
        }

        public Criteria andSuperTechnologyIdLessThanOrEqualTo(Integer value) {
            addCriterion("SUPER_TECHNOLOGY_ID <=", value, "superTechnologyId");
            return (Criteria) this;
        }

        public Criteria andSuperTechnologyIdIn(List<Integer> values) {
            addCriterion("SUPER_TECHNOLOGY_ID in", values, "superTechnologyId");
            return (Criteria) this;
        }

        public Criteria andSuperTechnologyIdNotIn(List<Integer> values) {
            addCriterion("SUPER_TECHNOLOGY_ID not in", values, "superTechnologyId");
            return (Criteria) this;
        }

        public Criteria andSuperTechnologyIdBetween(Integer value1, Integer value2) {
            addCriterion("SUPER_TECHNOLOGY_ID between", value1, value2, "superTechnologyId");
            return (Criteria) this;
        }

        public Criteria andSuperTechnologyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SUPER_TECHNOLOGY_ID not between", value1, value2, "superTechnologyId");
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