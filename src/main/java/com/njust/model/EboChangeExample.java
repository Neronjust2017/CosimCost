package com.njust.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class EboChangeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public EboChangeExample() {
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

        public Criteria andOptIdIsNull() {
            addCriterion("OPT_ID is null");
            return (Criteria) this;
        }

        public Criteria andOptIdIsNotNull() {
            addCriterion("OPT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOptIdEqualTo(BigDecimal value) {
            addCriterion("OPT_ID =", value, "optId");
            return (Criteria) this;
        }

        public Criteria andOptIdNotEqualTo(BigDecimal value) {
            addCriterion("OPT_ID <>", value, "optId");
            return (Criteria) this;
        }

        public Criteria andOptIdGreaterThan(BigDecimal value) {
            addCriterion("OPT_ID >", value, "optId");
            return (Criteria) this;
        }

        public Criteria andOptIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OPT_ID >=", value, "optId");
            return (Criteria) this;
        }

        public Criteria andOptIdLessThan(BigDecimal value) {
            addCriterion("OPT_ID <", value, "optId");
            return (Criteria) this;
        }

        public Criteria andOptIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OPT_ID <=", value, "optId");
            return (Criteria) this;
        }

        public Criteria andOptIdIn(List<BigDecimal> values) {
            addCriterion("OPT_ID in", values, "optId");
            return (Criteria) this;
        }

        public Criteria andOptIdNotIn(List<BigDecimal> values) {
            addCriterion("OPT_ID not in", values, "optId");
            return (Criteria) this;
        }

        public Criteria andOptIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OPT_ID between", value1, value2, "optId");
            return (Criteria) this;
        }

        public Criteria andOptIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OPT_ID not between", value1, value2, "optId");
            return (Criteria) this;
        }

        public Criteria andEboIsNull() {
            addCriterion("EBO is null");
            return (Criteria) this;
        }

        public Criteria andEboIsNotNull() {
            addCriterion("EBO is not null");
            return (Criteria) this;
        }

        public Criteria andEboEqualTo(BigDecimal value) {
            addCriterion("EBO =", value, "ebo");
            return (Criteria) this;
        }

        public Criteria andEboNotEqualTo(BigDecimal value) {
            addCriterion("EBO <>", value, "ebo");
            return (Criteria) this;
        }

        public Criteria andEboGreaterThan(BigDecimal value) {
            addCriterion("EBO >", value, "ebo");
            return (Criteria) this;
        }

        public Criteria andEboGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EBO >=", value, "ebo");
            return (Criteria) this;
        }

        public Criteria andEboLessThan(BigDecimal value) {
            addCriterion("EBO <", value, "ebo");
            return (Criteria) this;
        }

        public Criteria andEboLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EBO <=", value, "ebo");
            return (Criteria) this;
        }

        public Criteria andEboIn(List<BigDecimal> values) {
            addCriterion("EBO in", values, "ebo");
            return (Criteria) this;
        }

        public Criteria andEboNotIn(List<BigDecimal> values) {
            addCriterion("EBO not in", values, "ebo");
            return (Criteria) this;
        }

        public Criteria andEboBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EBO between", value1, value2, "ebo");
            return (Criteria) this;
        }

        public Criteria andEboNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EBO not between", value1, value2, "ebo");
            return (Criteria) this;
        }

        public Criteria andGenerationIsNull() {
            addCriterion("GENERATION is null");
            return (Criteria) this;
        }

        public Criteria andGenerationIsNotNull() {
            addCriterion("GENERATION is not null");
            return (Criteria) this;
        }

        public Criteria andGenerationEqualTo(BigDecimal value) {
            addCriterion("GENERATION =", value, "generation");
            return (Criteria) this;
        }

        public Criteria andGenerationNotEqualTo(BigDecimal value) {
            addCriterion("GENERATION <>", value, "generation");
            return (Criteria) this;
        }

        public Criteria andGenerationGreaterThan(BigDecimal value) {
            addCriterion("GENERATION >", value, "generation");
            return (Criteria) this;
        }

        public Criteria andGenerationGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GENERATION >=", value, "generation");
            return (Criteria) this;
        }

        public Criteria andGenerationLessThan(BigDecimal value) {
            addCriterion("GENERATION <", value, "generation");
            return (Criteria) this;
        }

        public Criteria andGenerationLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GENERATION <=", value, "generation");
            return (Criteria) this;
        }

        public Criteria andGenerationIn(List<BigDecimal> values) {
            addCriterion("GENERATION in", values, "generation");
            return (Criteria) this;
        }

        public Criteria andGenerationNotIn(List<BigDecimal> values) {
            addCriterion("GENERATION not in", values, "generation");
            return (Criteria) this;
        }

        public Criteria andGenerationBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GENERATION between", value1, value2, "generation");
            return (Criteria) this;
        }

        public Criteria andGenerationNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GENERATION not between", value1, value2, "generation");
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