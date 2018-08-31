package com.njust.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ZxFTeamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ZxFTeamExample() {
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

        public Criteria andFTeamIdIsNull() {
            addCriterion("F_TEAM_ID is null");
            return (Criteria) this;
        }

        public Criteria andFTeamIdIsNotNull() {
            addCriterion("F_TEAM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFTeamIdEqualTo(BigDecimal value) {
            addCriterion("F_TEAM_ID =", value, "fTeamId");
            return (Criteria) this;
        }

        public Criteria andFTeamIdNotEqualTo(BigDecimal value) {
            addCriterion("F_TEAM_ID <>", value, "fTeamId");
            return (Criteria) this;
        }

        public Criteria andFTeamIdGreaterThan(BigDecimal value) {
            addCriterion("F_TEAM_ID >", value, "fTeamId");
            return (Criteria) this;
        }

        public Criteria andFTeamIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("F_TEAM_ID >=", value, "fTeamId");
            return (Criteria) this;
        }

        public Criteria andFTeamIdLessThan(BigDecimal value) {
            addCriterion("F_TEAM_ID <", value, "fTeamId");
            return (Criteria) this;
        }

        public Criteria andFTeamIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("F_TEAM_ID <=", value, "fTeamId");
            return (Criteria) this;
        }

        public Criteria andFTeamIdIn(List<BigDecimal> values) {
            addCriterion("F_TEAM_ID in", values, "fTeamId");
            return (Criteria) this;
        }

        public Criteria andFTeamIdNotIn(List<BigDecimal> values) {
            addCriterion("F_TEAM_ID not in", values, "fTeamId");
            return (Criteria) this;
        }

        public Criteria andFTeamIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("F_TEAM_ID between", value1, value2, "fTeamId");
            return (Criteria) this;
        }

        public Criteria andFTeamIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("F_TEAM_ID not between", value1, value2, "fTeamId");
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

        public Criteria andTeamLevelIsNull() {
            addCriterion("TEAM_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andTeamLevelIsNotNull() {
            addCriterion("TEAM_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andTeamLevelEqualTo(BigDecimal value) {
            addCriterion("TEAM_LEVEL =", value, "teamLevel");
            return (Criteria) this;
        }

        public Criteria andTeamLevelNotEqualTo(BigDecimal value) {
            addCriterion("TEAM_LEVEL <>", value, "teamLevel");
            return (Criteria) this;
        }

        public Criteria andTeamLevelGreaterThan(BigDecimal value) {
            addCriterion("TEAM_LEVEL >", value, "teamLevel");
            return (Criteria) this;
        }

        public Criteria andTeamLevelGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TEAM_LEVEL >=", value, "teamLevel");
            return (Criteria) this;
        }

        public Criteria andTeamLevelLessThan(BigDecimal value) {
            addCriterion("TEAM_LEVEL <", value, "teamLevel");
            return (Criteria) this;
        }

        public Criteria andTeamLevelLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TEAM_LEVEL <=", value, "teamLevel");
            return (Criteria) this;
        }

        public Criteria andTeamLevelIn(List<BigDecimal> values) {
            addCriterion("TEAM_LEVEL in", values, "teamLevel");
            return (Criteria) this;
        }

        public Criteria andTeamLevelNotIn(List<BigDecimal> values) {
            addCriterion("TEAM_LEVEL not in", values, "teamLevel");
            return (Criteria) this;
        }

        public Criteria andTeamLevelBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TEAM_LEVEL between", value1, value2, "teamLevel");
            return (Criteria) this;
        }

        public Criteria andTeamLevelNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TEAM_LEVEL not between", value1, value2, "teamLevel");
            return (Criteria) this;
        }

        public Criteria andTeamEffiIsNull() {
            addCriterion("TEAM_EFFI is null");
            return (Criteria) this;
        }

        public Criteria andTeamEffiIsNotNull() {
            addCriterion("TEAM_EFFI is not null");
            return (Criteria) this;
        }

        public Criteria andTeamEffiEqualTo(BigDecimal value) {
            addCriterion("TEAM_EFFI =", value, "teamEffi");
            return (Criteria) this;
        }

        public Criteria andTeamEffiNotEqualTo(BigDecimal value) {
            addCriterion("TEAM_EFFI <>", value, "teamEffi");
            return (Criteria) this;
        }

        public Criteria andTeamEffiGreaterThan(BigDecimal value) {
            addCriterion("TEAM_EFFI >", value, "teamEffi");
            return (Criteria) this;
        }

        public Criteria andTeamEffiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TEAM_EFFI >=", value, "teamEffi");
            return (Criteria) this;
        }

        public Criteria andTeamEffiLessThan(BigDecimal value) {
            addCriterion("TEAM_EFFI <", value, "teamEffi");
            return (Criteria) this;
        }

        public Criteria andTeamEffiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TEAM_EFFI <=", value, "teamEffi");
            return (Criteria) this;
        }

        public Criteria andTeamEffiIn(List<BigDecimal> values) {
            addCriterion("TEAM_EFFI in", values, "teamEffi");
            return (Criteria) this;
        }

        public Criteria andTeamEffiNotIn(List<BigDecimal> values) {
            addCriterion("TEAM_EFFI not in", values, "teamEffi");
            return (Criteria) this;
        }

        public Criteria andTeamEffiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TEAM_EFFI between", value1, value2, "teamEffi");
            return (Criteria) this;
        }

        public Criteria andTeamEffiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TEAM_EFFI not between", value1, value2, "teamEffi");
            return (Criteria) this;
        }

        public Criteria andTeamNumberIsNull() {
            addCriterion("TEAM_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andTeamNumberIsNotNull() {
            addCriterion("TEAM_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andTeamNumberEqualTo(BigDecimal value) {
            addCriterion("TEAM_NUMBER =", value, "teamNumber");
            return (Criteria) this;
        }

        public Criteria andTeamNumberNotEqualTo(BigDecimal value) {
            addCriterion("TEAM_NUMBER <>", value, "teamNumber");
            return (Criteria) this;
        }

        public Criteria andTeamNumberGreaterThan(BigDecimal value) {
            addCriterion("TEAM_NUMBER >", value, "teamNumber");
            return (Criteria) this;
        }

        public Criteria andTeamNumberGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TEAM_NUMBER >=", value, "teamNumber");
            return (Criteria) this;
        }

        public Criteria andTeamNumberLessThan(BigDecimal value) {
            addCriterion("TEAM_NUMBER <", value, "teamNumber");
            return (Criteria) this;
        }

        public Criteria andTeamNumberLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TEAM_NUMBER <=", value, "teamNumber");
            return (Criteria) this;
        }

        public Criteria andTeamNumberIn(List<BigDecimal> values) {
            addCriterion("TEAM_NUMBER in", values, "teamNumber");
            return (Criteria) this;
        }

        public Criteria andTeamNumberNotIn(List<BigDecimal> values) {
            addCriterion("TEAM_NUMBER not in", values, "teamNumber");
            return (Criteria) this;
        }

        public Criteria andTeamNumberBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TEAM_NUMBER between", value1, value2, "teamNumber");
            return (Criteria) this;
        }

        public Criteria andTeamNumberNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TEAM_NUMBER not between", value1, value2, "teamNumber");
            return (Criteria) this;
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

        public Criteria andTeamNameIsNull() {
            addCriterion("TEAM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTeamNameIsNotNull() {
            addCriterion("TEAM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTeamNameEqualTo(String value) {
            addCriterion("TEAM_NAME =", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotEqualTo(String value) {
            addCriterion("TEAM_NAME <>", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameGreaterThan(String value) {
            addCriterion("TEAM_NAME >", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameGreaterThanOrEqualTo(String value) {
            addCriterion("TEAM_NAME >=", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameLessThan(String value) {
            addCriterion("TEAM_NAME <", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameLessThanOrEqualTo(String value) {
            addCriterion("TEAM_NAME <=", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameLike(String value) {
            addCriterion("TEAM_NAME like", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotLike(String value) {
            addCriterion("TEAM_NAME not like", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameIn(List<String> values) {
            addCriterion("TEAM_NAME in", values, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotIn(List<String> values) {
            addCriterion("TEAM_NAME not in", values, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameBetween(String value1, String value2) {
            addCriterion("TEAM_NAME between", value1, value2, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotBetween(String value1, String value2) {
            addCriterion("TEAM_NAME not between", value1, value2, "teamName");
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