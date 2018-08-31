package com.njust.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ZxFResultReplacementEquipExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ZxFResultReplacementEquipExample() {
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

        public Criteria andOrgEquipNumIsNull() {
            addCriterion("ORG_EQUIP_NUM is null");
            return (Criteria) this;
        }

        public Criteria andOrgEquipNumIsNotNull() {
            addCriterion("ORG_EQUIP_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andOrgEquipNumEqualTo(Long value) {
            addCriterion("ORG_EQUIP_NUM =", value, "orgEquipNum");
            return (Criteria) this;
        }

        public Criteria andOrgEquipNumNotEqualTo(Long value) {
            addCriterion("ORG_EQUIP_NUM <>", value, "orgEquipNum");
            return (Criteria) this;
        }

        public Criteria andOrgEquipNumGreaterThan(Long value) {
            addCriterion("ORG_EQUIP_NUM >", value, "orgEquipNum");
            return (Criteria) this;
        }

        public Criteria andOrgEquipNumGreaterThanOrEqualTo(Long value) {
            addCriterion("ORG_EQUIP_NUM >=", value, "orgEquipNum");
            return (Criteria) this;
        }

        public Criteria andOrgEquipNumLessThan(Long value) {
            addCriterion("ORG_EQUIP_NUM <", value, "orgEquipNum");
            return (Criteria) this;
        }

        public Criteria andOrgEquipNumLessThanOrEqualTo(Long value) {
            addCriterion("ORG_EQUIP_NUM <=", value, "orgEquipNum");
            return (Criteria) this;
        }

        public Criteria andOrgEquipNumIn(List<Long> values) {
            addCriterion("ORG_EQUIP_NUM in", values, "orgEquipNum");
            return (Criteria) this;
        }

        public Criteria andOrgEquipNumNotIn(List<Long> values) {
            addCriterion("ORG_EQUIP_NUM not in", values, "orgEquipNum");
            return (Criteria) this;
        }

        public Criteria andOrgEquipNumBetween(Long value1, Long value2) {
            addCriterion("ORG_EQUIP_NUM between", value1, value2, "orgEquipNum");
            return (Criteria) this;
        }

        public Criteria andOrgEquipNumNotBetween(Long value1, Long value2) {
            addCriterion("ORG_EQUIP_NUM not between", value1, value2, "orgEquipNum");
            return (Criteria) this;
        }

        public Criteria andRemainEquipNumIsNull() {
            addCriterion("REMAIN_EQUIP_NUM is null");
            return (Criteria) this;
        }

        public Criteria andRemainEquipNumIsNotNull() {
            addCriterion("REMAIN_EQUIP_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andRemainEquipNumEqualTo(Long value) {
            addCriterion("REMAIN_EQUIP_NUM =", value, "remainEquipNum");
            return (Criteria) this;
        }

        public Criteria andRemainEquipNumNotEqualTo(Long value) {
            addCriterion("REMAIN_EQUIP_NUM <>", value, "remainEquipNum");
            return (Criteria) this;
        }

        public Criteria andRemainEquipNumGreaterThan(Long value) {
            addCriterion("REMAIN_EQUIP_NUM >", value, "remainEquipNum");
            return (Criteria) this;
        }

        public Criteria andRemainEquipNumGreaterThanOrEqualTo(Long value) {
            addCriterion("REMAIN_EQUIP_NUM >=", value, "remainEquipNum");
            return (Criteria) this;
        }

        public Criteria andRemainEquipNumLessThan(Long value) {
            addCriterion("REMAIN_EQUIP_NUM <", value, "remainEquipNum");
            return (Criteria) this;
        }

        public Criteria andRemainEquipNumLessThanOrEqualTo(Long value) {
            addCriterion("REMAIN_EQUIP_NUM <=", value, "remainEquipNum");
            return (Criteria) this;
        }

        public Criteria andRemainEquipNumIn(List<Long> values) {
            addCriterion("REMAIN_EQUIP_NUM in", values, "remainEquipNum");
            return (Criteria) this;
        }

        public Criteria andRemainEquipNumNotIn(List<Long> values) {
            addCriterion("REMAIN_EQUIP_NUM not in", values, "remainEquipNum");
            return (Criteria) this;
        }

        public Criteria andRemainEquipNumBetween(Long value1, Long value2) {
            addCriterion("REMAIN_EQUIP_NUM between", value1, value2, "remainEquipNum");
            return (Criteria) this;
        }

        public Criteria andRemainEquipNumNotBetween(Long value1, Long value2) {
            addCriterion("REMAIN_EQUIP_NUM not between", value1, value2, "remainEquipNum");
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