package com.njust.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LlcNetTrainparamsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public LlcNetTrainparamsExample() {
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

        public Criteria andNetAlphaIsNull() {
            addCriterion("Net_alpha is null");
            return (Criteria) this;
        }

        public Criteria andNetAlphaIsNotNull() {
            addCriterion("Net_alpha is not null");
            return (Criteria) this;
        }

        public Criteria andNetAlphaEqualTo(BigDecimal value) {
            addCriterion("Net_alpha =", value, "netAlpha");
            return (Criteria) this;
        }

        public Criteria andNetAlphaNotEqualTo(BigDecimal value) {
            addCriterion("Net_alpha <>", value, "netAlpha");
            return (Criteria) this;
        }

        public Criteria andNetAlphaGreaterThan(BigDecimal value) {
            addCriterion("Net_alpha >", value, "netAlpha");
            return (Criteria) this;
        }

        public Criteria andNetAlphaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Net_alpha >=", value, "netAlpha");
            return (Criteria) this;
        }

        public Criteria andNetAlphaLessThan(BigDecimal value) {
            addCriterion("Net_alpha <", value, "netAlpha");
            return (Criteria) this;
        }

        public Criteria andNetAlphaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Net_alpha <=", value, "netAlpha");
            return (Criteria) this;
        }

        public Criteria andNetAlphaIn(List<BigDecimal> values) {
            addCriterion("Net_alpha in", values, "netAlpha");
            return (Criteria) this;
        }

        public Criteria andNetAlphaNotIn(List<BigDecimal> values) {
            addCriterion("Net_alpha not in", values, "netAlpha");
            return (Criteria) this;
        }

        public Criteria andNetAlphaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Net_alpha between", value1, value2, "netAlpha");
            return (Criteria) this;
        }

        public Criteria andNetAlphaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Net_alpha not between", value1, value2, "netAlpha");
            return (Criteria) this;
        }

        public Criteria andNetSpeedIsNull() {
            addCriterion("Net_speed is null");
            return (Criteria) this;
        }

        public Criteria andNetSpeedIsNotNull() {
            addCriterion("Net_speed is not null");
            return (Criteria) this;
        }

        public Criteria andNetSpeedEqualTo(BigDecimal value) {
            addCriterion("Net_speed =", value, "netSpeed");
            return (Criteria) this;
        }

        public Criteria andNetSpeedNotEqualTo(BigDecimal value) {
            addCriterion("Net_speed <>", value, "netSpeed");
            return (Criteria) this;
        }

        public Criteria andNetSpeedGreaterThan(BigDecimal value) {
            addCriterion("Net_speed >", value, "netSpeed");
            return (Criteria) this;
        }

        public Criteria andNetSpeedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Net_speed >=", value, "netSpeed");
            return (Criteria) this;
        }

        public Criteria andNetSpeedLessThan(BigDecimal value) {
            addCriterion("Net_speed <", value, "netSpeed");
            return (Criteria) this;
        }

        public Criteria andNetSpeedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Net_speed <=", value, "netSpeed");
            return (Criteria) this;
        }

        public Criteria andNetSpeedIn(List<BigDecimal> values) {
            addCriterion("Net_speed in", values, "netSpeed");
            return (Criteria) this;
        }

        public Criteria andNetSpeedNotIn(List<BigDecimal> values) {
            addCriterion("Net_speed not in", values, "netSpeed");
            return (Criteria) this;
        }

        public Criteria andNetSpeedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Net_speed between", value1, value2, "netSpeed");
            return (Criteria) this;
        }

        public Criteria andNetSpeedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Net_speed not between", value1, value2, "netSpeed");
            return (Criteria) this;
        }

        public Criteria andNetTraincIsNull() {
            addCriterion("Net_TrainC is null");
            return (Criteria) this;
        }

        public Criteria andNetTraincIsNotNull() {
            addCriterion("Net_TrainC is not null");
            return (Criteria) this;
        }

        public Criteria andNetTraincEqualTo(BigDecimal value) {
            addCriterion("Net_TrainC =", value, "netTrainc");
            return (Criteria) this;
        }

        public Criteria andNetTraincNotEqualTo(BigDecimal value) {
            addCriterion("Net_TrainC <>", value, "netTrainc");
            return (Criteria) this;
        }

        public Criteria andNetTraincGreaterThan(BigDecimal value) {
            addCriterion("Net_TrainC >", value, "netTrainc");
            return (Criteria) this;
        }

        public Criteria andNetTraincGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Net_TrainC >=", value, "netTrainc");
            return (Criteria) this;
        }

        public Criteria andNetTraincLessThan(BigDecimal value) {
            addCriterion("Net_TrainC <", value, "netTrainc");
            return (Criteria) this;
        }

        public Criteria andNetTraincLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Net_TrainC <=", value, "netTrainc");
            return (Criteria) this;
        }

        public Criteria andNetTraincIn(List<BigDecimal> values) {
            addCriterion("Net_TrainC in", values, "netTrainc");
            return (Criteria) this;
        }

        public Criteria andNetTraincNotIn(List<BigDecimal> values) {
            addCriterion("Net_TrainC not in", values, "netTrainc");
            return (Criteria) this;
        }

        public Criteria andNetTraincBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Net_TrainC between", value1, value2, "netTrainc");
            return (Criteria) this;
        }

        public Criteria andNetTraincNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Net_TrainC not between", value1, value2, "netTrainc");
            return (Criteria) this;
        }

        public Criteria andNetPrecisionIsNull() {
            addCriterion("Net_precision is null");
            return (Criteria) this;
        }

        public Criteria andNetPrecisionIsNotNull() {
            addCriterion("Net_precision is not null");
            return (Criteria) this;
        }

        public Criteria andNetPrecisionEqualTo(BigDecimal value) {
            addCriterion("Net_precision =", value, "netPrecision");
            return (Criteria) this;
        }

        public Criteria andNetPrecisionNotEqualTo(BigDecimal value) {
            addCriterion("Net_precision <>", value, "netPrecision");
            return (Criteria) this;
        }

        public Criteria andNetPrecisionGreaterThan(BigDecimal value) {
            addCriterion("Net_precision >", value, "netPrecision");
            return (Criteria) this;
        }

        public Criteria andNetPrecisionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Net_precision >=", value, "netPrecision");
            return (Criteria) this;
        }

        public Criteria andNetPrecisionLessThan(BigDecimal value) {
            addCriterion("Net_precision <", value, "netPrecision");
            return (Criteria) this;
        }

        public Criteria andNetPrecisionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Net_precision <=", value, "netPrecision");
            return (Criteria) this;
        }

        public Criteria andNetPrecisionIn(List<BigDecimal> values) {
            addCriterion("Net_precision in", values, "netPrecision");
            return (Criteria) this;
        }

        public Criteria andNetPrecisionNotIn(List<BigDecimal> values) {
            addCriterion("Net_precision not in", values, "netPrecision");
            return (Criteria) this;
        }

        public Criteria andNetPrecisionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Net_precision between", value1, value2, "netPrecision");
            return (Criteria) this;
        }

        public Criteria andNetPrecisionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Net_precision not between", value1, value2, "netPrecision");
            return (Criteria) this;
        }

        public Criteria andNetFlagIsNull() {
            addCriterion("Net_flag is null");
            return (Criteria) this;
        }

        public Criteria andNetFlagIsNotNull() {
            addCriterion("Net_flag is not null");
            return (Criteria) this;
        }

        public Criteria andNetFlagEqualTo(BigDecimal value) {
            addCriterion("Net_flag =", value, "netFlag");
            return (Criteria) this;
        }

        public Criteria andNetFlagNotEqualTo(BigDecimal value) {
            addCriterion("Net_flag <>", value, "netFlag");
            return (Criteria) this;
        }

        public Criteria andNetFlagGreaterThan(BigDecimal value) {
            addCriterion("Net_flag >", value, "netFlag");
            return (Criteria) this;
        }

        public Criteria andNetFlagGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Net_flag >=", value, "netFlag");
            return (Criteria) this;
        }

        public Criteria andNetFlagLessThan(BigDecimal value) {
            addCriterion("Net_flag <", value, "netFlag");
            return (Criteria) this;
        }

        public Criteria andNetFlagLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Net_flag <=", value, "netFlag");
            return (Criteria) this;
        }

        public Criteria andNetFlagIn(List<BigDecimal> values) {
            addCriterion("Net_flag in", values, "netFlag");
            return (Criteria) this;
        }

        public Criteria andNetFlagNotIn(List<BigDecimal> values) {
            addCriterion("Net_flag not in", values, "netFlag");
            return (Criteria) this;
        }

        public Criteria andNetFlagBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Net_flag between", value1, value2, "netFlag");
            return (Criteria) this;
        }

        public Criteria andNetFlagNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Net_flag not between", value1, value2, "netFlag");
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