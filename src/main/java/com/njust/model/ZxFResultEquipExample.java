package com.njust.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ZxFResultEquipExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ZxFResultEquipExample() {
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

        public Criteria andItemIdIsNull() {
            addCriterion("ITEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("ITEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(BigDecimal value) {
            addCriterion("ITEM_ID =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(BigDecimal value) {
            addCriterion("ITEM_ID <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(BigDecimal value) {
            addCriterion("ITEM_ID >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ITEM_ID >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(BigDecimal value) {
            addCriterion("ITEM_ID <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ITEM_ID <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<BigDecimal> values) {
            addCriterion("ITEM_ID in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<BigDecimal> values) {
            addCriterion("ITEM_ID not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ITEM_ID between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(BigDecimal value1, BigDecimal value2) {
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

        public Criteria andRevEquipNumEqualTo(BigDecimal value) {
            addCriterion("REV_EQUIP_NUM =", value, "revEquipNum");
            return (Criteria) this;
        }

        public Criteria andRevEquipNumNotEqualTo(BigDecimal value) {
            addCriterion("REV_EQUIP_NUM <>", value, "revEquipNum");
            return (Criteria) this;
        }

        public Criteria andRevEquipNumGreaterThan(BigDecimal value) {
            addCriterion("REV_EQUIP_NUM >", value, "revEquipNum");
            return (Criteria) this;
        }

        public Criteria andRevEquipNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REV_EQUIP_NUM >=", value, "revEquipNum");
            return (Criteria) this;
        }

        public Criteria andRevEquipNumLessThan(BigDecimal value) {
            addCriterion("REV_EQUIP_NUM <", value, "revEquipNum");
            return (Criteria) this;
        }

        public Criteria andRevEquipNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REV_EQUIP_NUM <=", value, "revEquipNum");
            return (Criteria) this;
        }

        public Criteria andRevEquipNumIn(List<BigDecimal> values) {
            addCriterion("REV_EQUIP_NUM in", values, "revEquipNum");
            return (Criteria) this;
        }

        public Criteria andRevEquipNumNotIn(List<BigDecimal> values) {
            addCriterion("REV_EQUIP_NUM not in", values, "revEquipNum");
            return (Criteria) this;
        }

        public Criteria andRevEquipNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REV_EQUIP_NUM between", value1, value2, "revEquipNum");
            return (Criteria) this;
        }

        public Criteria andRevEquipNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REV_EQUIP_NUM not between", value1, value2, "revEquipNum");
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

        public Criteria andEquipLossRatioIsNull() {
            addCriterion("EQUIP_LOSS_RATIO is null");
            return (Criteria) this;
        }

        public Criteria andEquipLossRatioIsNotNull() {
            addCriterion("EQUIP_LOSS_RATIO is not null");
            return (Criteria) this;
        }

        public Criteria andEquipLossRatioEqualTo(BigDecimal value) {
            addCriterion("EQUIP_LOSS_RATIO =", value, "equipLossRatio");
            return (Criteria) this;
        }

        public Criteria andEquipLossRatioNotEqualTo(BigDecimal value) {
            addCriterion("EQUIP_LOSS_RATIO <>", value, "equipLossRatio");
            return (Criteria) this;
        }

        public Criteria andEquipLossRatioGreaterThan(BigDecimal value) {
            addCriterion("EQUIP_LOSS_RATIO >", value, "equipLossRatio");
            return (Criteria) this;
        }

        public Criteria andEquipLossRatioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EQUIP_LOSS_RATIO >=", value, "equipLossRatio");
            return (Criteria) this;
        }

        public Criteria andEquipLossRatioLessThan(BigDecimal value) {
            addCriterion("EQUIP_LOSS_RATIO <", value, "equipLossRatio");
            return (Criteria) this;
        }

        public Criteria andEquipLossRatioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EQUIP_LOSS_RATIO <=", value, "equipLossRatio");
            return (Criteria) this;
        }

        public Criteria andEquipLossRatioIn(List<BigDecimal> values) {
            addCriterion("EQUIP_LOSS_RATIO in", values, "equipLossRatio");
            return (Criteria) this;
        }

        public Criteria andEquipLossRatioNotIn(List<BigDecimal> values) {
            addCriterion("EQUIP_LOSS_RATIO not in", values, "equipLossRatio");
            return (Criteria) this;
        }

        public Criteria andEquipLossRatioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EQUIP_LOSS_RATIO between", value1, value2, "equipLossRatio");
            return (Criteria) this;
        }

        public Criteria andEquipLossRatioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EQUIP_LOSS_RATIO not between", value1, value2, "equipLossRatio");
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

        public Criteria andWaitingCostEqualTo(BigDecimal value) {
            addCriterion("WAITING_COST =", value, "waitingCost");
            return (Criteria) this;
        }

        public Criteria andWaitingCostNotEqualTo(BigDecimal value) {
            addCriterion("WAITING_COST <>", value, "waitingCost");
            return (Criteria) this;
        }

        public Criteria andWaitingCostGreaterThan(BigDecimal value) {
            addCriterion("WAITING_COST >", value, "waitingCost");
            return (Criteria) this;
        }

        public Criteria andWaitingCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WAITING_COST >=", value, "waitingCost");
            return (Criteria) this;
        }

        public Criteria andWaitingCostLessThan(BigDecimal value) {
            addCriterion("WAITING_COST <", value, "waitingCost");
            return (Criteria) this;
        }

        public Criteria andWaitingCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WAITING_COST <=", value, "waitingCost");
            return (Criteria) this;
        }

        public Criteria andWaitingCostIn(List<BigDecimal> values) {
            addCriterion("WAITING_COST in", values, "waitingCost");
            return (Criteria) this;
        }

        public Criteria andWaitingCostNotIn(List<BigDecimal> values) {
            addCriterion("WAITING_COST not in", values, "waitingCost");
            return (Criteria) this;
        }

        public Criteria andWaitingCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WAITING_COST between", value1, value2, "waitingCost");
            return (Criteria) this;
        }

        public Criteria andWaitingCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WAITING_COST not between", value1, value2, "waitingCost");
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