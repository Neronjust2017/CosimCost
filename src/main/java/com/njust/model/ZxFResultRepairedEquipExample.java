package com.njust.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ZxFResultRepairedEquipExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ZxFResultRepairedEquipExample() {
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

        public Criteria andVsIdEqualTo(Long value) {
            addCriterion("VS_ID =", value, "vsId");
            return (Criteria) this;
        }

        public Criteria andVsIdNotEqualTo(Long value) {
            addCriterion("VS_ID <>", value, "vsId");
            return (Criteria) this;
        }

        public Criteria andVsIdGreaterThan(Long value) {
            addCriterion("VS_ID >", value, "vsId");
            return (Criteria) this;
        }

        public Criteria andVsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("VS_ID >=", value, "vsId");
            return (Criteria) this;
        }

        public Criteria andVsIdLessThan(Long value) {
            addCriterion("VS_ID <", value, "vsId");
            return (Criteria) this;
        }

        public Criteria andVsIdLessThanOrEqualTo(Long value) {
            addCriterion("VS_ID <=", value, "vsId");
            return (Criteria) this;
        }

        public Criteria andVsIdIn(List<Long> values) {
            addCriterion("VS_ID in", values, "vsId");
            return (Criteria) this;
        }

        public Criteria andVsIdNotIn(List<Long> values) {
            addCriterion("VS_ID not in", values, "vsId");
            return (Criteria) this;
        }

        public Criteria andVsIdBetween(Long value1, Long value2) {
            addCriterion("VS_ID between", value1, value2, "vsId");
            return (Criteria) this;
        }

        public Criteria andVsIdNotBetween(Long value1, Long value2) {
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

        public Criteria andStaIdEqualTo(Long value) {
            addCriterion("STA_ID =", value, "staId");
            return (Criteria) this;
        }

        public Criteria andStaIdNotEqualTo(Long value) {
            addCriterion("STA_ID <>", value, "staId");
            return (Criteria) this;
        }

        public Criteria andStaIdGreaterThan(Long value) {
            addCriterion("STA_ID >", value, "staId");
            return (Criteria) this;
        }

        public Criteria andStaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("STA_ID >=", value, "staId");
            return (Criteria) this;
        }

        public Criteria andStaIdLessThan(Long value) {
            addCriterion("STA_ID <", value, "staId");
            return (Criteria) this;
        }

        public Criteria andStaIdLessThanOrEqualTo(Long value) {
            addCriterion("STA_ID <=", value, "staId");
            return (Criteria) this;
        }

        public Criteria andStaIdIn(List<Long> values) {
            addCriterion("STA_ID in", values, "staId");
            return (Criteria) this;
        }

        public Criteria andStaIdNotIn(List<Long> values) {
            addCriterion("STA_ID not in", values, "staId");
            return (Criteria) this;
        }

        public Criteria andStaIdBetween(Long value1, Long value2) {
            addCriterion("STA_ID between", value1, value2, "staId");
            return (Criteria) this;
        }

        public Criteria andStaIdNotBetween(Long value1, Long value2) {
            addCriterion("STA_ID not between", value1, value2, "staId");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNull() {
            addCriterion("ITEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("ITEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(Long value) {
            addCriterion("ITEM_ID =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(Long value) {
            addCriterion("ITEM_ID <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(Long value) {
            addCriterion("ITEM_ID >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ITEM_ID >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(Long value) {
            addCriterion("ITEM_ID <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(Long value) {
            addCriterion("ITEM_ID <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<Long> values) {
            addCriterion("ITEM_ID in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<Long> values) {
            addCriterion("ITEM_ID not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(Long value1, Long value2) {
            addCriterion("ITEM_ID between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(Long value1, Long value2) {
            addCriterion("ITEM_ID not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andRevEquipNumIsNull() {
            addCriterion("REV_EQUIP_NUM is null");
            return (Criteria) this;
        }

        public Criteria andRevEquipNumIsNotNull() {
            addCriterion("REV_EQUIP_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andRevEquipNumEqualTo(Long value) {
            addCriterion("REV_EQUIP_NUM =", value, "revEquipNum");
            return (Criteria) this;
        }

        public Criteria andRevEquipNumNotEqualTo(Long value) {
            addCriterion("REV_EQUIP_NUM <>", value, "revEquipNum");
            return (Criteria) this;
        }

        public Criteria andRevEquipNumGreaterThan(Long value) {
            addCriterion("REV_EQUIP_NUM >", value, "revEquipNum");
            return (Criteria) this;
        }

        public Criteria andRevEquipNumGreaterThanOrEqualTo(Long value) {
            addCriterion("REV_EQUIP_NUM >=", value, "revEquipNum");
            return (Criteria) this;
        }

        public Criteria andRevEquipNumLessThan(Long value) {
            addCriterion("REV_EQUIP_NUM <", value, "revEquipNum");
            return (Criteria) this;
        }

        public Criteria andRevEquipNumLessThanOrEqualTo(Long value) {
            addCriterion("REV_EQUIP_NUM <=", value, "revEquipNum");
            return (Criteria) this;
        }

        public Criteria andRevEquipNumIn(List<Long> values) {
            addCriterion("REV_EQUIP_NUM in", values, "revEquipNum");
            return (Criteria) this;
        }

        public Criteria andRevEquipNumNotIn(List<Long> values) {
            addCriterion("REV_EQUIP_NUM not in", values, "revEquipNum");
            return (Criteria) this;
        }

        public Criteria andRevEquipNumBetween(Long value1, Long value2) {
            addCriterion("REV_EQUIP_NUM between", value1, value2, "revEquipNum");
            return (Criteria) this;
        }

        public Criteria andRevEquipNumNotBetween(Long value1, Long value2) {
            addCriterion("REV_EQUIP_NUM not between", value1, value2, "revEquipNum");
            return (Criteria) this;
        }

        public Criteria andFixEquipNumIsNull() {
            addCriterion("FIX_EQUIP_NUM is null");
            return (Criteria) this;
        }

        public Criteria andFixEquipNumIsNotNull() {
            addCriterion("FIX_EQUIP_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andFixEquipNumEqualTo(Long value) {
            addCriterion("FIX_EQUIP_NUM =", value, "fixEquipNum");
            return (Criteria) this;
        }

        public Criteria andFixEquipNumNotEqualTo(Long value) {
            addCriterion("FIX_EQUIP_NUM <>", value, "fixEquipNum");
            return (Criteria) this;
        }

        public Criteria andFixEquipNumGreaterThan(Long value) {
            addCriterion("FIX_EQUIP_NUM >", value, "fixEquipNum");
            return (Criteria) this;
        }

        public Criteria andFixEquipNumGreaterThanOrEqualTo(Long value) {
            addCriterion("FIX_EQUIP_NUM >=", value, "fixEquipNum");
            return (Criteria) this;
        }

        public Criteria andFixEquipNumLessThan(Long value) {
            addCriterion("FIX_EQUIP_NUM <", value, "fixEquipNum");
            return (Criteria) this;
        }

        public Criteria andFixEquipNumLessThanOrEqualTo(Long value) {
            addCriterion("FIX_EQUIP_NUM <=", value, "fixEquipNum");
            return (Criteria) this;
        }

        public Criteria andFixEquipNumIn(List<Long> values) {
            addCriterion("FIX_EQUIP_NUM in", values, "fixEquipNum");
            return (Criteria) this;
        }

        public Criteria andFixEquipNumNotIn(List<Long> values) {
            addCriterion("FIX_EQUIP_NUM not in", values, "fixEquipNum");
            return (Criteria) this;
        }

        public Criteria andFixEquipNumBetween(Long value1, Long value2) {
            addCriterion("FIX_EQUIP_NUM between", value1, value2, "fixEquipNum");
            return (Criteria) this;
        }

        public Criteria andFixEquipNumNotBetween(Long value1, Long value2) {
            addCriterion("FIX_EQUIP_NUM not between", value1, value2, "fixEquipNum");
            return (Criteria) this;
        }

        public Criteria andEquipFillRateIsNull() {
            addCriterion("EQUIP_FILL_RATE is null");
            return (Criteria) this;
        }

        public Criteria andEquipFillRateIsNotNull() {
            addCriterion("EQUIP_FILL_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andEquipFillRateEqualTo(BigDecimal value) {
            addCriterion("EQUIP_FILL_RATE =", value, "equipFillRate");
            return (Criteria) this;
        }

        public Criteria andEquipFillRateNotEqualTo(BigDecimal value) {
            addCriterion("EQUIP_FILL_RATE <>", value, "equipFillRate");
            return (Criteria) this;
        }

        public Criteria andEquipFillRateGreaterThan(BigDecimal value) {
            addCriterion("EQUIP_FILL_RATE >", value, "equipFillRate");
            return (Criteria) this;
        }

        public Criteria andEquipFillRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EQUIP_FILL_RATE >=", value, "equipFillRate");
            return (Criteria) this;
        }

        public Criteria andEquipFillRateLessThan(BigDecimal value) {
            addCriterion("EQUIP_FILL_RATE <", value, "equipFillRate");
            return (Criteria) this;
        }

        public Criteria andEquipFillRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EQUIP_FILL_RATE <=", value, "equipFillRate");
            return (Criteria) this;
        }

        public Criteria andEquipFillRateIn(List<BigDecimal> values) {
            addCriterion("EQUIP_FILL_RATE in", values, "equipFillRate");
            return (Criteria) this;
        }

        public Criteria andEquipFillRateNotIn(List<BigDecimal> values) {
            addCriterion("EQUIP_FILL_RATE not in", values, "equipFillRate");
            return (Criteria) this;
        }

        public Criteria andEquipFillRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EQUIP_FILL_RATE between", value1, value2, "equipFillRate");
            return (Criteria) this;
        }

        public Criteria andEquipFillRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EQUIP_FILL_RATE not between", value1, value2, "equipFillRate");
            return (Criteria) this;
        }

        public Criteria andWaitingCostIsNull() {
            addCriterion("WAITING_COST is null");
            return (Criteria) this;
        }

        public Criteria andWaitingCostIsNotNull() {
            addCriterion("WAITING_COST is not null");
            return (Criteria) this;
        }

        public Criteria andWaitingCostEqualTo(Long value) {
            addCriterion("WAITING_COST =", value, "waitingCost");
            return (Criteria) this;
        }

        public Criteria andWaitingCostNotEqualTo(Long value) {
            addCriterion("WAITING_COST <>", value, "waitingCost");
            return (Criteria) this;
        }

        public Criteria andWaitingCostGreaterThan(Long value) {
            addCriterion("WAITING_COST >", value, "waitingCost");
            return (Criteria) this;
        }

        public Criteria andWaitingCostGreaterThanOrEqualTo(Long value) {
            addCriterion("WAITING_COST >=", value, "waitingCost");
            return (Criteria) this;
        }

        public Criteria andWaitingCostLessThan(Long value) {
            addCriterion("WAITING_COST <", value, "waitingCost");
            return (Criteria) this;
        }

        public Criteria andWaitingCostLessThanOrEqualTo(Long value) {
            addCriterion("WAITING_COST <=", value, "waitingCost");
            return (Criteria) this;
        }

        public Criteria andWaitingCostIn(List<Long> values) {
            addCriterion("WAITING_COST in", values, "waitingCost");
            return (Criteria) this;
        }

        public Criteria andWaitingCostNotIn(List<Long> values) {
            addCriterion("WAITING_COST not in", values, "waitingCost");
            return (Criteria) this;
        }

        public Criteria andWaitingCostBetween(Long value1, Long value2) {
            addCriterion("WAITING_COST between", value1, value2, "waitingCost");
            return (Criteria) this;
        }

        public Criteria andWaitingCostNotBetween(Long value1, Long value2) {
            addCriterion("WAITING_COST not between", value1, value2, "waitingCost");
            return (Criteria) this;
        }

        public Criteria andTotalJourneyCostIsNull() {
            addCriterion("TOTAL_JOURNEY_COST is null");
            return (Criteria) this;
        }

        public Criteria andTotalJourneyCostIsNotNull() {
            addCriterion("TOTAL_JOURNEY_COST is not null");
            return (Criteria) this;
        }

        public Criteria andTotalJourneyCostEqualTo(Long value) {
            addCriterion("TOTAL_JOURNEY_COST =", value, "totalJourneyCost");
            return (Criteria) this;
        }

        public Criteria andTotalJourneyCostNotEqualTo(Long value) {
            addCriterion("TOTAL_JOURNEY_COST <>", value, "totalJourneyCost");
            return (Criteria) this;
        }

        public Criteria andTotalJourneyCostGreaterThan(Long value) {
            addCriterion("TOTAL_JOURNEY_COST >", value, "totalJourneyCost");
            return (Criteria) this;
        }

        public Criteria andTotalJourneyCostGreaterThanOrEqualTo(Long value) {
            addCriterion("TOTAL_JOURNEY_COST >=", value, "totalJourneyCost");
            return (Criteria) this;
        }

        public Criteria andTotalJourneyCostLessThan(Long value) {
            addCriterion("TOTAL_JOURNEY_COST <", value, "totalJourneyCost");
            return (Criteria) this;
        }

        public Criteria andTotalJourneyCostLessThanOrEqualTo(Long value) {
            addCriterion("TOTAL_JOURNEY_COST <=", value, "totalJourneyCost");
            return (Criteria) this;
        }

        public Criteria andTotalJourneyCostIn(List<Long> values) {
            addCriterion("TOTAL_JOURNEY_COST in", values, "totalJourneyCost");
            return (Criteria) this;
        }

        public Criteria andTotalJourneyCostNotIn(List<Long> values) {
            addCriterion("TOTAL_JOURNEY_COST not in", values, "totalJourneyCost");
            return (Criteria) this;
        }

        public Criteria andTotalJourneyCostBetween(Long value1, Long value2) {
            addCriterion("TOTAL_JOURNEY_COST between", value1, value2, "totalJourneyCost");
            return (Criteria) this;
        }

        public Criteria andTotalJourneyCostNotBetween(Long value1, Long value2) {
            addCriterion("TOTAL_JOURNEY_COST not between", value1, value2, "totalJourneyCost");
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