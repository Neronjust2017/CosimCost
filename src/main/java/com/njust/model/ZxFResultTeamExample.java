package com.njust.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ZxFResultTeamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ZxFResultTeamExample() {
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

        public Criteria andTeamIdIsNull() {
            addCriterion("TEAM_ID is null");
            return (Criteria) this;
        }

        public Criteria andTeamIdIsNotNull() {
            addCriterion("TEAM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTeamIdEqualTo(BigDecimal value) {
            addCriterion("TEAM_ID =", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotEqualTo(BigDecimal value) {
            addCriterion("TEAM_ID <>", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdGreaterThan(BigDecimal value) {
            addCriterion("TEAM_ID >", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TEAM_ID >=", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdLessThan(BigDecimal value) {
            addCriterion("TEAM_ID <", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TEAM_ID <=", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdIn(List<BigDecimal> values) {
            addCriterion("TEAM_ID in", values, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotIn(List<BigDecimal> values) {
            addCriterion("TEAM_ID not in", values, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TEAM_ID between", value1, value2, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TEAM_ID not between", value1, value2, "teamId");
            return (Criteria) this;
        }

        public Criteria andUtilizationRatioIsNull() {
            addCriterion("UTILIZATION_RATIO is null");
            return (Criteria) this;
        }

        public Criteria andUtilizationRatioIsNotNull() {
            addCriterion("UTILIZATION_RATIO is not null");
            return (Criteria) this;
        }

        public Criteria andUtilizationRatioEqualTo(BigDecimal value) {
            addCriterion("UTILIZATION_RATIO =", value, "utilizationRatio");
            return (Criteria) this;
        }

        public Criteria andUtilizationRatioNotEqualTo(BigDecimal value) {
            addCriterion("UTILIZATION_RATIO <>", value, "utilizationRatio");
            return (Criteria) this;
        }

        public Criteria andUtilizationRatioGreaterThan(BigDecimal value) {
            addCriterion("UTILIZATION_RATIO >", value, "utilizationRatio");
            return (Criteria) this;
        }

        public Criteria andUtilizationRatioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UTILIZATION_RATIO >=", value, "utilizationRatio");
            return (Criteria) this;
        }

        public Criteria andUtilizationRatioLessThan(BigDecimal value) {
            addCriterion("UTILIZATION_RATIO <", value, "utilizationRatio");
            return (Criteria) this;
        }

        public Criteria andUtilizationRatioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UTILIZATION_RATIO <=", value, "utilizationRatio");
            return (Criteria) this;
        }

        public Criteria andUtilizationRatioIn(List<BigDecimal> values) {
            addCriterion("UTILIZATION_RATIO in", values, "utilizationRatio");
            return (Criteria) this;
        }

        public Criteria andUtilizationRatioNotIn(List<BigDecimal> values) {
            addCriterion("UTILIZATION_RATIO not in", values, "utilizationRatio");
            return (Criteria) this;
        }

        public Criteria andUtilizationRatioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UTILIZATION_RATIO between", value1, value2, "utilizationRatio");
            return (Criteria) this;
        }

        public Criteria andUtilizationRatioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UTILIZATION_RATIO not between", value1, value2, "utilizationRatio");
            return (Criteria) this;
        }

        public Criteria andWorkingHourIsNull() {
            addCriterion("WORKING_HOUR is null");
            return (Criteria) this;
        }

        public Criteria andWorkingHourIsNotNull() {
            addCriterion("WORKING_HOUR is not null");
            return (Criteria) this;
        }

        public Criteria andWorkingHourEqualTo(Long value) {
            addCriterion("WORKING_HOUR =", value, "workingHour");
            return (Criteria) this;
        }

        public Criteria andWorkingHourNotEqualTo(Long value) {
            addCriterion("WORKING_HOUR <>", value, "workingHour");
            return (Criteria) this;
        }

        public Criteria andWorkingHourGreaterThan(Long value) {
            addCriterion("WORKING_HOUR >", value, "workingHour");
            return (Criteria) this;
        }

        public Criteria andWorkingHourGreaterThanOrEqualTo(Long value) {
            addCriterion("WORKING_HOUR >=", value, "workingHour");
            return (Criteria) this;
        }

        public Criteria andWorkingHourLessThan(Long value) {
            addCriterion("WORKING_HOUR <", value, "workingHour");
            return (Criteria) this;
        }

        public Criteria andWorkingHourLessThanOrEqualTo(Long value) {
            addCriterion("WORKING_HOUR <=", value, "workingHour");
            return (Criteria) this;
        }

        public Criteria andWorkingHourIn(List<Long> values) {
            addCriterion("WORKING_HOUR in", values, "workingHour");
            return (Criteria) this;
        }

        public Criteria andWorkingHourNotIn(List<Long> values) {
            addCriterion("WORKING_HOUR not in", values, "workingHour");
            return (Criteria) this;
        }

        public Criteria andWorkingHourBetween(Long value1, Long value2) {
            addCriterion("WORKING_HOUR between", value1, value2, "workingHour");
            return (Criteria) this;
        }

        public Criteria andWorkingHourNotBetween(Long value1, Long value2) {
            addCriterion("WORKING_HOUR not between", value1, value2, "workingHour");
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