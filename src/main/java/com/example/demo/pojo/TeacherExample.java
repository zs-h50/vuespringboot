package com.example.demo.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andTNoIsNull() {
            addCriterion("t_no is null");
            return (Criteria) this;
        }

        public Criteria andTNoIsNotNull() {
            addCriterion("t_no is not null");
            return (Criteria) this;
        }

        public Criteria andTNoEqualTo(String value) {
            addCriterion("t_no =", value, "tNo");
            return (Criteria) this;
        }

        public Criteria andTNoNotEqualTo(String value) {
            addCriterion("t_no <>", value, "tNo");
            return (Criteria) this;
        }

        public Criteria andTNoGreaterThan(String value) {
            addCriterion("t_no >", value, "tNo");
            return (Criteria) this;
        }

        public Criteria andTNoGreaterThanOrEqualTo(String value) {
            addCriterion("t_no >=", value, "tNo");
            return (Criteria) this;
        }

        public Criteria andTNoLessThan(String value) {
            addCriterion("t_no <", value, "tNo");
            return (Criteria) this;
        }

        public Criteria andTNoLessThanOrEqualTo(String value) {
            addCriterion("t_no <=", value, "tNo");
            return (Criteria) this;
        }

        public Criteria andTNoLike(String value) {
            addCriterion("t_no like", value, "tNo");
            return (Criteria) this;
        }

        public Criteria andTNoNotLike(String value) {
            addCriterion("t_no not like", value, "tNo");
            return (Criteria) this;
        }

        public Criteria andTNoIn(List<String> values) {
            addCriterion("t_no in", values, "tNo");
            return (Criteria) this;
        }

        public Criteria andTNoNotIn(List<String> values) {
            addCriterion("t_no not in", values, "tNo");
            return (Criteria) this;
        }

        public Criteria andTNoBetween(String value1, String value2) {
            addCriterion("t_no between", value1, value2, "tNo");
            return (Criteria) this;
        }

        public Criteria andTNoNotBetween(String value1, String value2) {
            addCriterion("t_no not between", value1, value2, "tNo");
            return (Criteria) this;
        }

        public Criteria andTNameIsNull() {
            addCriterion("t_name is null");
            return (Criteria) this;
        }

        public Criteria andTNameIsNotNull() {
            addCriterion("t_name is not null");
            return (Criteria) this;
        }

        public Criteria andTNameEqualTo(String value) {
            addCriterion("t_name =", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotEqualTo(String value) {
            addCriterion("t_name <>", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameGreaterThan(String value) {
            addCriterion("t_name >", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameGreaterThanOrEqualTo(String value) {
            addCriterion("t_name >=", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameLessThan(String value) {
            addCriterion("t_name <", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameLessThanOrEqualTo(String value) {
            addCriterion("t_name <=", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameLike(String value) {
            addCriterion("t_name like", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotLike(String value) {
            addCriterion("t_name not like", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameIn(List<String> values) {
            addCriterion("t_name in", values, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotIn(List<String> values) {
            addCriterion("t_name not in", values, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameBetween(String value1, String value2) {
            addCriterion("t_name between", value1, value2, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotBetween(String value1, String value2) {
            addCriterion("t_name not between", value1, value2, "tName");
            return (Criteria) this;
        }

        public Criteria andTGenderIsNull() {
            addCriterion("t_gender is null");
            return (Criteria) this;
        }

        public Criteria andTGenderIsNotNull() {
            addCriterion("t_gender is not null");
            return (Criteria) this;
        }

        public Criteria andTGenderEqualTo(Integer value) {
            addCriterion("t_gender =", value, "tGender");
            return (Criteria) this;
        }

        public Criteria andTGenderNotEqualTo(Integer value) {
            addCriterion("t_gender <>", value, "tGender");
            return (Criteria) this;
        }

        public Criteria andTGenderGreaterThan(Integer value) {
            addCriterion("t_gender >", value, "tGender");
            return (Criteria) this;
        }

        public Criteria andTGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_gender >=", value, "tGender");
            return (Criteria) this;
        }

        public Criteria andTGenderLessThan(Integer value) {
            addCriterion("t_gender <", value, "tGender");
            return (Criteria) this;
        }

        public Criteria andTGenderLessThanOrEqualTo(Integer value) {
            addCriterion("t_gender <=", value, "tGender");
            return (Criteria) this;
        }

        public Criteria andTGenderIn(List<Integer> values) {
            addCriterion("t_gender in", values, "tGender");
            return (Criteria) this;
        }

        public Criteria andTGenderNotIn(List<Integer> values) {
            addCriterion("t_gender not in", values, "tGender");
            return (Criteria) this;
        }

        public Criteria andTGenderBetween(Integer value1, Integer value2) {
            addCriterion("t_gender between", value1, value2, "tGender");
            return (Criteria) this;
        }

        public Criteria andTGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("t_gender not between", value1, value2, "tGender");
            return (Criteria) this;
        }

        public Criteria andTPhoneIsNull() {
            addCriterion("t_phone is null");
            return (Criteria) this;
        }

        public Criteria andTPhoneIsNotNull() {
            addCriterion("t_phone is not null");
            return (Criteria) this;
        }

        public Criteria andTPhoneEqualTo(String value) {
            addCriterion("t_phone =", value, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneNotEqualTo(String value) {
            addCriterion("t_phone <>", value, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneGreaterThan(String value) {
            addCriterion("t_phone >", value, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("t_phone >=", value, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneLessThan(String value) {
            addCriterion("t_phone <", value, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneLessThanOrEqualTo(String value) {
            addCriterion("t_phone <=", value, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneLike(String value) {
            addCriterion("t_phone like", value, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneNotLike(String value) {
            addCriterion("t_phone not like", value, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneIn(List<String> values) {
            addCriterion("t_phone in", values, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneNotIn(List<String> values) {
            addCriterion("t_phone not in", values, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneBetween(String value1, String value2) {
            addCriterion("t_phone between", value1, value2, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneNotBetween(String value1, String value2) {
            addCriterion("t_phone not between", value1, value2, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTEmailIsNull() {
            addCriterion("t_email is null");
            return (Criteria) this;
        }

        public Criteria andTEmailIsNotNull() {
            addCriterion("t_email is not null");
            return (Criteria) this;
        }

        public Criteria andTEmailEqualTo(String value) {
            addCriterion("t_email =", value, "tEmail");
            return (Criteria) this;
        }

        public Criteria andTEmailNotEqualTo(String value) {
            addCriterion("t_email <>", value, "tEmail");
            return (Criteria) this;
        }

        public Criteria andTEmailGreaterThan(String value) {
            addCriterion("t_email >", value, "tEmail");
            return (Criteria) this;
        }

        public Criteria andTEmailGreaterThanOrEqualTo(String value) {
            addCriterion("t_email >=", value, "tEmail");
            return (Criteria) this;
        }

        public Criteria andTEmailLessThan(String value) {
            addCriterion("t_email <", value, "tEmail");
            return (Criteria) this;
        }

        public Criteria andTEmailLessThanOrEqualTo(String value) {
            addCriterion("t_email <=", value, "tEmail");
            return (Criteria) this;
        }

        public Criteria andTEmailLike(String value) {
            addCriterion("t_email like", value, "tEmail");
            return (Criteria) this;
        }

        public Criteria andTEmailNotLike(String value) {
            addCriterion("t_email not like", value, "tEmail");
            return (Criteria) this;
        }

        public Criteria andTEmailIn(List<String> values) {
            addCriterion("t_email in", values, "tEmail");
            return (Criteria) this;
        }

        public Criteria andTEmailNotIn(List<String> values) {
            addCriterion("t_email not in", values, "tEmail");
            return (Criteria) this;
        }

        public Criteria andTEmailBetween(String value1, String value2) {
            addCriterion("t_email between", value1, value2, "tEmail");
            return (Criteria) this;
        }

        public Criteria andTEmailNotBetween(String value1, String value2) {
            addCriterion("t_email not between", value1, value2, "tEmail");
            return (Criteria) this;
        }

        public Criteria andTBirthdayIsNull() {
            addCriterion("t_birthday is null");
            return (Criteria) this;
        }

        public Criteria andTBirthdayIsNotNull() {
            addCriterion("t_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andTBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("t_birthday =", value, "tBirthday");
            return (Criteria) this;
        }

        public Criteria andTBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("t_birthday <>", value, "tBirthday");
            return (Criteria) this;
        }

        public Criteria andTBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("t_birthday >", value, "tBirthday");
            return (Criteria) this;
        }

        public Criteria andTBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("t_birthday >=", value, "tBirthday");
            return (Criteria) this;
        }

        public Criteria andTBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("t_birthday <", value, "tBirthday");
            return (Criteria) this;
        }

        public Criteria andTBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("t_birthday <=", value, "tBirthday");
            return (Criteria) this;
        }

        public Criteria andTBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("t_birthday in", values, "tBirthday");
            return (Criteria) this;
        }

        public Criteria andTBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("t_birthday not in", values, "tBirthday");
            return (Criteria) this;
        }

        public Criteria andTBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("t_birthday between", value1, value2, "tBirthday");
            return (Criteria) this;
        }

        public Criteria andTBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("t_birthday not between", value1, value2, "tBirthday");
            return (Criteria) this;
        }

        public Criteria andTCardIsNull() {
            addCriterion("t_card is null");
            return (Criteria) this;
        }

        public Criteria andTCardIsNotNull() {
            addCriterion("t_card is not null");
            return (Criteria) this;
        }

        public Criteria andTCardEqualTo(String value) {
            addCriterion("t_card =", value, "tCard");
            return (Criteria) this;
        }

        public Criteria andTCardNotEqualTo(String value) {
            addCriterion("t_card <>", value, "tCard");
            return (Criteria) this;
        }

        public Criteria andTCardGreaterThan(String value) {
            addCriterion("t_card >", value, "tCard");
            return (Criteria) this;
        }

        public Criteria andTCardGreaterThanOrEqualTo(String value) {
            addCriterion("t_card >=", value, "tCard");
            return (Criteria) this;
        }

        public Criteria andTCardLessThan(String value) {
            addCriterion("t_card <", value, "tCard");
            return (Criteria) this;
        }

        public Criteria andTCardLessThanOrEqualTo(String value) {
            addCriterion("t_card <=", value, "tCard");
            return (Criteria) this;
        }

        public Criteria andTCardLike(String value) {
            addCriterion("t_card like", value, "tCard");
            return (Criteria) this;
        }

        public Criteria andTCardNotLike(String value) {
            addCriterion("t_card not like", value, "tCard");
            return (Criteria) this;
        }

        public Criteria andTCardIn(List<String> values) {
            addCriterion("t_card in", values, "tCard");
            return (Criteria) this;
        }

        public Criteria andTCardNotIn(List<String> values) {
            addCriterion("t_card not in", values, "tCard");
            return (Criteria) this;
        }

        public Criteria andTCardBetween(String value1, String value2) {
            addCriterion("t_card between", value1, value2, "tCard");
            return (Criteria) this;
        }

        public Criteria andTCardNotBetween(String value1, String value2) {
            addCriterion("t_card not between", value1, value2, "tCard");
            return (Criteria) this;
        }

        public Criteria andTSchoolIsNull() {
            addCriterion("t_school is null");
            return (Criteria) this;
        }

        public Criteria andTSchoolIsNotNull() {
            addCriterion("t_school is not null");
            return (Criteria) this;
        }

        public Criteria andTSchoolEqualTo(String value) {
            addCriterion("t_school =", value, "tSchool");
            return (Criteria) this;
        }

        public Criteria andTSchoolNotEqualTo(String value) {
            addCriterion("t_school <>", value, "tSchool");
            return (Criteria) this;
        }

        public Criteria andTSchoolGreaterThan(String value) {
            addCriterion("t_school >", value, "tSchool");
            return (Criteria) this;
        }

        public Criteria andTSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("t_school >=", value, "tSchool");
            return (Criteria) this;
        }

        public Criteria andTSchoolLessThan(String value) {
            addCriterion("t_school <", value, "tSchool");
            return (Criteria) this;
        }

        public Criteria andTSchoolLessThanOrEqualTo(String value) {
            addCriterion("t_school <=", value, "tSchool");
            return (Criteria) this;
        }

        public Criteria andTSchoolLike(String value) {
            addCriterion("t_school like", value, "tSchool");
            return (Criteria) this;
        }

        public Criteria andTSchoolNotLike(String value) {
            addCriterion("t_school not like", value, "tSchool");
            return (Criteria) this;
        }

        public Criteria andTSchoolIn(List<String> values) {
            addCriterion("t_school in", values, "tSchool");
            return (Criteria) this;
        }

        public Criteria andTSchoolNotIn(List<String> values) {
            addCriterion("t_school not in", values, "tSchool");
            return (Criteria) this;
        }

        public Criteria andTSchoolBetween(String value1, String value2) {
            addCriterion("t_school between", value1, value2, "tSchool");
            return (Criteria) this;
        }

        public Criteria andTSchoolNotBetween(String value1, String value2) {
            addCriterion("t_school not between", value1, value2, "tSchool");
            return (Criteria) this;
        }

        public Criteria andTYearIsNull() {
            addCriterion("t_year is null");
            return (Criteria) this;
        }

        public Criteria andTYearIsNotNull() {
            addCriterion("t_year is not null");
            return (Criteria) this;
        }

        public Criteria andTYearEqualTo(Integer value) {
            addCriterion("t_year =", value, "tYear");
            return (Criteria) this;
        }

        public Criteria andTYearNotEqualTo(Integer value) {
            addCriterion("t_year <>", value, "tYear");
            return (Criteria) this;
        }

        public Criteria andTYearGreaterThan(Integer value) {
            addCriterion("t_year >", value, "tYear");
            return (Criteria) this;
        }

        public Criteria andTYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_year >=", value, "tYear");
            return (Criteria) this;
        }

        public Criteria andTYearLessThan(Integer value) {
            addCriterion("t_year <", value, "tYear");
            return (Criteria) this;
        }

        public Criteria andTYearLessThanOrEqualTo(Integer value) {
            addCriterion("t_year <=", value, "tYear");
            return (Criteria) this;
        }

        public Criteria andTYearIn(List<Integer> values) {
            addCriterion("t_year in", values, "tYear");
            return (Criteria) this;
        }

        public Criteria andTYearNotIn(List<Integer> values) {
            addCriterion("t_year not in", values, "tYear");
            return (Criteria) this;
        }

        public Criteria andTYearBetween(Integer value1, Integer value2) {
            addCriterion("t_year between", value1, value2, "tYear");
            return (Criteria) this;
        }

        public Criteria andTYearNotBetween(Integer value1, Integer value2) {
            addCriterion("t_year not between", value1, value2, "tYear");
            return (Criteria) this;
        }

        public Criteria andTEducationIsNull() {
            addCriterion("t_education is null");
            return (Criteria) this;
        }

        public Criteria andTEducationIsNotNull() {
            addCriterion("t_education is not null");
            return (Criteria) this;
        }

        public Criteria andTEducationEqualTo(Integer value) {
            addCriterion("t_education =", value, "tEducation");
            return (Criteria) this;
        }

        public Criteria andTEducationNotEqualTo(Integer value) {
            addCriterion("t_education <>", value, "tEducation");
            return (Criteria) this;
        }

        public Criteria andTEducationGreaterThan(Integer value) {
            addCriterion("t_education >", value, "tEducation");
            return (Criteria) this;
        }

        public Criteria andTEducationGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_education >=", value, "tEducation");
            return (Criteria) this;
        }

        public Criteria andTEducationLessThan(Integer value) {
            addCriterion("t_education <", value, "tEducation");
            return (Criteria) this;
        }

        public Criteria andTEducationLessThanOrEqualTo(Integer value) {
            addCriterion("t_education <=", value, "tEducation");
            return (Criteria) this;
        }

        public Criteria andTEducationIn(List<Integer> values) {
            addCriterion("t_education in", values, "tEducation");
            return (Criteria) this;
        }

        public Criteria andTEducationNotIn(List<Integer> values) {
            addCriterion("t_education not in", values, "tEducation");
            return (Criteria) this;
        }

        public Criteria andTEducationBetween(Integer value1, Integer value2) {
            addCriterion("t_education between", value1, value2, "tEducation");
            return (Criteria) this;
        }

        public Criteria andTEducationNotBetween(Integer value1, Integer value2) {
            addCriterion("t_education not between", value1, value2, "tEducation");
            return (Criteria) this;
        }

        public Criteria andTDegreeIsNull() {
            addCriterion("t_degree is null");
            return (Criteria) this;
        }

        public Criteria andTDegreeIsNotNull() {
            addCriterion("t_degree is not null");
            return (Criteria) this;
        }

        public Criteria andTDegreeEqualTo(Integer value) {
            addCriterion("t_degree =", value, "tDegree");
            return (Criteria) this;
        }

        public Criteria andTDegreeNotEqualTo(Integer value) {
            addCriterion("t_degree <>", value, "tDegree");
            return (Criteria) this;
        }

        public Criteria andTDegreeGreaterThan(Integer value) {
            addCriterion("t_degree >", value, "tDegree");
            return (Criteria) this;
        }

        public Criteria andTDegreeGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_degree >=", value, "tDegree");
            return (Criteria) this;
        }

        public Criteria andTDegreeLessThan(Integer value) {
            addCriterion("t_degree <", value, "tDegree");
            return (Criteria) this;
        }

        public Criteria andTDegreeLessThanOrEqualTo(Integer value) {
            addCriterion("t_degree <=", value, "tDegree");
            return (Criteria) this;
        }

        public Criteria andTDegreeIn(List<Integer> values) {
            addCriterion("t_degree in", values, "tDegree");
            return (Criteria) this;
        }

        public Criteria andTDegreeNotIn(List<Integer> values) {
            addCriterion("t_degree not in", values, "tDegree");
            return (Criteria) this;
        }

        public Criteria andTDegreeBetween(Integer value1, Integer value2) {
            addCriterion("t_degree between", value1, value2, "tDegree");
            return (Criteria) this;
        }

        public Criteria andTDegreeNotBetween(Integer value1, Integer value2) {
            addCriterion("t_degree not between", value1, value2, "tDegree");
            return (Criteria) this;
        }

        public Criteria andTMajorIsNull() {
            addCriterion("t_major is null");
            return (Criteria) this;
        }

        public Criteria andTMajorIsNotNull() {
            addCriterion("t_major is not null");
            return (Criteria) this;
        }

        public Criteria andTMajorEqualTo(String value) {
            addCriterion("t_major =", value, "tMajor");
            return (Criteria) this;
        }

        public Criteria andTMajorNotEqualTo(String value) {
            addCriterion("t_major <>", value, "tMajor");
            return (Criteria) this;
        }

        public Criteria andTMajorGreaterThan(String value) {
            addCriterion("t_major >", value, "tMajor");
            return (Criteria) this;
        }

        public Criteria andTMajorGreaterThanOrEqualTo(String value) {
            addCriterion("t_major >=", value, "tMajor");
            return (Criteria) this;
        }

        public Criteria andTMajorLessThan(String value) {
            addCriterion("t_major <", value, "tMajor");
            return (Criteria) this;
        }

        public Criteria andTMajorLessThanOrEqualTo(String value) {
            addCriterion("t_major <=", value, "tMajor");
            return (Criteria) this;
        }

        public Criteria andTMajorLike(String value) {
            addCriterion("t_major like", value, "tMajor");
            return (Criteria) this;
        }

        public Criteria andTMajorNotLike(String value) {
            addCriterion("t_major not like", value, "tMajor");
            return (Criteria) this;
        }

        public Criteria andTMajorIn(List<String> values) {
            addCriterion("t_major in", values, "tMajor");
            return (Criteria) this;
        }

        public Criteria andTMajorNotIn(List<String> values) {
            addCriterion("t_major not in", values, "tMajor");
            return (Criteria) this;
        }

        public Criteria andTMajorBetween(String value1, String value2) {
            addCriterion("t_major between", value1, value2, "tMajor");
            return (Criteria) this;
        }

        public Criteria andTMajorNotBetween(String value1, String value2) {
            addCriterion("t_major not between", value1, value2, "tMajor");
            return (Criteria) this;
        }

        public Criteria andTFettleIsNull() {
            addCriterion("t_fettle is null");
            return (Criteria) this;
        }

        public Criteria andTFettleIsNotNull() {
            addCriterion("t_fettle is not null");
            return (Criteria) this;
        }

        public Criteria andTFettleEqualTo(Integer value) {
            addCriterion("t_fettle =", value, "tFettle");
            return (Criteria) this;
        }

        public Criteria andTFettleNotEqualTo(Integer value) {
            addCriterion("t_fettle <>", value, "tFettle");
            return (Criteria) this;
        }

        public Criteria andTFettleGreaterThan(Integer value) {
            addCriterion("t_fettle >", value, "tFettle");
            return (Criteria) this;
        }

        public Criteria andTFettleGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_fettle >=", value, "tFettle");
            return (Criteria) this;
        }

        public Criteria andTFettleLessThan(Integer value) {
            addCriterion("t_fettle <", value, "tFettle");
            return (Criteria) this;
        }

        public Criteria andTFettleLessThanOrEqualTo(Integer value) {
            addCriterion("t_fettle <=", value, "tFettle");
            return (Criteria) this;
        }

        public Criteria andTFettleIn(List<Integer> values) {
            addCriterion("t_fettle in", values, "tFettle");
            return (Criteria) this;
        }

        public Criteria andTFettleNotIn(List<Integer> values) {
            addCriterion("t_fettle not in", values, "tFettle");
            return (Criteria) this;
        }

        public Criteria andTFettleBetween(Integer value1, Integer value2) {
            addCriterion("t_fettle between", value1, value2, "tFettle");
            return (Criteria) this;
        }

        public Criteria andTFettleNotBetween(Integer value1, Integer value2) {
            addCriterion("t_fettle not between", value1, value2, "tFettle");
            return (Criteria) this;
        }

        public Criteria andTRemarkIsNull() {
            addCriterion("t_remark is null");
            return (Criteria) this;
        }

        public Criteria andTRemarkIsNotNull() {
            addCriterion("t_remark is not null");
            return (Criteria) this;
        }

        public Criteria andTRemarkEqualTo(String value) {
            addCriterion("t_remark =", value, "tRemark");
            return (Criteria) this;
        }

        public Criteria andTRemarkNotEqualTo(String value) {
            addCriterion("t_remark <>", value, "tRemark");
            return (Criteria) this;
        }

        public Criteria andTRemarkGreaterThan(String value) {
            addCriterion("t_remark >", value, "tRemark");
            return (Criteria) this;
        }

        public Criteria andTRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("t_remark >=", value, "tRemark");
            return (Criteria) this;
        }

        public Criteria andTRemarkLessThan(String value) {
            addCriterion("t_remark <", value, "tRemark");
            return (Criteria) this;
        }

        public Criteria andTRemarkLessThanOrEqualTo(String value) {
            addCriterion("t_remark <=", value, "tRemark");
            return (Criteria) this;
        }

        public Criteria andTRemarkLike(String value) {
            addCriterion("t_remark like", value, "tRemark");
            return (Criteria) this;
        }

        public Criteria andTRemarkNotLike(String value) {
            addCriterion("t_remark not like", value, "tRemark");
            return (Criteria) this;
        }

        public Criteria andTRemarkIn(List<String> values) {
            addCriterion("t_remark in", values, "tRemark");
            return (Criteria) this;
        }

        public Criteria andTRemarkNotIn(List<String> values) {
            addCriterion("t_remark not in", values, "tRemark");
            return (Criteria) this;
        }

        public Criteria andTRemarkBetween(String value1, String value2) {
            addCriterion("t_remark between", value1, value2, "tRemark");
            return (Criteria) this;
        }

        public Criteria andTRemarkNotBetween(String value1, String value2) {
            addCriterion("t_remark not between", value1, value2, "tRemark");
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