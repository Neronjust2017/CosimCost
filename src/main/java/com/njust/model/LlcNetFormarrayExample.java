package com.njust.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LlcNetFormarrayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public LlcNetFormarrayExample() {
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

        public Criteria andSvrtimeIsNull() {
            addCriterion("SvrTime is null");
            return (Criteria) this;
        }

        public Criteria andSvrtimeIsNotNull() {
            addCriterion("SvrTime is not null");
            return (Criteria) this;
        }

        public Criteria andSvrtimeEqualTo(String value) {
            addCriterion("SvrTime =", value, "svrtime");
            return (Criteria) this;
        }

        public Criteria andSvrtimeNotEqualTo(String value) {
            addCriterion("SvrTime <>", value, "svrtime");
            return (Criteria) this;
        }

        public Criteria andSvrtimeGreaterThan(String value) {
            addCriterion("SvrTime >", value, "svrtime");
            return (Criteria) this;
        }

        public Criteria andSvrtimeGreaterThanOrEqualTo(String value) {
            addCriterion("SvrTime >=", value, "svrtime");
            return (Criteria) this;
        }

        public Criteria andSvrtimeLessThan(String value) {
            addCriterion("SvrTime <", value, "svrtime");
            return (Criteria) this;
        }

        public Criteria andSvrtimeLessThanOrEqualTo(String value) {
            addCriterion("SvrTime <=", value, "svrtime");
            return (Criteria) this;
        }

        public Criteria andSvrtimeLike(String value) {
            addCriterion("SvrTime like", value, "svrtime");
            return (Criteria) this;
        }

        public Criteria andSvrtimeNotLike(String value) {
            addCriterion("SvrTime not like", value, "svrtime");
            return (Criteria) this;
        }

        public Criteria andSvrtimeIn(List<String> values) {
            addCriterion("SvrTime in", values, "svrtime");
            return (Criteria) this;
        }

        public Criteria andSvrtimeNotIn(List<String> values) {
            addCriterion("SvrTime not in", values, "svrtime");
            return (Criteria) this;
        }

        public Criteria andSvrtimeBetween(String value1, String value2) {
            addCriterion("SvrTime between", value1, value2, "svrtime");
            return (Criteria) this;
        }

        public Criteria andSvrtimeNotBetween(String value1, String value2) {
            addCriterion("SvrTime not between", value1, value2, "svrtime");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayeroutindexIsNull() {
            addCriterion("FormArray_LayerOutIndex is null");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayeroutindexIsNotNull() {
            addCriterion("FormArray_LayerOutIndex is not null");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayeroutindexEqualTo(BigDecimal value) {
            addCriterion("FormArray_LayerOutIndex =", value, "formarrayLayeroutindex");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayeroutindexNotEqualTo(BigDecimal value) {
            addCriterion("FormArray_LayerOutIndex <>", value, "formarrayLayeroutindex");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayeroutindexGreaterThan(BigDecimal value) {
            addCriterion("FormArray_LayerOutIndex >", value, "formarrayLayeroutindex");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayeroutindexGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FormArray_LayerOutIndex >=", value, "formarrayLayeroutindex");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayeroutindexLessThan(BigDecimal value) {
            addCriterion("FormArray_LayerOutIndex <", value, "formarrayLayeroutindex");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayeroutindexLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FormArray_LayerOutIndex <=", value, "formarrayLayeroutindex");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayeroutindexIn(List<BigDecimal> values) {
            addCriterion("FormArray_LayerOutIndex in", values, "formarrayLayeroutindex");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayeroutindexNotIn(List<BigDecimal> values) {
            addCriterion("FormArray_LayerOutIndex not in", values, "formarrayLayeroutindex");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayeroutindexBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FormArray_LayerOutIndex between", value1, value2, "formarrayLayeroutindex");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayeroutindexNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FormArray_LayerOutIndex not between", value1, value2, "formarrayLayeroutindex");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayernodeindexIsNull() {
            addCriterion("FormArray_LayerNodeIndex is null");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayernodeindexIsNotNull() {
            addCriterion("FormArray_LayerNodeIndex is not null");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayernodeindexEqualTo(BigDecimal value) {
            addCriterion("FormArray_LayerNodeIndex =", value, "formarrayLayernodeindex");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayernodeindexNotEqualTo(BigDecimal value) {
            addCriterion("FormArray_LayerNodeIndex <>", value, "formarrayLayernodeindex");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayernodeindexGreaterThan(BigDecimal value) {
            addCriterion("FormArray_LayerNodeIndex >", value, "formarrayLayernodeindex");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayernodeindexGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FormArray_LayerNodeIndex >=", value, "formarrayLayernodeindex");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayernodeindexLessThan(BigDecimal value) {
            addCriterion("FormArray_LayerNodeIndex <", value, "formarrayLayernodeindex");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayernodeindexLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FormArray_LayerNodeIndex <=", value, "formarrayLayernodeindex");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayernodeindexIn(List<BigDecimal> values) {
            addCriterion("FormArray_LayerNodeIndex in", values, "formarrayLayernodeindex");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayernodeindexNotIn(List<BigDecimal> values) {
            addCriterion("FormArray_LayerNodeIndex not in", values, "formarrayLayernodeindex");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayernodeindexBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FormArray_LayerNodeIndex between", value1, value2, "formarrayLayernodeindex");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayernodeindexNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FormArray_LayerNodeIndex not between", value1, value2, "formarrayLayernodeindex");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayernodevalueIsNull() {
            addCriterion("FormArray_LayerNodeValue is null");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayernodevalueIsNotNull() {
            addCriterion("FormArray_LayerNodeValue is not null");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayernodevalueEqualTo(BigDecimal value) {
            addCriterion("FormArray_LayerNodeValue =", value, "formarrayLayernodevalue");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayernodevalueNotEqualTo(BigDecimal value) {
            addCriterion("FormArray_LayerNodeValue <>", value, "formarrayLayernodevalue");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayernodevalueGreaterThan(BigDecimal value) {
            addCriterion("FormArray_LayerNodeValue >", value, "formarrayLayernodevalue");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayernodevalueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FormArray_LayerNodeValue >=", value, "formarrayLayernodevalue");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayernodevalueLessThan(BigDecimal value) {
            addCriterion("FormArray_LayerNodeValue <", value, "formarrayLayernodevalue");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayernodevalueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FormArray_LayerNodeValue <=", value, "formarrayLayernodevalue");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayernodevalueIn(List<BigDecimal> values) {
            addCriterion("FormArray_LayerNodeValue in", values, "formarrayLayernodevalue");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayernodevalueNotIn(List<BigDecimal> values) {
            addCriterion("FormArray_LayerNodeValue not in", values, "formarrayLayernodevalue");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayernodevalueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FormArray_LayerNodeValue between", value1, value2, "formarrayLayernodevalue");
            return (Criteria) this;
        }

        public Criteria andFormarrayLayernodevalueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FormArray_LayerNodeValue not between", value1, value2, "formarrayLayernodevalue");
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