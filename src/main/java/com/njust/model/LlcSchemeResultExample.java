package com.njust.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LlcSchemeResultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public LlcSchemeResultExample() {
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

        public Criteria andValueIsNull() {
            addCriterion("VALUE is null");
            return (Criteria) this;
        }

        public Criteria andValueIsNotNull() {
            addCriterion("VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andValueEqualTo(BigDecimal value) {
            addCriterion("VALUE =", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotEqualTo(BigDecimal value) {
            addCriterion("VALUE <>", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThan(BigDecimal value) {
            addCriterion("VALUE >", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VALUE >=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThan(BigDecimal value) {
            addCriterion("VALUE <", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VALUE <=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueIn(List<BigDecimal> values) {
            addCriterion("VALUE in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotIn(List<BigDecimal> values) {
            addCriterion("VALUE not in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VALUE between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VALUE not between", value1, value2, "value");
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