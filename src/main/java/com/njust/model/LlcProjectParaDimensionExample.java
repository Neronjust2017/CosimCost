package com.njust.model;

import java.util.ArrayList;
import java.util.List;

public class LlcProjectParaDimensionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public LlcProjectParaDimensionExample() {
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

        public Criteria andProjectIdIsNull() {
            addCriterion("PROJECT_ID is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("PROJECT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(Integer value) {
            addCriterion("PROJECT_ID =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(Integer value) {
            addCriterion("PROJECT_ID <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(Integer value) {
            addCriterion("PROJECT_ID >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PROJECT_ID >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(Integer value) {
            addCriterion("PROJECT_ID <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("PROJECT_ID <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<Integer> values) {
            addCriterion("PROJECT_ID in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<Integer> values) {
            addCriterion("PROJECT_ID not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(Integer value1, Integer value2) {
            addCriterion("PROJECT_ID between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PROJECT_ID not between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andCostTreeIdIsNull() {
            addCriterion("COST_TREE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCostTreeIdIsNotNull() {
            addCriterion("COST_TREE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCostTreeIdEqualTo(Integer value) {
            addCriterion("COST_TREE_ID =", value, "costTreeId");
            return (Criteria) this;
        }

        public Criteria andCostTreeIdNotEqualTo(Integer value) {
            addCriterion("COST_TREE_ID <>", value, "costTreeId");
            return (Criteria) this;
        }

        public Criteria andCostTreeIdGreaterThan(Integer value) {
            addCriterion("COST_TREE_ID >", value, "costTreeId");
            return (Criteria) this;
        }

        public Criteria andCostTreeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("COST_TREE_ID >=", value, "costTreeId");
            return (Criteria) this;
        }

        public Criteria andCostTreeIdLessThan(Integer value) {
            addCriterion("COST_TREE_ID <", value, "costTreeId");
            return (Criteria) this;
        }

        public Criteria andCostTreeIdLessThanOrEqualTo(Integer value) {
            addCriterion("COST_TREE_ID <=", value, "costTreeId");
            return (Criteria) this;
        }

        public Criteria andCostTreeIdIn(List<Integer> values) {
            addCriterion("COST_TREE_ID in", values, "costTreeId");
            return (Criteria) this;
        }

        public Criteria andCostTreeIdNotIn(List<Integer> values) {
            addCriterion("COST_TREE_ID not in", values, "costTreeId");
            return (Criteria) this;
        }

        public Criteria andCostTreeIdBetween(Integer value1, Integer value2) {
            addCriterion("COST_TREE_ID between", value1, value2, "costTreeId");
            return (Criteria) this;
        }

        public Criteria andCostTreeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("COST_TREE_ID not between", value1, value2, "costTreeId");
            return (Criteria) this;
        }

        public Criteria andProductTreeIdIsNull() {
            addCriterion("PRODUCT_TREE_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductTreeIdIsNotNull() {
            addCriterion("PRODUCT_TREE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductTreeIdEqualTo(Integer value) {
            addCriterion("PRODUCT_TREE_ID =", value, "productTreeId");
            return (Criteria) this;
        }

        public Criteria andProductTreeIdNotEqualTo(Integer value) {
            addCriterion("PRODUCT_TREE_ID <>", value, "productTreeId");
            return (Criteria) this;
        }

        public Criteria andProductTreeIdGreaterThan(Integer value) {
            addCriterion("PRODUCT_TREE_ID >", value, "productTreeId");
            return (Criteria) this;
        }

        public Criteria andProductTreeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRODUCT_TREE_ID >=", value, "productTreeId");
            return (Criteria) this;
        }

        public Criteria andProductTreeIdLessThan(Integer value) {
            addCriterion("PRODUCT_TREE_ID <", value, "productTreeId");
            return (Criteria) this;
        }

        public Criteria andProductTreeIdLessThanOrEqualTo(Integer value) {
            addCriterion("PRODUCT_TREE_ID <=", value, "productTreeId");
            return (Criteria) this;
        }

        public Criteria andProductTreeIdIn(List<Integer> values) {
            addCriterion("PRODUCT_TREE_ID in", values, "productTreeId");
            return (Criteria) this;
        }

        public Criteria andProductTreeIdNotIn(List<Integer> values) {
            addCriterion("PRODUCT_TREE_ID not in", values, "productTreeId");
            return (Criteria) this;
        }

        public Criteria andProductTreeIdBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCT_TREE_ID between", value1, value2, "productTreeId");
            return (Criteria) this;
        }

        public Criteria andProductTreeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCT_TREE_ID not between", value1, value2, "productTreeId");
            return (Criteria) this;
        }

        public Criteria andBelongProductIdIsNull() {
            addCriterion("BELONG_PRODUCT_ID is null");
            return (Criteria) this;
        }

        public Criteria andBelongProductIdIsNotNull() {
            addCriterion("BELONG_PRODUCT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBelongProductIdEqualTo(Integer value) {
            addCriterion("BELONG_PRODUCT_ID =", value, "belongProductId");
            return (Criteria) this;
        }

        public Criteria andBelongProductIdNotEqualTo(Integer value) {
            addCriterion("BELONG_PRODUCT_ID <>", value, "belongProductId");
            return (Criteria) this;
        }

        public Criteria andBelongProductIdGreaterThan(Integer value) {
            addCriterion("BELONG_PRODUCT_ID >", value, "belongProductId");
            return (Criteria) this;
        }

        public Criteria andBelongProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("BELONG_PRODUCT_ID >=", value, "belongProductId");
            return (Criteria) this;
        }

        public Criteria andBelongProductIdLessThan(Integer value) {
            addCriterion("BELONG_PRODUCT_ID <", value, "belongProductId");
            return (Criteria) this;
        }

        public Criteria andBelongProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("BELONG_PRODUCT_ID <=", value, "belongProductId");
            return (Criteria) this;
        }

        public Criteria andBelongProductIdIn(List<Integer> values) {
            addCriterion("BELONG_PRODUCT_ID in", values, "belongProductId");
            return (Criteria) this;
        }

        public Criteria andBelongProductIdNotIn(List<Integer> values) {
            addCriterion("BELONG_PRODUCT_ID not in", values, "belongProductId");
            return (Criteria) this;
        }

        public Criteria andBelongProductIdBetween(Integer value1, Integer value2) {
            addCriterion("BELONG_PRODUCT_ID between", value1, value2, "belongProductId");
            return (Criteria) this;
        }

        public Criteria andBelongProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("BELONG_PRODUCT_ID not between", value1, value2, "belongProductId");
            return (Criteria) this;
        }

        public Criteria andTaskTreeIdIsNull() {
            addCriterion("TASK_TREE_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaskTreeIdIsNotNull() {
            addCriterion("TASK_TREE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTreeIdEqualTo(Integer value) {
            addCriterion("TASK_TREE_ID =", value, "taskTreeId");
            return (Criteria) this;
        }

        public Criteria andTaskTreeIdNotEqualTo(Integer value) {
            addCriterion("TASK_TREE_ID <>", value, "taskTreeId");
            return (Criteria) this;
        }

        public Criteria andTaskTreeIdGreaterThan(Integer value) {
            addCriterion("TASK_TREE_ID >", value, "taskTreeId");
            return (Criteria) this;
        }

        public Criteria andTaskTreeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TASK_TREE_ID >=", value, "taskTreeId");
            return (Criteria) this;
        }

        public Criteria andTaskTreeIdLessThan(Integer value) {
            addCriterion("TASK_TREE_ID <", value, "taskTreeId");
            return (Criteria) this;
        }

        public Criteria andTaskTreeIdLessThanOrEqualTo(Integer value) {
            addCriterion("TASK_TREE_ID <=", value, "taskTreeId");
            return (Criteria) this;
        }

        public Criteria andTaskTreeIdIn(List<Integer> values) {
            addCriterion("TASK_TREE_ID in", values, "taskTreeId");
            return (Criteria) this;
        }

        public Criteria andTaskTreeIdNotIn(List<Integer> values) {
            addCriterion("TASK_TREE_ID not in", values, "taskTreeId");
            return (Criteria) this;
        }

        public Criteria andTaskTreeIdBetween(Integer value1, Integer value2) {
            addCriterion("TASK_TREE_ID between", value1, value2, "taskTreeId");
            return (Criteria) this;
        }

        public Criteria andTaskTreeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TASK_TREE_ID not between", value1, value2, "taskTreeId");
            return (Criteria) this;
        }

        public Criteria andBelongTaskIdIsNull() {
            addCriterion("BELONG_TASK_ID is null");
            return (Criteria) this;
        }

        public Criteria andBelongTaskIdIsNotNull() {
            addCriterion("BELONG_TASK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBelongTaskIdEqualTo(Integer value) {
            addCriterion("BELONG_TASK_ID =", value, "belongTaskId");
            return (Criteria) this;
        }

        public Criteria andBelongTaskIdNotEqualTo(Integer value) {
            addCriterion("BELONG_TASK_ID <>", value, "belongTaskId");
            return (Criteria) this;
        }

        public Criteria andBelongTaskIdGreaterThan(Integer value) {
            addCriterion("BELONG_TASK_ID >", value, "belongTaskId");
            return (Criteria) this;
        }

        public Criteria andBelongTaskIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("BELONG_TASK_ID >=", value, "belongTaskId");
            return (Criteria) this;
        }

        public Criteria andBelongTaskIdLessThan(Integer value) {
            addCriterion("BELONG_TASK_ID <", value, "belongTaskId");
            return (Criteria) this;
        }

        public Criteria andBelongTaskIdLessThanOrEqualTo(Integer value) {
            addCriterion("BELONG_TASK_ID <=", value, "belongTaskId");
            return (Criteria) this;
        }

        public Criteria andBelongTaskIdIn(List<Integer> values) {
            addCriterion("BELONG_TASK_ID in", values, "belongTaskId");
            return (Criteria) this;
        }

        public Criteria andBelongTaskIdNotIn(List<Integer> values) {
            addCriterion("BELONG_TASK_ID not in", values, "belongTaskId");
            return (Criteria) this;
        }

        public Criteria andBelongTaskIdBetween(Integer value1, Integer value2) {
            addCriterion("BELONG_TASK_ID between", value1, value2, "belongTaskId");
            return (Criteria) this;
        }

        public Criteria andBelongTaskIdNotBetween(Integer value1, Integer value2) {
            addCriterion("BELONG_TASK_ID not between", value1, value2, "belongTaskId");
            return (Criteria) this;
        }

        public Criteria andResourceTreeIdIsNull() {
            addCriterion("RESOURCE_TREE_ID is null");
            return (Criteria) this;
        }

        public Criteria andResourceTreeIdIsNotNull() {
            addCriterion("RESOURCE_TREE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andResourceTreeIdEqualTo(Integer value) {
            addCriterion("RESOURCE_TREE_ID =", value, "resourceTreeId");
            return (Criteria) this;
        }

        public Criteria andResourceTreeIdNotEqualTo(Integer value) {
            addCriterion("RESOURCE_TREE_ID <>", value, "resourceTreeId");
            return (Criteria) this;
        }

        public Criteria andResourceTreeIdGreaterThan(Integer value) {
            addCriterion("RESOURCE_TREE_ID >", value, "resourceTreeId");
            return (Criteria) this;
        }

        public Criteria andResourceTreeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("RESOURCE_TREE_ID >=", value, "resourceTreeId");
            return (Criteria) this;
        }

        public Criteria andResourceTreeIdLessThan(Integer value) {
            addCriterion("RESOURCE_TREE_ID <", value, "resourceTreeId");
            return (Criteria) this;
        }

        public Criteria andResourceTreeIdLessThanOrEqualTo(Integer value) {
            addCriterion("RESOURCE_TREE_ID <=", value, "resourceTreeId");
            return (Criteria) this;
        }

        public Criteria andResourceTreeIdIn(List<Integer> values) {
            addCriterion("RESOURCE_TREE_ID in", values, "resourceTreeId");
            return (Criteria) this;
        }

        public Criteria andResourceTreeIdNotIn(List<Integer> values) {
            addCriterion("RESOURCE_TREE_ID not in", values, "resourceTreeId");
            return (Criteria) this;
        }

        public Criteria andResourceTreeIdBetween(Integer value1, Integer value2) {
            addCriterion("RESOURCE_TREE_ID between", value1, value2, "resourceTreeId");
            return (Criteria) this;
        }

        public Criteria andResourceTreeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("RESOURCE_TREE_ID not between", value1, value2, "resourceTreeId");
            return (Criteria) this;
        }

        public Criteria andBelongResourceIdIsNull() {
            addCriterion("BELONG_RESOURCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andBelongResourceIdIsNotNull() {
            addCriterion("BELONG_RESOURCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBelongResourceIdEqualTo(Integer value) {
            addCriterion("BELONG_RESOURCE_ID =", value, "belongResourceId");
            return (Criteria) this;
        }

        public Criteria andBelongResourceIdNotEqualTo(Integer value) {
            addCriterion("BELONG_RESOURCE_ID <>", value, "belongResourceId");
            return (Criteria) this;
        }

        public Criteria andBelongResourceIdGreaterThan(Integer value) {
            addCriterion("BELONG_RESOURCE_ID >", value, "belongResourceId");
            return (Criteria) this;
        }

        public Criteria andBelongResourceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("BELONG_RESOURCE_ID >=", value, "belongResourceId");
            return (Criteria) this;
        }

        public Criteria andBelongResourceIdLessThan(Integer value) {
            addCriterion("BELONG_RESOURCE_ID <", value, "belongResourceId");
            return (Criteria) this;
        }

        public Criteria andBelongResourceIdLessThanOrEqualTo(Integer value) {
            addCriterion("BELONG_RESOURCE_ID <=", value, "belongResourceId");
            return (Criteria) this;
        }

        public Criteria andBelongResourceIdIn(List<Integer> values) {
            addCriterion("BELONG_RESOURCE_ID in", values, "belongResourceId");
            return (Criteria) this;
        }

        public Criteria andBelongResourceIdNotIn(List<Integer> values) {
            addCriterion("BELONG_RESOURCE_ID not in", values, "belongResourceId");
            return (Criteria) this;
        }

        public Criteria andBelongResourceIdBetween(Integer value1, Integer value2) {
            addCriterion("BELONG_RESOURCE_ID between", value1, value2, "belongResourceId");
            return (Criteria) this;
        }

        public Criteria andBelongResourceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("BELONG_RESOURCE_ID not between", value1, value2, "belongResourceId");
            return (Criteria) this;
        }

        public Criteria andTimeTreeIdIsNull() {
            addCriterion("TIME_TREE_ID is null");
            return (Criteria) this;
        }

        public Criteria andTimeTreeIdIsNotNull() {
            addCriterion("TIME_TREE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTimeTreeIdEqualTo(Integer value) {
            addCriterion("TIME_TREE_ID =", value, "timeTreeId");
            return (Criteria) this;
        }

        public Criteria andTimeTreeIdNotEqualTo(Integer value) {
            addCriterion("TIME_TREE_ID <>", value, "timeTreeId");
            return (Criteria) this;
        }

        public Criteria andTimeTreeIdGreaterThan(Integer value) {
            addCriterion("TIME_TREE_ID >", value, "timeTreeId");
            return (Criteria) this;
        }

        public Criteria andTimeTreeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TIME_TREE_ID >=", value, "timeTreeId");
            return (Criteria) this;
        }

        public Criteria andTimeTreeIdLessThan(Integer value) {
            addCriterion("TIME_TREE_ID <", value, "timeTreeId");
            return (Criteria) this;
        }

        public Criteria andTimeTreeIdLessThanOrEqualTo(Integer value) {
            addCriterion("TIME_TREE_ID <=", value, "timeTreeId");
            return (Criteria) this;
        }

        public Criteria andTimeTreeIdIn(List<Integer> values) {
            addCriterion("TIME_TREE_ID in", values, "timeTreeId");
            return (Criteria) this;
        }

        public Criteria andTimeTreeIdNotIn(List<Integer> values) {
            addCriterion("TIME_TREE_ID not in", values, "timeTreeId");
            return (Criteria) this;
        }

        public Criteria andTimeTreeIdBetween(Integer value1, Integer value2) {
            addCriterion("TIME_TREE_ID between", value1, value2, "timeTreeId");
            return (Criteria) this;
        }

        public Criteria andTimeTreeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TIME_TREE_ID not between", value1, value2, "timeTreeId");
            return (Criteria) this;
        }

        public Criteria andBelongTimeIdIsNull() {
            addCriterion("BELONG_TIME_ID is null");
            return (Criteria) this;
        }

        public Criteria andBelongTimeIdIsNotNull() {
            addCriterion("BELONG_TIME_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBelongTimeIdEqualTo(Integer value) {
            addCriterion("BELONG_TIME_ID =", value, "belongTimeId");
            return (Criteria) this;
        }

        public Criteria andBelongTimeIdNotEqualTo(Integer value) {
            addCriterion("BELONG_TIME_ID <>", value, "belongTimeId");
            return (Criteria) this;
        }

        public Criteria andBelongTimeIdGreaterThan(Integer value) {
            addCriterion("BELONG_TIME_ID >", value, "belongTimeId");
            return (Criteria) this;
        }

        public Criteria andBelongTimeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("BELONG_TIME_ID >=", value, "belongTimeId");
            return (Criteria) this;
        }

        public Criteria andBelongTimeIdLessThan(Integer value) {
            addCriterion("BELONG_TIME_ID <", value, "belongTimeId");
            return (Criteria) this;
        }

        public Criteria andBelongTimeIdLessThanOrEqualTo(Integer value) {
            addCriterion("BELONG_TIME_ID <=", value, "belongTimeId");
            return (Criteria) this;
        }

        public Criteria andBelongTimeIdIn(List<Integer> values) {
            addCriterion("BELONG_TIME_ID in", values, "belongTimeId");
            return (Criteria) this;
        }

        public Criteria andBelongTimeIdNotIn(List<Integer> values) {
            addCriterion("BELONG_TIME_ID not in", values, "belongTimeId");
            return (Criteria) this;
        }

        public Criteria andBelongTimeIdBetween(Integer value1, Integer value2) {
            addCriterion("BELONG_TIME_ID between", value1, value2, "belongTimeId");
            return (Criteria) this;
        }

        public Criteria andBelongTimeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("BELONG_TIME_ID not between", value1, value2, "belongTimeId");
            return (Criteria) this;
        }

        public Criteria andTechnologyTreeIdIsNull() {
            addCriterion("TECHNOLOGY_TREE_ID is null");
            return (Criteria) this;
        }

        public Criteria andTechnologyTreeIdIsNotNull() {
            addCriterion("TECHNOLOGY_TREE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTechnologyTreeIdEqualTo(Integer value) {
            addCriterion("TECHNOLOGY_TREE_ID =", value, "technologyTreeId");
            return (Criteria) this;
        }

        public Criteria andTechnologyTreeIdNotEqualTo(Integer value) {
            addCriterion("TECHNOLOGY_TREE_ID <>", value, "technologyTreeId");
            return (Criteria) this;
        }

        public Criteria andTechnologyTreeIdGreaterThan(Integer value) {
            addCriterion("TECHNOLOGY_TREE_ID >", value, "technologyTreeId");
            return (Criteria) this;
        }

        public Criteria andTechnologyTreeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TECHNOLOGY_TREE_ID >=", value, "technologyTreeId");
            return (Criteria) this;
        }

        public Criteria andTechnologyTreeIdLessThan(Integer value) {
            addCriterion("TECHNOLOGY_TREE_ID <", value, "technologyTreeId");
            return (Criteria) this;
        }

        public Criteria andTechnologyTreeIdLessThanOrEqualTo(Integer value) {
            addCriterion("TECHNOLOGY_TREE_ID <=", value, "technologyTreeId");
            return (Criteria) this;
        }

        public Criteria andTechnologyTreeIdIn(List<Integer> values) {
            addCriterion("TECHNOLOGY_TREE_ID in", values, "technologyTreeId");
            return (Criteria) this;
        }

        public Criteria andTechnologyTreeIdNotIn(List<Integer> values) {
            addCriterion("TECHNOLOGY_TREE_ID not in", values, "technologyTreeId");
            return (Criteria) this;
        }

        public Criteria andTechnologyTreeIdBetween(Integer value1, Integer value2) {
            addCriterion("TECHNOLOGY_TREE_ID between", value1, value2, "technologyTreeId");
            return (Criteria) this;
        }

        public Criteria andTechnologyTreeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TECHNOLOGY_TREE_ID not between", value1, value2, "technologyTreeId");
            return (Criteria) this;
        }

        public Criteria andBelongTechnologyIdIsNull() {
            addCriterion("BELONG_TECHNOLOGY_ID is null");
            return (Criteria) this;
        }

        public Criteria andBelongTechnologyIdIsNotNull() {
            addCriterion("BELONG_TECHNOLOGY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBelongTechnologyIdEqualTo(Integer value) {
            addCriterion("BELONG_TECHNOLOGY_ID =", value, "belongTechnologyId");
            return (Criteria) this;
        }

        public Criteria andBelongTechnologyIdNotEqualTo(Integer value) {
            addCriterion("BELONG_TECHNOLOGY_ID <>", value, "belongTechnologyId");
            return (Criteria) this;
        }

        public Criteria andBelongTechnologyIdGreaterThan(Integer value) {
            addCriterion("BELONG_TECHNOLOGY_ID >", value, "belongTechnologyId");
            return (Criteria) this;
        }

        public Criteria andBelongTechnologyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("BELONG_TECHNOLOGY_ID >=", value, "belongTechnologyId");
            return (Criteria) this;
        }

        public Criteria andBelongTechnologyIdLessThan(Integer value) {
            addCriterion("BELONG_TECHNOLOGY_ID <", value, "belongTechnologyId");
            return (Criteria) this;
        }

        public Criteria andBelongTechnologyIdLessThanOrEqualTo(Integer value) {
            addCriterion("BELONG_TECHNOLOGY_ID <=", value, "belongTechnologyId");
            return (Criteria) this;
        }

        public Criteria andBelongTechnologyIdIn(List<Integer> values) {
            addCriterion("BELONG_TECHNOLOGY_ID in", values, "belongTechnologyId");
            return (Criteria) this;
        }

        public Criteria andBelongTechnologyIdNotIn(List<Integer> values) {
            addCriterion("BELONG_TECHNOLOGY_ID not in", values, "belongTechnologyId");
            return (Criteria) this;
        }

        public Criteria andBelongTechnologyIdBetween(Integer value1, Integer value2) {
            addCriterion("BELONG_TECHNOLOGY_ID between", value1, value2, "belongTechnologyId");
            return (Criteria) this;
        }

        public Criteria andBelongTechnologyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("BELONG_TECHNOLOGY_ID not between", value1, value2, "belongTechnologyId");
            return (Criteria) this;
        }

        public Criteria andParameterIdIsNull() {
            addCriterion("PARAMETER_ID is null");
            return (Criteria) this;
        }

        public Criteria andParameterIdIsNotNull() {
            addCriterion("PARAMETER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParameterIdEqualTo(Integer value) {
            addCriterion("PARAMETER_ID =", value, "parameterId");
            return (Criteria) this;
        }

        public Criteria andParameterIdNotEqualTo(Integer value) {
            addCriterion("PARAMETER_ID <>", value, "parameterId");
            return (Criteria) this;
        }

        public Criteria andParameterIdGreaterThan(Integer value) {
            addCriterion("PARAMETER_ID >", value, "parameterId");
            return (Criteria) this;
        }

        public Criteria andParameterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PARAMETER_ID >=", value, "parameterId");
            return (Criteria) this;
        }

        public Criteria andParameterIdLessThan(Integer value) {
            addCriterion("PARAMETER_ID <", value, "parameterId");
            return (Criteria) this;
        }

        public Criteria andParameterIdLessThanOrEqualTo(Integer value) {
            addCriterion("PARAMETER_ID <=", value, "parameterId");
            return (Criteria) this;
        }

        public Criteria andParameterIdIn(List<Integer> values) {
            addCriterion("PARAMETER_ID in", values, "parameterId");
            return (Criteria) this;
        }

        public Criteria andParameterIdNotIn(List<Integer> values) {
            addCriterion("PARAMETER_ID not in", values, "parameterId");
            return (Criteria) this;
        }

        public Criteria andParameterIdBetween(Integer value1, Integer value2) {
            addCriterion("PARAMETER_ID between", value1, value2, "parameterId");
            return (Criteria) this;
        }

        public Criteria andParameterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PARAMETER_ID not between", value1, value2, "parameterId");
            return (Criteria) this;
        }

        public Criteria andParameterNameIsNull() {
            addCriterion("PARAMETER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andParameterNameIsNotNull() {
            addCriterion("PARAMETER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andParameterNameEqualTo(String value) {
            addCriterion("PARAMETER_NAME =", value, "parameterName");
            return (Criteria) this;
        }

        public Criteria andParameterNameNotEqualTo(String value) {
            addCriterion("PARAMETER_NAME <>", value, "parameterName");
            return (Criteria) this;
        }

        public Criteria andParameterNameGreaterThan(String value) {
            addCriterion("PARAMETER_NAME >", value, "parameterName");
            return (Criteria) this;
        }

        public Criteria andParameterNameGreaterThanOrEqualTo(String value) {
            addCriterion("PARAMETER_NAME >=", value, "parameterName");
            return (Criteria) this;
        }

        public Criteria andParameterNameLessThan(String value) {
            addCriterion("PARAMETER_NAME <", value, "parameterName");
            return (Criteria) this;
        }

        public Criteria andParameterNameLessThanOrEqualTo(String value) {
            addCriterion("PARAMETER_NAME <=", value, "parameterName");
            return (Criteria) this;
        }

        public Criteria andParameterNameLike(String value) {
            addCriterion("PARAMETER_NAME like", value, "parameterName");
            return (Criteria) this;
        }

        public Criteria andParameterNameNotLike(String value) {
            addCriterion("PARAMETER_NAME not like", value, "parameterName");
            return (Criteria) this;
        }

        public Criteria andParameterNameIn(List<String> values) {
            addCriterion("PARAMETER_NAME in", values, "parameterName");
            return (Criteria) this;
        }

        public Criteria andParameterNameNotIn(List<String> values) {
            addCriterion("PARAMETER_NAME not in", values, "parameterName");
            return (Criteria) this;
        }

        public Criteria andParameterNameBetween(String value1, String value2) {
            addCriterion("PARAMETER_NAME between", value1, value2, "parameterName");
            return (Criteria) this;
        }

        public Criteria andParameterNameNotBetween(String value1, String value2) {
            addCriterion("PARAMETER_NAME not between", value1, value2, "parameterName");
            return (Criteria) this;
        }

        public Criteria andParameterDesIsNull() {
            addCriterion("PARAMETER_DES is null");
            return (Criteria) this;
        }

        public Criteria andParameterDesIsNotNull() {
            addCriterion("PARAMETER_DES is not null");
            return (Criteria) this;
        }

        public Criteria andParameterDesEqualTo(String value) {
            addCriterion("PARAMETER_DES =", value, "parameterDes");
            return (Criteria) this;
        }

        public Criteria andParameterDesNotEqualTo(String value) {
            addCriterion("PARAMETER_DES <>", value, "parameterDes");
            return (Criteria) this;
        }

        public Criteria andParameterDesGreaterThan(String value) {
            addCriterion("PARAMETER_DES >", value, "parameterDes");
            return (Criteria) this;
        }

        public Criteria andParameterDesGreaterThanOrEqualTo(String value) {
            addCriterion("PARAMETER_DES >=", value, "parameterDes");
            return (Criteria) this;
        }

        public Criteria andParameterDesLessThan(String value) {
            addCriterion("PARAMETER_DES <", value, "parameterDes");
            return (Criteria) this;
        }

        public Criteria andParameterDesLessThanOrEqualTo(String value) {
            addCriterion("PARAMETER_DES <=", value, "parameterDes");
            return (Criteria) this;
        }

        public Criteria andParameterDesLike(String value) {
            addCriterion("PARAMETER_DES like", value, "parameterDes");
            return (Criteria) this;
        }

        public Criteria andParameterDesNotLike(String value) {
            addCriterion("PARAMETER_DES not like", value, "parameterDes");
            return (Criteria) this;
        }

        public Criteria andParameterDesIn(List<String> values) {
            addCriterion("PARAMETER_DES in", values, "parameterDes");
            return (Criteria) this;
        }

        public Criteria andParameterDesNotIn(List<String> values) {
            addCriterion("PARAMETER_DES not in", values, "parameterDes");
            return (Criteria) this;
        }

        public Criteria andParameterDesBetween(String value1, String value2) {
            addCriterion("PARAMETER_DES between", value1, value2, "parameterDes");
            return (Criteria) this;
        }

        public Criteria andParameterDesNotBetween(String value1, String value2) {
            addCriterion("PARAMETER_DES not between", value1, value2, "parameterDes");
            return (Criteria) this;
        }

        public Criteria andVariablesIsNull() {
            addCriterion("VARIABLES is null");
            return (Criteria) this;
        }

        public Criteria andVariablesIsNotNull() {
            addCriterion("VARIABLES is not null");
            return (Criteria) this;
        }

        public Criteria andVariablesEqualTo(String value) {
            addCriterion("VARIABLES =", value, "variables");
            return (Criteria) this;
        }

        public Criteria andVariablesNotEqualTo(String value) {
            addCriterion("VARIABLES <>", value, "variables");
            return (Criteria) this;
        }

        public Criteria andVariablesGreaterThan(String value) {
            addCriterion("VARIABLES >", value, "variables");
            return (Criteria) this;
        }

        public Criteria andVariablesGreaterThanOrEqualTo(String value) {
            addCriterion("VARIABLES >=", value, "variables");
            return (Criteria) this;
        }

        public Criteria andVariablesLessThan(String value) {
            addCriterion("VARIABLES <", value, "variables");
            return (Criteria) this;
        }

        public Criteria andVariablesLessThanOrEqualTo(String value) {
            addCriterion("VARIABLES <=", value, "variables");
            return (Criteria) this;
        }

        public Criteria andVariablesLike(String value) {
            addCriterion("VARIABLES like", value, "variables");
            return (Criteria) this;
        }

        public Criteria andVariablesNotLike(String value) {
            addCriterion("VARIABLES not like", value, "variables");
            return (Criteria) this;
        }

        public Criteria andVariablesIn(List<String> values) {
            addCriterion("VARIABLES in", values, "variables");
            return (Criteria) this;
        }

        public Criteria andVariablesNotIn(List<String> values) {
            addCriterion("VARIABLES not in", values, "variables");
            return (Criteria) this;
        }

        public Criteria andVariablesBetween(String value1, String value2) {
            addCriterion("VARIABLES between", value1, value2, "variables");
            return (Criteria) this;
        }

        public Criteria andVariablesNotBetween(String value1, String value2) {
            addCriterion("VARIABLES not between", value1, value2, "variables");
            return (Criteria) this;
        }

        public Criteria andFunctionIsNull() {
            addCriterion("FUNCTION is null");
            return (Criteria) this;
        }

        public Criteria andFunctionIsNotNull() {
            addCriterion("FUNCTION is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionEqualTo(String value) {
            addCriterion("FUNCTION =", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionNotEqualTo(String value) {
            addCriterion("FUNCTION <>", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionGreaterThan(String value) {
            addCriterion("FUNCTION >", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionGreaterThanOrEqualTo(String value) {
            addCriterion("FUNCTION >=", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionLessThan(String value) {
            addCriterion("FUNCTION <", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionLessThanOrEqualTo(String value) {
            addCriterion("FUNCTION <=", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionLike(String value) {
            addCriterion("FUNCTION like", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionNotLike(String value) {
            addCriterion("FUNCTION not like", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionIn(List<String> values) {
            addCriterion("FUNCTION in", values, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionNotIn(List<String> values) {
            addCriterion("FUNCTION not in", values, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionBetween(String value1, String value2) {
            addCriterion("FUNCTION between", value1, value2, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionNotBetween(String value1, String value2) {
            addCriterion("FUNCTION not between", value1, value2, "function");
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