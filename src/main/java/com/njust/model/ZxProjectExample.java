package com.njust.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ZxProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ZxProjectExample() {
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

        public Criteria andProIdIsNull() {
            addCriterion("PRO_ID is null");
            return (Criteria) this;
        }

        public Criteria andProIdIsNotNull() {
            addCriterion("PRO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProIdEqualTo(BigDecimal value) {
            addCriterion("PRO_ID =", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotEqualTo(BigDecimal value) {
            addCriterion("PRO_ID <>", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThan(BigDecimal value) {
            addCriterion("PRO_ID >", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRO_ID >=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThan(BigDecimal value) {
            addCriterion("PRO_ID <", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRO_ID <=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdIn(List<BigDecimal> values) {
            addCriterion("PRO_ID in", values, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotIn(List<BigDecimal> values) {
            addCriterion("PRO_ID not in", values, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRO_ID between", value1, value2, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRO_ID not between", value1, value2, "proId");
            return (Criteria) this;
        }

        public Criteria andProNameIsNull() {
            addCriterion("PRO_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProNameIsNotNull() {
            addCriterion("PRO_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProNameEqualTo(String value) {
            addCriterion("PRO_NAME =", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotEqualTo(String value) {
            addCriterion("PRO_NAME <>", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameGreaterThan(String value) {
            addCriterion("PRO_NAME >", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameGreaterThanOrEqualTo(String value) {
            addCriterion("PRO_NAME >=", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLessThan(String value) {
            addCriterion("PRO_NAME <", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLessThanOrEqualTo(String value) {
            addCriterion("PRO_NAME <=", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLike(String value) {
            addCriterion("PRO_NAME like", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotLike(String value) {
            addCriterion("PRO_NAME not like", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameIn(List<String> values) {
            addCriterion("PRO_NAME in", values, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotIn(List<String> values) {
            addCriterion("PRO_NAME not in", values, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameBetween(String value1, String value2) {
            addCriterion("PRO_NAME between", value1, value2, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotBetween(String value1, String value2) {
            addCriterion("PRO_NAME not between", value1, value2, "proName");
            return (Criteria) this;
        }

        public Criteria andProCtimeIsNull() {
            addCriterion("PRO_CTIME is null");
            return (Criteria) this;
        }

        public Criteria andProCtimeIsNotNull() {
            addCriterion("PRO_CTIME is not null");
            return (Criteria) this;
        }

        public Criteria andProCtimeEqualTo(String value) {
            addCriterion("PRO_CTIME =", value, "proCtime");
            return (Criteria) this;
        }

        public Criteria andProCtimeNotEqualTo(String value) {
            addCriterion("PRO_CTIME <>", value, "proCtime");
            return (Criteria) this;
        }

        public Criteria andProCtimeGreaterThan(String value) {
            addCriterion("PRO_CTIME >", value, "proCtime");
            return (Criteria) this;
        }

        public Criteria andProCtimeGreaterThanOrEqualTo(String value) {
            addCriterion("PRO_CTIME >=", value, "proCtime");
            return (Criteria) this;
        }

        public Criteria andProCtimeLessThan(String value) {
            addCriterion("PRO_CTIME <", value, "proCtime");
            return (Criteria) this;
        }

        public Criteria andProCtimeLessThanOrEqualTo(String value) {
            addCriterion("PRO_CTIME <=", value, "proCtime");
            return (Criteria) this;
        }

        public Criteria andProCtimeLike(String value) {
            addCriterion("PRO_CTIME like", value, "proCtime");
            return (Criteria) this;
        }

        public Criteria andProCtimeNotLike(String value) {
            addCriterion("PRO_CTIME not like", value, "proCtime");
            return (Criteria) this;
        }

        public Criteria andProCtimeIn(List<String> values) {
            addCriterion("PRO_CTIME in", values, "proCtime");
            return (Criteria) this;
        }

        public Criteria andProCtimeNotIn(List<String> values) {
            addCriterion("PRO_CTIME not in", values, "proCtime");
            return (Criteria) this;
        }

        public Criteria andProCtimeBetween(String value1, String value2) {
            addCriterion("PRO_CTIME between", value1, value2, "proCtime");
            return (Criteria) this;
        }

        public Criteria andProCtimeNotBetween(String value1, String value2) {
            addCriterion("PRO_CTIME not between", value1, value2, "proCtime");
            return (Criteria) this;
        }

        public Criteria andProRemarkIsNull() {
            addCriterion("PRO_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andProRemarkIsNotNull() {
            addCriterion("PRO_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andProRemarkEqualTo(String value) {
            addCriterion("PRO_REMARK =", value, "proRemark");
            return (Criteria) this;
        }

        public Criteria andProRemarkNotEqualTo(String value) {
            addCriterion("PRO_REMARK <>", value, "proRemark");
            return (Criteria) this;
        }

        public Criteria andProRemarkGreaterThan(String value) {
            addCriterion("PRO_REMARK >", value, "proRemark");
            return (Criteria) this;
        }

        public Criteria andProRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("PRO_REMARK >=", value, "proRemark");
            return (Criteria) this;
        }

        public Criteria andProRemarkLessThan(String value) {
            addCriterion("PRO_REMARK <", value, "proRemark");
            return (Criteria) this;
        }

        public Criteria andProRemarkLessThanOrEqualTo(String value) {
            addCriterion("PRO_REMARK <=", value, "proRemark");
            return (Criteria) this;
        }

        public Criteria andProRemarkLike(String value) {
            addCriterion("PRO_REMARK like", value, "proRemark");
            return (Criteria) this;
        }

        public Criteria andProRemarkNotLike(String value) {
            addCriterion("PRO_REMARK not like", value, "proRemark");
            return (Criteria) this;
        }

        public Criteria andProRemarkIn(List<String> values) {
            addCriterion("PRO_REMARK in", values, "proRemark");
            return (Criteria) this;
        }

        public Criteria andProRemarkNotIn(List<String> values) {
            addCriterion("PRO_REMARK not in", values, "proRemark");
            return (Criteria) this;
        }

        public Criteria andProRemarkBetween(String value1, String value2) {
            addCriterion("PRO_REMARK between", value1, value2, "proRemark");
            return (Criteria) this;
        }

        public Criteria andProRemarkNotBetween(String value1, String value2) {
            addCriterion("PRO_REMARK not between", value1, value2, "proRemark");
            return (Criteria) this;
        }

        public Criteria andProStateIsNull() {
            addCriterion("PRO_STATE is null");
            return (Criteria) this;
        }

        public Criteria andProStateIsNotNull() {
            addCriterion("PRO_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andProStateEqualTo(Short value) {
            addCriterion("PRO_STATE =", value, "proState");
            return (Criteria) this;
        }

        public Criteria andProStateNotEqualTo(Short value) {
            addCriterion("PRO_STATE <>", value, "proState");
            return (Criteria) this;
        }

        public Criteria andProStateGreaterThan(Short value) {
            addCriterion("PRO_STATE >", value, "proState");
            return (Criteria) this;
        }

        public Criteria andProStateGreaterThanOrEqualTo(Short value) {
            addCriterion("PRO_STATE >=", value, "proState");
            return (Criteria) this;
        }

        public Criteria andProStateLessThan(Short value) {
            addCriterion("PRO_STATE <", value, "proState");
            return (Criteria) this;
        }

        public Criteria andProStateLessThanOrEqualTo(Short value) {
            addCriterion("PRO_STATE <=", value, "proState");
            return (Criteria) this;
        }

        public Criteria andProStateIn(List<Short> values) {
            addCriterion("PRO_STATE in", values, "proState");
            return (Criteria) this;
        }

        public Criteria andProStateNotIn(List<Short> values) {
            addCriterion("PRO_STATE not in", values, "proState");
            return (Criteria) this;
        }

        public Criteria andProStateBetween(Short value1, Short value2) {
            addCriterion("PRO_STATE between", value1, value2, "proState");
            return (Criteria) this;
        }

        public Criteria andProStateNotBetween(Short value1, Short value2) {
            addCriterion("PRO_STATE not between", value1, value2, "proState");
            return (Criteria) this;
        }

        public Criteria andProSimulatedIsNull() {
            addCriterion("PRO_SIMULATED is null");
            return (Criteria) this;
        }

        public Criteria andProSimulatedIsNotNull() {
            addCriterion("PRO_SIMULATED is not null");
            return (Criteria) this;
        }

        public Criteria andProSimulatedEqualTo(Short value) {
            addCriterion("PRO_SIMULATED =", value, "proSimulated");
            return (Criteria) this;
        }

        public Criteria andProSimulatedNotEqualTo(Short value) {
            addCriterion("PRO_SIMULATED <>", value, "proSimulated");
            return (Criteria) this;
        }

        public Criteria andProSimulatedGreaterThan(Short value) {
            addCriterion("PRO_SIMULATED >", value, "proSimulated");
            return (Criteria) this;
        }

        public Criteria andProSimulatedGreaterThanOrEqualTo(Short value) {
            addCriterion("PRO_SIMULATED >=", value, "proSimulated");
            return (Criteria) this;
        }

        public Criteria andProSimulatedLessThan(Short value) {
            addCriterion("PRO_SIMULATED <", value, "proSimulated");
            return (Criteria) this;
        }

        public Criteria andProSimulatedLessThanOrEqualTo(Short value) {
            addCriterion("PRO_SIMULATED <=", value, "proSimulated");
            return (Criteria) this;
        }

        public Criteria andProSimulatedIn(List<Short> values) {
            addCriterion("PRO_SIMULATED in", values, "proSimulated");
            return (Criteria) this;
        }

        public Criteria andProSimulatedNotIn(List<Short> values) {
            addCriterion("PRO_SIMULATED not in", values, "proSimulated");
            return (Criteria) this;
        }

        public Criteria andProSimulatedBetween(Short value1, Short value2) {
            addCriterion("PRO_SIMULATED between", value1, value2, "proSimulated");
            return (Criteria) this;
        }

        public Criteria andProSimulatedNotBetween(Short value1, Short value2) {
            addCriterion("PRO_SIMULATED not between", value1, value2, "proSimulated");
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