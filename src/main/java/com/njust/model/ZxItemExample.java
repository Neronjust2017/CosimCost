package com.njust.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ZxItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ZxItemExample() {
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

        public Criteria andItemOrderIsNull() {
            addCriterion("ITEM_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andItemOrderIsNotNull() {
            addCriterion("ITEM_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andItemOrderEqualTo(String value) {
            addCriterion("ITEM_ORDER =", value, "itemOrder");
            return (Criteria) this;
        }

        public Criteria andItemOrderNotEqualTo(String value) {
            addCriterion("ITEM_ORDER <>", value, "itemOrder");
            return (Criteria) this;
        }

        public Criteria andItemOrderGreaterThan(String value) {
            addCriterion("ITEM_ORDER >", value, "itemOrder");
            return (Criteria) this;
        }

        public Criteria andItemOrderGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_ORDER >=", value, "itemOrder");
            return (Criteria) this;
        }

        public Criteria andItemOrderLessThan(String value) {
            addCriterion("ITEM_ORDER <", value, "itemOrder");
            return (Criteria) this;
        }

        public Criteria andItemOrderLessThanOrEqualTo(String value) {
            addCriterion("ITEM_ORDER <=", value, "itemOrder");
            return (Criteria) this;
        }

        public Criteria andItemOrderLike(String value) {
            addCriterion("ITEM_ORDER like", value, "itemOrder");
            return (Criteria) this;
        }

        public Criteria andItemOrderNotLike(String value) {
            addCriterion("ITEM_ORDER not like", value, "itemOrder");
            return (Criteria) this;
        }

        public Criteria andItemOrderIn(List<String> values) {
            addCriterion("ITEM_ORDER in", values, "itemOrder");
            return (Criteria) this;
        }

        public Criteria andItemOrderNotIn(List<String> values) {
            addCriterion("ITEM_ORDER not in", values, "itemOrder");
            return (Criteria) this;
        }

        public Criteria andItemOrderBetween(String value1, String value2) {
            addCriterion("ITEM_ORDER between", value1, value2, "itemOrder");
            return (Criteria) this;
        }

        public Criteria andItemOrderNotBetween(String value1, String value2) {
            addCriterion("ITEM_ORDER not between", value1, value2, "itemOrder");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNull() {
            addCriterion("ITEM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNotNull() {
            addCriterion("ITEM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andItemNameEqualTo(String value) {
            addCriterion("ITEM_NAME =", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotEqualTo(String value) {
            addCriterion("ITEM_NAME <>", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThan(String value) {
            addCriterion("ITEM_NAME >", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_NAME >=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThan(String value) {
            addCriterion("ITEM_NAME <", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThanOrEqualTo(String value) {
            addCriterion("ITEM_NAME <=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLike(String value) {
            addCriterion("ITEM_NAME like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotLike(String value) {
            addCriterion("ITEM_NAME not like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameIn(List<String> values) {
            addCriterion("ITEM_NAME in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotIn(List<String> values) {
            addCriterion("ITEM_NAME not in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameBetween(String value1, String value2) {
            addCriterion("ITEM_NAME between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotBetween(String value1, String value2) {
            addCriterion("ITEM_NAME not between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andHItemIdIsNull() {
            addCriterion("H_ITEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andHItemIdIsNotNull() {
            addCriterion("H_ITEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andHItemIdEqualTo(BigDecimal value) {
            addCriterion("H_ITEM_ID =", value, "hItemId");
            return (Criteria) this;
        }

        public Criteria andHItemIdNotEqualTo(BigDecimal value) {
            addCriterion("H_ITEM_ID <>", value, "hItemId");
            return (Criteria) this;
        }

        public Criteria andHItemIdGreaterThan(BigDecimal value) {
            addCriterion("H_ITEM_ID >", value, "hItemId");
            return (Criteria) this;
        }

        public Criteria andHItemIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("H_ITEM_ID >=", value, "hItemId");
            return (Criteria) this;
        }

        public Criteria andHItemIdLessThan(BigDecimal value) {
            addCriterion("H_ITEM_ID <", value, "hItemId");
            return (Criteria) this;
        }

        public Criteria andHItemIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("H_ITEM_ID <=", value, "hItemId");
            return (Criteria) this;
        }

        public Criteria andHItemIdIn(List<BigDecimal> values) {
            addCriterion("H_ITEM_ID in", values, "hItemId");
            return (Criteria) this;
        }

        public Criteria andHItemIdNotIn(List<BigDecimal> values) {
            addCriterion("H_ITEM_ID not in", values, "hItemId");
            return (Criteria) this;
        }

        public Criteria andHItemIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("H_ITEM_ID between", value1, value2, "hItemId");
            return (Criteria) this;
        }

        public Criteria andHItemIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("H_ITEM_ID not between", value1, value2, "hItemId");
            return (Criteria) this;
        }

        public Criteria andHNumberIsNull() {
            addCriterion("H_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andHNumberIsNotNull() {
            addCriterion("H_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andHNumberEqualTo(Long value) {
            addCriterion("H_NUMBER =", value, "hNumber");
            return (Criteria) this;
        }

        public Criteria andHNumberNotEqualTo(Long value) {
            addCriterion("H_NUMBER <>", value, "hNumber");
            return (Criteria) this;
        }

        public Criteria andHNumberGreaterThan(Long value) {
            addCriterion("H_NUMBER >", value, "hNumber");
            return (Criteria) this;
        }

        public Criteria andHNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("H_NUMBER >=", value, "hNumber");
            return (Criteria) this;
        }

        public Criteria andHNumberLessThan(Long value) {
            addCriterion("H_NUMBER <", value, "hNumber");
            return (Criteria) this;
        }

        public Criteria andHNumberLessThanOrEqualTo(Long value) {
            addCriterion("H_NUMBER <=", value, "hNumber");
            return (Criteria) this;
        }

        public Criteria andHNumberIn(List<Long> values) {
            addCriterion("H_NUMBER in", values, "hNumber");
            return (Criteria) this;
        }

        public Criteria andHNumberNotIn(List<Long> values) {
            addCriterion("H_NUMBER not in", values, "hNumber");
            return (Criteria) this;
        }

        public Criteria andHNumberBetween(Long value1, Long value2) {
            addCriterion("H_NUMBER between", value1, value2, "hNumber");
            return (Criteria) this;
        }

        public Criteria andHNumberNotBetween(Long value1, Long value2) {
            addCriterion("H_NUMBER not between", value1, value2, "hNumber");
            return (Criteria) this;
        }

        public Criteria andFailWarmStandbyIsNull() {
            addCriterion("FAIL_WARM_STANDBY is null");
            return (Criteria) this;
        }

        public Criteria andFailWarmStandbyIsNotNull() {
            addCriterion("FAIL_WARM_STANDBY is not null");
            return (Criteria) this;
        }

        public Criteria andFailWarmStandbyEqualTo(BigDecimal value) {
            addCriterion("FAIL_WARM_STANDBY =", value, "failWarmStandby");
            return (Criteria) this;
        }

        public Criteria andFailWarmStandbyNotEqualTo(BigDecimal value) {
            addCriterion("FAIL_WARM_STANDBY <>", value, "failWarmStandby");
            return (Criteria) this;
        }

        public Criteria andFailWarmStandbyGreaterThan(BigDecimal value) {
            addCriterion("FAIL_WARM_STANDBY >", value, "failWarmStandby");
            return (Criteria) this;
        }

        public Criteria andFailWarmStandbyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FAIL_WARM_STANDBY >=", value, "failWarmStandby");
            return (Criteria) this;
        }

        public Criteria andFailWarmStandbyLessThan(BigDecimal value) {
            addCriterion("FAIL_WARM_STANDBY <", value, "failWarmStandby");
            return (Criteria) this;
        }

        public Criteria andFailWarmStandbyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FAIL_WARM_STANDBY <=", value, "failWarmStandby");
            return (Criteria) this;
        }

        public Criteria andFailWarmStandbyIn(List<BigDecimal> values) {
            addCriterion("FAIL_WARM_STANDBY in", values, "failWarmStandby");
            return (Criteria) this;
        }

        public Criteria andFailWarmStandbyNotIn(List<BigDecimal> values) {
            addCriterion("FAIL_WARM_STANDBY not in", values, "failWarmStandby");
            return (Criteria) this;
        }

        public Criteria andFailWarmStandbyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FAIL_WARM_STANDBY between", value1, value2, "failWarmStandby");
            return (Criteria) this;
        }

        public Criteria andFailWarmStandbyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FAIL_WARM_STANDBY not between", value1, value2, "failWarmStandby");
            return (Criteria) this;
        }

        public Criteria andItemCostIsNull() {
            addCriterion("ITEM_COST is null");
            return (Criteria) this;
        }

        public Criteria andItemCostIsNotNull() {
            addCriterion("ITEM_COST is not null");
            return (Criteria) this;
        }

        public Criteria andItemCostEqualTo(BigDecimal value) {
            addCriterion("ITEM_COST =", value, "itemCost");
            return (Criteria) this;
        }

        public Criteria andItemCostNotEqualTo(BigDecimal value) {
            addCriterion("ITEM_COST <>", value, "itemCost");
            return (Criteria) this;
        }

        public Criteria andItemCostGreaterThan(BigDecimal value) {
            addCriterion("ITEM_COST >", value, "itemCost");
            return (Criteria) this;
        }

        public Criteria andItemCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ITEM_COST >=", value, "itemCost");
            return (Criteria) this;
        }

        public Criteria andItemCostLessThan(BigDecimal value) {
            addCriterion("ITEM_COST <", value, "itemCost");
            return (Criteria) this;
        }

        public Criteria andItemCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ITEM_COST <=", value, "itemCost");
            return (Criteria) this;
        }

        public Criteria andItemCostIn(List<BigDecimal> values) {
            addCriterion("ITEM_COST in", values, "itemCost");
            return (Criteria) this;
        }

        public Criteria andItemCostNotIn(List<BigDecimal> values) {
            addCriterion("ITEM_COST not in", values, "itemCost");
            return (Criteria) this;
        }

        public Criteria andItemCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ITEM_COST between", value1, value2, "itemCost");
            return (Criteria) this;
        }

        public Criteria andItemCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ITEM_COST not between", value1, value2, "itemCost");
            return (Criteria) this;
        }

        public Criteria andRepairTimeIsNull() {
            addCriterion("REPAIR_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRepairTimeIsNotNull() {
            addCriterion("REPAIR_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRepairTimeEqualTo(BigDecimal value) {
            addCriterion("REPAIR_TIME =", value, "repairTime");
            return (Criteria) this;
        }

        public Criteria andRepairTimeNotEqualTo(BigDecimal value) {
            addCriterion("REPAIR_TIME <>", value, "repairTime");
            return (Criteria) this;
        }

        public Criteria andRepairTimeGreaterThan(BigDecimal value) {
            addCriterion("REPAIR_TIME >", value, "repairTime");
            return (Criteria) this;
        }

        public Criteria andRepairTimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REPAIR_TIME >=", value, "repairTime");
            return (Criteria) this;
        }

        public Criteria andRepairTimeLessThan(BigDecimal value) {
            addCriterion("REPAIR_TIME <", value, "repairTime");
            return (Criteria) this;
        }

        public Criteria andRepairTimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REPAIR_TIME <=", value, "repairTime");
            return (Criteria) this;
        }

        public Criteria andRepairTimeIn(List<BigDecimal> values) {
            addCriterion("REPAIR_TIME in", values, "repairTime");
            return (Criteria) this;
        }

        public Criteria andRepairTimeNotIn(List<BigDecimal> values) {
            addCriterion("REPAIR_TIME not in", values, "repairTime");
            return (Criteria) this;
        }

        public Criteria andRepairTimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REPAIR_TIME between", value1, value2, "repairTime");
            return (Criteria) this;
        }

        public Criteria andRepairTimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REPAIR_TIME not between", value1, value2, "repairTime");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("TYPE like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("TYPE not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andFailColdStandbyIsNull() {
            addCriterion("FAIL_COLD_STANDBY is null");
            return (Criteria) this;
        }

        public Criteria andFailColdStandbyIsNotNull() {
            addCriterion("FAIL_COLD_STANDBY is not null");
            return (Criteria) this;
        }

        public Criteria andFailColdStandbyEqualTo(BigDecimal value) {
            addCriterion("FAIL_COLD_STANDBY =", value, "failColdStandby");
            return (Criteria) this;
        }

        public Criteria andFailColdStandbyNotEqualTo(BigDecimal value) {
            addCriterion("FAIL_COLD_STANDBY <>", value, "failColdStandby");
            return (Criteria) this;
        }

        public Criteria andFailColdStandbyGreaterThan(BigDecimal value) {
            addCriterion("FAIL_COLD_STANDBY >", value, "failColdStandby");
            return (Criteria) this;
        }

        public Criteria andFailColdStandbyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FAIL_COLD_STANDBY >=", value, "failColdStandby");
            return (Criteria) this;
        }

        public Criteria andFailColdStandbyLessThan(BigDecimal value) {
            addCriterion("FAIL_COLD_STANDBY <", value, "failColdStandby");
            return (Criteria) this;
        }

        public Criteria andFailColdStandbyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FAIL_COLD_STANDBY <=", value, "failColdStandby");
            return (Criteria) this;
        }

        public Criteria andFailColdStandbyIn(List<BigDecimal> values) {
            addCriterion("FAIL_COLD_STANDBY in", values, "failColdStandby");
            return (Criteria) this;
        }

        public Criteria andFailColdStandbyNotIn(List<BigDecimal> values) {
            addCriterion("FAIL_COLD_STANDBY not in", values, "failColdStandby");
            return (Criteria) this;
        }

        public Criteria andFailColdStandbyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FAIL_COLD_STANDBY between", value1, value2, "failColdStandby");
            return (Criteria) this;
        }

        public Criteria andFailColdStandbyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FAIL_COLD_STANDBY not between", value1, value2, "failColdStandby");
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