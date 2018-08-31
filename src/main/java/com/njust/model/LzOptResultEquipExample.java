package com.njust.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LzOptResultEquipExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public LzOptResultEquipExample() {
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

        public Criteria andOptIdIsNull() {
            addCriterion("OPT_ID is null");
            return (Criteria) this;
        }

        public Criteria andOptIdIsNotNull() {
            addCriterion("OPT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOptIdEqualTo(BigDecimal value) {
            addCriterion("OPT_ID =", value, "optId");
            return (Criteria) this;
        }

        public Criteria andOptIdNotEqualTo(BigDecimal value) {
            addCriterion("OPT_ID <>", value, "optId");
            return (Criteria) this;
        }

        public Criteria andOptIdGreaterThan(BigDecimal value) {
            addCriterion("OPT_ID >", value, "optId");
            return (Criteria) this;
        }

        public Criteria andOptIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OPT_ID >=", value, "optId");
            return (Criteria) this;
        }

        public Criteria andOptIdLessThan(BigDecimal value) {
            addCriterion("OPT_ID <", value, "optId");
            return (Criteria) this;
        }

        public Criteria andOptIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OPT_ID <=", value, "optId");
            return (Criteria) this;
        }

        public Criteria andOptIdIn(List<BigDecimal> values) {
            addCriterion("OPT_ID in", values, "optId");
            return (Criteria) this;
        }

        public Criteria andOptIdNotIn(List<BigDecimal> values) {
            addCriterion("OPT_ID not in", values, "optId");
            return (Criteria) this;
        }

        public Criteria andOptIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OPT_ID between", value1, value2, "optId");
            return (Criteria) this;
        }

        public Criteria andOptIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OPT_ID not between", value1, value2, "optId");
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

        public Criteria andResultEquipIdIsNull() {
            addCriterion("RESULT_EQUIP_ID is null");
            return (Criteria) this;
        }

        public Criteria andResultEquipIdIsNotNull() {
            addCriterion("RESULT_EQUIP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andResultEquipIdEqualTo(BigDecimal value) {
            addCriterion("RESULT_EQUIP_ID =", value, "resultEquipId");
            return (Criteria) this;
        }

        public Criteria andResultEquipIdNotEqualTo(BigDecimal value) {
            addCriterion("RESULT_EQUIP_ID <>", value, "resultEquipId");
            return (Criteria) this;
        }

        public Criteria andResultEquipIdGreaterThan(BigDecimal value) {
            addCriterion("RESULT_EQUIP_ID >", value, "resultEquipId");
            return (Criteria) this;
        }

        public Criteria andResultEquipIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RESULT_EQUIP_ID >=", value, "resultEquipId");
            return (Criteria) this;
        }

        public Criteria andResultEquipIdLessThan(BigDecimal value) {
            addCriterion("RESULT_EQUIP_ID <", value, "resultEquipId");
            return (Criteria) this;
        }

        public Criteria andResultEquipIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RESULT_EQUIP_ID <=", value, "resultEquipId");
            return (Criteria) this;
        }

        public Criteria andResultEquipIdIn(List<BigDecimal> values) {
            addCriterion("RESULT_EQUIP_ID in", values, "resultEquipId");
            return (Criteria) this;
        }

        public Criteria andResultEquipIdNotIn(List<BigDecimal> values) {
            addCriterion("RESULT_EQUIP_ID not in", values, "resultEquipId");
            return (Criteria) this;
        }

        public Criteria andResultEquipIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RESULT_EQUIP_ID between", value1, value2, "resultEquipId");
            return (Criteria) this;
        }

        public Criteria andResultEquipIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RESULT_EQUIP_ID not between", value1, value2, "resultEquipId");
            return (Criteria) this;
        }

        public Criteria andEquipAvailabilityIsNull() {
            addCriterion("EQUIP_AVAILABILITY is null");
            return (Criteria) this;
        }

        public Criteria andEquipAvailabilityIsNotNull() {
            addCriterion("EQUIP_AVAILABILITY is not null");
            return (Criteria) this;
        }

        public Criteria andEquipAvailabilityEqualTo(BigDecimal value) {
            addCriterion("EQUIP_AVAILABILITY =", value, "equipAvailability");
            return (Criteria) this;
        }

        public Criteria andEquipAvailabilityNotEqualTo(BigDecimal value) {
            addCriterion("EQUIP_AVAILABILITY <>", value, "equipAvailability");
            return (Criteria) this;
        }

        public Criteria andEquipAvailabilityGreaterThan(BigDecimal value) {
            addCriterion("EQUIP_AVAILABILITY >", value, "equipAvailability");
            return (Criteria) this;
        }

        public Criteria andEquipAvailabilityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EQUIP_AVAILABILITY >=", value, "equipAvailability");
            return (Criteria) this;
        }

        public Criteria andEquipAvailabilityLessThan(BigDecimal value) {
            addCriterion("EQUIP_AVAILABILITY <", value, "equipAvailability");
            return (Criteria) this;
        }

        public Criteria andEquipAvailabilityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EQUIP_AVAILABILITY <=", value, "equipAvailability");
            return (Criteria) this;
        }

        public Criteria andEquipAvailabilityIn(List<BigDecimal> values) {
            addCriterion("EQUIP_AVAILABILITY in", values, "equipAvailability");
            return (Criteria) this;
        }

        public Criteria andEquipAvailabilityNotIn(List<BigDecimal> values) {
            addCriterion("EQUIP_AVAILABILITY not in", values, "equipAvailability");
            return (Criteria) this;
        }

        public Criteria andEquipAvailabilityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EQUIP_AVAILABILITY between", value1, value2, "equipAvailability");
            return (Criteria) this;
        }

        public Criteria andEquipAvailabilityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EQUIP_AVAILABILITY not between", value1, value2, "equipAvailability");
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