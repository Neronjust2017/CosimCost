package com.njust.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ZxStationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ZxStationExample() {
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

        public Criteria andStaNameIsNull() {
            addCriterion("STA_NAME is null");
            return (Criteria) this;
        }

        public Criteria andStaNameIsNotNull() {
            addCriterion("STA_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andStaNameEqualTo(String value) {
            addCriterion("STA_NAME =", value, "staName");
            return (Criteria) this;
        }

        public Criteria andStaNameNotEqualTo(String value) {
            addCriterion("STA_NAME <>", value, "staName");
            return (Criteria) this;
        }

        public Criteria andStaNameGreaterThan(String value) {
            addCriterion("STA_NAME >", value, "staName");
            return (Criteria) this;
        }

        public Criteria andStaNameGreaterThanOrEqualTo(String value) {
            addCriterion("STA_NAME >=", value, "staName");
            return (Criteria) this;
        }

        public Criteria andStaNameLessThan(String value) {
            addCriterion("STA_NAME <", value, "staName");
            return (Criteria) this;
        }

        public Criteria andStaNameLessThanOrEqualTo(String value) {
            addCriterion("STA_NAME <=", value, "staName");
            return (Criteria) this;
        }

        public Criteria andStaNameLike(String value) {
            addCriterion("STA_NAME like", value, "staName");
            return (Criteria) this;
        }

        public Criteria andStaNameNotLike(String value) {
            addCriterion("STA_NAME not like", value, "staName");
            return (Criteria) this;
        }

        public Criteria andStaNameIn(List<String> values) {
            addCriterion("STA_NAME in", values, "staName");
            return (Criteria) this;
        }

        public Criteria andStaNameNotIn(List<String> values) {
            addCriterion("STA_NAME not in", values, "staName");
            return (Criteria) this;
        }

        public Criteria andStaNameBetween(String value1, String value2) {
            addCriterion("STA_NAME between", value1, value2, "staName");
            return (Criteria) this;
        }

        public Criteria andStaNameNotBetween(String value1, String value2) {
            addCriterion("STA_NAME not between", value1, value2, "staName");
            return (Criteria) this;
        }

        public Criteria andHStaIdIsNull() {
            addCriterion("H_STA_ID is null");
            return (Criteria) this;
        }

        public Criteria andHStaIdIsNotNull() {
            addCriterion("H_STA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andHStaIdEqualTo(BigDecimal value) {
            addCriterion("H_STA_ID =", value, "hStaId");
            return (Criteria) this;
        }

        public Criteria andHStaIdNotEqualTo(BigDecimal value) {
            addCriterion("H_STA_ID <>", value, "hStaId");
            return (Criteria) this;
        }

        public Criteria andHStaIdGreaterThan(BigDecimal value) {
            addCriterion("H_STA_ID >", value, "hStaId");
            return (Criteria) this;
        }

        public Criteria andHStaIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("H_STA_ID >=", value, "hStaId");
            return (Criteria) this;
        }

        public Criteria andHStaIdLessThan(BigDecimal value) {
            addCriterion("H_STA_ID <", value, "hStaId");
            return (Criteria) this;
        }

        public Criteria andHStaIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("H_STA_ID <=", value, "hStaId");
            return (Criteria) this;
        }

        public Criteria andHStaIdIn(List<BigDecimal> values) {
            addCriterion("H_STA_ID in", values, "hStaId");
            return (Criteria) this;
        }

        public Criteria andHStaIdNotIn(List<BigDecimal> values) {
            addCriterion("H_STA_ID not in", values, "hStaId");
            return (Criteria) this;
        }

        public Criteria andHStaIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("H_STA_ID between", value1, value2, "hStaId");
            return (Criteria) this;
        }

        public Criteria andHStaIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("H_STA_ID not between", value1, value2, "hStaId");
            return (Criteria) this;
        }

        public Criteria andHTimeIsNull() {
            addCriterion("H_TIME is null");
            return (Criteria) this;
        }

        public Criteria andHTimeIsNotNull() {
            addCriterion("H_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andHTimeEqualTo(BigDecimal value) {
            addCriterion("H_TIME =", value, "hTime");
            return (Criteria) this;
        }

        public Criteria andHTimeNotEqualTo(BigDecimal value) {
            addCriterion("H_TIME <>", value, "hTime");
            return (Criteria) this;
        }

        public Criteria andHTimeGreaterThan(BigDecimal value) {
            addCriterion("H_TIME >", value, "hTime");
            return (Criteria) this;
        }

        public Criteria andHTimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("H_TIME >=", value, "hTime");
            return (Criteria) this;
        }

        public Criteria andHTimeLessThan(BigDecimal value) {
            addCriterion("H_TIME <", value, "hTime");
            return (Criteria) this;
        }

        public Criteria andHTimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("H_TIME <=", value, "hTime");
            return (Criteria) this;
        }

        public Criteria andHTimeIn(List<BigDecimal> values) {
            addCriterion("H_TIME in", values, "hTime");
            return (Criteria) this;
        }

        public Criteria andHTimeNotIn(List<BigDecimal> values) {
            addCriterion("H_TIME not in", values, "hTime");
            return (Criteria) this;
        }

        public Criteria andHTimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("H_TIME between", value1, value2, "hTime");
            return (Criteria) this;
        }

        public Criteria andHTimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("H_TIME not between", value1, value2, "hTime");
            return (Criteria) this;
        }

        public Criteria andLTimeIsNull() {
            addCriterion("L_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLTimeIsNotNull() {
            addCriterion("L_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLTimeEqualTo(BigDecimal value) {
            addCriterion("L_TIME =", value, "lTime");
            return (Criteria) this;
        }

        public Criteria andLTimeNotEqualTo(BigDecimal value) {
            addCriterion("L_TIME <>", value, "lTime");
            return (Criteria) this;
        }

        public Criteria andLTimeGreaterThan(BigDecimal value) {
            addCriterion("L_TIME >", value, "lTime");
            return (Criteria) this;
        }

        public Criteria andLTimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("L_TIME >=", value, "lTime");
            return (Criteria) this;
        }

        public Criteria andLTimeLessThan(BigDecimal value) {
            addCriterion("L_TIME <", value, "lTime");
            return (Criteria) this;
        }

        public Criteria andLTimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("L_TIME <=", value, "lTime");
            return (Criteria) this;
        }

        public Criteria andLTimeIn(List<BigDecimal> values) {
            addCriterion("L_TIME in", values, "lTime");
            return (Criteria) this;
        }

        public Criteria andLTimeNotIn(List<BigDecimal> values) {
            addCriterion("L_TIME not in", values, "lTime");
            return (Criteria) this;
        }

        public Criteria andLTimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("L_TIME between", value1, value2, "lTime");
            return (Criteria) this;
        }

        public Criteria andLTimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("L_TIME not between", value1, value2, "lTime");
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

        public Criteria andTypeEqualTo(BigDecimal value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(BigDecimal value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(BigDecimal value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(BigDecimal value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<BigDecimal> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<BigDecimal> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andProIdIsNull() {
            addCriterion("PRO_ID is null");
            return (Criteria) this;
        }

        public Criteria andProIdIsNotNull() {
            addCriterion("PRO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProIdEqualTo(BigDecimal value) {
            addCriterion("PRO_ID =", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotEqualTo(BigDecimal value) {
            addCriterion("PRO_ID <>", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThan(BigDecimal value) {
            addCriterion("PRO_ID >", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRO_ID >=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThan(BigDecimal value) {
            addCriterion("PRO_ID <", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRO_ID <=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdIn(List<BigDecimal> values) {
            addCriterion("PRO_ID in", values, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotIn(List<BigDecimal> values) {
            addCriterion("PRO_ID not in", values, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRO_ID between", value1, value2, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRO_ID not between", value1, value2, "proId");
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