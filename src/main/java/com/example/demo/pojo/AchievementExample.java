package com.example.demo.pojo;

import java.util.ArrayList;
import java.util.List;

public class AchievementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AchievementExample() {
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

        public Criteria andAIdIsNull() {
            addCriterion("a_id is null");
            return (Criteria) this;
        }

        public Criteria andAIdIsNotNull() {
            addCriterion("a_id is not null");
            return (Criteria) this;
        }

        public Criteria andAIdEqualTo(Long value) {
            addCriterion("a_id =", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotEqualTo(Long value) {
            addCriterion("a_id <>", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThan(Long value) {
            addCriterion("a_id >", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThanOrEqualTo(Long value) {
            addCriterion("a_id >=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThan(Long value) {
            addCriterion("a_id <", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThanOrEqualTo(Long value) {
            addCriterion("a_id <=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdIn(List<Long> values) {
            addCriterion("a_id in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotIn(List<Long> values) {
            addCriterion("a_id not in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdBetween(Long value1, Long value2) {
            addCriterion("a_id between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotBetween(Long value1, Long value2) {
            addCriterion("a_id not between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andSIdIsNull() {
            addCriterion("s_id is null");
            return (Criteria) this;
        }

        public Criteria andSIdIsNotNull() {
            addCriterion("s_id is not null");
            return (Criteria) this;
        }

        public Criteria andSIdEqualTo(Long value) {
            addCriterion("s_id =", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotEqualTo(Long value) {
            addCriterion("s_id <>", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThan(Long value) {
            addCriterion("s_id >", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThanOrEqualTo(Long value) {
            addCriterion("s_id >=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThan(Long value) {
            addCriterion("s_id <", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThanOrEqualTo(Long value) {
            addCriterion("s_id <=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdIn(List<Long> values) {
            addCriterion("s_id in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotIn(List<Long> values) {
            addCriterion("s_id not in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdBetween(Long value1, Long value2) {
            addCriterion("s_id between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotBetween(Long value1, Long value2) {
            addCriterion("s_id not between", value1, value2, "sId");
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

        public Criteria andAYearsIsNull() {
            addCriterion("a_years is null");
            return (Criteria) this;
        }

        public Criteria andAYearsIsNotNull() {
            addCriterion("a_years is not null");
            return (Criteria) this;
        }

        public Criteria andAYearsEqualTo(Integer value) {
            addCriterion("a_years =", value, "aYears");
            return (Criteria) this;
        }

        public Criteria andAYearsNotEqualTo(Integer value) {
            addCriterion("a_years <>", value, "aYears");
            return (Criteria) this;
        }

        public Criteria andAYearsGreaterThan(Integer value) {
            addCriterion("a_years >", value, "aYears");
            return (Criteria) this;
        }

        public Criteria andAYearsGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_years >=", value, "aYears");
            return (Criteria) this;
        }

        public Criteria andAYearsLessThan(Integer value) {
            addCriterion("a_years <", value, "aYears");
            return (Criteria) this;
        }

        public Criteria andAYearsLessThanOrEqualTo(Integer value) {
            addCriterion("a_years <=", value, "aYears");
            return (Criteria) this;
        }

        public Criteria andAYearsIn(List<Integer> values) {
            addCriterion("a_years in", values, "aYears");
            return (Criteria) this;
        }

        public Criteria andAYearsNotIn(List<Integer> values) {
            addCriterion("a_years not in", values, "aYears");
            return (Criteria) this;
        }

        public Criteria andAYearsBetween(Integer value1, Integer value2) {
            addCriterion("a_years between", value1, value2, "aYears");
            return (Criteria) this;
        }

        public Criteria andAYearsNotBetween(Integer value1, Integer value2) {
            addCriterion("a_years not between", value1, value2, "aYears");
            return (Criteria) this;
        }

        public Criteria andASemesterIsNull() {
            addCriterion("a_semester is null");
            return (Criteria) this;
        }

        public Criteria andASemesterIsNotNull() {
            addCriterion("a_semester is not null");
            return (Criteria) this;
        }

        public Criteria andASemesterEqualTo(Integer value) {
            addCriterion("a_semester =", value, "aSemester");
            return (Criteria) this;
        }

        public Criteria andASemesterNotEqualTo(Integer value) {
            addCriterion("a_semester <>", value, "aSemester");
            return (Criteria) this;
        }

        public Criteria andASemesterGreaterThan(Integer value) {
            addCriterion("a_semester >", value, "aSemester");
            return (Criteria) this;
        }

        public Criteria andASemesterGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_semester >=", value, "aSemester");
            return (Criteria) this;
        }

        public Criteria andASemesterLessThan(Integer value) {
            addCriterion("a_semester <", value, "aSemester");
            return (Criteria) this;
        }

        public Criteria andASemesterLessThanOrEqualTo(Integer value) {
            addCriterion("a_semester <=", value, "aSemester");
            return (Criteria) this;
        }

        public Criteria andASemesterIn(List<Integer> values) {
            addCriterion("a_semester in", values, "aSemester");
            return (Criteria) this;
        }

        public Criteria andASemesterNotIn(List<Integer> values) {
            addCriterion("a_semester not in", values, "aSemester");
            return (Criteria) this;
        }

        public Criteria andASemesterBetween(Integer value1, Integer value2) {
            addCriterion("a_semester between", value1, value2, "aSemester");
            return (Criteria) this;
        }

        public Criteria andASemesterNotBetween(Integer value1, Integer value2) {
            addCriterion("a_semester not between", value1, value2, "aSemester");
            return (Criteria) this;
        }

        public Criteria andAScoreIsNull() {
            addCriterion("a_score is null");
            return (Criteria) this;
        }

        public Criteria andAScoreIsNotNull() {
            addCriterion("a_score is not null");
            return (Criteria) this;
        }

        public Criteria andAScoreEqualTo(Integer value) {
            addCriterion("a_score =", value, "aScore");
            return (Criteria) this;
        }

        public Criteria andAScoreNotEqualTo(Integer value) {
            addCriterion("a_score <>", value, "aScore");
            return (Criteria) this;
        }

        public Criteria andAScoreGreaterThan(Integer value) {
            addCriterion("a_score >", value, "aScore");
            return (Criteria) this;
        }

        public Criteria andAScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_score >=", value, "aScore");
            return (Criteria) this;
        }

        public Criteria andAScoreLessThan(Integer value) {
            addCriterion("a_score <", value, "aScore");
            return (Criteria) this;
        }

        public Criteria andAScoreLessThanOrEqualTo(Integer value) {
            addCriterion("a_score <=", value, "aScore");
            return (Criteria) this;
        }

        public Criteria andAScoreIn(List<Integer> values) {
            addCriterion("a_score in", values, "aScore");
            return (Criteria) this;
        }

        public Criteria andAScoreNotIn(List<Integer> values) {
            addCriterion("a_score not in", values, "aScore");
            return (Criteria) this;
        }

        public Criteria andAScoreBetween(Integer value1, Integer value2) {
            addCriterion("a_score between", value1, value2, "aScore");
            return (Criteria) this;
        }

        public Criteria andAScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("a_score not between", value1, value2, "aScore");
            return (Criteria) this;
        }

        public Criteria andARemarkIsNull() {
            addCriterion("a_remark is null");
            return (Criteria) this;
        }

        public Criteria andARemarkIsNotNull() {
            addCriterion("a_remark is not null");
            return (Criteria) this;
        }

        public Criteria andARemarkEqualTo(String value) {
            addCriterion("a_remark =", value, "aRemark");
            return (Criteria) this;
        }

        public Criteria andARemarkNotEqualTo(String value) {
            addCriterion("a_remark <>", value, "aRemark");
            return (Criteria) this;
        }

        public Criteria andARemarkGreaterThan(String value) {
            addCriterion("a_remark >", value, "aRemark");
            return (Criteria) this;
        }

        public Criteria andARemarkGreaterThanOrEqualTo(String value) {
            addCriterion("a_remark >=", value, "aRemark");
            return (Criteria) this;
        }

        public Criteria andARemarkLessThan(String value) {
            addCriterion("a_remark <", value, "aRemark");
            return (Criteria) this;
        }

        public Criteria andARemarkLessThanOrEqualTo(String value) {
            addCriterion("a_remark <=", value, "aRemark");
            return (Criteria) this;
        }

        public Criteria andARemarkLike(String value) {
            addCriterion("a_remark like", value, "aRemark");
            return (Criteria) this;
        }

        public Criteria andARemarkNotLike(String value) {
            addCriterion("a_remark not like", value, "aRemark");
            return (Criteria) this;
        }

        public Criteria andARemarkIn(List<String> values) {
            addCriterion("a_remark in", values, "aRemark");
            return (Criteria) this;
        }

        public Criteria andARemarkNotIn(List<String> values) {
            addCriterion("a_remark not in", values, "aRemark");
            return (Criteria) this;
        }

        public Criteria andARemarkBetween(String value1, String value2) {
            addCriterion("a_remark between", value1, value2, "aRemark");
            return (Criteria) this;
        }

        public Criteria andARemarkNotBetween(String value1, String value2) {
            addCriterion("a_remark not between", value1, value2, "aRemark");
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