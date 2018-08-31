package com.njust.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class HisDataStructureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public HisDataStructureExample() {
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

        public Criteria andAttrIdIsNull() {
            addCriterion("ATTR_ID is null");
            return (Criteria) this;
        }

        public Criteria andAttrIdIsNotNull() {
            addCriterion("ATTR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAttrIdEqualTo(BigDecimal value) {
            addCriterion("ATTR_ID =", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdNotEqualTo(BigDecimal value) {
            addCriterion("ATTR_ID <>", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdGreaterThan(BigDecimal value) {
            addCriterion("ATTR_ID >", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ATTR_ID >=", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdLessThan(BigDecimal value) {
            addCriterion("ATTR_ID <", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ATTR_ID <=", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdIn(List<BigDecimal> values) {
            addCriterion("ATTR_ID in", values, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdNotIn(List<BigDecimal> values) {
            addCriterion("ATTR_ID not in", values, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ATTR_ID between", value1, value2, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ATTR_ID not between", value1, value2, "attrId");
            return (Criteria) this;
        }

        public Criteria andSetIdIsNull() {
            addCriterion("SET_ID is null");
            return (Criteria) this;
        }

        public Criteria andSetIdIsNotNull() {
            addCriterion("SET_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSetIdEqualTo(BigDecimal value) {
            addCriterion("SET_ID =", value, "setId");
            return (Criteria) this;
        }

        public Criteria andSetIdNotEqualTo(BigDecimal value) {
            addCriterion("SET_ID <>", value, "setId");
            return (Criteria) this;
        }

        public Criteria andSetIdGreaterThan(BigDecimal value) {
            addCriterion("SET_ID >", value, "setId");
            return (Criteria) this;
        }

        public Criteria andSetIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SET_ID >=", value, "setId");
            return (Criteria) this;
        }

        public Criteria andSetIdLessThan(BigDecimal value) {
            addCriterion("SET_ID <", value, "setId");
            return (Criteria) this;
        }

        public Criteria andSetIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SET_ID <=", value, "setId");
            return (Criteria) this;
        }

        public Criteria andSetIdIn(List<BigDecimal> values) {
            addCriterion("SET_ID in", values, "setId");
            return (Criteria) this;
        }

        public Criteria andSetIdNotIn(List<BigDecimal> values) {
            addCriterion("SET_ID not in", values, "setId");
            return (Criteria) this;
        }

        public Criteria andSetIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SET_ID between", value1, value2, "setId");
            return (Criteria) this;
        }

        public Criteria andSetIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SET_ID not between", value1, value2, "setId");
            return (Criteria) this;
        }

        public Criteria andAttrNameIsNull() {
            addCriterion("ATTR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAttrNameIsNotNull() {
            addCriterion("ATTR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAttrNameEqualTo(String value) {
            addCriterion("ATTR_NAME =", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameNotEqualTo(String value) {
            addCriterion("ATTR_NAME <>", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameGreaterThan(String value) {
            addCriterion("ATTR_NAME >", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameGreaterThanOrEqualTo(String value) {
            addCriterion("ATTR_NAME >=", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameLessThan(String value) {
            addCriterion("ATTR_NAME <", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameLessThanOrEqualTo(String value) {
            addCriterion("ATTR_NAME <=", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameLike(String value) {
            addCriterion("ATTR_NAME like", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameNotLike(String value) {
            addCriterion("ATTR_NAME not like", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameIn(List<String> values) {
            addCriterion("ATTR_NAME in", values, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameNotIn(List<String> values) {
            addCriterion("ATTR_NAME not in", values, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameBetween(String value1, String value2) {
            addCriterion("ATTR_NAME between", value1, value2, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameNotBetween(String value1, String value2) {
            addCriterion("ATTR_NAME not between", value1, value2, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrUnitIsNull() {
            addCriterion("ATTR_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andAttrUnitIsNotNull() {
            addCriterion("ATTR_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andAttrUnitEqualTo(String value) {
            addCriterion("ATTR_UNIT =", value, "attrUnit");
            return (Criteria) this;
        }

        public Criteria andAttrUnitNotEqualTo(String value) {
            addCriterion("ATTR_UNIT <>", value, "attrUnit");
            return (Criteria) this;
        }

        public Criteria andAttrUnitGreaterThan(String value) {
            addCriterion("ATTR_UNIT >", value, "attrUnit");
            return (Criteria) this;
        }

        public Criteria andAttrUnitGreaterThanOrEqualTo(String value) {
            addCriterion("ATTR_UNIT >=", value, "attrUnit");
            return (Criteria) this;
        }

        public Criteria andAttrUnitLessThan(String value) {
            addCriterion("ATTR_UNIT <", value, "attrUnit");
            return (Criteria) this;
        }

        public Criteria andAttrUnitLessThanOrEqualTo(String value) {
            addCriterion("ATTR_UNIT <=", value, "attrUnit");
            return (Criteria) this;
        }

        public Criteria andAttrUnitLike(String value) {
            addCriterion("ATTR_UNIT like", value, "attrUnit");
            return (Criteria) this;
        }

        public Criteria andAttrUnitNotLike(String value) {
            addCriterion("ATTR_UNIT not like", value, "attrUnit");
            return (Criteria) this;
        }

        public Criteria andAttrUnitIn(List<String> values) {
            addCriterion("ATTR_UNIT in", values, "attrUnit");
            return (Criteria) this;
        }

        public Criteria andAttrUnitNotIn(List<String> values) {
            addCriterion("ATTR_UNIT not in", values, "attrUnit");
            return (Criteria) this;
        }

        public Criteria andAttrUnitBetween(String value1, String value2) {
            addCriterion("ATTR_UNIT between", value1, value2, "attrUnit");
            return (Criteria) this;
        }

        public Criteria andAttrUnitNotBetween(String value1, String value2) {
            addCriterion("ATTR_UNIT not between", value1, value2, "attrUnit");
            return (Criteria) this;
        }

        public Criteria andAttrTypeIsNull() {
            addCriterion("ATTR_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andAttrTypeIsNotNull() {
            addCriterion("ATTR_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAttrTypeEqualTo(String value) {
            addCriterion("ATTR_TYPE =", value, "attrType");
            return (Criteria) this;
        }

        public Criteria andAttrTypeNotEqualTo(String value) {
            addCriterion("ATTR_TYPE <>", value, "attrType");
            return (Criteria) this;
        }

        public Criteria andAttrTypeGreaterThan(String value) {
            addCriterion("ATTR_TYPE >", value, "attrType");
            return (Criteria) this;
        }

        public Criteria andAttrTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ATTR_TYPE >=", value, "attrType");
            return (Criteria) this;
        }

        public Criteria andAttrTypeLessThan(String value) {
            addCriterion("ATTR_TYPE <", value, "attrType");
            return (Criteria) this;
        }

        public Criteria andAttrTypeLessThanOrEqualTo(String value) {
            addCriterion("ATTR_TYPE <=", value, "attrType");
            return (Criteria) this;
        }

        public Criteria andAttrTypeLike(String value) {
            addCriterion("ATTR_TYPE like", value, "attrType");
            return (Criteria) this;
        }

        public Criteria andAttrTypeNotLike(String value) {
            addCriterion("ATTR_TYPE not like", value, "attrType");
            return (Criteria) this;
        }

        public Criteria andAttrTypeIn(List<String> values) {
            addCriterion("ATTR_TYPE in", values, "attrType");
            return (Criteria) this;
        }

        public Criteria andAttrTypeNotIn(List<String> values) {
            addCriterion("ATTR_TYPE not in", values, "attrType");
            return (Criteria) this;
        }

        public Criteria andAttrTypeBetween(String value1, String value2) {
            addCriterion("ATTR_TYPE between", value1, value2, "attrType");
            return (Criteria) this;
        }

        public Criteria andAttrTypeNotBetween(String value1, String value2) {
            addCriterion("ATTR_TYPE not between", value1, value2, "attrType");
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