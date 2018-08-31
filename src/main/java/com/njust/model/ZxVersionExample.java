package com.njust.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ZxVersionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ZxVersionExample() {
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

        public Criteria andVsNbIsNull() {
            addCriterion("VS_NB is null");
            return (Criteria) this;
        }

        public Criteria andVsNbIsNotNull() {
            addCriterion("VS_NB is not null");
            return (Criteria) this;
        }

        public Criteria andVsNbEqualTo(BigDecimal value) {
            addCriterion("VS_NB =", value, "vsNb");
            return (Criteria) this;
        }

        public Criteria andVsNbNotEqualTo(BigDecimal value) {
            addCriterion("VS_NB <>", value, "vsNb");
            return (Criteria) this;
        }

        public Criteria andVsNbGreaterThan(BigDecimal value) {
            addCriterion("VS_NB >", value, "vsNb");
            return (Criteria) this;
        }

        public Criteria andVsNbGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VS_NB >=", value, "vsNb");
            return (Criteria) this;
        }

        public Criteria andVsNbLessThan(BigDecimal value) {
            addCriterion("VS_NB <", value, "vsNb");
            return (Criteria) this;
        }

        public Criteria andVsNbLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VS_NB <=", value, "vsNb");
            return (Criteria) this;
        }

        public Criteria andVsNbIn(List<BigDecimal> values) {
            addCriterion("VS_NB in", values, "vsNb");
            return (Criteria) this;
        }

        public Criteria andVsNbNotIn(List<BigDecimal> values) {
            addCriterion("VS_NB not in", values, "vsNb");
            return (Criteria) this;
        }

        public Criteria andVsNbBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VS_NB between", value1, value2, "vsNb");
            return (Criteria) this;
        }

        public Criteria andVsNbNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VS_NB not between", value1, value2, "vsNb");
            return (Criteria) this;
        }

        public Criteria andVsNameIsNull() {
            addCriterion("VS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andVsNameIsNotNull() {
            addCriterion("VS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andVsNameEqualTo(String value) {
            addCriterion("VS_NAME =", value, "vsName");
            return (Criteria) this;
        }

        public Criteria andVsNameNotEqualTo(String value) {
            addCriterion("VS_NAME <>", value, "vsName");
            return (Criteria) this;
        }

        public Criteria andVsNameGreaterThan(String value) {
            addCriterion("VS_NAME >", value, "vsName");
            return (Criteria) this;
        }

        public Criteria andVsNameGreaterThanOrEqualTo(String value) {
            addCriterion("VS_NAME >=", value, "vsName");
            return (Criteria) this;
        }

        public Criteria andVsNameLessThan(String value) {
            addCriterion("VS_NAME <", value, "vsName");
            return (Criteria) this;
        }

        public Criteria andVsNameLessThanOrEqualTo(String value) {
            addCriterion("VS_NAME <=", value, "vsName");
            return (Criteria) this;
        }

        public Criteria andVsNameLike(String value) {
            addCriterion("VS_NAME like", value, "vsName");
            return (Criteria) this;
        }

        public Criteria andVsNameNotLike(String value) {
            addCriterion("VS_NAME not like", value, "vsName");
            return (Criteria) this;
        }

        public Criteria andVsNameIn(List<String> values) {
            addCriterion("VS_NAME in", values, "vsName");
            return (Criteria) this;
        }

        public Criteria andVsNameNotIn(List<String> values) {
            addCriterion("VS_NAME not in", values, "vsName");
            return (Criteria) this;
        }

        public Criteria andVsNameBetween(String value1, String value2) {
            addCriterion("VS_NAME between", value1, value2, "vsName");
            return (Criteria) this;
        }

        public Criteria andVsNameNotBetween(String value1, String value2) {
            addCriterion("VS_NAME not between", value1, value2, "vsName");
            return (Criteria) this;
        }

        public Criteria andVsCtimeIsNull() {
            addCriterion("VS_CTIME is null");
            return (Criteria) this;
        }

        public Criteria andVsCtimeIsNotNull() {
            addCriterion("VS_CTIME is not null");
            return (Criteria) this;
        }

        public Criteria andVsCtimeEqualTo(String value) {
            addCriterion("VS_CTIME =", value, "vsCtime");
            return (Criteria) this;
        }

        public Criteria andVsCtimeNotEqualTo(String value) {
            addCriterion("VS_CTIME <>", value, "vsCtime");
            return (Criteria) this;
        }

        public Criteria andVsCtimeGreaterThan(String value) {
            addCriterion("VS_CTIME >", value, "vsCtime");
            return (Criteria) this;
        }

        public Criteria andVsCtimeGreaterThanOrEqualTo(String value) {
            addCriterion("VS_CTIME >=", value, "vsCtime");
            return (Criteria) this;
        }

        public Criteria andVsCtimeLessThan(String value) {
            addCriterion("VS_CTIME <", value, "vsCtime");
            return (Criteria) this;
        }

        public Criteria andVsCtimeLessThanOrEqualTo(String value) {
            addCriterion("VS_CTIME <=", value, "vsCtime");
            return (Criteria) this;
        }

        public Criteria andVsCtimeLike(String value) {
            addCriterion("VS_CTIME like", value, "vsCtime");
            return (Criteria) this;
        }

        public Criteria andVsCtimeNotLike(String value) {
            addCriterion("VS_CTIME not like", value, "vsCtime");
            return (Criteria) this;
        }

        public Criteria andVsCtimeIn(List<String> values) {
            addCriterion("VS_CTIME in", values, "vsCtime");
            return (Criteria) this;
        }

        public Criteria andVsCtimeNotIn(List<String> values) {
            addCriterion("VS_CTIME not in", values, "vsCtime");
            return (Criteria) this;
        }

        public Criteria andVsCtimeBetween(String value1, String value2) {
            addCriterion("VS_CTIME between", value1, value2, "vsCtime");
            return (Criteria) this;
        }

        public Criteria andVsCtimeNotBetween(String value1, String value2) {
            addCriterion("VS_CTIME not between", value1, value2, "vsCtime");
            return (Criteria) this;
        }

        public Criteria andVsTimeIsNull() {
            addCriterion("VS_TIME is null");
            return (Criteria) this;
        }

        public Criteria andVsTimeIsNotNull() {
            addCriterion("VS_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andVsTimeEqualTo(BigDecimal value) {
            addCriterion("VS_TIME =", value, "vsTime");
            return (Criteria) this;
        }

        public Criteria andVsTimeNotEqualTo(BigDecimal value) {
            addCriterion("VS_TIME <>", value, "vsTime");
            return (Criteria) this;
        }

        public Criteria andVsTimeGreaterThan(BigDecimal value) {
            addCriterion("VS_TIME >", value, "vsTime");
            return (Criteria) this;
        }

        public Criteria andVsTimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VS_TIME >=", value, "vsTime");
            return (Criteria) this;
        }

        public Criteria andVsTimeLessThan(BigDecimal value) {
            addCriterion("VS_TIME <", value, "vsTime");
            return (Criteria) this;
        }

        public Criteria andVsTimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VS_TIME <=", value, "vsTime");
            return (Criteria) this;
        }

        public Criteria andVsTimeIn(List<BigDecimal> values) {
            addCriterion("VS_TIME in", values, "vsTime");
            return (Criteria) this;
        }

        public Criteria andVsTimeNotIn(List<BigDecimal> values) {
            addCriterion("VS_TIME not in", values, "vsTime");
            return (Criteria) this;
        }

        public Criteria andVsTimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VS_TIME between", value1, value2, "vsTime");
            return (Criteria) this;
        }

        public Criteria andVsTimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VS_TIME not between", value1, value2, "vsTime");
            return (Criteria) this;
        }

        public Criteria andVsSimcountIsNull() {
            addCriterion("VS_SIMCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andVsSimcountIsNotNull() {
            addCriterion("VS_SIMCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andVsSimcountEqualTo(BigDecimal value) {
            addCriterion("VS_SIMCOUNT =", value, "vsSimcount");
            return (Criteria) this;
        }

        public Criteria andVsSimcountNotEqualTo(BigDecimal value) {
            addCriterion("VS_SIMCOUNT <>", value, "vsSimcount");
            return (Criteria) this;
        }

        public Criteria andVsSimcountGreaterThan(BigDecimal value) {
            addCriterion("VS_SIMCOUNT >", value, "vsSimcount");
            return (Criteria) this;
        }

        public Criteria andVsSimcountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VS_SIMCOUNT >=", value, "vsSimcount");
            return (Criteria) this;
        }

        public Criteria andVsSimcountLessThan(BigDecimal value) {
            addCriterion("VS_SIMCOUNT <", value, "vsSimcount");
            return (Criteria) this;
        }

        public Criteria andVsSimcountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VS_SIMCOUNT <=", value, "vsSimcount");
            return (Criteria) this;
        }

        public Criteria andVsSimcountIn(List<BigDecimal> values) {
            addCriterion("VS_SIMCOUNT in", values, "vsSimcount");
            return (Criteria) this;
        }

        public Criteria andVsSimcountNotIn(List<BigDecimal> values) {
            addCriterion("VS_SIMCOUNT not in", values, "vsSimcount");
            return (Criteria) this;
        }

        public Criteria andVsSimcountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VS_SIMCOUNT between", value1, value2, "vsSimcount");
            return (Criteria) this;
        }

        public Criteria andVsSimcountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VS_SIMCOUNT not between", value1, value2, "vsSimcount");
            return (Criteria) this;
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

        public Criteria andVsStepIsNull() {
            addCriterion("VS_STEP is null");
            return (Criteria) this;
        }

        public Criteria andVsStepIsNotNull() {
            addCriterion("VS_STEP is not null");
            return (Criteria) this;
        }

        public Criteria andVsStepEqualTo(BigDecimal value) {
            addCriterion("VS_STEP =", value, "vsStep");
            return (Criteria) this;
        }

        public Criteria andVsStepNotEqualTo(BigDecimal value) {
            addCriterion("VS_STEP <>", value, "vsStep");
            return (Criteria) this;
        }

        public Criteria andVsStepGreaterThan(BigDecimal value) {
            addCriterion("VS_STEP >", value, "vsStep");
            return (Criteria) this;
        }

        public Criteria andVsStepGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VS_STEP >=", value, "vsStep");
            return (Criteria) this;
        }

        public Criteria andVsStepLessThan(BigDecimal value) {
            addCriterion("VS_STEP <", value, "vsStep");
            return (Criteria) this;
        }

        public Criteria andVsStepLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VS_STEP <=", value, "vsStep");
            return (Criteria) this;
        }

        public Criteria andVsStepIn(List<BigDecimal> values) {
            addCriterion("VS_STEP in", values, "vsStep");
            return (Criteria) this;
        }

        public Criteria andVsStepNotIn(List<BigDecimal> values) {
            addCriterion("VS_STEP not in", values, "vsStep");
            return (Criteria) this;
        }

        public Criteria andVsStepBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VS_STEP between", value1, value2, "vsStep");
            return (Criteria) this;
        }

        public Criteria andVsStepNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VS_STEP not between", value1, value2, "vsStep");
            return (Criteria) this;
        }

        public Criteria andVsStateIsNull() {
            addCriterion("VS_STATE is null");
            return (Criteria) this;
        }

        public Criteria andVsStateIsNotNull() {
            addCriterion("VS_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andVsStateEqualTo(Short value) {
            addCriterion("VS_STATE =", value, "vsState");
            return (Criteria) this;
        }

        public Criteria andVsStateNotEqualTo(Short value) {
            addCriterion("VS_STATE <>", value, "vsState");
            return (Criteria) this;
        }

        public Criteria andVsStateGreaterThan(Short value) {
            addCriterion("VS_STATE >", value, "vsState");
            return (Criteria) this;
        }

        public Criteria andVsStateGreaterThanOrEqualTo(Short value) {
            addCriterion("VS_STATE >=", value, "vsState");
            return (Criteria) this;
        }

        public Criteria andVsStateLessThan(Short value) {
            addCriterion("VS_STATE <", value, "vsState");
            return (Criteria) this;
        }

        public Criteria andVsStateLessThanOrEqualTo(Short value) {
            addCriterion("VS_STATE <=", value, "vsState");
            return (Criteria) this;
        }

        public Criteria andVsStateIn(List<Short> values) {
            addCriterion("VS_STATE in", values, "vsState");
            return (Criteria) this;
        }

        public Criteria andVsStateNotIn(List<Short> values) {
            addCriterion("VS_STATE not in", values, "vsState");
            return (Criteria) this;
        }

        public Criteria andVsStateBetween(Short value1, Short value2) {
            addCriterion("VS_STATE between", value1, value2, "vsState");
            return (Criteria) this;
        }

        public Criteria andVsStateNotBetween(Short value1, Short value2) {
            addCriterion("VS_STATE not between", value1, value2, "vsState");
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