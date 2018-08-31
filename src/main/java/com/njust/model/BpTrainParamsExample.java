package com.njust.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BpTrainParamsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public BpTrainParamsExample() {
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

        public Criteria andAlphaIsNull() {
            addCriterion("ALPHA is null");
            return (Criteria) this;
        }

        public Criteria andAlphaIsNotNull() {
            addCriterion("ALPHA is not null");
            return (Criteria) this;
        }

        public Criteria andAlphaEqualTo(BigDecimal value) {
            addCriterion("ALPHA =", value, "alpha");
            return (Criteria) this;
        }

        public Criteria andAlphaNotEqualTo(BigDecimal value) {
            addCriterion("ALPHA <>", value, "alpha");
            return (Criteria) this;
        }

        public Criteria andAlphaGreaterThan(BigDecimal value) {
            addCriterion("ALPHA >", value, "alpha");
            return (Criteria) this;
        }

        public Criteria andAlphaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ALPHA >=", value, "alpha");
            return (Criteria) this;
        }

        public Criteria andAlphaLessThan(BigDecimal value) {
            addCriterion("ALPHA <", value, "alpha");
            return (Criteria) this;
        }

        public Criteria andAlphaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ALPHA <=", value, "alpha");
            return (Criteria) this;
        }

        public Criteria andAlphaIn(List<BigDecimal> values) {
            addCriterion("ALPHA in", values, "alpha");
            return (Criteria) this;
        }

        public Criteria andAlphaNotIn(List<BigDecimal> values) {
            addCriterion("ALPHA not in", values, "alpha");
            return (Criteria) this;
        }

        public Criteria andAlphaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ALPHA between", value1, value2, "alpha");
            return (Criteria) this;
        }

        public Criteria andAlphaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ALPHA not between", value1, value2, "alpha");
            return (Criteria) this;
        }

        public Criteria andSpeedIsNull() {
            addCriterion("SPEED is null");
            return (Criteria) this;
        }

        public Criteria andSpeedIsNotNull() {
            addCriterion("SPEED is not null");
            return (Criteria) this;
        }

        public Criteria andSpeedEqualTo(BigDecimal value) {
            addCriterion("SPEED =", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedNotEqualTo(BigDecimal value) {
            addCriterion("SPEED <>", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedGreaterThan(BigDecimal value) {
            addCriterion("SPEED >", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SPEED >=", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedLessThan(BigDecimal value) {
            addCriterion("SPEED <", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SPEED <=", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedIn(List<BigDecimal> values) {
            addCriterion("SPEED in", values, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedNotIn(List<BigDecimal> values) {
            addCriterion("SPEED not in", values, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SPEED between", value1, value2, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SPEED not between", value1, value2, "speed");
            return (Criteria) this;
        }

        public Criteria andTrainCountIsNull() {
            addCriterion("TRAIN_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andTrainCountIsNotNull() {
            addCriterion("TRAIN_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTrainCountEqualTo(BigDecimal value) {
            addCriterion("TRAIN_COUNT =", value, "trainCount");
            return (Criteria) this;
        }

        public Criteria andTrainCountNotEqualTo(BigDecimal value) {
            addCriterion("TRAIN_COUNT <>", value, "trainCount");
            return (Criteria) this;
        }

        public Criteria andTrainCountGreaterThan(BigDecimal value) {
            addCriterion("TRAIN_COUNT >", value, "trainCount");
            return (Criteria) this;
        }

        public Criteria andTrainCountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRAIN_COUNT >=", value, "trainCount");
            return (Criteria) this;
        }

        public Criteria andTrainCountLessThan(BigDecimal value) {
            addCriterion("TRAIN_COUNT <", value, "trainCount");
            return (Criteria) this;
        }

        public Criteria andTrainCountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRAIN_COUNT <=", value, "trainCount");
            return (Criteria) this;
        }

        public Criteria andTrainCountIn(List<BigDecimal> values) {
            addCriterion("TRAIN_COUNT in", values, "trainCount");
            return (Criteria) this;
        }

        public Criteria andTrainCountNotIn(List<BigDecimal> values) {
            addCriterion("TRAIN_COUNT not in", values, "trainCount");
            return (Criteria) this;
        }

        public Criteria andTrainCountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRAIN_COUNT between", value1, value2, "trainCount");
            return (Criteria) this;
        }

        public Criteria andTrainCountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRAIN_COUNT not between", value1, value2, "trainCount");
            return (Criteria) this;
        }

        public Criteria andTrainPrecisionIsNull() {
            addCriterion("TRAIN_PRECISION is null");
            return (Criteria) this;
        }

        public Criteria andTrainPrecisionIsNotNull() {
            addCriterion("TRAIN_PRECISION is not null");
            return (Criteria) this;
        }

        public Criteria andTrainPrecisionEqualTo(BigDecimal value) {
            addCriterion("TRAIN_PRECISION =", value, "trainPrecision");
            return (Criteria) this;
        }

        public Criteria andTrainPrecisionNotEqualTo(BigDecimal value) {
            addCriterion("TRAIN_PRECISION <>", value, "trainPrecision");
            return (Criteria) this;
        }

        public Criteria andTrainPrecisionGreaterThan(BigDecimal value) {
            addCriterion("TRAIN_PRECISION >", value, "trainPrecision");
            return (Criteria) this;
        }

        public Criteria andTrainPrecisionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRAIN_PRECISION >=", value, "trainPrecision");
            return (Criteria) this;
        }

        public Criteria andTrainPrecisionLessThan(BigDecimal value) {
            addCriterion("TRAIN_PRECISION <", value, "trainPrecision");
            return (Criteria) this;
        }

        public Criteria andTrainPrecisionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRAIN_PRECISION <=", value, "trainPrecision");
            return (Criteria) this;
        }

        public Criteria andTrainPrecisionIn(List<BigDecimal> values) {
            addCriterion("TRAIN_PRECISION in", values, "trainPrecision");
            return (Criteria) this;
        }

        public Criteria andTrainPrecisionNotIn(List<BigDecimal> values) {
            addCriterion("TRAIN_PRECISION not in", values, "trainPrecision");
            return (Criteria) this;
        }

        public Criteria andTrainPrecisionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRAIN_PRECISION between", value1, value2, "trainPrecision");
            return (Criteria) this;
        }

        public Criteria andTrainPrecisionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRAIN_PRECISION not between", value1, value2, "trainPrecision");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("FLAG is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(Integer value) {
            addCriterion("FLAG =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(Integer value) {
            addCriterion("FLAG <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(Integer value) {
            addCriterion("FLAG >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("FLAG >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(Integer value) {
            addCriterion("FLAG <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(Integer value) {
            addCriterion("FLAG <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<Integer> values) {
            addCriterion("FLAG in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<Integer> values) {
            addCriterion("FLAG not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(Integer value1, Integer value2) {
            addCriterion("FLAG between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("FLAG not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andHlayersIndexIsNull() {
            addCriterion("HLAYERS_INDEX is null");
            return (Criteria) this;
        }

        public Criteria andHlayersIndexIsNotNull() {
            addCriterion("HLAYERS_INDEX is not null");
            return (Criteria) this;
        }

        public Criteria andHlayersIndexEqualTo(BigDecimal value) {
            addCriterion("HLAYERS_INDEX =", value, "hlayersIndex");
            return (Criteria) this;
        }

        public Criteria andHlayersIndexNotEqualTo(BigDecimal value) {
            addCriterion("HLAYERS_INDEX <>", value, "hlayersIndex");
            return (Criteria) this;
        }

        public Criteria andHlayersIndexGreaterThan(BigDecimal value) {
            addCriterion("HLAYERS_INDEX >", value, "hlayersIndex");
            return (Criteria) this;
        }

        public Criteria andHlayersIndexGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HLAYERS_INDEX >=", value, "hlayersIndex");
            return (Criteria) this;
        }

        public Criteria andHlayersIndexLessThan(BigDecimal value) {
            addCriterion("HLAYERS_INDEX <", value, "hlayersIndex");
            return (Criteria) this;
        }

        public Criteria andHlayersIndexLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HLAYERS_INDEX <=", value, "hlayersIndex");
            return (Criteria) this;
        }

        public Criteria andHlayersIndexIn(List<BigDecimal> values) {
            addCriterion("HLAYERS_INDEX in", values, "hlayersIndex");
            return (Criteria) this;
        }

        public Criteria andHlayersIndexNotIn(List<BigDecimal> values) {
            addCriterion("HLAYERS_INDEX not in", values, "hlayersIndex");
            return (Criteria) this;
        }

        public Criteria andHlayersIndexBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HLAYERS_INDEX between", value1, value2, "hlayersIndex");
            return (Criteria) this;
        }

        public Criteria andHlayersIndexNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HLAYERS_INDEX not between", value1, value2, "hlayersIndex");
            return (Criteria) this;
        }

        public Criteria andHlayersValueIsNull() {
            addCriterion("HLAYERS_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andHlayersValueIsNotNull() {
            addCriterion("HLAYERS_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andHlayersValueEqualTo(BigDecimal value) {
            addCriterion("HLAYERS_VALUE =", value, "hlayersValue");
            return (Criteria) this;
        }

        public Criteria andHlayersValueNotEqualTo(BigDecimal value) {
            addCriterion("HLAYERS_VALUE <>", value, "hlayersValue");
            return (Criteria) this;
        }

        public Criteria andHlayersValueGreaterThan(BigDecimal value) {
            addCriterion("HLAYERS_VALUE >", value, "hlayersValue");
            return (Criteria) this;
        }

        public Criteria andHlayersValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HLAYERS_VALUE >=", value, "hlayersValue");
            return (Criteria) this;
        }

        public Criteria andHlayersValueLessThan(BigDecimal value) {
            addCriterion("HLAYERS_VALUE <", value, "hlayersValue");
            return (Criteria) this;
        }

        public Criteria andHlayersValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HLAYERS_VALUE <=", value, "hlayersValue");
            return (Criteria) this;
        }

        public Criteria andHlayersValueIn(List<BigDecimal> values) {
            addCriterion("HLAYERS_VALUE in", values, "hlayersValue");
            return (Criteria) this;
        }

        public Criteria andHlayersValueNotIn(List<BigDecimal> values) {
            addCriterion("HLAYERS_VALUE not in", values, "hlayersValue");
            return (Criteria) this;
        }

        public Criteria andHlayersValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HLAYERS_VALUE between", value1, value2, "hlayersValue");
            return (Criteria) this;
        }

        public Criteria andHlayersValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HLAYERS_VALUE not between", value1, value2, "hlayersValue");
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