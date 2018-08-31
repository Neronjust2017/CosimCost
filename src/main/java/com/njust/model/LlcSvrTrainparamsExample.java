package com.njust.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LlcSvrTrainparamsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public LlcSvrTrainparamsExample() {
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

        public Criteria andSvrTimeIsNull() {
            addCriterion("Svr_Time is null");
            return (Criteria) this;
        }

        public Criteria andSvrTimeIsNotNull() {
            addCriterion("Svr_Time is not null");
            return (Criteria) this;
        }

        public Criteria andSvrTimeEqualTo(String value) {
            addCriterion("Svr_Time =", value, "svrTime");
            return (Criteria) this;
        }

        public Criteria andSvrTimeNotEqualTo(String value) {
            addCriterion("Svr_Time <>", value, "svrTime");
            return (Criteria) this;
        }

        public Criteria andSvrTimeGreaterThan(String value) {
            addCriterion("Svr_Time >", value, "svrTime");
            return (Criteria) this;
        }

        public Criteria andSvrTimeGreaterThanOrEqualTo(String value) {
            addCriterion("Svr_Time >=", value, "svrTime");
            return (Criteria) this;
        }

        public Criteria andSvrTimeLessThan(String value) {
            addCriterion("Svr_Time <", value, "svrTime");
            return (Criteria) this;
        }

        public Criteria andSvrTimeLessThanOrEqualTo(String value) {
            addCriterion("Svr_Time <=", value, "svrTime");
            return (Criteria) this;
        }

        public Criteria andSvrTimeLike(String value) {
            addCriterion("Svr_Time like", value, "svrTime");
            return (Criteria) this;
        }

        public Criteria andSvrTimeNotLike(String value) {
            addCriterion("Svr_Time not like", value, "svrTime");
            return (Criteria) this;
        }

        public Criteria andSvrTimeIn(List<String> values) {
            addCriterion("Svr_Time in", values, "svrTime");
            return (Criteria) this;
        }

        public Criteria andSvrTimeNotIn(List<String> values) {
            addCriterion("Svr_Time not in", values, "svrTime");
            return (Criteria) this;
        }

        public Criteria andSvrTimeBetween(String value1, String value2) {
            addCriterion("Svr_Time between", value1, value2, "svrTime");
            return (Criteria) this;
        }

        public Criteria andSvrTimeNotBetween(String value1, String value2) {
            addCriterion("Svr_Time not between", value1, value2, "svrTime");
            return (Criteria) this;
        }

        public Criteria andSvrLIsNull() {
            addCriterion("Svr_L is null");
            return (Criteria) this;
        }

        public Criteria andSvrLIsNotNull() {
            addCriterion("Svr_L is not null");
            return (Criteria) this;
        }

        public Criteria andSvrLEqualTo(BigDecimal value) {
            addCriterion("Svr_L =", value, "svrL");
            return (Criteria) this;
        }

        public Criteria andSvrLNotEqualTo(BigDecimal value) {
            addCriterion("Svr_L <>", value, "svrL");
            return (Criteria) this;
        }

        public Criteria andSvrLGreaterThan(BigDecimal value) {
            addCriterion("Svr_L >", value, "svrL");
            return (Criteria) this;
        }

        public Criteria andSvrLGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Svr_L >=", value, "svrL");
            return (Criteria) this;
        }

        public Criteria andSvrLLessThan(BigDecimal value) {
            addCriterion("Svr_L <", value, "svrL");
            return (Criteria) this;
        }

        public Criteria andSvrLLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Svr_L <=", value, "svrL");
            return (Criteria) this;
        }

        public Criteria andSvrLIn(List<BigDecimal> values) {
            addCriterion("Svr_L in", values, "svrL");
            return (Criteria) this;
        }

        public Criteria andSvrLNotIn(List<BigDecimal> values) {
            addCriterion("Svr_L not in", values, "svrL");
            return (Criteria) this;
        }

        public Criteria andSvrLBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Svr_L between", value1, value2, "svrL");
            return (Criteria) this;
        }

        public Criteria andSvrLNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Svr_L not between", value1, value2, "svrL");
            return (Criteria) this;
        }

        public Criteria andSvrCIsNull() {
            addCriterion("Svr_C is null");
            return (Criteria) this;
        }

        public Criteria andSvrCIsNotNull() {
            addCriterion("Svr_C is not null");
            return (Criteria) this;
        }

        public Criteria andSvrCEqualTo(BigDecimal value) {
            addCriterion("Svr_C =", value, "svrC");
            return (Criteria) this;
        }

        public Criteria andSvrCNotEqualTo(BigDecimal value) {
            addCriterion("Svr_C <>", value, "svrC");
            return (Criteria) this;
        }

        public Criteria andSvrCGreaterThan(BigDecimal value) {
            addCriterion("Svr_C >", value, "svrC");
            return (Criteria) this;
        }

        public Criteria andSvrCGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Svr_C >=", value, "svrC");
            return (Criteria) this;
        }

        public Criteria andSvrCLessThan(BigDecimal value) {
            addCriterion("Svr_C <", value, "svrC");
            return (Criteria) this;
        }

        public Criteria andSvrCLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Svr_C <=", value, "svrC");
            return (Criteria) this;
        }

        public Criteria andSvrCIn(List<BigDecimal> values) {
            addCriterion("Svr_C in", values, "svrC");
            return (Criteria) this;
        }

        public Criteria andSvrCNotIn(List<BigDecimal> values) {
            addCriterion("Svr_C not in", values, "svrC");
            return (Criteria) this;
        }

        public Criteria andSvrCBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Svr_C between", value1, value2, "svrC");
            return (Criteria) this;
        }

        public Criteria andSvrCNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Svr_C not between", value1, value2, "svrC");
            return (Criteria) this;
        }

        public Criteria andSvrGammaIsNull() {
            addCriterion("Svr_Gamma is null");
            return (Criteria) this;
        }

        public Criteria andSvrGammaIsNotNull() {
            addCriterion("Svr_Gamma is not null");
            return (Criteria) this;
        }

        public Criteria andSvrGammaEqualTo(BigDecimal value) {
            addCriterion("Svr_Gamma =", value, "svrGamma");
            return (Criteria) this;
        }

        public Criteria andSvrGammaNotEqualTo(BigDecimal value) {
            addCriterion("Svr_Gamma <>", value, "svrGamma");
            return (Criteria) this;
        }

        public Criteria andSvrGammaGreaterThan(BigDecimal value) {
            addCriterion("Svr_Gamma >", value, "svrGamma");
            return (Criteria) this;
        }

        public Criteria andSvrGammaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Svr_Gamma >=", value, "svrGamma");
            return (Criteria) this;
        }

        public Criteria andSvrGammaLessThan(BigDecimal value) {
            addCriterion("Svr_Gamma <", value, "svrGamma");
            return (Criteria) this;
        }

        public Criteria andSvrGammaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Svr_Gamma <=", value, "svrGamma");
            return (Criteria) this;
        }

        public Criteria andSvrGammaIn(List<BigDecimal> values) {
            addCriterion("Svr_Gamma in", values, "svrGamma");
            return (Criteria) this;
        }

        public Criteria andSvrGammaNotIn(List<BigDecimal> values) {
            addCriterion("Svr_Gamma not in", values, "svrGamma");
            return (Criteria) this;
        }

        public Criteria andSvrGammaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Svr_Gamma between", value1, value2, "svrGamma");
            return (Criteria) this;
        }

        public Criteria andSvrGammaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Svr_Gamma not between", value1, value2, "svrGamma");
            return (Criteria) this;
        }

        public Criteria andSvrEpsIsNull() {
            addCriterion("Svr_Eps is null");
            return (Criteria) this;
        }

        public Criteria andSvrEpsIsNotNull() {
            addCriterion("Svr_Eps is not null");
            return (Criteria) this;
        }

        public Criteria andSvrEpsEqualTo(BigDecimal value) {
            addCriterion("Svr_Eps =", value, "svrEps");
            return (Criteria) this;
        }

        public Criteria andSvrEpsNotEqualTo(BigDecimal value) {
            addCriterion("Svr_Eps <>", value, "svrEps");
            return (Criteria) this;
        }

        public Criteria andSvrEpsGreaterThan(BigDecimal value) {
            addCriterion("Svr_Eps >", value, "svrEps");
            return (Criteria) this;
        }

        public Criteria andSvrEpsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Svr_Eps >=", value, "svrEps");
            return (Criteria) this;
        }

        public Criteria andSvrEpsLessThan(BigDecimal value) {
            addCriterion("Svr_Eps <", value, "svrEps");
            return (Criteria) this;
        }

        public Criteria andSvrEpsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Svr_Eps <=", value, "svrEps");
            return (Criteria) this;
        }

        public Criteria andSvrEpsIn(List<BigDecimal> values) {
            addCriterion("Svr_Eps in", values, "svrEps");
            return (Criteria) this;
        }

        public Criteria andSvrEpsNotIn(List<BigDecimal> values) {
            addCriterion("Svr_Eps not in", values, "svrEps");
            return (Criteria) this;
        }

        public Criteria andSvrEpsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Svr_Eps between", value1, value2, "svrEps");
            return (Criteria) this;
        }

        public Criteria andSvrEpsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Svr_Eps not between", value1, value2, "svrEps");
            return (Criteria) this;
        }

        public Criteria andTLatestcpiIsNull() {
            addCriterion("T_latestCPI is null");
            return (Criteria) this;
        }

        public Criteria andTLatestcpiIsNotNull() {
            addCriterion("T_latestCPI is not null");
            return (Criteria) this;
        }

        public Criteria andTLatestcpiEqualTo(BigDecimal value) {
            addCriterion("T_latestCPI =", value, "tLatestcpi");
            return (Criteria) this;
        }

        public Criteria andTLatestcpiNotEqualTo(BigDecimal value) {
            addCriterion("T_latestCPI <>", value, "tLatestcpi");
            return (Criteria) this;
        }

        public Criteria andTLatestcpiGreaterThan(BigDecimal value) {
            addCriterion("T_latestCPI >", value, "tLatestcpi");
            return (Criteria) this;
        }

        public Criteria andTLatestcpiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("T_latestCPI >=", value, "tLatestcpi");
            return (Criteria) this;
        }

        public Criteria andTLatestcpiLessThan(BigDecimal value) {
            addCriterion("T_latestCPI <", value, "tLatestcpi");
            return (Criteria) this;
        }

        public Criteria andTLatestcpiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("T_latestCPI <=", value, "tLatestcpi");
            return (Criteria) this;
        }

        public Criteria andTLatestcpiIn(List<BigDecimal> values) {
            addCriterion("T_latestCPI in", values, "tLatestcpi");
            return (Criteria) this;
        }

        public Criteria andTLatestcpiNotIn(List<BigDecimal> values) {
            addCriterion("T_latestCPI not in", values, "tLatestcpi");
            return (Criteria) this;
        }

        public Criteria andTLatestcpiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("T_latestCPI between", value1, value2, "tLatestcpi");
            return (Criteria) this;
        }

        public Criteria andTLatestcpiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("T_latestCPI not between", value1, value2, "tLatestcpi");
            return (Criteria) this;
        }

        public Criteria andTLatestyearIsNull() {
            addCriterion("T_latestYear is null");
            return (Criteria) this;
        }

        public Criteria andTLatestyearIsNotNull() {
            addCriterion("T_latestYear is not null");
            return (Criteria) this;
        }

        public Criteria andTLatestyearEqualTo(BigDecimal value) {
            addCriterion("T_latestYear =", value, "tLatestyear");
            return (Criteria) this;
        }

        public Criteria andTLatestyearNotEqualTo(BigDecimal value) {
            addCriterion("T_latestYear <>", value, "tLatestyear");
            return (Criteria) this;
        }

        public Criteria andTLatestyearGreaterThan(BigDecimal value) {
            addCriterion("T_latestYear >", value, "tLatestyear");
            return (Criteria) this;
        }

        public Criteria andTLatestyearGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("T_latestYear >=", value, "tLatestyear");
            return (Criteria) this;
        }

        public Criteria andTLatestyearLessThan(BigDecimal value) {
            addCriterion("T_latestYear <", value, "tLatestyear");
            return (Criteria) this;
        }

        public Criteria andTLatestyearLessThanOrEqualTo(BigDecimal value) {
            addCriterion("T_latestYear <=", value, "tLatestyear");
            return (Criteria) this;
        }

        public Criteria andTLatestyearIn(List<BigDecimal> values) {
            addCriterion("T_latestYear in", values, "tLatestyear");
            return (Criteria) this;
        }

        public Criteria andTLatestyearNotIn(List<BigDecimal> values) {
            addCriterion("T_latestYear not in", values, "tLatestyear");
            return (Criteria) this;
        }

        public Criteria andTLatestyearBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("T_latestYear between", value1, value2, "tLatestyear");
            return (Criteria) this;
        }

        public Criteria andTLatestyearNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("T_latestYear not between", value1, value2, "tLatestyear");
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