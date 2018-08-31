package com.njust.model;

import java.util.ArrayList;
import java.util.List;

public class LlcSchemeCostDimensionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public LlcSchemeCostDimensionExample() {
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

        public Criteria andSchemeIdIsNull() {
            addCriterion("SCHEME_ID is null");
            return (Criteria) this;
        }

        public Criteria andSchemeIdIsNotNull() {
            addCriterion("SCHEME_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSchemeIdEqualTo(Integer value) {
            addCriterion("SCHEME_ID =", value, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdNotEqualTo(Integer value) {
            addCriterion("SCHEME_ID <>", value, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdGreaterThan(Integer value) {
            addCriterion("SCHEME_ID >", value, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SCHEME_ID >=", value, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdLessThan(Integer value) {
            addCriterion("SCHEME_ID <", value, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdLessThanOrEqualTo(Integer value) {
            addCriterion("SCHEME_ID <=", value, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdIn(List<Integer> values) {
            addCriterion("SCHEME_ID in", values, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdNotIn(List<Integer> values) {
            addCriterion("SCHEME_ID not in", values, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdBetween(Integer value1, Integer value2) {
            addCriterion("SCHEME_ID between", value1, value2, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdNotBetween(Integer value1, Integer value2) {
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

        public Criteria andCostIdEqualTo(Integer value) {
            addCriterion("COST_ID =", value, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdNotEqualTo(Integer value) {
            addCriterion("COST_ID <>", value, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdGreaterThan(Integer value) {
            addCriterion("COST_ID >", value, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("COST_ID >=", value, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdLessThan(Integer value) {
            addCriterion("COST_ID <", value, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdLessThanOrEqualTo(Integer value) {
            addCriterion("COST_ID <=", value, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdIn(List<Integer> values) {
            addCriterion("COST_ID in", values, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdNotIn(List<Integer> values) {
            addCriterion("COST_ID not in", values, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdBetween(Integer value1, Integer value2) {
            addCriterion("COST_ID between", value1, value2, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdNotBetween(Integer value1, Integer value2) {
            addCriterion("COST_ID not between", value1, value2, "costId");
            return (Criteria) this;
        }

        public Criteria andSuperCostIdIsNull() {
            addCriterion("SUPER_COST_ID is null");
            return (Criteria) this;
        }

        public Criteria andSuperCostIdIsNotNull() {
            addCriterion("SUPER_COST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSuperCostIdEqualTo(Integer value) {
            addCriterion("SUPER_COST_ID =", value, "superCostId");
            return (Criteria) this;
        }

        public Criteria andSuperCostIdNotEqualTo(Integer value) {
            addCriterion("SUPER_COST_ID <>", value, "superCostId");
            return (Criteria) this;
        }

        public Criteria andSuperCostIdGreaterThan(Integer value) {
            addCriterion("SUPER_COST_ID >", value, "superCostId");
            return (Criteria) this;
        }

        public Criteria andSuperCostIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SUPER_COST_ID >=", value, "superCostId");
            return (Criteria) this;
        }

        public Criteria andSuperCostIdLessThan(Integer value) {
            addCriterion("SUPER_COST_ID <", value, "superCostId");
            return (Criteria) this;
        }

        public Criteria andSuperCostIdLessThanOrEqualTo(Integer value) {
            addCriterion("SUPER_COST_ID <=", value, "superCostId");
            return (Criteria) this;
        }

        public Criteria andSuperCostIdIn(List<Integer> values) {
            addCriterion("SUPER_COST_ID in", values, "superCostId");
            return (Criteria) this;
        }

        public Criteria andSuperCostIdNotIn(List<Integer> values) {
            addCriterion("SUPER_COST_ID not in", values, "superCostId");
            return (Criteria) this;
        }

        public Criteria andSuperCostIdBetween(Integer value1, Integer value2) {
            addCriterion("SUPER_COST_ID between", value1, value2, "superCostId");
            return (Criteria) this;
        }

        public Criteria andSuperCostIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SUPER_COST_ID not between", value1, value2, "superCostId");
            return (Criteria) this;
        }

        public Criteria andBelongProductIdIsNull() {
            addCriterion("BELONG_PRODUCT_ID is null");
            return (Criteria) this;
        }

        public Criteria andBelongProductIdIsNotNull() {
            addCriterion("BELONG_PRODUCT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBelongProductIdEqualTo(Integer value) {
            addCriterion("BELONG_PRODUCT_ID =", value, "belongProductId");
            return (Criteria) this;
        }

        public Criteria andBelongProductIdNotEqualTo(Integer value) {
            addCriterion("BELONG_PRODUCT_ID <>", value, "belongProductId");
            return (Criteria) this;
        }

        public Criteria andBelongProductIdGreaterThan(Integer value) {
            addCriterion("BELONG_PRODUCT_ID >", value, "belongProductId");
            return (Criteria) this;
        }

        public Criteria andBelongProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("BELONG_PRODUCT_ID >=", value, "belongProductId");
            return (Criteria) this;
        }

        public Criteria andBelongProductIdLessThan(Integer value) {
            addCriterion("BELONG_PRODUCT_ID <", value, "belongProductId");
            return (Criteria) this;
        }

        public Criteria andBelongProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("BELONG_PRODUCT_ID <=", value, "belongProductId");
            return (Criteria) this;
        }

        public Criteria andBelongProductIdIn(List<Integer> values) {
            addCriterion("BELONG_PRODUCT_ID in", values, "belongProductId");
            return (Criteria) this;
        }

        public Criteria andBelongProductIdNotIn(List<Integer> values) {
            addCriterion("BELONG_PRODUCT_ID not in", values, "belongProductId");
            return (Criteria) this;
        }

        public Criteria andBelongProductIdBetween(Integer value1, Integer value2) {
            addCriterion("BELONG_PRODUCT_ID between", value1, value2, "belongProductId");
            return (Criteria) this;
        }

        public Criteria andBelongProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("BELONG_PRODUCT_ID not between", value1, value2, "belongProductId");
            return (Criteria) this;
        }

        public Criteria andBelongTaskIdIsNull() {
            addCriterion("BELONG_TASK_ID is null");
            return (Criteria) this;
        }

        public Criteria andBelongTaskIdIsNotNull() {
            addCriterion("BELONG_TASK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBelongTaskIdEqualTo(Integer value) {
            addCriterion("BELONG_TASK_ID =", value, "belongTaskId");
            return (Criteria) this;
        }

        public Criteria andBelongTaskIdNotEqualTo(Integer value) {
            addCriterion("BELONG_TASK_ID <>", value, "belongTaskId");
            return (Criteria) this;
        }

        public Criteria andBelongTaskIdGreaterThan(Integer value) {
            addCriterion("BELONG_TASK_ID >", value, "belongTaskId");
            return (Criteria) this;
        }

        public Criteria andBelongTaskIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("BELONG_TASK_ID >=", value, "belongTaskId");
            return (Criteria) this;
        }

        public Criteria andBelongTaskIdLessThan(Integer value) {
            addCriterion("BELONG_TASK_ID <", value, "belongTaskId");
            return (Criteria) this;
        }

        public Criteria andBelongTaskIdLessThanOrEqualTo(Integer value) {
            addCriterion("BELONG_TASK_ID <=", value, "belongTaskId");
            return (Criteria) this;
        }

        public Criteria andBelongTaskIdIn(List<Integer> values) {
            addCriterion("BELONG_TASK_ID in", values, "belongTaskId");
            return (Criteria) this;
        }

        public Criteria andBelongTaskIdNotIn(List<Integer> values) {
            addCriterion("BELONG_TASK_ID not in", values, "belongTaskId");
            return (Criteria) this;
        }

        public Criteria andBelongTaskIdBetween(Integer value1, Integer value2) {
            addCriterion("BELONG_TASK_ID between", value1, value2, "belongTaskId");
            return (Criteria) this;
        }

        public Criteria andBelongTaskIdNotBetween(Integer value1, Integer value2) {
            addCriterion("BELONG_TASK_ID not between", value1, value2, "belongTaskId");
            return (Criteria) this;
        }

        public Criteria andBelongResourceIdIsNull() {
            addCriterion("BELONG_RESOURCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andBelongResourceIdIsNotNull() {
            addCriterion("BELONG_RESOURCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBelongResourceIdEqualTo(Integer value) {
            addCriterion("BELONG_RESOURCE_ID =", value, "belongResourceId");
            return (Criteria) this;
        }

        public Criteria andBelongResourceIdNotEqualTo(Integer value) {
            addCriterion("BELONG_RESOURCE_ID <>", value, "belongResourceId");
            return (Criteria) this;
        }

        public Criteria andBelongResourceIdGreaterThan(Integer value) {
            addCriterion("BELONG_RESOURCE_ID >", value, "belongResourceId");
            return (Criteria) this;
        }

        public Criteria andBelongResourceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("BELONG_RESOURCE_ID >=", value, "belongResourceId");
            return (Criteria) this;
        }

        public Criteria andBelongResourceIdLessThan(Integer value) {
            addCriterion("BELONG_RESOURCE_ID <", value, "belongResourceId");
            return (Criteria) this;
        }

        public Criteria andBelongResourceIdLessThanOrEqualTo(Integer value) {
            addCriterion("BELONG_RESOURCE_ID <=", value, "belongResourceId");
            return (Criteria) this;
        }

        public Criteria andBelongResourceIdIn(List<Integer> values) {
            addCriterion("BELONG_RESOURCE_ID in", values, "belongResourceId");
            return (Criteria) this;
        }

        public Criteria andBelongResourceIdNotIn(List<Integer> values) {
            addCriterion("BELONG_RESOURCE_ID not in", values, "belongResourceId");
            return (Criteria) this;
        }

        public Criteria andBelongResourceIdBetween(Integer value1, Integer value2) {
            addCriterion("BELONG_RESOURCE_ID between", value1, value2, "belongResourceId");
            return (Criteria) this;
        }

        public Criteria andBelongResourceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("BELONG_RESOURCE_ID not between", value1, value2, "belongResourceId");
            return (Criteria) this;
        }

        public Criteria andBelongTimeIdIsNull() {
            addCriterion("BELONG_TIME_ID is null");
            return (Criteria) this;
        }

        public Criteria andBelongTimeIdIsNotNull() {
            addCriterion("BELONG_TIME_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBelongTimeIdEqualTo(Integer value) {
            addCriterion("BELONG_TIME_ID =", value, "belongTimeId");
            return (Criteria) this;
        }

        public Criteria andBelongTimeIdNotEqualTo(Integer value) {
            addCriterion("BELONG_TIME_ID <>", value, "belongTimeId");
            return (Criteria) this;
        }

        public Criteria andBelongTimeIdGreaterThan(Integer value) {
            addCriterion("BELONG_TIME_ID >", value, "belongTimeId");
            return (Criteria) this;
        }

        public Criteria andBelongTimeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("BELONG_TIME_ID >=", value, "belongTimeId");
            return (Criteria) this;
        }

        public Criteria andBelongTimeIdLessThan(Integer value) {
            addCriterion("BELONG_TIME_ID <", value, "belongTimeId");
            return (Criteria) this;
        }

        public Criteria andBelongTimeIdLessThanOrEqualTo(Integer value) {
            addCriterion("BELONG_TIME_ID <=", value, "belongTimeId");
            return (Criteria) this;
        }

        public Criteria andBelongTimeIdIn(List<Integer> values) {
            addCriterion("BELONG_TIME_ID in", values, "belongTimeId");
            return (Criteria) this;
        }

        public Criteria andBelongTimeIdNotIn(List<Integer> values) {
            addCriterion("BELONG_TIME_ID not in", values, "belongTimeId");
            return (Criteria) this;
        }

        public Criteria andBelongTimeIdBetween(Integer value1, Integer value2) {
            addCriterion("BELONG_TIME_ID between", value1, value2, "belongTimeId");
            return (Criteria) this;
        }

        public Criteria andBelongTimeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("BELONG_TIME_ID not between", value1, value2, "belongTimeId");
            return (Criteria) this;
        }

        public Criteria andBelongTechnologyIdIsNull() {
            addCriterion("BELONG_TECHNOLOGY_ID is null");
            return (Criteria) this;
        }

        public Criteria andBelongTechnologyIdIsNotNull() {
            addCriterion("BELONG_TECHNOLOGY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBelongTechnologyIdEqualTo(Integer value) {
            addCriterion("BELONG_TECHNOLOGY_ID =", value, "belongTechnologyId");
            return (Criteria) this;
        }

        public Criteria andBelongTechnologyIdNotEqualTo(Integer value) {
            addCriterion("BELONG_TECHNOLOGY_ID <>", value, "belongTechnologyId");
            return (Criteria) this;
        }

        public Criteria andBelongTechnologyIdGreaterThan(Integer value) {
            addCriterion("BELONG_TECHNOLOGY_ID >", value, "belongTechnologyId");
            return (Criteria) this;
        }

        public Criteria andBelongTechnologyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("BELONG_TECHNOLOGY_ID >=", value, "belongTechnologyId");
            return (Criteria) this;
        }

        public Criteria andBelongTechnologyIdLessThan(Integer value) {
            addCriterion("BELONG_TECHNOLOGY_ID <", value, "belongTechnologyId");
            return (Criteria) this;
        }

        public Criteria andBelongTechnologyIdLessThanOrEqualTo(Integer value) {
            addCriterion("BELONG_TECHNOLOGY_ID <=", value, "belongTechnologyId");
            return (Criteria) this;
        }

        public Criteria andBelongTechnologyIdIn(List<Integer> values) {
            addCriterion("BELONG_TECHNOLOGY_ID in", values, "belongTechnologyId");
            return (Criteria) this;
        }

        public Criteria andBelongTechnologyIdNotIn(List<Integer> values) {
            addCriterion("BELONG_TECHNOLOGY_ID not in", values, "belongTechnologyId");
            return (Criteria) this;
        }

        public Criteria andBelongTechnologyIdBetween(Integer value1, Integer value2) {
            addCriterion("BELONG_TECHNOLOGY_ID between", value1, value2, "belongTechnologyId");
            return (Criteria) this;
        }

        public Criteria andBelongTechnologyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("BELONG_TECHNOLOGY_ID not between", value1, value2, "belongTechnologyId");
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