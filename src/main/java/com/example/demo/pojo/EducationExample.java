package com.example.demo.pojo;

import java.util.ArrayList;
import java.util.List;

public class EducationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EducationExample() {
        oredCriteria = new ArrayList<>();
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

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andEIdIsNull() {
            addCriterion("e_id is null");
            return (Criteria) this;
        }

        public Criteria andEIdIsNotNull() {
            addCriterion("e_id is not null");
            return (Criteria) this;
        }

        public Criteria andEIdEqualTo(Long value) {
            addCriterion("e_id =", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdNotEqualTo(Long value) {
            addCriterion("e_id <>", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdGreaterThan(Long value) {
            addCriterion("e_id >", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdGreaterThanOrEqualTo(Long value) {
            addCriterion("e_id >=", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdLessThan(Long value) {
            addCriterion("e_id <", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdLessThanOrEqualTo(Long value) {
            addCriterion("e_id <=", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdIn(List<Long> values) {
            addCriterion("e_id in", values, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdNotIn(List<Long> values) {
            addCriterion("e_id not in", values, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdBetween(Long value1, Long value2) {
            addCriterion("e_id between", value1, value2, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdNotBetween(Long value1, Long value2) {
            addCriterion("e_id not between", value1, value2, "eId");
            return (Criteria) this;
        }

        public Criteria andCIdIsNull() {
            addCriterion("c_id is null");
            return (Criteria) this;
        }

        public Criteria andCIdIsNotNull() {
            addCriterion("c_id is not null");
            return (Criteria) this;
        }

        public Criteria andCIdEqualTo(Long value) {
            addCriterion("c_id =", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotEqualTo(Long value) {
            addCriterion("c_id <>", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThan(Long value) {
            addCriterion("c_id >", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThanOrEqualTo(Long value) {
            addCriterion("c_id >=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThan(Long value) {
            addCriterion("c_id <", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThanOrEqualTo(Long value) {
            addCriterion("c_id <=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdIn(List<Long> values) {
            addCriterion("c_id in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotIn(List<Long> values) {
            addCriterion("c_id not in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdBetween(Long value1, Long value2) {
            addCriterion("c_id between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotBetween(Long value1, Long value2) {
            addCriterion("c_id not between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andTIdIsNull() {
            addCriterion("t_id is null");
            return (Criteria) this;
        }

        public Criteria andTIdIsNotNull() {
            addCriterion("t_id is not null");
            return (Criteria) this;
        }

        public Criteria andTIdEqualTo(Long value) {
            addCriterion("t_id =", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotEqualTo(Long value) {
            addCriterion("t_id <>", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThan(Long value) {
            addCriterion("t_id >", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t_id >=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThan(Long value) {
            addCriterion("t_id <", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThanOrEqualTo(Long value) {
            addCriterion("t_id <=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdIn(List<Long> values) {
            addCriterion("t_id in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotIn(List<Long> values) {
            addCriterion("t_id not in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdBetween(Long value1, Long value2) {
            addCriterion("t_id between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotBetween(Long value1, Long value2) {
            addCriterion("t_id not between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andEYearIsNull() {
            addCriterion("e_year is null");
            return (Criteria) this;
        }

        public Criteria andEYearIsNotNull() {
            addCriterion("e_year is not null");
            return (Criteria) this;
        }

        public Criteria andEYearEqualTo(Integer value) {
            addCriterion("e_year =", value, "eYear");
            return (Criteria) this;
        }

        public Criteria andEYearNotEqualTo(Integer value) {
            addCriterion("e_year <>", value, "eYear");
            return (Criteria) this;
        }

        public Criteria andEYearGreaterThan(Integer value) {
            addCriterion("e_year >", value, "eYear");
            return (Criteria) this;
        }

        public Criteria andEYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("e_year >=", value, "eYear");
            return (Criteria) this;
        }

        public Criteria andEYearLessThan(Integer value) {
            addCriterion("e_year <", value, "eYear");
            return (Criteria) this;
        }

        public Criteria andEYearLessThanOrEqualTo(Integer value) {
            addCriterion("e_year <=", value, "eYear");
            return (Criteria) this;
        }

        public Criteria andEYearIn(List<Integer> values) {
            addCriterion("e_year in", values, "eYear");
            return (Criteria) this;
        }

        public Criteria andEYearNotIn(List<Integer> values) {
            addCriterion("e_year not in", values, "eYear");
            return (Criteria) this;
        }

        public Criteria andEYearBetween(Integer value1, Integer value2) {
            addCriterion("e_year between", value1, value2, "eYear");
            return (Criteria) this;
        }

        public Criteria andEYearNotBetween(Integer value1, Integer value2) {
            addCriterion("e_year not between", value1, value2, "eYear");
            return (Criteria) this;
        }

        public Criteria andESemesterIsNull() {
            addCriterion("e_semester is null");
            return (Criteria) this;
        }

        public Criteria andESemesterIsNotNull() {
            addCriterion("e_semester is not null");
            return (Criteria) this;
        }

        public Criteria andESemesterEqualTo(Integer value) {
            addCriterion("e_semester =", value, "eSemester");
            return (Criteria) this;
        }

        public Criteria andESemesterNotEqualTo(Integer value) {
            addCriterion("e_semester <>", value, "eSemester");
            return (Criteria) this;
        }

        public Criteria andESemesterGreaterThan(Integer value) {
            addCriterion("e_semester >", value, "eSemester");
            return (Criteria) this;
        }

        public Criteria andESemesterGreaterThanOrEqualTo(Integer value) {
            addCriterion("e_semester >=", value, "eSemester");
            return (Criteria) this;
        }

        public Criteria andESemesterLessThan(Integer value) {
            addCriterion("e_semester <", value, "eSemester");
            return (Criteria) this;
        }

        public Criteria andESemesterLessThanOrEqualTo(Integer value) {
            addCriterion("e_semester <=", value, "eSemester");
            return (Criteria) this;
        }

        public Criteria andESemesterIn(List<Integer> values) {
            addCriterion("e_semester in", values, "eSemester");
            return (Criteria) this;
        }

        public Criteria andESemesterNotIn(List<Integer> values) {
            addCriterion("e_semester not in", values, "eSemester");
            return (Criteria) this;
        }

        public Criteria andESemesterBetween(Integer value1, Integer value2) {
            addCriterion("e_semester between", value1, value2, "eSemester");
            return (Criteria) this;
        }

        public Criteria andESemesterNotBetween(Integer value1, Integer value2) {
            addCriterion("e_semester not between", value1, value2, "eSemester");
            return (Criteria) this;
        }

        public Criteria andEFettleIsNull() {
            addCriterion("e_fettle is null");
            return (Criteria) this;
        }

        public Criteria andEFettleIsNotNull() {
            addCriterion("e_fettle is not null");
            return (Criteria) this;
        }

        public Criteria andEFettleEqualTo(Integer value) {
            addCriterion("e_fettle =", value, "eFettle");
            return (Criteria) this;
        }

        public Criteria andEFettleNotEqualTo(Integer value) {
            addCriterion("e_fettle <>", value, "eFettle");
            return (Criteria) this;
        }

        public Criteria andEFettleGreaterThan(Integer value) {
            addCriterion("e_fettle >", value, "eFettle");
            return (Criteria) this;
        }

        public Criteria andEFettleGreaterThanOrEqualTo(Integer value) {
            addCriterion("e_fettle >=", value, "eFettle");
            return (Criteria) this;
        }

        public Criteria andEFettleLessThan(Integer value) {
            addCriterion("e_fettle <", value, "eFettle");
            return (Criteria) this;
        }

        public Criteria andEFettleLessThanOrEqualTo(Integer value) {
            addCriterion("e_fettle <=", value, "eFettle");
            return (Criteria) this;
        }

        public Criteria andEFettleIn(List<Integer> values) {
            addCriterion("e_fettle in", values, "eFettle");
            return (Criteria) this;
        }

        public Criteria andEFettleNotIn(List<Integer> values) {
            addCriterion("e_fettle not in", values, "eFettle");
            return (Criteria) this;
        }

        public Criteria andEFettleBetween(Integer value1, Integer value2) {
            addCriterion("e_fettle between", value1, value2, "eFettle");
            return (Criteria) this;
        }

        public Criteria andEFettleNotBetween(Integer value1, Integer value2) {
            addCriterion("e_fettle not between", value1, value2, "eFettle");
            return (Criteria) this;
        }

        public Criteria andERemarkIsNull() {
            addCriterion("e_remark is null");
            return (Criteria) this;
        }

        public Criteria andERemarkIsNotNull() {
            addCriterion("e_remark is not null");
            return (Criteria) this;
        }

        public Criteria andERemarkEqualTo(String value) {
            addCriterion("e_remark =", value, "eRemark");
            return (Criteria) this;
        }

        public Criteria andERemarkNotEqualTo(String value) {
            addCriterion("e_remark <>", value, "eRemark");
            return (Criteria) this;
        }

        public Criteria andERemarkGreaterThan(String value) {
            addCriterion("e_remark >", value, "eRemark");
            return (Criteria) this;
        }

        public Criteria andERemarkGreaterThanOrEqualTo(String value) {
            addCriterion("e_remark >=", value, "eRemark");
            return (Criteria) this;
        }

        public Criteria andERemarkLessThan(String value) {
            addCriterion("e_remark <", value, "eRemark");
            return (Criteria) this;
        }

        public Criteria andERemarkLessThanOrEqualTo(String value) {
            addCriterion("e_remark <=", value, "eRemark");
            return (Criteria) this;
        }

        public Criteria andERemarkLike(String value) {
            addCriterion("e_remark like", value, "eRemark");
            return (Criteria) this;
        }

        public Criteria andERemarkNotLike(String value) {
            addCriterion("e_remark not like", value, "eRemark");
            return (Criteria) this;
        }

        public Criteria andERemarkIn(List<String> values) {
            addCriterion("e_remark in", values, "eRemark");
            return (Criteria) this;
        }

        public Criteria andERemarkNotIn(List<String> values) {
            addCriterion("e_remark not in", values, "eRemark");
            return (Criteria) this;
        }

        public Criteria andERemarkBetween(String value1, String value2) {
            addCriterion("e_remark between", value1, value2, "eRemark");
            return (Criteria) this;
        }

        public Criteria andERemarkNotBetween(String value1, String value2) {
            addCriterion("e_remark not between", value1, value2, "eRemark");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNull() {
            addCriterion("course_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNotNull() {
            addCriterion("course_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIdEqualTo(Integer value) {
            addCriterion("course_id =", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotEqualTo(Integer value) {
            addCriterion("course_id <>", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThan(Integer value) {
            addCriterion("course_id >", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_id >=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThan(Integer value) {
            addCriterion("course_id <", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThanOrEqualTo(Integer value) {
            addCriterion("course_id <=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIn(List<Integer> values) {
            addCriterion("course_id in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotIn(List<Integer> values) {
            addCriterion("course_id not in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdBetween(Integer value1, Integer value2) {
            addCriterion("course_id between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("course_id not between", value1, value2, "courseId");
            return (Criteria) this;
        }
    }

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