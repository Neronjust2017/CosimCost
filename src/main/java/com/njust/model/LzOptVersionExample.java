package com.njust.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LzOptVersionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public LzOptVersionExample() {
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

        public Criteria andOptNameIsNull() {
            addCriterion("OPT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOptNameIsNotNull() {
            addCriterion("OPT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOptNameEqualTo(String value) {
            addCriterion("OPT_NAME =", value, "optName");
            return (Criteria) this;
        }

        public Criteria andOptNameNotEqualTo(String value) {
            addCriterion("OPT_NAME <>", value, "optName");
            return (Criteria) this;
        }

        public Criteria andOptNameGreaterThan(String value) {
            addCriterion("OPT_NAME >", value, "optName");
            return (Criteria) this;
        }

        public Criteria andOptNameGreaterThanOrEqualTo(String value) {
            addCriterion("OPT_NAME >=", value, "optName");
            return (Criteria) this;
        }

        public Criteria andOptNameLessThan(String value) {
            addCriterion("OPT_NAME <", value, "optName");
            return (Criteria) this;
        }

        public Criteria andOptNameLessThanOrEqualTo(String value) {
            addCriterion("OPT_NAME <=", value, "optName");
            return (Criteria) this;
        }

        public Criteria andOptNameLike(String value) {
            addCriterion("OPT_NAME like", value, "optName");
            return (Criteria) this;
        }

        public Criteria andOptNameNotLike(String value) {
            addCriterion("OPT_NAME not like", value, "optName");
            return (Criteria) this;
        }

        public Criteria andOptNameIn(List<String> values) {
            addCriterion("OPT_NAME in", values, "optName");
            return (Criteria) this;
        }

        public Criteria andOptNameNotIn(List<String> values) {
            addCriterion("OPT_NAME not in", values, "optName");
            return (Criteria) this;
        }

        public Criteria andOptNameBetween(String value1, String value2) {
            addCriterion("OPT_NAME between", value1, value2, "optName");
            return (Criteria) this;
        }

        public Criteria andOptNameNotBetween(String value1, String value2) {
            addCriterion("OPT_NAME not between", value1, value2, "optName");
            return (Criteria) this;
        }

        public Criteria andOptDescribeIsNull() {
            addCriterion("OPT_DESCRIBE is null");
            return (Criteria) this;
        }

        public Criteria andOptDescribeIsNotNull() {
            addCriterion("OPT_DESCRIBE is not null");
            return (Criteria) this;
        }

        public Criteria andOptDescribeEqualTo(String value) {
            addCriterion("OPT_DESCRIBE =", value, "optDescribe");
            return (Criteria) this;
        }

        public Criteria andOptDescribeNotEqualTo(String value) {
            addCriterion("OPT_DESCRIBE <>", value, "optDescribe");
            return (Criteria) this;
        }

        public Criteria andOptDescribeGreaterThan(String value) {
            addCriterion("OPT_DESCRIBE >", value, "optDescribe");
            return (Criteria) this;
        }

        public Criteria andOptDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("OPT_DESCRIBE >=", value, "optDescribe");
            return (Criteria) this;
        }

        public Criteria andOptDescribeLessThan(String value) {
            addCriterion("OPT_DESCRIBE <", value, "optDescribe");
            return (Criteria) this;
        }

        public Criteria andOptDescribeLessThanOrEqualTo(String value) {
            addCriterion("OPT_DESCRIBE <=", value, "optDescribe");
            return (Criteria) this;
        }

        public Criteria andOptDescribeLike(String value) {
            addCriterion("OPT_DESCRIBE like", value, "optDescribe");
            return (Criteria) this;
        }

        public Criteria andOptDescribeNotLike(String value) {
            addCriterion("OPT_DESCRIBE not like", value, "optDescribe");
            return (Criteria) this;
        }

        public Criteria andOptDescribeIn(List<String> values) {
            addCriterion("OPT_DESCRIBE in", values, "optDescribe");
            return (Criteria) this;
        }

        public Criteria andOptDescribeNotIn(List<String> values) {
            addCriterion("OPT_DESCRIBE not in", values, "optDescribe");
            return (Criteria) this;
        }

        public Criteria andOptDescribeBetween(String value1, String value2) {
            addCriterion("OPT_DESCRIBE between", value1, value2, "optDescribe");
            return (Criteria) this;
        }

        public Criteria andOptDescribeNotBetween(String value1, String value2) {
            addCriterion("OPT_DESCRIBE not between", value1, value2, "optDescribe");
            return (Criteria) this;
        }

        public Criteria andOptFundIsNull() {
            addCriterion("OPT_FUND is null");
            return (Criteria) this;
        }

        public Criteria andOptFundIsNotNull() {
            addCriterion("OPT_FUND is not null");
            return (Criteria) this;
        }

        public Criteria andOptFundEqualTo(BigDecimal value) {
            addCriterion("OPT_FUND =", value, "optFund");
            return (Criteria) this;
        }

        public Criteria andOptFundNotEqualTo(BigDecimal value) {
            addCriterion("OPT_FUND <>", value, "optFund");
            return (Criteria) this;
        }

        public Criteria andOptFundGreaterThan(BigDecimal value) {
            addCriterion("OPT_FUND >", value, "optFund");
            return (Criteria) this;
        }

        public Criteria andOptFundGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OPT_FUND >=", value, "optFund");
            return (Criteria) this;
        }

        public Criteria andOptFundLessThan(BigDecimal value) {
            addCriterion("OPT_FUND <", value, "optFund");
            return (Criteria) this;
        }

        public Criteria andOptFundLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OPT_FUND <=", value, "optFund");
            return (Criteria) this;
        }

        public Criteria andOptFundIn(List<BigDecimal> values) {
            addCriterion("OPT_FUND in", values, "optFund");
            return (Criteria) this;
        }

        public Criteria andOptFundNotIn(List<BigDecimal> values) {
            addCriterion("OPT_FUND not in", values, "optFund");
            return (Criteria) this;
        }

        public Criteria andOptFundBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OPT_FUND between", value1, value2, "optFund");
            return (Criteria) this;
        }

        public Criteria andOptFundNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OPT_FUND not between", value1, value2, "optFund");
            return (Criteria) this;
        }

        public Criteria andOptBuildtimeIsNull() {
            addCriterion("OPT_BUILDTIME is null");
            return (Criteria) this;
        }

        public Criteria andOptBuildtimeIsNotNull() {
            addCriterion("OPT_BUILDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andOptBuildtimeEqualTo(String value) {
            addCriterion("OPT_BUILDTIME =", value, "optBuildtime");
            return (Criteria) this;
        }

        public Criteria andOptBuildtimeNotEqualTo(String value) {
            addCriterion("OPT_BUILDTIME <>", value, "optBuildtime");
            return (Criteria) this;
        }

        public Criteria andOptBuildtimeGreaterThan(String value) {
            addCriterion("OPT_BUILDTIME >", value, "optBuildtime");
            return (Criteria) this;
        }

        public Criteria andOptBuildtimeGreaterThanOrEqualTo(String value) {
            addCriterion("OPT_BUILDTIME >=", value, "optBuildtime");
            return (Criteria) this;
        }

        public Criteria andOptBuildtimeLessThan(String value) {
            addCriterion("OPT_BUILDTIME <", value, "optBuildtime");
            return (Criteria) this;
        }

        public Criteria andOptBuildtimeLessThanOrEqualTo(String value) {
            addCriterion("OPT_BUILDTIME <=", value, "optBuildtime");
            return (Criteria) this;
        }

        public Criteria andOptBuildtimeLike(String value) {
            addCriterion("OPT_BUILDTIME like", value, "optBuildtime");
            return (Criteria) this;
        }

        public Criteria andOptBuildtimeNotLike(String value) {
            addCriterion("OPT_BUILDTIME not like", value, "optBuildtime");
            return (Criteria) this;
        }

        public Criteria andOptBuildtimeIn(List<String> values) {
            addCriterion("OPT_BUILDTIME in", values, "optBuildtime");
            return (Criteria) this;
        }

        public Criteria andOptBuildtimeNotIn(List<String> values) {
            addCriterion("OPT_BUILDTIME not in", values, "optBuildtime");
            return (Criteria) this;
        }

        public Criteria andOptBuildtimeBetween(String value1, String value2) {
            addCriterion("OPT_BUILDTIME between", value1, value2, "optBuildtime");
            return (Criteria) this;
        }

        public Criteria andOptBuildtimeNotBetween(String value1, String value2) {
            addCriterion("OPT_BUILDTIME not between", value1, value2, "optBuildtime");
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