package com.usts.salarymanage.model;

import java.util.ArrayList;
import java.util.List;

public class EmployeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public EmployeeExample() {
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

        public Criteria andEmpNameIsNull() {
            addCriterion("emp_name is null");
            return (Criteria) this;
        }

        public Criteria andEmpNameIsNotNull() {
            addCriterion("emp_name is not null");
            return (Criteria) this;
        }

        public Criteria andEmpNameEqualTo(String value) {
            addCriterion("emp_name =", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotEqualTo(String value) {
            addCriterion("emp_name <>", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameGreaterThan(String value) {
            addCriterion("emp_name >", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameGreaterThanOrEqualTo(String value) {
            addCriterion("emp_name >=", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLessThan(String value) {
            addCriterion("emp_name <", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLessThanOrEqualTo(String value) {
            addCriterion("emp_name <=", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLike(String value) {
            addCriterion("emp_name like", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotLike(String value) {
            addCriterion("emp_name not like", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameIn(List<String> values) {
            addCriterion("emp_name in", values, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotIn(List<String> values) {
            addCriterion("emp_name not in", values, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameBetween(String value1, String value2) {
            addCriterion("emp_name between", value1, value2, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotBetween(String value1, String value2) {
            addCriterion("emp_name not between", value1, value2, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpSexIsNull() {
            addCriterion("emp_sex is null");
            return (Criteria) this;
        }

        public Criteria andEmpSexIsNotNull() {
            addCriterion("emp_sex is not null");
            return (Criteria) this;
        }

        public Criteria andEmpSexEqualTo(String value) {
            addCriterion("emp_sex =", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexNotEqualTo(String value) {
            addCriterion("emp_sex <>", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexGreaterThan(String value) {
            addCriterion("emp_sex >", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexGreaterThanOrEqualTo(String value) {
            addCriterion("emp_sex >=", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexLessThan(String value) {
            addCriterion("emp_sex <", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexLessThanOrEqualTo(String value) {
            addCriterion("emp_sex <=", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexLike(String value) {
            addCriterion("emp_sex like", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexNotLike(String value) {
            addCriterion("emp_sex not like", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexIn(List<String> values) {
            addCriterion("emp_sex in", values, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexNotIn(List<String> values) {
            addCriterion("emp_sex not in", values, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexBetween(String value1, String value2) {
            addCriterion("emp_sex between", value1, value2, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexNotBetween(String value1, String value2) {
            addCriterion("emp_sex not between", value1, value2, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpAgeIsNull() {
            addCriterion("emp_age is null");
            return (Criteria) this;
        }

        public Criteria andEmpAgeIsNotNull() {
            addCriterion("emp_age is not null");
            return (Criteria) this;
        }

        public Criteria andEmpAgeEqualTo(Integer value) {
            addCriterion("emp_age =", value, "empAge");
            return (Criteria) this;
        }

        public Criteria andEmpAgeNotEqualTo(Integer value) {
            addCriterion("emp_age <>", value, "empAge");
            return (Criteria) this;
        }

        public Criteria andEmpAgeGreaterThan(Integer value) {
            addCriterion("emp_age >", value, "empAge");
            return (Criteria) this;
        }

        public Criteria andEmpAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("emp_age >=", value, "empAge");
            return (Criteria) this;
        }

        public Criteria andEmpAgeLessThan(Integer value) {
            addCriterion("emp_age <", value, "empAge");
            return (Criteria) this;
        }

        public Criteria andEmpAgeLessThanOrEqualTo(Integer value) {
            addCriterion("emp_age <=", value, "empAge");
            return (Criteria) this;
        }

        public Criteria andEmpAgeIn(List<Integer> values) {
            addCriterion("emp_age in", values, "empAge");
            return (Criteria) this;
        }

        public Criteria andEmpAgeNotIn(List<Integer> values) {
            addCriterion("emp_age not in", values, "empAge");
            return (Criteria) this;
        }

        public Criteria andEmpAgeBetween(Integer value1, Integer value2) {
            addCriterion("emp_age between", value1, value2, "empAge");
            return (Criteria) this;
        }

        public Criteria andEmpAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("emp_age not between", value1, value2, "empAge");
            return (Criteria) this;
        }

        public Criteria andEmpDepartmentIsNull() {
            addCriterion("emp_department is null");
            return (Criteria) this;
        }

        public Criteria andEmpDepartmentIsNotNull() {
            addCriterion("emp_department is not null");
            return (Criteria) this;
        }

        public Criteria andEmpDepartmentEqualTo(Integer value) {
            addCriterion("emp_department =", value, "empDepartment");
            return (Criteria) this;
        }

        public Criteria andEmpDepartmentNotEqualTo(Integer value) {
            addCriterion("emp_department <>", value, "empDepartment");
            return (Criteria) this;
        }

        public Criteria andEmpDepartmentGreaterThan(Integer value) {
            addCriterion("emp_department >", value, "empDepartment");
            return (Criteria) this;
        }

        public Criteria andEmpDepartmentGreaterThanOrEqualTo(Integer value) {
            addCriterion("emp_department >=", value, "empDepartment");
            return (Criteria) this;
        }

        public Criteria andEmpDepartmentLessThan(Integer value) {
            addCriterion("emp_department <", value, "empDepartment");
            return (Criteria) this;
        }

        public Criteria andEmpDepartmentLessThanOrEqualTo(Integer value) {
            addCriterion("emp_department <=", value, "empDepartment");
            return (Criteria) this;
        }

        public Criteria andEmpDepartmentIn(List<Integer> values) {
            addCriterion("emp_department in", values, "empDepartment");
            return (Criteria) this;
        }

        public Criteria andEmpDepartmentNotIn(List<Integer> values) {
            addCriterion("emp_department not in", values, "empDepartment");
            return (Criteria) this;
        }

        public Criteria andEmpDepartmentBetween(Integer value1, Integer value2) {
            addCriterion("emp_department between", value1, value2, "empDepartment");
            return (Criteria) this;
        }

        public Criteria andEmpDepartmentNotBetween(Integer value1, Integer value2) {
            addCriterion("emp_department not between", value1, value2, "empDepartment");
            return (Criteria) this;
        }

        public Criteria andEmpCareerIsNull() {
            addCriterion("emp_career is null");
            return (Criteria) this;
        }

        public Criteria andEmpCareerIsNotNull() {
            addCriterion("emp_career is not null");
            return (Criteria) this;
        }

        public Criteria andEmpCareerEqualTo(Integer value) {
            addCriterion("emp_career =", value, "empCareer");
            return (Criteria) this;
        }

        public Criteria andEmpCareerNotEqualTo(Integer value) {
            addCriterion("emp_career <>", value, "empCareer");
            return (Criteria) this;
        }

        public Criteria andEmpCareerGreaterThan(Integer value) {
            addCriterion("emp_career >", value, "empCareer");
            return (Criteria) this;
        }

        public Criteria andEmpCareerGreaterThanOrEqualTo(Integer value) {
            addCriterion("emp_career >=", value, "empCareer");
            return (Criteria) this;
        }

        public Criteria andEmpCareerLessThan(Integer value) {
            addCriterion("emp_career <", value, "empCareer");
            return (Criteria) this;
        }

        public Criteria andEmpCareerLessThanOrEqualTo(Integer value) {
            addCriterion("emp_career <=", value, "empCareer");
            return (Criteria) this;
        }

        public Criteria andEmpCareerIn(List<Integer> values) {
            addCriterion("emp_career in", values, "empCareer");
            return (Criteria) this;
        }

        public Criteria andEmpCareerNotIn(List<Integer> values) {
            addCriterion("emp_career not in", values, "empCareer");
            return (Criteria) this;
        }

        public Criteria andEmpCareerBetween(Integer value1, Integer value2) {
            addCriterion("emp_career between", value1, value2, "empCareer");
            return (Criteria) this;
        }

        public Criteria andEmpCareerNotBetween(Integer value1, Integer value2) {
            addCriterion("emp_career not between", value1, value2, "empCareer");
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