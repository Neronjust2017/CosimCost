package com.njust.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LlcTrainModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public LlcTrainModelExample() {
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

        public Criteria andSvrtimeIsNull() {
            addCriterion("SvrTime is null");
            return (Criteria) this;
        }

        public Criteria andSvrtimeIsNotNull() {
            addCriterion("SvrTime is not null");
            return (Criteria) this;
        }

        public Criteria andSvrtimeEqualTo(String value) {
            addCriterion("SvrTime =", value, "svrtime");
            return (Criteria) this;
        }

        public Criteria andSvrtimeNotEqualTo(String value) {
            addCriterion("SvrTime <>", value, "svrtime");
            return (Criteria) this;
        }

        public Criteria andSvrtimeGreaterThan(String value) {
            addCriterion("SvrTime >", value, "svrtime");
            return (Criteria) this;
        }

        public Criteria andSvrtimeGreaterThanOrEqualTo(String value) {
            addCriterion("SvrTime >=", value, "svrtime");
            return (Criteria) this;
        }

        public Criteria andSvrtimeLessThan(String value) {
            addCriterion("SvrTime <", value, "svrtime");
            return (Criteria) this;
        }

        public Criteria andSvrtimeLessThanOrEqualTo(String value) {
            addCriterion("SvrTime <=", value, "svrtime");
            return (Criteria) this;
        }

        public Criteria andSvrtimeLike(String value) {
            addCriterion("SvrTime like", value, "svrtime");
            return (Criteria) this;
        }

        public Criteria andSvrtimeNotLike(String value) {
            addCriterion("SvrTime not like", value, "svrtime");
            return (Criteria) this;
        }

        public Criteria andSvrtimeIn(List<String> values) {
            addCriterion("SvrTime in", values, "svrtime");
            return (Criteria) this;
        }

        public Criteria andSvrtimeNotIn(List<String> values) {
            addCriterion("SvrTime not in", values, "svrtime");
            return (Criteria) this;
        }

        public Criteria andSvrtimeBetween(String value1, String value2) {
            addCriterion("SvrTime between", value1, value2, "svrtime");
            return (Criteria) this;
        }

        public Criteria andSvrtimeNotBetween(String value1, String value2) {
            addCriterion("SvrTime not between", value1, value2, "svrtime");
            return (Criteria) this;
        }

        public Criteria andParamsnumIsNull() {
            addCriterion("ParamsNum is null");
            return (Criteria) this;
        }

        public Criteria andParamsnumIsNotNull() {
            addCriterion("ParamsNum is not null");
            return (Criteria) this;
        }

        public Criteria andParamsnumEqualTo(BigDecimal value) {
            addCriterion("ParamsNum =", value, "paramsnum");
            return (Criteria) this;
        }

        public Criteria andParamsnumNotEqualTo(BigDecimal value) {
            addCriterion("ParamsNum <>", value, "paramsnum");
            return (Criteria) this;
        }

        public Criteria andParamsnumGreaterThan(BigDecimal value) {
            addCriterion("ParamsNum >", value, "paramsnum");
            return (Criteria) this;
        }

        public Criteria andParamsnumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ParamsNum >=", value, "paramsnum");
            return (Criteria) this;
        }

        public Criteria andParamsnumLessThan(BigDecimal value) {
            addCriterion("ParamsNum <", value, "paramsnum");
            return (Criteria) this;
        }

        public Criteria andParamsnumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ParamsNum <=", value, "paramsnum");
            return (Criteria) this;
        }

        public Criteria andParamsnumIn(List<BigDecimal> values) {
            addCriterion("ParamsNum in", values, "paramsnum");
            return (Criteria) this;
        }

        public Criteria andParamsnumNotIn(List<BigDecimal> values) {
            addCriterion("ParamsNum not in", values, "paramsnum");
            return (Criteria) this;
        }

        public Criteria andParamsnumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ParamsNum between", value1, value2, "paramsnum");
            return (Criteria) this;
        }

        public Criteria andParamsnumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ParamsNum not between", value1, value2, "paramsnum");
            return (Criteria) this;
        }

        public Criteria andParamsIsNull() {
            addCriterion("Params is null");
            return (Criteria) this;
        }

        public Criteria andParamsIsNotNull() {
            addCriterion("Params is not null");
            return (Criteria) this;
        }

        public Criteria andParamsEqualTo(String value) {
            addCriterion("Params =", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsNotEqualTo(String value) {
            addCriterion("Params <>", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsGreaterThan(String value) {
            addCriterion("Params >", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsGreaterThanOrEqualTo(String value) {
            addCriterion("Params >=", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsLessThan(String value) {
            addCriterion("Params <", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsLessThanOrEqualTo(String value) {
            addCriterion("Params <=", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsLike(String value) {
            addCriterion("Params like", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsNotLike(String value) {
            addCriterion("Params not like", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsIn(List<String> values) {
            addCriterion("Params in", values, "params");
            return (Criteria) this;
        }

        public Criteria andParamsNotIn(List<String> values) {
            addCriterion("Params not in", values, "params");
            return (Criteria) this;
        }

        public Criteria andParamsBetween(String value1, String value2) {
            addCriterion("Params between", value1, value2, "params");
            return (Criteria) this;
        }

        public Criteria andParamsNotBetween(String value1, String value2) {
            addCriterion("Params not between", value1, value2, "params");
            return (Criteria) this;
        }

        public Criteria andParamsaliasIsNull() {
            addCriterion("ParamsAlias is null");
            return (Criteria) this;
        }

        public Criteria andParamsaliasIsNotNull() {
            addCriterion("ParamsAlias is not null");
            return (Criteria) this;
        }

        public Criteria andParamsaliasEqualTo(String value) {
            addCriterion("ParamsAlias =", value, "paramsalias");
            return (Criteria) this;
        }

        public Criteria andParamsaliasNotEqualTo(String value) {
            addCriterion("ParamsAlias <>", value, "paramsalias");
            return (Criteria) this;
        }

        public Criteria andParamsaliasGreaterThan(String value) {
            addCriterion("ParamsAlias >", value, "paramsalias");
            return (Criteria) this;
        }

        public Criteria andParamsaliasGreaterThanOrEqualTo(String value) {
            addCriterion("ParamsAlias >=", value, "paramsalias");
            return (Criteria) this;
        }

        public Criteria andParamsaliasLessThan(String value) {
            addCriterion("ParamsAlias <", value, "paramsalias");
            return (Criteria) this;
        }

        public Criteria andParamsaliasLessThanOrEqualTo(String value) {
            addCriterion("ParamsAlias <=", value, "paramsalias");
            return (Criteria) this;
        }

        public Criteria andParamsaliasLike(String value) {
            addCriterion("ParamsAlias like", value, "paramsalias");
            return (Criteria) this;
        }

        public Criteria andParamsaliasNotLike(String value) {
            addCriterion("ParamsAlias not like", value, "paramsalias");
            return (Criteria) this;
        }

        public Criteria andParamsaliasIn(List<String> values) {
            addCriterion("ParamsAlias in", values, "paramsalias");
            return (Criteria) this;
        }

        public Criteria andParamsaliasNotIn(List<String> values) {
            addCriterion("ParamsAlias not in", values, "paramsalias");
            return (Criteria) this;
        }

        public Criteria andParamsaliasBetween(String value1, String value2) {
            addCriterion("ParamsAlias between", value1, value2, "paramsalias");
            return (Criteria) this;
        }

        public Criteria andParamsaliasNotBetween(String value1, String value2) {
            addCriterion("ParamsAlias not between", value1, value2, "paramsalias");
            return (Criteria) this;
        }

        public Criteria andTrmodeltypeIsNull() {
            addCriterion("TrModelType is null");
            return (Criteria) this;
        }

        public Criteria andTrmodeltypeIsNotNull() {
            addCriterion("TrModelType is not null");
            return (Criteria) this;
        }

        public Criteria andTrmodeltypeEqualTo(BigDecimal value) {
            addCriterion("TrModelType =", value, "trmodeltype");
            return (Criteria) this;
        }

        public Criteria andTrmodeltypeNotEqualTo(BigDecimal value) {
            addCriterion("TrModelType <>", value, "trmodeltype");
            return (Criteria) this;
        }

        public Criteria andTrmodeltypeGreaterThan(BigDecimal value) {
            addCriterion("TrModelType >", value, "trmodeltype");
            return (Criteria) this;
        }

        public Criteria andTrmodeltypeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TrModelType >=", value, "trmodeltype");
            return (Criteria) this;
        }

        public Criteria andTrmodeltypeLessThan(BigDecimal value) {
            addCriterion("TrModelType <", value, "trmodeltype");
            return (Criteria) this;
        }

        public Criteria andTrmodeltypeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TrModelType <=", value, "trmodeltype");
            return (Criteria) this;
        }

        public Criteria andTrmodeltypeIn(List<BigDecimal> values) {
            addCriterion("TrModelType in", values, "trmodeltype");
            return (Criteria) this;
        }

        public Criteria andTrmodeltypeNotIn(List<BigDecimal> values) {
            addCriterion("TrModelType not in", values, "trmodeltype");
            return (Criteria) this;
        }

        public Criteria andTrmodeltypeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TrModelType between", value1, value2, "trmodeltype");
            return (Criteria) this;
        }

        public Criteria andTrmodeltypeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TrModelType not between", value1, value2, "trmodeltype");
            return (Criteria) this;
        }

        public Criteria andTrmodeltypealiasIsNull() {
            addCriterion("TrModelTypeAlias is null");
            return (Criteria) this;
        }

        public Criteria andTrmodeltypealiasIsNotNull() {
            addCriterion("TrModelTypeAlias is not null");
            return (Criteria) this;
        }

        public Criteria andTrmodeltypealiasEqualTo(String value) {
            addCriterion("TrModelTypeAlias =", value, "trmodeltypealias");
            return (Criteria) this;
        }

        public Criteria andTrmodeltypealiasNotEqualTo(String value) {
            addCriterion("TrModelTypeAlias <>", value, "trmodeltypealias");
            return (Criteria) this;
        }

        public Criteria andTrmodeltypealiasGreaterThan(String value) {
            addCriterion("TrModelTypeAlias >", value, "trmodeltypealias");
            return (Criteria) this;
        }

        public Criteria andTrmodeltypealiasGreaterThanOrEqualTo(String value) {
            addCriterion("TrModelTypeAlias >=", value, "trmodeltypealias");
            return (Criteria) this;
        }

        public Criteria andTrmodeltypealiasLessThan(String value) {
            addCriterion("TrModelTypeAlias <", value, "trmodeltypealias");
            return (Criteria) this;
        }

        public Criteria andTrmodeltypealiasLessThanOrEqualTo(String value) {
            addCriterion("TrModelTypeAlias <=", value, "trmodeltypealias");
            return (Criteria) this;
        }

        public Criteria andTrmodeltypealiasLike(String value) {
            addCriterion("TrModelTypeAlias like", value, "trmodeltypealias");
            return (Criteria) this;
        }

        public Criteria andTrmodeltypealiasNotLike(String value) {
            addCriterion("TrModelTypeAlias not like", value, "trmodeltypealias");
            return (Criteria) this;
        }

        public Criteria andTrmodeltypealiasIn(List<String> values) {
            addCriterion("TrModelTypeAlias in", values, "trmodeltypealias");
            return (Criteria) this;
        }

        public Criteria andTrmodeltypealiasNotIn(List<String> values) {
            addCriterion("TrModelTypeAlias not in", values, "trmodeltypealias");
            return (Criteria) this;
        }

        public Criteria andTrmodeltypealiasBetween(String value1, String value2) {
            addCriterion("TrModelTypeAlias between", value1, value2, "trmodeltypealias");
            return (Criteria) this;
        }

        public Criteria andTrmodeltypealiasNotBetween(String value1, String value2) {
            addCriterion("TrModelTypeAlias not between", value1, value2, "trmodeltypealias");
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