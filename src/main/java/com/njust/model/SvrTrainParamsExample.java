package com.njust.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SvrTrainParamsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public SvrTrainParamsExample() {
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

        public Criteria andModelTimeIsNull() {
            addCriterion("MODEL_TIME is null");
            return (Criteria) this;
        }

        public Criteria andModelTimeIsNotNull() {
            addCriterion("MODEL_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andModelTimeEqualTo(String value) {
            addCriterion("MODEL_TIME =", value, "modelTime");
            return (Criteria) this;
        }

        public Criteria andModelTimeNotEqualTo(String value) {
            addCriterion("MODEL_TIME <>", value, "modelTime");
            return (Criteria) this;
        }

        public Criteria andModelTimeGreaterThan(String value) {
            addCriterion("MODEL_TIME >", value, "modelTime");
            return (Criteria) this;
        }

        public Criteria andModelTimeGreaterThanOrEqualTo(String value) {
            addCriterion("MODEL_TIME >=", value, "modelTime");
            return (Criteria) this;
        }

        public Criteria andModelTimeLessThan(String value) {
            addCriterion("MODEL_TIME <", value, "modelTime");
            return (Criteria) this;
        }

        public Criteria andModelTimeLessThanOrEqualTo(String value) {
            addCriterion("MODEL_TIME <=", value, "modelTime");
            return (Criteria) this;
        }

        public Criteria andModelTimeLike(String value) {
            addCriterion("MODEL_TIME like", value, "modelTime");
            return (Criteria) this;
        }

        public Criteria andModelTimeNotLike(String value) {
            addCriterion("MODEL_TIME not like", value, "modelTime");
            return (Criteria) this;
        }

        public Criteria andModelTimeIn(List<String> values) {
            addCriterion("MODEL_TIME in", values, "modelTime");
            return (Criteria) this;
        }

        public Criteria andModelTimeNotIn(List<String> values) {
            addCriterion("MODEL_TIME not in", values, "modelTime");
            return (Criteria) this;
        }

        public Criteria andModelTimeBetween(String value1, String value2) {
            addCriterion("MODEL_TIME between", value1, value2, "modelTime");
            return (Criteria) this;
        }

        public Criteria andModelTimeNotBetween(String value1, String value2) {
            addCriterion("MODEL_TIME not between", value1, value2, "modelTime");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNull() {
            addCriterion("PROJECT_ID is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("PROJECT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(BigDecimal value) {
            addCriterion("PROJECT_ID =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(BigDecimal value) {
            addCriterion("PROJECT_ID <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(BigDecimal value) {
            addCriterion("PROJECT_ID >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PROJECT_ID >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(BigDecimal value) {
            addCriterion("PROJECT_ID <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PROJECT_ID <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<BigDecimal> values) {
            addCriterion("PROJECT_ID in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<BigDecimal> values) {
            addCriterion("PROJECT_ID not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROJECT_ID between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROJECT_ID not between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdIsNull() {
            addCriterion("SCHEME_ID is null");
            return (Criteria) this;
        }

        public Criteria andSchemeIdIsNotNull() {
            addCriterion("SCHEME_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSchemeIdEqualTo(BigDecimal value) {
            addCriterion("SCHEME_ID =", value, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdNotEqualTo(BigDecimal value) {
            addCriterion("SCHEME_ID <>", value, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdGreaterThan(BigDecimal value) {
            addCriterion("SCHEME_ID >", value, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SCHEME_ID >=", value, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdLessThan(BigDecimal value) {
            addCriterion("SCHEME_ID <", value, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SCHEME_ID <=", value, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdIn(List<BigDecimal> values) {
            addCriterion("SCHEME_ID in", values, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdNotIn(List<BigDecimal> values) {
            addCriterion("SCHEME_ID not in", values, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCHEME_ID between", value1, value2, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCHEME_ID not between", value1, value2, "schemeId");
            return (Criteria) this;
        }

        public Criteria andCostTreeIdIsNull() {
            addCriterion("COST_TREE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCostTreeIdIsNotNull() {
            addCriterion("COST_TREE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCostTreeIdEqualTo(BigDecimal value) {
            addCriterion("COST_TREE_ID =", value, "costTreeId");
            return (Criteria) this;
        }

        public Criteria andCostTreeIdNotEqualTo(BigDecimal value) {
            addCriterion("COST_TREE_ID <>", value, "costTreeId");
            return (Criteria) this;
        }

        public Criteria andCostTreeIdGreaterThan(BigDecimal value) {
            addCriterion("COST_TREE_ID >", value, "costTreeId");
            return (Criteria) this;
        }

        public Criteria andCostTreeIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COST_TREE_ID >=", value, "costTreeId");
            return (Criteria) this;
        }

        public Criteria andCostTreeIdLessThan(BigDecimal value) {
            addCriterion("COST_TREE_ID <", value, "costTreeId");
            return (Criteria) this;
        }

        public Criteria andCostTreeIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COST_TREE_ID <=", value, "costTreeId");
            return (Criteria) this;
        }

        public Criteria andCostTreeIdIn(List<BigDecimal> values) {
            addCriterion("COST_TREE_ID in", values, "costTreeId");
            return (Criteria) this;
        }

        public Criteria andCostTreeIdNotIn(List<BigDecimal> values) {
            addCriterion("COST_TREE_ID not in", values, "costTreeId");
            return (Criteria) this;
        }

        public Criteria andCostTreeIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COST_TREE_ID between", value1, value2, "costTreeId");
            return (Criteria) this;
        }

        public Criteria andCostTreeIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COST_TREE_ID not between", value1, value2, "costTreeId");
            return (Criteria) this;
        }

        public Criteria andCostIdIsNull() {
            addCriterion("COST_ID is null");
            return (Criteria) this;
        }

        public Criteria andCostIdIsNotNull() {
            addCriterion("COST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCostIdEqualTo(BigDecimal value) {
            addCriterion("COST_ID =", value, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdNotEqualTo(BigDecimal value) {
            addCriterion("COST_ID <>", value, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdGreaterThan(BigDecimal value) {
            addCriterion("COST_ID >", value, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COST_ID >=", value, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdLessThan(BigDecimal value) {
            addCriterion("COST_ID <", value, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COST_ID <=", value, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdIn(List<BigDecimal> values) {
            addCriterion("COST_ID in", values, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdNotIn(List<BigDecimal> values) {
            addCriterion("COST_ID not in", values, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COST_ID between", value1, value2, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COST_ID not between", value1, value2, "costId");
            return (Criteria) this;
        }

        public Criteria andSvrLIsNull() {
            addCriterion("SVR_L is null");
            return (Criteria) this;
        }

        public Criteria andSvrLIsNotNull() {
            addCriterion("SVR_L is not null");
            return (Criteria) this;
        }

        public Criteria andSvrLEqualTo(BigDecimal value) {
            addCriterion("SVR_L =", value, "svrL");
            return (Criteria) this;
        }

        public Criteria andSvrLNotEqualTo(BigDecimal value) {
            addCriterion("SVR_L <>", value, "svrL");
            return (Criteria) this;
        }

        public Criteria andSvrLGreaterThan(BigDecimal value) {
            addCriterion("SVR_L >", value, "svrL");
            return (Criteria) this;
        }

        public Criteria andSvrLGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SVR_L >=", value, "svrL");
            return (Criteria) this;
        }

        public Criteria andSvrLLessThan(BigDecimal value) {
            addCriterion("SVR_L <", value, "svrL");
            return (Criteria) this;
        }

        public Criteria andSvrLLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SVR_L <=", value, "svrL");
            return (Criteria) this;
        }

        public Criteria andSvrLIn(List<BigDecimal> values) {
            addCriterion("SVR_L in", values, "svrL");
            return (Criteria) this;
        }

        public Criteria andSvrLNotIn(List<BigDecimal> values) {
            addCriterion("SVR_L not in", values, "svrL");
            return (Criteria) this;
        }

        public Criteria andSvrLBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SVR_L between", value1, value2, "svrL");
            return (Criteria) this;
        }

        public Criteria andSvrLNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SVR_L not between", value1, value2, "svrL");
            return (Criteria) this;
        }

        public Criteria andSvrCIsNull() {
            addCriterion("SVR_C is null");
            return (Criteria) this;
        }

        public Criteria andSvrCIsNotNull() {
            addCriterion("SVR_C is not null");
            return (Criteria) this;
        }

        public Criteria andSvrCEqualTo(BigDecimal value) {
            addCriterion("SVR_C =", value, "svrC");
            return (Criteria) this;
        }

        public Criteria andSvrCNotEqualTo(BigDecimal value) {
            addCriterion("SVR_C <>", value, "svrC");
            return (Criteria) this;
        }

        public Criteria andSvrCGreaterThan(BigDecimal value) {
            addCriterion("SVR_C >", value, "svrC");
            return (Criteria) this;
        }

        public Criteria andSvrCGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SVR_C >=", value, "svrC");
            return (Criteria) this;
        }

        public Criteria andSvrCLessThan(BigDecimal value) {
            addCriterion("SVR_C <", value, "svrC");
            return (Criteria) this;
        }

        public Criteria andSvrCLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SVR_C <=", value, "svrC");
            return (Criteria) this;
        }

        public Criteria andSvrCIn(List<BigDecimal> values) {
            addCriterion("SVR_C in", values, "svrC");
            return (Criteria) this;
        }

        public Criteria andSvrCNotIn(List<BigDecimal> values) {
            addCriterion("SVR_C not in", values, "svrC");
            return (Criteria) this;
        }

        public Criteria andSvrCBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SVR_C between", value1, value2, "svrC");
            return (Criteria) this;
        }

        public Criteria andSvrCNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SVR_C not between", value1, value2, "svrC");
            return (Criteria) this;
        }

        public Criteria andSvrGammaIsNull() {
            addCriterion("SVR_GAMMA is null");
            return (Criteria) this;
        }

        public Criteria andSvrGammaIsNotNull() {
            addCriterion("SVR_GAMMA is not null");
            return (Criteria) this;
        }

        public Criteria andSvrGammaEqualTo(BigDecimal value) {
            addCriterion("SVR_GAMMA =", value, "svrGamma");
            return (Criteria) this;
        }

        public Criteria andSvrGammaNotEqualTo(BigDecimal value) {
            addCriterion("SVR_GAMMA <>", value, "svrGamma");
            return (Criteria) this;
        }

        public Criteria andSvrGammaGreaterThan(BigDecimal value) {
            addCriterion("SVR_GAMMA >", value, "svrGamma");
            return (Criteria) this;
        }

        public Criteria andSvrGammaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SVR_GAMMA >=", value, "svrGamma");
            return (Criteria) this;
        }

        public Criteria andSvrGammaLessThan(BigDecimal value) {
            addCriterion("SVR_GAMMA <", value, "svrGamma");
            return (Criteria) this;
        }

        public Criteria andSvrGammaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SVR_GAMMA <=", value, "svrGamma");
            return (Criteria) this;
        }

        public Criteria andSvrGammaIn(List<BigDecimal> values) {
            addCriterion("SVR_GAMMA in", values, "svrGamma");
            return (Criteria) this;
        }

        public Criteria andSvrGammaNotIn(List<BigDecimal> values) {
            addCriterion("SVR_GAMMA not in", values, "svrGamma");
            return (Criteria) this;
        }

        public Criteria andSvrGammaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SVR_GAMMA between", value1, value2, "svrGamma");
            return (Criteria) this;
        }

        public Criteria andSvrGammaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SVR_GAMMA not between", value1, value2, "svrGamma");
            return (Criteria) this;
        }

        public Criteria andSvrEpsIsNull() {
            addCriterion("SVR_EPS is null");
            return (Criteria) this;
        }

        public Criteria andSvrEpsIsNotNull() {
            addCriterion("SVR_EPS is not null");
            return (Criteria) this;
        }

        public Criteria andSvrEpsEqualTo(BigDecimal value) {
            addCriterion("SVR_EPS =", value, "svrEps");
            return (Criteria) this;
        }

        public Criteria andSvrEpsNotEqualTo(BigDecimal value) {
            addCriterion("SVR_EPS <>", value, "svrEps");
            return (Criteria) this;
        }

        public Criteria andSvrEpsGreaterThan(BigDecimal value) {
            addCriterion("SVR_EPS >", value, "svrEps");
            return (Criteria) this;
        }

        public Criteria andSvrEpsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SVR_EPS >=", value, "svrEps");
            return (Criteria) this;
        }

        public Criteria andSvrEpsLessThan(BigDecimal value) {
            addCriterion("SVR_EPS <", value, "svrEps");
            return (Criteria) this;
        }

        public Criteria andSvrEpsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SVR_EPS <=", value, "svrEps");
            return (Criteria) this;
        }

        public Criteria andSvrEpsIn(List<BigDecimal> values) {
            addCriterion("SVR_EPS in", values, "svrEps");
            return (Criteria) this;
        }

        public Criteria andSvrEpsNotIn(List<BigDecimal> values) {
            addCriterion("SVR_EPS not in", values, "svrEps");
            return (Criteria) this;
        }

        public Criteria andSvrEpsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SVR_EPS between", value1, value2, "svrEps");
            return (Criteria) this;
        }

        public Criteria andSvrEpsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SVR_EPS not between", value1, value2, "svrEps");
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