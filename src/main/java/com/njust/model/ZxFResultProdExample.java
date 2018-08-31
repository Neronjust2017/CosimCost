package com.njust.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ZxFResultProdExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ZxFResultProdExample() {
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

        public Criteria andVsIdIsNull() {
            addCriterion("VS_ID is null");
            return (Criteria) this;
        }

        public Criteria andVsIdIsNotNull() {
            addCriterion("VS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVsIdEqualTo(BigDecimal value) {
            addCriterion("VS_ID =", value, "vsId");
            return (Criteria) this;
        }

        public Criteria andVsIdNotEqualTo(BigDecimal value) {
            addCriterion("VS_ID <>", value, "vsId");
            return (Criteria) this;
        }

        public Criteria andVsIdGreaterThan(BigDecimal value) {
            addCriterion("VS_ID >", value, "vsId");
            return (Criteria) this;
        }

        public Criteria andVsIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VS_ID >=", value, "vsId");
            return (Criteria) this;
        }

        public Criteria andVsIdLessThan(BigDecimal value) {
            addCriterion("VS_ID <", value, "vsId");
            return (Criteria) this;
        }

        public Criteria andVsIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VS_ID <=", value, "vsId");
            return (Criteria) this;
        }

        public Criteria andVsIdIn(List<BigDecimal> values) {
            addCriterion("VS_ID in", values, "vsId");
            return (Criteria) this;
        }

        public Criteria andVsIdNotIn(List<BigDecimal> values) {
            addCriterion("VS_ID not in", values, "vsId");
            return (Criteria) this;
        }

        public Criteria andVsIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VS_ID between", value1, value2, "vsId");
            return (Criteria) this;
        }

        public Criteria andVsIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VS_ID not between", value1, value2, "vsId");
            return (Criteria) this;
        }

        public Criteria andStaIdIsNull() {
            addCriterion("STA_ID is null");
            return (Criteria) this;
        }

        public Criteria andStaIdIsNotNull() {
            addCriterion("STA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStaIdEqualTo(BigDecimal value) {
            addCriterion("STA_ID =", value, "staId");
            return (Criteria) this;
        }

        public Criteria andStaIdNotEqualTo(BigDecimal value) {
            addCriterion("STA_ID <>", value, "staId");
            return (Criteria) this;
        }

        public Criteria andStaIdGreaterThan(BigDecimal value) {
            addCriterion("STA_ID >", value, "staId");
            return (Criteria) this;
        }

        public Criteria andStaIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("STA_ID >=", value, "staId");
            return (Criteria) this;
        }

        public Criteria andStaIdLessThan(BigDecimal value) {
            addCriterion("STA_ID <", value, "staId");
            return (Criteria) this;
        }

        public Criteria andStaIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("STA_ID <=", value, "staId");
            return (Criteria) this;
        }

        public Criteria andStaIdIn(List<BigDecimal> values) {
            addCriterion("STA_ID in", values, "staId");
            return (Criteria) this;
        }

        public Criteria andStaIdNotIn(List<BigDecimal> values) {
            addCriterion("STA_ID not in", values, "staId");
            return (Criteria) this;
        }

        public Criteria andStaIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STA_ID between", value1, value2, "staId");
            return (Criteria) this;
        }

        public Criteria andStaIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STA_ID not between", value1, value2, "staId");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNull() {
            addCriterion("ITEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("ITEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(BigDecimal value) {
            addCriterion("ITEM_ID =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(BigDecimal value) {
            addCriterion("ITEM_ID <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(BigDecimal value) {
            addCriterion("ITEM_ID >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ITEM_ID >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(BigDecimal value) {
            addCriterion("ITEM_ID <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ITEM_ID <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<BigDecimal> values) {
            addCriterion("ITEM_ID in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<BigDecimal> values) {
            addCriterion("ITEM_ID not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ITEM_ID between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ITEM_ID not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andPerfectnessRatioIsNull() {
            addCriterion("PERFECTNESS_RATIO is null");
            return (Criteria) this;
        }

        public Criteria andPerfectnessRatioIsNotNull() {
            addCriterion("PERFECTNESS_RATIO is not null");
            return (Criteria) this;
        }

        public Criteria andPerfectnessRatioEqualTo(BigDecimal value) {
            addCriterion("PERFECTNESS_RATIO =", value, "perfectnessRatio");
            return (Criteria) this;
        }

        public Criteria andPerfectnessRatioNotEqualTo(BigDecimal value) {
            addCriterion("PERFECTNESS_RATIO <>", value, "perfectnessRatio");
            return (Criteria) this;
        }

        public Criteria andPerfectnessRatioGreaterThan(BigDecimal value) {
            addCriterion("PERFECTNESS_RATIO >", value, "perfectnessRatio");
            return (Criteria) this;
        }

        public Criteria andPerfectnessRatioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PERFECTNESS_RATIO >=", value, "perfectnessRatio");
            return (Criteria) this;
        }

        public Criteria andPerfectnessRatioLessThan(BigDecimal value) {
            addCriterion("PERFECTNESS_RATIO <", value, "perfectnessRatio");
            return (Criteria) this;
        }

        public Criteria andPerfectnessRatioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PERFECTNESS_RATIO <=", value, "perfectnessRatio");
            return (Criteria) this;
        }

        public Criteria andPerfectnessRatioIn(List<BigDecimal> values) {
            addCriterion("PERFECTNESS_RATIO in", values, "perfectnessRatio");
            return (Criteria) this;
        }

        public Criteria andPerfectnessRatioNotIn(List<BigDecimal> values) {
            addCriterion("PERFECTNESS_RATIO not in", values, "perfectnessRatio");
            return (Criteria) this;
        }

        public Criteria andPerfectnessRatioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PERFECTNESS_RATIO between", value1, value2, "perfectnessRatio");
            return (Criteria) this;
        }

        public Criteria andPerfectnessRatioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PERFECTNESS_RATIO not between", value1, value2, "perfectnessRatio");
            return (Criteria) this;
        }

        public Criteria andOrgProdNumIsNull() {
            addCriterion("ORG_PROD_NUM is null");
            return (Criteria) this;
        }

        public Criteria andOrgProdNumIsNotNull() {
            addCriterion("ORG_PROD_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andOrgProdNumEqualTo(Long value) {
            addCriterion("ORG_PROD_NUM =", value, "orgProdNum");
            return (Criteria) this;
        }

        public Criteria andOrgProdNumNotEqualTo(Long value) {
            addCriterion("ORG_PROD_NUM <>", value, "orgProdNum");
            return (Criteria) this;
        }

        public Criteria andOrgProdNumGreaterThan(Long value) {
            addCriterion("ORG_PROD_NUM >", value, "orgProdNum");
            return (Criteria) this;
        }

        public Criteria andOrgProdNumGreaterThanOrEqualTo(Long value) {
            addCriterion("ORG_PROD_NUM >=", value, "orgProdNum");
            return (Criteria) this;
        }

        public Criteria andOrgProdNumLessThan(Long value) {
            addCriterion("ORG_PROD_NUM <", value, "orgProdNum");
            return (Criteria) this;
        }

        public Criteria andOrgProdNumLessThanOrEqualTo(Long value) {
            addCriterion("ORG_PROD_NUM <=", value, "orgProdNum");
            return (Criteria) this;
        }

        public Criteria andOrgProdNumIn(List<Long> values) {
            addCriterion("ORG_PROD_NUM in", values, "orgProdNum");
            return (Criteria) this;
        }

        public Criteria andOrgProdNumNotIn(List<Long> values) {
            addCriterion("ORG_PROD_NUM not in", values, "orgProdNum");
            return (Criteria) this;
        }

        public Criteria andOrgProdNumBetween(Long value1, Long value2) {
            addCriterion("ORG_PROD_NUM between", value1, value2, "orgProdNum");
            return (Criteria) this;
        }

        public Criteria andOrgProdNumNotBetween(Long value1, Long value2) {
            addCriterion("ORG_PROD_NUM not between", value1, value2, "orgProdNum");
            return (Criteria) this;
        }

        public Criteria andRemainProdNumIsNull() {
            addCriterion("REMAIN_PROD_NUM is null");
            return (Criteria) this;
        }

        public Criteria andRemainProdNumIsNotNull() {
            addCriterion("REMAIN_PROD_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andRemainProdNumEqualTo(Long value) {
            addCriterion("REMAIN_PROD_NUM =", value, "remainProdNum");
            return (Criteria) this;
        }

        public Criteria andRemainProdNumNotEqualTo(Long value) {
            addCriterion("REMAIN_PROD_NUM <>", value, "remainProdNum");
            return (Criteria) this;
        }

        public Criteria andRemainProdNumGreaterThan(Long value) {
            addCriterion("REMAIN_PROD_NUM >", value, "remainProdNum");
            return (Criteria) this;
        }

        public Criteria andRemainProdNumGreaterThanOrEqualTo(Long value) {
            addCriterion("REMAIN_PROD_NUM >=", value, "remainProdNum");
            return (Criteria) this;
        }

        public Criteria andRemainProdNumLessThan(Long value) {
            addCriterion("REMAIN_PROD_NUM <", value, "remainProdNum");
            return (Criteria) this;
        }

        public Criteria andRemainProdNumLessThanOrEqualTo(Long value) {
            addCriterion("REMAIN_PROD_NUM <=", value, "remainProdNum");
            return (Criteria) this;
        }

        public Criteria andRemainProdNumIn(List<Long> values) {
            addCriterion("REMAIN_PROD_NUM in", values, "remainProdNum");
            return (Criteria) this;
        }

        public Criteria andRemainProdNumNotIn(List<Long> values) {
            addCriterion("REMAIN_PROD_NUM not in", values, "remainProdNum");
            return (Criteria) this;
        }

        public Criteria andRemainProdNumBetween(Long value1, Long value2) {
            addCriterion("REMAIN_PROD_NUM between", value1, value2, "remainProdNum");
            return (Criteria) this;
        }

        public Criteria andRemainProdNumNotBetween(Long value1, Long value2) {
            addCriterion("REMAIN_PROD_NUM not between", value1, value2, "remainProdNum");
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