package com.njust.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ZxProdExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ZxProdExample() {
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

        public Criteria andProdIdIsNull() {
            addCriterion("PROD_ID is null");
            return (Criteria) this;
        }

        public Criteria andProdIdIsNotNull() {
            addCriterion("PROD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProdIdEqualTo(BigDecimal value) {
            addCriterion("PROD_ID =", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdNotEqualTo(BigDecimal value) {
            addCriterion("PROD_ID <>", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdGreaterThan(BigDecimal value) {
            addCriterion("PROD_ID >", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PROD_ID >=", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdLessThan(BigDecimal value) {
            addCriterion("PROD_ID <", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PROD_ID <=", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdIn(List<BigDecimal> values) {
            addCriterion("PROD_ID in", values, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdNotIn(List<BigDecimal> values) {
            addCriterion("PROD_ID not in", values, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROD_ID between", value1, value2, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROD_ID not between", value1, value2, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdOrderIsNull() {
            addCriterion("PROD_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andProdOrderIsNotNull() {
            addCriterion("PROD_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andProdOrderEqualTo(String value) {
            addCriterion("PROD_ORDER =", value, "prodOrder");
            return (Criteria) this;
        }

        public Criteria andProdOrderNotEqualTo(String value) {
            addCriterion("PROD_ORDER <>", value, "prodOrder");
            return (Criteria) this;
        }

        public Criteria andProdOrderGreaterThan(String value) {
            addCriterion("PROD_ORDER >", value, "prodOrder");
            return (Criteria) this;
        }

        public Criteria andProdOrderGreaterThanOrEqualTo(String value) {
            addCriterion("PROD_ORDER >=", value, "prodOrder");
            return (Criteria) this;
        }

        public Criteria andProdOrderLessThan(String value) {
            addCriterion("PROD_ORDER <", value, "prodOrder");
            return (Criteria) this;
        }

        public Criteria andProdOrderLessThanOrEqualTo(String value) {
            addCriterion("PROD_ORDER <=", value, "prodOrder");
            return (Criteria) this;
        }

        public Criteria andProdOrderLike(String value) {
            addCriterion("PROD_ORDER like", value, "prodOrder");
            return (Criteria) this;
        }

        public Criteria andProdOrderNotLike(String value) {
            addCriterion("PROD_ORDER not like", value, "prodOrder");
            return (Criteria) this;
        }

        public Criteria andProdOrderIn(List<String> values) {
            addCriterion("PROD_ORDER in", values, "prodOrder");
            return (Criteria) this;
        }

        public Criteria andProdOrderNotIn(List<String> values) {
            addCriterion("PROD_ORDER not in", values, "prodOrder");
            return (Criteria) this;
        }

        public Criteria andProdOrderBetween(String value1, String value2) {
            addCriterion("PROD_ORDER between", value1, value2, "prodOrder");
            return (Criteria) this;
        }

        public Criteria andProdOrderNotBetween(String value1, String value2) {
            addCriterion("PROD_ORDER not between", value1, value2, "prodOrder");
            return (Criteria) this;
        }

        public Criteria andProdNameIsNull() {
            addCriterion("PROD_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProdNameIsNotNull() {
            addCriterion("PROD_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProdNameEqualTo(String value) {
            addCriterion("PROD_NAME =", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameNotEqualTo(String value) {
            addCriterion("PROD_NAME <>", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameGreaterThan(String value) {
            addCriterion("PROD_NAME >", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameGreaterThanOrEqualTo(String value) {
            addCriterion("PROD_NAME >=", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameLessThan(String value) {
            addCriterion("PROD_NAME <", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameLessThanOrEqualTo(String value) {
            addCriterion("PROD_NAME <=", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameLike(String value) {
            addCriterion("PROD_NAME like", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameNotLike(String value) {
            addCriterion("PROD_NAME not like", value, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameIn(List<String> values) {
            addCriterion("PROD_NAME in", values, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameNotIn(List<String> values) {
            addCriterion("PROD_NAME not in", values, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameBetween(String value1, String value2) {
            addCriterion("PROD_NAME between", value1, value2, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdNameNotBetween(String value1, String value2) {
            addCriterion("PROD_NAME not between", value1, value2, "prodName");
            return (Criteria) this;
        }

        public Criteria andProdCostIsNull() {
            addCriterion("PROD_COST is null");
            return (Criteria) this;
        }

        public Criteria andProdCostIsNotNull() {
            addCriterion("PROD_COST is not null");
            return (Criteria) this;
        }

        public Criteria andProdCostEqualTo(BigDecimal value) {
            addCriterion("PROD_COST =", value, "prodCost");
            return (Criteria) this;
        }

        public Criteria andProdCostNotEqualTo(BigDecimal value) {
            addCriterion("PROD_COST <>", value, "prodCost");
            return (Criteria) this;
        }

        public Criteria andProdCostGreaterThan(BigDecimal value) {
            addCriterion("PROD_COST >", value, "prodCost");
            return (Criteria) this;
        }

        public Criteria andProdCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PROD_COST >=", value, "prodCost");
            return (Criteria) this;
        }

        public Criteria andProdCostLessThan(BigDecimal value) {
            addCriterion("PROD_COST <", value, "prodCost");
            return (Criteria) this;
        }

        public Criteria andProdCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PROD_COST <=", value, "prodCost");
            return (Criteria) this;
        }

        public Criteria andProdCostIn(List<BigDecimal> values) {
            addCriterion("PROD_COST in", values, "prodCost");
            return (Criteria) this;
        }

        public Criteria andProdCostNotIn(List<BigDecimal> values) {
            addCriterion("PROD_COST not in", values, "prodCost");
            return (Criteria) this;
        }

        public Criteria andProdCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROD_COST between", value1, value2, "prodCost");
            return (Criteria) this;
        }

        public Criteria andProdCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROD_COST not between", value1, value2, "prodCost");
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