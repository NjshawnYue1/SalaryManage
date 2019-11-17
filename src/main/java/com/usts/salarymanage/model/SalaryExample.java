package com.usts.salarymanage.model;

import java.util.ArrayList;
import java.util.List;

public class SalaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public SalaryExample() {
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

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryIsNull() {
            addCriterion("base_salary is null");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryIsNotNull() {
            addCriterion("base_salary is not null");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryEqualTo(Long value) {
            addCriterion("base_salary =", value, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryNotEqualTo(Long value) {
            addCriterion("base_salary <>", value, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryGreaterThan(Long value) {
            addCriterion("base_salary >", value, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryGreaterThanOrEqualTo(Long value) {
            addCriterion("base_salary >=", value, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryLessThan(Long value) {
            addCriterion("base_salary <", value, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryLessThanOrEqualTo(Long value) {
            addCriterion("base_salary <=", value, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryIn(List<Long> values) {
            addCriterion("base_salary in", values, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryNotIn(List<Long> values) {
            addCriterion("base_salary not in", values, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryBetween(Long value1, Long value2) {
            addCriterion("base_salary between", value1, value2, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryNotBetween(Long value1, Long value2) {
            addCriterion("base_salary not between", value1, value2, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andAllowanceIsNull() {
            addCriterion("allowance is null");
            return (Criteria) this;
        }

        public Criteria andAllowanceIsNotNull() {
            addCriterion("allowance is not null");
            return (Criteria) this;
        }

        public Criteria andAllowanceEqualTo(Long value) {
            addCriterion("allowance =", value, "allowance");
            return (Criteria) this;
        }

        public Criteria andAllowanceNotEqualTo(Long value) {
            addCriterion("allowance <>", value, "allowance");
            return (Criteria) this;
        }

        public Criteria andAllowanceGreaterThan(Long value) {
            addCriterion("allowance >", value, "allowance");
            return (Criteria) this;
        }

        public Criteria andAllowanceGreaterThanOrEqualTo(Long value) {
            addCriterion("allowance >=", value, "allowance");
            return (Criteria) this;
        }

        public Criteria andAllowanceLessThan(Long value) {
            addCriterion("allowance <", value, "allowance");
            return (Criteria) this;
        }

        public Criteria andAllowanceLessThanOrEqualTo(Long value) {
            addCriterion("allowance <=", value, "allowance");
            return (Criteria) this;
        }

        public Criteria andAllowanceIn(List<Long> values) {
            addCriterion("allowance in", values, "allowance");
            return (Criteria) this;
        }

        public Criteria andAllowanceNotIn(List<Long> values) {
            addCriterion("allowance not in", values, "allowance");
            return (Criteria) this;
        }

        public Criteria andAllowanceBetween(Long value1, Long value2) {
            addCriterion("allowance between", value1, value2, "allowance");
            return (Criteria) this;
        }

        public Criteria andAllowanceNotBetween(Long value1, Long value2) {
            addCriterion("allowance not between", value1, value2, "allowance");
            return (Criteria) this;
        }

        public Criteria andBounsIsNull() {
            addCriterion("bouns is null");
            return (Criteria) this;
        }

        public Criteria andBounsIsNotNull() {
            addCriterion("bouns is not null");
            return (Criteria) this;
        }

        public Criteria andBounsEqualTo(Long value) {
            addCriterion("bouns =", value, "bouns");
            return (Criteria) this;
        }

        public Criteria andBounsNotEqualTo(Long value) {
            addCriterion("bouns <>", value, "bouns");
            return (Criteria) this;
        }

        public Criteria andBounsGreaterThan(Long value) {
            addCriterion("bouns >", value, "bouns");
            return (Criteria) this;
        }

        public Criteria andBounsGreaterThanOrEqualTo(Long value) {
            addCriterion("bouns >=", value, "bouns");
            return (Criteria) this;
        }

        public Criteria andBounsLessThan(Long value) {
            addCriterion("bouns <", value, "bouns");
            return (Criteria) this;
        }

        public Criteria andBounsLessThanOrEqualTo(Long value) {
            addCriterion("bouns <=", value, "bouns");
            return (Criteria) this;
        }

        public Criteria andBounsIn(List<Long> values) {
            addCriterion("bouns in", values, "bouns");
            return (Criteria) this;
        }

        public Criteria andBounsNotIn(List<Long> values) {
            addCriterion("bouns not in", values, "bouns");
            return (Criteria) this;
        }

        public Criteria andBounsBetween(Long value1, Long value2) {
            addCriterion("bouns between", value1, value2, "bouns");
            return (Criteria) this;
        }

        public Criteria andBounsNotBetween(Long value1, Long value2) {
            addCriterion("bouns not between", value1, value2, "bouns");
            return (Criteria) this;
        }

        public Criteria andInsuranceIsNull() {
            addCriterion("insurance is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceIsNotNull() {
            addCriterion("insurance is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceEqualTo(Long value) {
            addCriterion("insurance =", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceNotEqualTo(Long value) {
            addCriterion("insurance <>", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceGreaterThan(Long value) {
            addCriterion("insurance >", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceGreaterThanOrEqualTo(Long value) {
            addCriterion("insurance >=", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceLessThan(Long value) {
            addCriterion("insurance <", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceLessThanOrEqualTo(Long value) {
            addCriterion("insurance <=", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceIn(List<Long> values) {
            addCriterion("insurance in", values, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceNotIn(List<Long> values) {
            addCriterion("insurance not in", values, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceBetween(Long value1, Long value2) {
            addCriterion("insurance between", value1, value2, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceNotBetween(Long value1, Long value2) {
            addCriterion("insurance not between", value1, value2, "insurance");
            return (Criteria) this;
        }

        public Criteria andHousingFundIsNull() {
            addCriterion("housing_fund is null");
            return (Criteria) this;
        }

        public Criteria andHousingFundIsNotNull() {
            addCriterion("housing_fund is not null");
            return (Criteria) this;
        }

        public Criteria andHousingFundEqualTo(Long value) {
            addCriterion("housing_fund =", value, "housingFund");
            return (Criteria) this;
        }

        public Criteria andHousingFundNotEqualTo(Long value) {
            addCriterion("housing_fund <>", value, "housingFund");
            return (Criteria) this;
        }

        public Criteria andHousingFundGreaterThan(Long value) {
            addCriterion("housing_fund >", value, "housingFund");
            return (Criteria) this;
        }

        public Criteria andHousingFundGreaterThanOrEqualTo(Long value) {
            addCriterion("housing_fund >=", value, "housingFund");
            return (Criteria) this;
        }

        public Criteria andHousingFundLessThan(Long value) {
            addCriterion("housing_fund <", value, "housingFund");
            return (Criteria) this;
        }

        public Criteria andHousingFundLessThanOrEqualTo(Long value) {
            addCriterion("housing_fund <=", value, "housingFund");
            return (Criteria) this;
        }

        public Criteria andHousingFundIn(List<Long> values) {
            addCriterion("housing_fund in", values, "housingFund");
            return (Criteria) this;
        }

        public Criteria andHousingFundNotIn(List<Long> values) {
            addCriterion("housing_fund not in", values, "housingFund");
            return (Criteria) this;
        }

        public Criteria andHousingFundBetween(Long value1, Long value2) {
            addCriterion("housing_fund between", value1, value2, "housingFund");
            return (Criteria) this;
        }

        public Criteria andHousingFundNotBetween(Long value1, Long value2) {
            addCriterion("housing_fund not between", value1, value2, "housingFund");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNull() {
            addCriterion("emp_id is null");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNotNull() {
            addCriterion("emp_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmpIdEqualTo(Integer value) {
            addCriterion("emp_id =", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotEqualTo(Integer value) {
            addCriterion("emp_id <>", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThan(Integer value) {
            addCriterion("emp_id >", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("emp_id >=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThan(Integer value) {
            addCriterion("emp_id <", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThanOrEqualTo(Integer value) {
            addCriterion("emp_id <=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdIn(List<Integer> values) {
            addCriterion("emp_id in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotIn(List<Integer> values) {
            addCriterion("emp_id not in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdBetween(Integer value1, Integer value2) {
            addCriterion("emp_id between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("emp_id not between", value1, value2, "empId");
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