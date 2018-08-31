package com.njust.model;

import java.util.ArrayList;
import java.util.List;

public class LlcDataParameterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public LlcDataParameterExample() {
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

        public Criteria andDataparameteridIsNull() {
            addCriterion("DATAPARAMETERID is null");
            return (Criteria) this;
        }

        public Criteria andDataparameteridIsNotNull() {
            addCriterion("DATAPARAMETERID is not null");
            return (Criteria) this;
        }

        public Criteria andDataparameteridEqualTo(String value) {
            addCriterion("DATAPARAMETERID =", value, "dataparameterid");
            return (Criteria) this;
        }

        public Criteria andDataparameteridNotEqualTo(String value) {
            addCriterion("DATAPARAMETERID <>", value, "dataparameterid");
            return (Criteria) this;
        }

        public Criteria andDataparameteridGreaterThan(String value) {
            addCriterion("DATAPARAMETERID >", value, "dataparameterid");
            return (Criteria) this;
        }

        public Criteria andDataparameteridGreaterThanOrEqualTo(String value) {
            addCriterion("DATAPARAMETERID >=", value, "dataparameterid");
            return (Criteria) this;
        }

        public Criteria andDataparameteridLessThan(String value) {
            addCriterion("DATAPARAMETERID <", value, "dataparameterid");
            return (Criteria) this;
        }

        public Criteria andDataparameteridLessThanOrEqualTo(String value) {
            addCriterion("DATAPARAMETERID <=", value, "dataparameterid");
            return (Criteria) this;
        }

        public Criteria andDataparameteridLike(String value) {
            addCriterion("DATAPARAMETERID like", value, "dataparameterid");
            return (Criteria) this;
        }

        public Criteria andDataparameteridNotLike(String value) {
            addCriterion("DATAPARAMETERID not like", value, "dataparameterid");
            return (Criteria) this;
        }

        public Criteria andDataparameteridIn(List<String> values) {
            addCriterion("DATAPARAMETERID in", values, "dataparameterid");
            return (Criteria) this;
        }

        public Criteria andDataparameteridNotIn(List<String> values) {
            addCriterion("DATAPARAMETERID not in", values, "dataparameterid");
            return (Criteria) this;
        }

        public Criteria andDataparameteridBetween(String value1, String value2) {
            addCriterion("DATAPARAMETERID between", value1, value2, "dataparameterid");
            return (Criteria) this;
        }

        public Criteria andDataparameteridNotBetween(String value1, String value2) {
            addCriterion("DATAPARAMETERID not between", value1, value2, "dataparameterid");
            return (Criteria) this;
        }

        public Criteria andFlagIscheckedIsNull() {
            addCriterion("FLAG_ISCHECKED is null");
            return (Criteria) this;
        }

        public Criteria andFlagIscheckedIsNotNull() {
            addCriterion("FLAG_ISCHECKED is not null");
            return (Criteria) this;
        }

        public Criteria andFlagIscheckedEqualTo(Short value) {
            addCriterion("FLAG_ISCHECKED =", value, "flagIschecked");
            return (Criteria) this;
        }

        public Criteria andFlagIscheckedNotEqualTo(Short value) {
            addCriterion("FLAG_ISCHECKED <>", value, "flagIschecked");
            return (Criteria) this;
        }

        public Criteria andFlagIscheckedGreaterThan(Short value) {
            addCriterion("FLAG_ISCHECKED >", value, "flagIschecked");
            return (Criteria) this;
        }

        public Criteria andFlagIscheckedGreaterThanOrEqualTo(Short value) {
            addCriterion("FLAG_ISCHECKED >=", value, "flagIschecked");
            return (Criteria) this;
        }

        public Criteria andFlagIscheckedLessThan(Short value) {
            addCriterion("FLAG_ISCHECKED <", value, "flagIschecked");
            return (Criteria) this;
        }

        public Criteria andFlagIscheckedLessThanOrEqualTo(Short value) {
            addCriterion("FLAG_ISCHECKED <=", value, "flagIschecked");
            return (Criteria) this;
        }

        public Criteria andFlagIscheckedIn(List<Short> values) {
            addCriterion("FLAG_ISCHECKED in", values, "flagIschecked");
            return (Criteria) this;
        }

        public Criteria andFlagIscheckedNotIn(List<Short> values) {
            addCriterion("FLAG_ISCHECKED not in", values, "flagIschecked");
            return (Criteria) this;
        }

        public Criteria andFlagIscheckedBetween(Short value1, Short value2) {
            addCriterion("FLAG_ISCHECKED between", value1, value2, "flagIschecked");
            return (Criteria) this;
        }

        public Criteria andFlagIscheckedNotBetween(Short value1, Short value2) {
            addCriterion("FLAG_ISCHECKED not between", value1, value2, "flagIschecked");
            return (Criteria) this;
        }

        public Criteria andDataparameternameIsNull() {
            addCriterion("DATAPARAMETERNAME is null");
            return (Criteria) this;
        }

        public Criteria andDataparameternameIsNotNull() {
            addCriterion("DATAPARAMETERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDataparameternameEqualTo(String value) {
            addCriterion("DATAPARAMETERNAME =", value, "dataparametername");
            return (Criteria) this;
        }

        public Criteria andDataparameternameNotEqualTo(String value) {
            addCriterion("DATAPARAMETERNAME <>", value, "dataparametername");
            return (Criteria) this;
        }

        public Criteria andDataparameternameGreaterThan(String value) {
            addCriterion("DATAPARAMETERNAME >", value, "dataparametername");
            return (Criteria) this;
        }

        public Criteria andDataparameternameGreaterThanOrEqualTo(String value) {
            addCriterion("DATAPARAMETERNAME >=", value, "dataparametername");
            return (Criteria) this;
        }

        public Criteria andDataparameternameLessThan(String value) {
            addCriterion("DATAPARAMETERNAME <", value, "dataparametername");
            return (Criteria) this;
        }

        public Criteria andDataparameternameLessThanOrEqualTo(String value) {
            addCriterion("DATAPARAMETERNAME <=", value, "dataparametername");
            return (Criteria) this;
        }

        public Criteria andDataparameternameLike(String value) {
            addCriterion("DATAPARAMETERNAME like", value, "dataparametername");
            return (Criteria) this;
        }

        public Criteria andDataparameternameNotLike(String value) {
            addCriterion("DATAPARAMETERNAME not like", value, "dataparametername");
            return (Criteria) this;
        }

        public Criteria andDataparameternameIn(List<String> values) {
            addCriterion("DATAPARAMETERNAME in", values, "dataparametername");
            return (Criteria) this;
        }

        public Criteria andDataparameternameNotIn(List<String> values) {
            addCriterion("DATAPARAMETERNAME not in", values, "dataparametername");
            return (Criteria) this;
        }

        public Criteria andDataparameternameBetween(String value1, String value2) {
            addCriterion("DATAPARAMETERNAME between", value1, value2, "dataparametername");
            return (Criteria) this;
        }

        public Criteria andDataparameternameNotBetween(String value1, String value2) {
            addCriterion("DATAPARAMETERNAME not between", value1, value2, "dataparametername");
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

        public Criteria andTypeEqualTo(Short value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Short value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Short value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Short value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Short value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Short> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Short> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Short value1, Short value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Short value1, Short value2) {
            addCriterion("TYPE not between", value1, value2, "type");
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