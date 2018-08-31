package com.njust.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LlcTrainDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public LlcTrainDataExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMaxrangeIsNull() {
            addCriterion("MAXRANGE is null");
            return (Criteria) this;
        }

        public Criteria andMaxrangeIsNotNull() {
            addCriterion("MAXRANGE is not null");
            return (Criteria) this;
        }

        public Criteria andMaxrangeEqualTo(BigDecimal value) {
            addCriterion("MAXRANGE =", value, "maxrange");
            return (Criteria) this;
        }

        public Criteria andMaxrangeNotEqualTo(BigDecimal value) {
            addCriterion("MAXRANGE <>", value, "maxrange");
            return (Criteria) this;
        }

        public Criteria andMaxrangeGreaterThan(BigDecimal value) {
            addCriterion("MAXRANGE >", value, "maxrange");
            return (Criteria) this;
        }

        public Criteria andMaxrangeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MAXRANGE >=", value, "maxrange");
            return (Criteria) this;
        }

        public Criteria andMaxrangeLessThan(BigDecimal value) {
            addCriterion("MAXRANGE <", value, "maxrange");
            return (Criteria) this;
        }

        public Criteria andMaxrangeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MAXRANGE <=", value, "maxrange");
            return (Criteria) this;
        }

        public Criteria andMaxrangeIn(List<BigDecimal> values) {
            addCriterion("MAXRANGE in", values, "maxrange");
            return (Criteria) this;
        }

        public Criteria andMaxrangeNotIn(List<BigDecimal> values) {
            addCriterion("MAXRANGE not in", values, "maxrange");
            return (Criteria) this;
        }

        public Criteria andMaxrangeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAXRANGE between", value1, value2, "maxrange");
            return (Criteria) this;
        }

        public Criteria andMaxrangeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAXRANGE not between", value1, value2, "maxrange");
            return (Criteria) this;
        }

        public Criteria andMaxheightIsNull() {
            addCriterion("MAXHEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andMaxheightIsNotNull() {
            addCriterion("MAXHEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andMaxheightEqualTo(BigDecimal value) {
            addCriterion("MAXHEIGHT =", value, "maxheight");
            return (Criteria) this;
        }

        public Criteria andMaxheightNotEqualTo(BigDecimal value) {
            addCriterion("MAXHEIGHT <>", value, "maxheight");
            return (Criteria) this;
        }

        public Criteria andMaxheightGreaterThan(BigDecimal value) {
            addCriterion("MAXHEIGHT >", value, "maxheight");
            return (Criteria) this;
        }

        public Criteria andMaxheightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MAXHEIGHT >=", value, "maxheight");
            return (Criteria) this;
        }

        public Criteria andMaxheightLessThan(BigDecimal value) {
            addCriterion("MAXHEIGHT <", value, "maxheight");
            return (Criteria) this;
        }

        public Criteria andMaxheightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MAXHEIGHT <=", value, "maxheight");
            return (Criteria) this;
        }

        public Criteria andMaxheightIn(List<BigDecimal> values) {
            addCriterion("MAXHEIGHT in", values, "maxheight");
            return (Criteria) this;
        }

        public Criteria andMaxheightNotIn(List<BigDecimal> values) {
            addCriterion("MAXHEIGHT not in", values, "maxheight");
            return (Criteria) this;
        }

        public Criteria andMaxheightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAXHEIGHT between", value1, value2, "maxheight");
            return (Criteria) this;
        }

        public Criteria andMaxheightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAXHEIGHT not between", value1, value2, "maxheight");
            return (Criteria) this;
        }

        public Criteria andMaxspeedIsNull() {
            addCriterion("MAXSPEED is null");
            return (Criteria) this;
        }

        public Criteria andMaxspeedIsNotNull() {
            addCriterion("MAXSPEED is not null");
            return (Criteria) this;
        }

        public Criteria andMaxspeedEqualTo(BigDecimal value) {
            addCriterion("MAXSPEED =", value, "maxspeed");
            return (Criteria) this;
        }

        public Criteria andMaxspeedNotEqualTo(BigDecimal value) {
            addCriterion("MAXSPEED <>", value, "maxspeed");
            return (Criteria) this;
        }

        public Criteria andMaxspeedGreaterThan(BigDecimal value) {
            addCriterion("MAXSPEED >", value, "maxspeed");
            return (Criteria) this;
        }

        public Criteria andMaxspeedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MAXSPEED >=", value, "maxspeed");
            return (Criteria) this;
        }

        public Criteria andMaxspeedLessThan(BigDecimal value) {
            addCriterion("MAXSPEED <", value, "maxspeed");
            return (Criteria) this;
        }

        public Criteria andMaxspeedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MAXSPEED <=", value, "maxspeed");
            return (Criteria) this;
        }

        public Criteria andMaxspeedIn(List<BigDecimal> values) {
            addCriterion("MAXSPEED in", values, "maxspeed");
            return (Criteria) this;
        }

        public Criteria andMaxspeedNotIn(List<BigDecimal> values) {
            addCriterion("MAXSPEED not in", values, "maxspeed");
            return (Criteria) this;
        }

        public Criteria andMaxspeedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAXSPEED between", value1, value2, "maxspeed");
            return (Criteria) this;
        }

        public Criteria andMaxspeedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAXSPEED not between", value1, value2, "maxspeed");
            return (Criteria) this;
        }

        public Criteria andMassIsNull() {
            addCriterion("MASS is null");
            return (Criteria) this;
        }

        public Criteria andMassIsNotNull() {
            addCriterion("MASS is not null");
            return (Criteria) this;
        }

        public Criteria andMassEqualTo(BigDecimal value) {
            addCriterion("MASS =", value, "mass");
            return (Criteria) this;
        }

        public Criteria andMassNotEqualTo(BigDecimal value) {
            addCriterion("MASS <>", value, "mass");
            return (Criteria) this;
        }

        public Criteria andMassGreaterThan(BigDecimal value) {
            addCriterion("MASS >", value, "mass");
            return (Criteria) this;
        }

        public Criteria andMassGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MASS >=", value, "mass");
            return (Criteria) this;
        }

        public Criteria andMassLessThan(BigDecimal value) {
            addCriterion("MASS <", value, "mass");
            return (Criteria) this;
        }

        public Criteria andMassLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MASS <=", value, "mass");
            return (Criteria) this;
        }

        public Criteria andMassIn(List<BigDecimal> values) {
            addCriterion("MASS in", values, "mass");
            return (Criteria) this;
        }

        public Criteria andMassNotIn(List<BigDecimal> values) {
            addCriterion("MASS not in", values, "mass");
            return (Criteria) this;
        }

        public Criteria andMassBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MASS between", value1, value2, "mass");
            return (Criteria) this;
        }

        public Criteria andMassNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MASS not between", value1, value2, "mass");
            return (Criteria) this;
        }

        public Criteria andMaxloadIsNull() {
            addCriterion("MAXLOAD is null");
            return (Criteria) this;
        }

        public Criteria andMaxloadIsNotNull() {
            addCriterion("MAXLOAD is not null");
            return (Criteria) this;
        }

        public Criteria andMaxloadEqualTo(BigDecimal value) {
            addCriterion("MAXLOAD =", value, "maxload");
            return (Criteria) this;
        }

        public Criteria andMaxloadNotEqualTo(BigDecimal value) {
            addCriterion("MAXLOAD <>", value, "maxload");
            return (Criteria) this;
        }

        public Criteria andMaxloadGreaterThan(BigDecimal value) {
            addCriterion("MAXLOAD >", value, "maxload");
            return (Criteria) this;
        }

        public Criteria andMaxloadGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MAXLOAD >=", value, "maxload");
            return (Criteria) this;
        }

        public Criteria andMaxloadLessThan(BigDecimal value) {
            addCriterion("MAXLOAD <", value, "maxload");
            return (Criteria) this;
        }

        public Criteria andMaxloadLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MAXLOAD <=", value, "maxload");
            return (Criteria) this;
        }

        public Criteria andMaxloadIn(List<BigDecimal> values) {
            addCriterion("MAXLOAD in", values, "maxload");
            return (Criteria) this;
        }

        public Criteria andMaxloadNotIn(List<BigDecimal> values) {
            addCriterion("MAXLOAD not in", values, "maxload");
            return (Criteria) this;
        }

        public Criteria andMaxloadBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAXLOAD between", value1, value2, "maxload");
            return (Criteria) this;
        }

        public Criteria andMaxloadNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAXLOAD not between", value1, value2, "maxload");
            return (Criteria) this;
        }

        public Criteria andMlengthIsNull() {
            addCriterion("MLENGTH is null");
            return (Criteria) this;
        }

        public Criteria andMlengthIsNotNull() {
            addCriterion("MLENGTH is not null");
            return (Criteria) this;
        }

        public Criteria andMlengthEqualTo(BigDecimal value) {
            addCriterion("MLENGTH =", value, "mlength");
            return (Criteria) this;
        }

        public Criteria andMlengthNotEqualTo(BigDecimal value) {
            addCriterion("MLENGTH <>", value, "mlength");
            return (Criteria) this;
        }

        public Criteria andMlengthGreaterThan(BigDecimal value) {
            addCriterion("MLENGTH >", value, "mlength");
            return (Criteria) this;
        }

        public Criteria andMlengthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MLENGTH >=", value, "mlength");
            return (Criteria) this;
        }

        public Criteria andMlengthLessThan(BigDecimal value) {
            addCriterion("MLENGTH <", value, "mlength");
            return (Criteria) this;
        }

        public Criteria andMlengthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MLENGTH <=", value, "mlength");
            return (Criteria) this;
        }

        public Criteria andMlengthIn(List<BigDecimal> values) {
            addCriterion("MLENGTH in", values, "mlength");
            return (Criteria) this;
        }

        public Criteria andMlengthNotIn(List<BigDecimal> values) {
            addCriterion("MLENGTH not in", values, "mlength");
            return (Criteria) this;
        }

        public Criteria andMlengthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MLENGTH between", value1, value2, "mlength");
            return (Criteria) this;
        }

        public Criteria andMlengthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MLENGTH not between", value1, value2, "mlength");
            return (Criteria) this;
        }

        public Criteria andMdiameterIsNull() {
            addCriterion("MDIAMETER is null");
            return (Criteria) this;
        }

        public Criteria andMdiameterIsNotNull() {
            addCriterion("MDIAMETER is not null");
            return (Criteria) this;
        }

        public Criteria andMdiameterEqualTo(BigDecimal value) {
            addCriterion("MDIAMETER =", value, "mdiameter");
            return (Criteria) this;
        }

        public Criteria andMdiameterNotEqualTo(BigDecimal value) {
            addCriterion("MDIAMETER <>", value, "mdiameter");
            return (Criteria) this;
        }

        public Criteria andMdiameterGreaterThan(BigDecimal value) {
            addCriterion("MDIAMETER >", value, "mdiameter");
            return (Criteria) this;
        }

        public Criteria andMdiameterGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MDIAMETER >=", value, "mdiameter");
            return (Criteria) this;
        }

        public Criteria andMdiameterLessThan(BigDecimal value) {
            addCriterion("MDIAMETER <", value, "mdiameter");
            return (Criteria) this;
        }

        public Criteria andMdiameterLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MDIAMETER <=", value, "mdiameter");
            return (Criteria) this;
        }

        public Criteria andMdiameterIn(List<BigDecimal> values) {
            addCriterion("MDIAMETER in", values, "mdiameter");
            return (Criteria) this;
        }

        public Criteria andMdiameterNotIn(List<BigDecimal> values) {
            addCriterion("MDIAMETER not in", values, "mdiameter");
            return (Criteria) this;
        }

        public Criteria andMdiameterBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MDIAMETER between", value1, value2, "mdiameter");
            return (Criteria) this;
        }

        public Criteria andMdiameterNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MDIAMETER not between", value1, value2, "mdiameter");
            return (Criteria) this;
        }

        public Criteria andMwinglengthIsNull() {
            addCriterion("MWINGLENGTH is null");
            return (Criteria) this;
        }

        public Criteria andMwinglengthIsNotNull() {
            addCriterion("MWINGLENGTH is not null");
            return (Criteria) this;
        }

        public Criteria andMwinglengthEqualTo(BigDecimal value) {
            addCriterion("MWINGLENGTH =", value, "mwinglength");
            return (Criteria) this;
        }

        public Criteria andMwinglengthNotEqualTo(BigDecimal value) {
            addCriterion("MWINGLENGTH <>", value, "mwinglength");
            return (Criteria) this;
        }

        public Criteria andMwinglengthGreaterThan(BigDecimal value) {
            addCriterion("MWINGLENGTH >", value, "mwinglength");
            return (Criteria) this;
        }

        public Criteria andMwinglengthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MWINGLENGTH >=", value, "mwinglength");
            return (Criteria) this;
        }

        public Criteria andMwinglengthLessThan(BigDecimal value) {
            addCriterion("MWINGLENGTH <", value, "mwinglength");
            return (Criteria) this;
        }

        public Criteria andMwinglengthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MWINGLENGTH <=", value, "mwinglength");
            return (Criteria) this;
        }

        public Criteria andMwinglengthIn(List<BigDecimal> values) {
            addCriterion("MWINGLENGTH in", values, "mwinglength");
            return (Criteria) this;
        }

        public Criteria andMwinglengthNotIn(List<BigDecimal> values) {
            addCriterion("MWINGLENGTH not in", values, "mwinglength");
            return (Criteria) this;
        }

        public Criteria andMwinglengthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MWINGLENGTH between", value1, value2, "mwinglength");
            return (Criteria) this;
        }

        public Criteria andMwinglengthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MWINGLENGTH not between", value1, value2, "mwinglength");
            return (Criteria) this;
        }

        public Criteria andMkillposibilityIsNull() {
            addCriterion("MKILLPOSIBILITY is null");
            return (Criteria) this;
        }

        public Criteria andMkillposibilityIsNotNull() {
            addCriterion("MKILLPOSIBILITY is not null");
            return (Criteria) this;
        }

        public Criteria andMkillposibilityEqualTo(BigDecimal value) {
            addCriterion("MKILLPOSIBILITY =", value, "mkillposibility");
            return (Criteria) this;
        }

        public Criteria andMkillposibilityNotEqualTo(BigDecimal value) {
            addCriterion("MKILLPOSIBILITY <>", value, "mkillposibility");
            return (Criteria) this;
        }

        public Criteria andMkillposibilityGreaterThan(BigDecimal value) {
            addCriterion("MKILLPOSIBILITY >", value, "mkillposibility");
            return (Criteria) this;
        }

        public Criteria andMkillposibilityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MKILLPOSIBILITY >=", value, "mkillposibility");
            return (Criteria) this;
        }

        public Criteria andMkillposibilityLessThan(BigDecimal value) {
            addCriterion("MKILLPOSIBILITY <", value, "mkillposibility");
            return (Criteria) this;
        }

        public Criteria andMkillposibilityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MKILLPOSIBILITY <=", value, "mkillposibility");
            return (Criteria) this;
        }

        public Criteria andMkillposibilityIn(List<BigDecimal> values) {
            addCriterion("MKILLPOSIBILITY in", values, "mkillposibility");
            return (Criteria) this;
        }

        public Criteria andMkillposibilityNotIn(List<BigDecimal> values) {
            addCriterion("MKILLPOSIBILITY not in", values, "mkillposibility");
            return (Criteria) this;
        }

        public Criteria andMkillposibilityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MKILLPOSIBILITY between", value1, value2, "mkillposibility");
            return (Criteria) this;
        }

        public Criteria andMkillposibilityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MKILLPOSIBILITY not between", value1, value2, "mkillposibility");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("YEAR is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("YEAR is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(String value) {
            addCriterion("YEAR =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(String value) {
            addCriterion("YEAR <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(String value) {
            addCriterion("YEAR >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(String value) {
            addCriterion("YEAR >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(String value) {
            addCriterion("YEAR <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(String value) {
            addCriterion("YEAR <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLike(String value) {
            addCriterion("YEAR like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotLike(String value) {
            addCriterion("YEAR not like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<String> values) {
            addCriterion("YEAR in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<String> values) {
            addCriterion("YEAR not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(String value1, String value2) {
            addCriterion("YEAR between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(String value1, String value2) {
            addCriterion("YEAR not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andCpiIsNull() {
            addCriterion("CPI is null");
            return (Criteria) this;
        }

        public Criteria andCpiIsNotNull() {
            addCriterion("CPI is not null");
            return (Criteria) this;
        }

        public Criteria andCpiEqualTo(String value) {
            addCriterion("CPI =", value, "cpi");
            return (Criteria) this;
        }

        public Criteria andCpiNotEqualTo(String value) {
            addCriterion("CPI <>", value, "cpi");
            return (Criteria) this;
        }

        public Criteria andCpiGreaterThan(String value) {
            addCriterion("CPI >", value, "cpi");
            return (Criteria) this;
        }

        public Criteria andCpiGreaterThanOrEqualTo(String value) {
            addCriterion("CPI >=", value, "cpi");
            return (Criteria) this;
        }

        public Criteria andCpiLessThan(String value) {
            addCriterion("CPI <", value, "cpi");
            return (Criteria) this;
        }

        public Criteria andCpiLessThanOrEqualTo(String value) {
            addCriterion("CPI <=", value, "cpi");
            return (Criteria) this;
        }

        public Criteria andCpiLike(String value) {
            addCriterion("CPI like", value, "cpi");
            return (Criteria) this;
        }

        public Criteria andCpiNotLike(String value) {
            addCriterion("CPI not like", value, "cpi");
            return (Criteria) this;
        }

        public Criteria andCpiIn(List<String> values) {
            addCriterion("CPI in", values, "cpi");
            return (Criteria) this;
        }

        public Criteria andCpiNotIn(List<String> values) {
            addCriterion("CPI not in", values, "cpi");
            return (Criteria) this;
        }

        public Criteria andCpiBetween(String value1, String value2) {
            addCriterion("CPI between", value1, value2, "cpi");
            return (Criteria) this;
        }

        public Criteria andCpiNotBetween(String value1, String value2) {
            addCriterion("CPI not between", value1, value2, "cpi");
            return (Criteria) this;
        }

        public Criteria andExpenseIsNull() {
            addCriterion("EXPENSE is null");
            return (Criteria) this;
        }

        public Criteria andExpenseIsNotNull() {
            addCriterion("EXPENSE is not null");
            return (Criteria) this;
        }

        public Criteria andExpenseEqualTo(BigDecimal value) {
            addCriterion("EXPENSE =", value, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseNotEqualTo(BigDecimal value) {
            addCriterion("EXPENSE <>", value, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseGreaterThan(BigDecimal value) {
            addCriterion("EXPENSE >", value, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXPENSE >=", value, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseLessThan(BigDecimal value) {
            addCriterion("EXPENSE <", value, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXPENSE <=", value, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseIn(List<BigDecimal> values) {
            addCriterion("EXPENSE in", values, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseNotIn(List<BigDecimal> values) {
            addCriterion("EXPENSE not in", values, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXPENSE between", value1, value2, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXPENSE not between", value1, value2, "expense");
            return (Criteria) this;
        }

        public Criteria andNetExpSameIsNull() {
            addCriterion("NET_EXP_SAME is null");
            return (Criteria) this;
        }

        public Criteria andNetExpSameIsNotNull() {
            addCriterion("NET_EXP_SAME is not null");
            return (Criteria) this;
        }

        public Criteria andNetExpSameEqualTo(BigDecimal value) {
            addCriterion("NET_EXP_SAME =", value, "netExpSame");
            return (Criteria) this;
        }

        public Criteria andNetExpSameNotEqualTo(BigDecimal value) {
            addCriterion("NET_EXP_SAME <>", value, "netExpSame");
            return (Criteria) this;
        }

        public Criteria andNetExpSameGreaterThan(BigDecimal value) {
            addCriterion("NET_EXP_SAME >", value, "netExpSame");
            return (Criteria) this;
        }

        public Criteria andNetExpSameGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NET_EXP_SAME >=", value, "netExpSame");
            return (Criteria) this;
        }

        public Criteria andNetExpSameLessThan(BigDecimal value) {
            addCriterion("NET_EXP_SAME <", value, "netExpSame");
            return (Criteria) this;
        }

        public Criteria andNetExpSameLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NET_EXP_SAME <=", value, "netExpSame");
            return (Criteria) this;
        }

        public Criteria andNetExpSameIn(List<BigDecimal> values) {
            addCriterion("NET_EXP_SAME in", values, "netExpSame");
            return (Criteria) this;
        }

        public Criteria andNetExpSameNotIn(List<BigDecimal> values) {
            addCriterion("NET_EXP_SAME not in", values, "netExpSame");
            return (Criteria) this;
        }

        public Criteria andNetExpSameBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NET_EXP_SAME between", value1, value2, "netExpSame");
            return (Criteria) this;
        }

        public Criteria andNetExpSameNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NET_EXP_SAME not between", value1, value2, "netExpSame");
            return (Criteria) this;
        }

        public Criteria andNetExpDiffIsNull() {
            addCriterion("NET_EXP_DIFF is null");
            return (Criteria) this;
        }

        public Criteria andNetExpDiffIsNotNull() {
            addCriterion("NET_EXP_DIFF is not null");
            return (Criteria) this;
        }

        public Criteria andNetExpDiffEqualTo(BigDecimal value) {
            addCriterion("NET_EXP_DIFF =", value, "netExpDiff");
            return (Criteria) this;
        }

        public Criteria andNetExpDiffNotEqualTo(BigDecimal value) {
            addCriterion("NET_EXP_DIFF <>", value, "netExpDiff");
            return (Criteria) this;
        }

        public Criteria andNetExpDiffGreaterThan(BigDecimal value) {
            addCriterion("NET_EXP_DIFF >", value, "netExpDiff");
            return (Criteria) this;
        }

        public Criteria andNetExpDiffGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NET_EXP_DIFF >=", value, "netExpDiff");
            return (Criteria) this;
        }

        public Criteria andNetExpDiffLessThan(BigDecimal value) {
            addCriterion("NET_EXP_DIFF <", value, "netExpDiff");
            return (Criteria) this;
        }

        public Criteria andNetExpDiffLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NET_EXP_DIFF <=", value, "netExpDiff");
            return (Criteria) this;
        }

        public Criteria andNetExpDiffIn(List<BigDecimal> values) {
            addCriterion("NET_EXP_DIFF in", values, "netExpDiff");
            return (Criteria) this;
        }

        public Criteria andNetExpDiffNotIn(List<BigDecimal> values) {
            addCriterion("NET_EXP_DIFF not in", values, "netExpDiff");
            return (Criteria) this;
        }

        public Criteria andNetExpDiffBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NET_EXP_DIFF between", value1, value2, "netExpDiff");
            return (Criteria) this;
        }

        public Criteria andNetExpDiffNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NET_EXP_DIFF not between", value1, value2, "netExpDiff");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("COUNTRY is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("COUNTRY is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("COUNTRY =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("COUNTRY <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("COUNTRY >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("COUNTRY >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("COUNTRY <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("COUNTRY <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("COUNTRY like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("COUNTRY not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("COUNTRY in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("COUNTRY not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("COUNTRY between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("COUNTRY not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andBzExpenseIsNull() {
            addCriterion("BZ_EXPENSE is null");
            return (Criteria) this;
        }

        public Criteria andBzExpenseIsNotNull() {
            addCriterion("BZ_EXPENSE is not null");
            return (Criteria) this;
        }

        public Criteria andBzExpenseEqualTo(BigDecimal value) {
            addCriterion("BZ_EXPENSE =", value, "bzExpense");
            return (Criteria) this;
        }

        public Criteria andBzExpenseNotEqualTo(BigDecimal value) {
            addCriterion("BZ_EXPENSE <>", value, "bzExpense");
            return (Criteria) this;
        }

        public Criteria andBzExpenseGreaterThan(BigDecimal value) {
            addCriterion("BZ_EXPENSE >", value, "bzExpense");
            return (Criteria) this;
        }

        public Criteria andBzExpenseGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BZ_EXPENSE >=", value, "bzExpense");
            return (Criteria) this;
        }

        public Criteria andBzExpenseLessThan(BigDecimal value) {
            addCriterion("BZ_EXPENSE <", value, "bzExpense");
            return (Criteria) this;
        }

        public Criteria andBzExpenseLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BZ_EXPENSE <=", value, "bzExpense");
            return (Criteria) this;
        }

        public Criteria andBzExpenseIn(List<BigDecimal> values) {
            addCriterion("BZ_EXPENSE in", values, "bzExpense");
            return (Criteria) this;
        }

        public Criteria andBzExpenseNotIn(List<BigDecimal> values) {
            addCriterion("BZ_EXPENSE not in", values, "bzExpense");
            return (Criteria) this;
        }

        public Criteria andBzExpenseBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BZ_EXPENSE between", value1, value2, "bzExpense");
            return (Criteria) this;
        }

        public Criteria andBzExpenseNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BZ_EXPENSE not between", value1, value2, "bzExpense");
            return (Criteria) this;
        }

        public Criteria andYzExpenseIsNull() {
            addCriterion("YZ_EXPENSE is null");
            return (Criteria) this;
        }

        public Criteria andYzExpenseIsNotNull() {
            addCriterion("YZ_EXPENSE is not null");
            return (Criteria) this;
        }

        public Criteria andYzExpenseEqualTo(BigDecimal value) {
            addCriterion("YZ_EXPENSE =", value, "yzExpense");
            return (Criteria) this;
        }

        public Criteria andYzExpenseNotEqualTo(BigDecimal value) {
            addCriterion("YZ_EXPENSE <>", value, "yzExpense");
            return (Criteria) this;
        }

        public Criteria andYzExpenseGreaterThan(BigDecimal value) {
            addCriterion("YZ_EXPENSE >", value, "yzExpense");
            return (Criteria) this;
        }

        public Criteria andYzExpenseGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YZ_EXPENSE >=", value, "yzExpense");
            return (Criteria) this;
        }

        public Criteria andYzExpenseLessThan(BigDecimal value) {
            addCriterion("YZ_EXPENSE <", value, "yzExpense");
            return (Criteria) this;
        }

        public Criteria andYzExpenseLessThanOrEqualTo(BigDecimal value) {
            addCriterion("YZ_EXPENSE <=", value, "yzExpense");
            return (Criteria) this;
        }

        public Criteria andYzExpenseIn(List<BigDecimal> values) {
            addCriterion("YZ_EXPENSE in", values, "yzExpense");
            return (Criteria) this;
        }

        public Criteria andYzExpenseNotIn(List<BigDecimal> values) {
            addCriterion("YZ_EXPENSE not in", values, "yzExpense");
            return (Criteria) this;
        }

        public Criteria andYzExpenseBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YZ_EXPENSE between", value1, value2, "yzExpense");
            return (Criteria) this;
        }

        public Criteria andYzExpenseNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YZ_EXPENSE not between", value1, value2, "yzExpense");
            return (Criteria) this;
        }

        public Criteria andCgExpenseIsNull() {
            addCriterion("CG_EXPENSE is null");
            return (Criteria) this;
        }

        public Criteria andCgExpenseIsNotNull() {
            addCriterion("CG_EXPENSE is not null");
            return (Criteria) this;
        }

        public Criteria andCgExpenseEqualTo(BigDecimal value) {
            addCriterion("CG_EXPENSE =", value, "cgExpense");
            return (Criteria) this;
        }

        public Criteria andCgExpenseNotEqualTo(BigDecimal value) {
            addCriterion("CG_EXPENSE <>", value, "cgExpense");
            return (Criteria) this;
        }

        public Criteria andCgExpenseGreaterThan(BigDecimal value) {
            addCriterion("CG_EXPENSE >", value, "cgExpense");
            return (Criteria) this;
        }

        public Criteria andCgExpenseGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CG_EXPENSE >=", value, "cgExpense");
            return (Criteria) this;
        }

        public Criteria andCgExpenseLessThan(BigDecimal value) {
            addCriterion("CG_EXPENSE <", value, "cgExpense");
            return (Criteria) this;
        }

        public Criteria andCgExpenseLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CG_EXPENSE <=", value, "cgExpense");
            return (Criteria) this;
        }

        public Criteria andCgExpenseIn(List<BigDecimal> values) {
            addCriterion("CG_EXPENSE in", values, "cgExpense");
            return (Criteria) this;
        }

        public Criteria andCgExpenseNotIn(List<BigDecimal> values) {
            addCriterion("CG_EXPENSE not in", values, "cgExpense");
            return (Criteria) this;
        }

        public Criteria andCgExpenseBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CG_EXPENSE between", value1, value2, "cgExpense");
            return (Criteria) this;
        }

        public Criteria andCgExpenseNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CG_EXPENSE not between", value1, value2, "cgExpense");
            return (Criteria) this;
        }

        public Criteria andLzExpenseIsNull() {
            addCriterion("LZ_EXPENSE is null");
            return (Criteria) this;
        }

        public Criteria andLzExpenseIsNotNull() {
            addCriterion("LZ_EXPENSE is not null");
            return (Criteria) this;
        }

        public Criteria andLzExpenseEqualTo(BigDecimal value) {
            addCriterion("LZ_EXPENSE =", value, "lzExpense");
            return (Criteria) this;
        }

        public Criteria andLzExpenseNotEqualTo(BigDecimal value) {
            addCriterion("LZ_EXPENSE <>", value, "lzExpense");
            return (Criteria) this;
        }

        public Criteria andLzExpenseGreaterThan(BigDecimal value) {
            addCriterion("LZ_EXPENSE >", value, "lzExpense");
            return (Criteria) this;
        }

        public Criteria andLzExpenseGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LZ_EXPENSE >=", value, "lzExpense");
            return (Criteria) this;
        }

        public Criteria andLzExpenseLessThan(BigDecimal value) {
            addCriterion("LZ_EXPENSE <", value, "lzExpense");
            return (Criteria) this;
        }

        public Criteria andLzExpenseLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LZ_EXPENSE <=", value, "lzExpense");
            return (Criteria) this;
        }

        public Criteria andLzExpenseIn(List<BigDecimal> values) {
            addCriterion("LZ_EXPENSE in", values, "lzExpense");
            return (Criteria) this;
        }

        public Criteria andLzExpenseNotIn(List<BigDecimal> values) {
            addCriterion("LZ_EXPENSE not in", values, "lzExpense");
            return (Criteria) this;
        }

        public Criteria andLzExpenseBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LZ_EXPENSE between", value1, value2, "lzExpense");
            return (Criteria) this;
        }

        public Criteria andLzExpenseNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LZ_EXPENSE not between", value1, value2, "lzExpense");
            return (Criteria) this;
        }

        public Criteria andBfExpenseIsNull() {
            addCriterion("BF_EXPENSE is null");
            return (Criteria) this;
        }

        public Criteria andBfExpenseIsNotNull() {
            addCriterion("BF_EXPENSE is not null");
            return (Criteria) this;
        }

        public Criteria andBfExpenseEqualTo(BigDecimal value) {
            addCriterion("BF_EXPENSE =", value, "bfExpense");
            return (Criteria) this;
        }

        public Criteria andBfExpenseNotEqualTo(BigDecimal value) {
            addCriterion("BF_EXPENSE <>", value, "bfExpense");
            return (Criteria) this;
        }

        public Criteria andBfExpenseGreaterThan(BigDecimal value) {
            addCriterion("BF_EXPENSE >", value, "bfExpense");
            return (Criteria) this;
        }

        public Criteria andBfExpenseGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BF_EXPENSE >=", value, "bfExpense");
            return (Criteria) this;
        }

        public Criteria andBfExpenseLessThan(BigDecimal value) {
            addCriterion("BF_EXPENSE <", value, "bfExpense");
            return (Criteria) this;
        }

        public Criteria andBfExpenseLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BF_EXPENSE <=", value, "bfExpense");
            return (Criteria) this;
        }

        public Criteria andBfExpenseIn(List<BigDecimal> values) {
            addCriterion("BF_EXPENSE in", values, "bfExpense");
            return (Criteria) this;
        }

        public Criteria andBfExpenseNotIn(List<BigDecimal> values) {
            addCriterion("BF_EXPENSE not in", values, "bfExpense");
            return (Criteria) this;
        }

        public Criteria andBfExpenseBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BF_EXPENSE between", value1, value2, "bfExpense");
            return (Criteria) this;
        }

        public Criteria andBfExpenseNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BF_EXPENSE not between", value1, value2, "bfExpense");
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