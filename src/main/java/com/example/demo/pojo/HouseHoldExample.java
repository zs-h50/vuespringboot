package com.example.demo.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HouseHoldExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HouseHoldExample() {
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

        public Criteria andHIdIsNull() {
            addCriterion("h_id is null");
            return (Criteria) this;
        }

        public Criteria andHIdIsNotNull() {
            addCriterion("h_id is not null");
            return (Criteria) this;
        }

        public Criteria andHIdEqualTo(Long value) {
            addCriterion("h_id =", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdNotEqualTo(Long value) {
            addCriterion("h_id <>", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdGreaterThan(Long value) {
            addCriterion("h_id >", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdGreaterThanOrEqualTo(Long value) {
            addCriterion("h_id >=", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdLessThan(Long value) {
            addCriterion("h_id <", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdLessThanOrEqualTo(Long value) {
            addCriterion("h_id <=", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdIn(List<Long> values) {
            addCriterion("h_id in", values, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdNotIn(List<Long> values) {
            addCriterion("h_id not in", values, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdBetween(Long value1, Long value2) {
            addCriterion("h_id between", value1, value2, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdNotBetween(Long value1, Long value2) {
            addCriterion("h_id not between", value1, value2, "hId");
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

        public Criteria andGenreIsNull() {
            addCriterion("genre is null");
            return (Criteria) this;
        }

        public Criteria andGenreIsNotNull() {
            addCriterion("genre is not null");
            return (Criteria) this;
        }

        public Criteria andGenreEqualTo(Integer value) {
            addCriterion("genre =", value, "genre");
            return (Criteria) this;
        }

        public Criteria andGenreNotEqualTo(Integer value) {
            addCriterion("genre <>", value, "genre");
            return (Criteria) this;
        }

        public Criteria andGenreGreaterThan(Integer value) {
            addCriterion("genre >", value, "genre");
            return (Criteria) this;
        }

        public Criteria andGenreGreaterThanOrEqualTo(Integer value) {
            addCriterion("genre >=", value, "genre");
            return (Criteria) this;
        }

        public Criteria andGenreLessThan(Integer value) {
            addCriterion("genre <", value, "genre");
            return (Criteria) this;
        }

        public Criteria andGenreLessThanOrEqualTo(Integer value) {
            addCriterion("genre <=", value, "genre");
            return (Criteria) this;
        }

        public Criteria andGenreIn(List<Integer> values) {
            addCriterion("genre in", values, "genre");
            return (Criteria) this;
        }

        public Criteria andGenreNotIn(List<Integer> values) {
            addCriterion("genre not in", values, "genre");
            return (Criteria) this;
        }

        public Criteria andGenreBetween(Integer value1, Integer value2) {
            addCriterion("genre between", value1, value2, "genre");
            return (Criteria) this;
        }

        public Criteria andGenreNotBetween(Integer value1, Integer value2) {
            addCriterion("genre not between", value1, value2, "genre");
            return (Criteria) this;
        }

        public Criteria andHNameIsNull() {
            addCriterion("h_name is null");
            return (Criteria) this;
        }

        public Criteria andHNameIsNotNull() {
            addCriterion("h_name is not null");
            return (Criteria) this;
        }

        public Criteria andHNameEqualTo(String value) {
            addCriterion("h_name =", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameNotEqualTo(String value) {
            addCriterion("h_name <>", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameGreaterThan(String value) {
            addCriterion("h_name >", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameGreaterThanOrEqualTo(String value) {
            addCriterion("h_name >=", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameLessThan(String value) {
            addCriterion("h_name <", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameLessThanOrEqualTo(String value) {
            addCriterion("h_name <=", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameLike(String value) {
            addCriterion("h_name like", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameNotLike(String value) {
            addCriterion("h_name not like", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameIn(List<String> values) {
            addCriterion("h_name in", values, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameNotIn(List<String> values) {
            addCriterion("h_name not in", values, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameBetween(String value1, String value2) {
            addCriterion("h_name between", value1, value2, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameNotBetween(String value1, String value2) {
            addCriterion("h_name not between", value1, value2, "hName");
            return (Criteria) this;
        }

        public Criteria andHGenderIsNull() {
            addCriterion("h_gender is null");
            return (Criteria) this;
        }

        public Criteria andHGenderIsNotNull() {
            addCriterion("h_gender is not null");
            return (Criteria) this;
        }

        public Criteria andHGenderEqualTo(Integer value) {
            addCriterion("h_gender =", value, "hGender");
            return (Criteria) this;
        }

        public Criteria andHGenderNotEqualTo(Integer value) {
            addCriterion("h_gender <>", value, "hGender");
            return (Criteria) this;
        }

        public Criteria andHGenderGreaterThan(Integer value) {
            addCriterion("h_gender >", value, "hGender");
            return (Criteria) this;
        }

        public Criteria andHGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("h_gender >=", value, "hGender");
            return (Criteria) this;
        }

        public Criteria andHGenderLessThan(Integer value) {
            addCriterion("h_gender <", value, "hGender");
            return (Criteria) this;
        }

        public Criteria andHGenderLessThanOrEqualTo(Integer value) {
            addCriterion("h_gender <=", value, "hGender");
            return (Criteria) this;
        }

        public Criteria andHGenderIn(List<Integer> values) {
            addCriterion("h_gender in", values, "hGender");
            return (Criteria) this;
        }

        public Criteria andHGenderNotIn(List<Integer> values) {
            addCriterion("h_gender not in", values, "hGender");
            return (Criteria) this;
        }

        public Criteria andHGenderBetween(Integer value1, Integer value2) {
            addCriterion("h_gender between", value1, value2, "hGender");
            return (Criteria) this;
        }

        public Criteria andHGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("h_gender not between", value1, value2, "hGender");
            return (Criteria) this;
        }

        public Criteria andHPhoneIsNull() {
            addCriterion("h_phone is null");
            return (Criteria) this;
        }

        public Criteria andHPhoneIsNotNull() {
            addCriterion("h_phone is not null");
            return (Criteria) this;
        }

        public Criteria andHPhoneEqualTo(String value) {
            addCriterion("h_phone =", value, "hPhone");
            return (Criteria) this;
        }

        public Criteria andHPhoneNotEqualTo(String value) {
            addCriterion("h_phone <>", value, "hPhone");
            return (Criteria) this;
        }

        public Criteria andHPhoneGreaterThan(String value) {
            addCriterion("h_phone >", value, "hPhone");
            return (Criteria) this;
        }

        public Criteria andHPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("h_phone >=", value, "hPhone");
            return (Criteria) this;
        }

        public Criteria andHPhoneLessThan(String value) {
            addCriterion("h_phone <", value, "hPhone");
            return (Criteria) this;
        }

        public Criteria andHPhoneLessThanOrEqualTo(String value) {
            addCriterion("h_phone <=", value, "hPhone");
            return (Criteria) this;
        }

        public Criteria andHPhoneLike(String value) {
            addCriterion("h_phone like", value, "hPhone");
            return (Criteria) this;
        }

        public Criteria andHPhoneNotLike(String value) {
            addCriterion("h_phone not like", value, "hPhone");
            return (Criteria) this;
        }

        public Criteria andHPhoneIn(List<String> values) {
            addCriterion("h_phone in", values, "hPhone");
            return (Criteria) this;
        }

        public Criteria andHPhoneNotIn(List<String> values) {
            addCriterion("h_phone not in", values, "hPhone");
            return (Criteria) this;
        }

        public Criteria andHPhoneBetween(String value1, String value2) {
            addCriterion("h_phone between", value1, value2, "hPhone");
            return (Criteria) this;
        }

        public Criteria andHPhoneNotBetween(String value1, String value2) {
            addCriterion("h_phone not between", value1, value2, "hPhone");
            return (Criteria) this;
        }

        public Criteria andHBirthdayIsNull() {
            addCriterion("h_birthday is null");
            return (Criteria) this;
        }

        public Criteria andHBirthdayIsNotNull() {
            addCriterion("h_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andHBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("h_birthday =", value, "hBirthday");
            return (Criteria) this;
        }

        public Criteria andHBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("h_birthday <>", value, "hBirthday");
            return (Criteria) this;
        }

        public Criteria andHBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("h_birthday >", value, "hBirthday");
            return (Criteria) this;
        }

        public Criteria andHBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("h_birthday >=", value, "hBirthday");
            return (Criteria) this;
        }

        public Criteria andHBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("h_birthday <", value, "hBirthday");
            return (Criteria) this;
        }

        public Criteria andHBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("h_birthday <=", value, "hBirthday");
            return (Criteria) this;
        }

        public Criteria andHBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("h_birthday in", values, "hBirthday");
            return (Criteria) this;
        }

        public Criteria andHBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("h_birthday not in", values, "hBirthday");
            return (Criteria) this;
        }

        public Criteria andHBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("h_birthday between", value1, value2, "hBirthday");
            return (Criteria) this;
        }

        public Criteria andHBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("h_birthday not between", value1, value2, "hBirthday");
            return (Criteria) this;
        }

        public Criteria andHCardIsNull() {
            addCriterion("h_card is null");
            return (Criteria) this;
        }

        public Criteria andHCardIsNotNull() {
            addCriterion("h_card is not null");
            return (Criteria) this;
        }

        public Criteria andHCardEqualTo(String value) {
            addCriterion("h_card =", value, "hCard");
            return (Criteria) this;
        }

        public Criteria andHCardNotEqualTo(String value) {
            addCriterion("h_card <>", value, "hCard");
            return (Criteria) this;
        }

        public Criteria andHCardGreaterThan(String value) {
            addCriterion("h_card >", value, "hCard");
            return (Criteria) this;
        }

        public Criteria andHCardGreaterThanOrEqualTo(String value) {
            addCriterion("h_card >=", value, "hCard");
            return (Criteria) this;
        }

        public Criteria andHCardLessThan(String value) {
            addCriterion("h_card <", value, "hCard");
            return (Criteria) this;
        }

        public Criteria andHCardLessThanOrEqualTo(String value) {
            addCriterion("h_card <=", value, "hCard");
            return (Criteria) this;
        }

        public Criteria andHCardLike(String value) {
            addCriterion("h_card like", value, "hCard");
            return (Criteria) this;
        }

        public Criteria andHCardNotLike(String value) {
            addCriterion("h_card not like", value, "hCard");
            return (Criteria) this;
        }

        public Criteria andHCardIn(List<String> values) {
            addCriterion("h_card in", values, "hCard");
            return (Criteria) this;
        }

        public Criteria andHCardNotIn(List<String> values) {
            addCriterion("h_card not in", values, "hCard");
            return (Criteria) this;
        }

        public Criteria andHCardBetween(String value1, String value2) {
            addCriterion("h_card between", value1, value2, "hCard");
            return (Criteria) this;
        }

        public Criteria andHCardNotBetween(String value1, String value2) {
            addCriterion("h_card not between", value1, value2, "hCard");
            return (Criteria) this;
        }

        public Criteria andHFettleIsNull() {
            addCriterion("h_fettle is null");
            return (Criteria) this;
        }

        public Criteria andHFettleIsNotNull() {
            addCriterion("h_fettle is not null");
            return (Criteria) this;
        }

        public Criteria andHFettleEqualTo(Integer value) {
            addCriterion("h_fettle =", value, "hFettle");
            return (Criteria) this;
        }

        public Criteria andHFettleNotEqualTo(Integer value) {
            addCriterion("h_fettle <>", value, "hFettle");
            return (Criteria) this;
        }

        public Criteria andHFettleGreaterThan(Integer value) {
            addCriterion("h_fettle >", value, "hFettle");
            return (Criteria) this;
        }

        public Criteria andHFettleGreaterThanOrEqualTo(Integer value) {
            addCriterion("h_fettle >=", value, "hFettle");
            return (Criteria) this;
        }

        public Criteria andHFettleLessThan(Integer value) {
            addCriterion("h_fettle <", value, "hFettle");
            return (Criteria) this;
        }

        public Criteria andHFettleLessThanOrEqualTo(Integer value) {
            addCriterion("h_fettle <=", value, "hFettle");
            return (Criteria) this;
        }

        public Criteria andHFettleIn(List<Integer> values) {
            addCriterion("h_fettle in", values, "hFettle");
            return (Criteria) this;
        }

        public Criteria andHFettleNotIn(List<Integer> values) {
            addCriterion("h_fettle not in", values, "hFettle");
            return (Criteria) this;
        }

        public Criteria andHFettleBetween(Integer value1, Integer value2) {
            addCriterion("h_fettle between", value1, value2, "hFettle");
            return (Criteria) this;
        }

        public Criteria andHFettleNotBetween(Integer value1, Integer value2) {
            addCriterion("h_fettle not between", value1, value2, "hFettle");
            return (Criteria) this;
        }

        public Criteria andHRemarkIsNull() {
            addCriterion("h_remark is null");
            return (Criteria) this;
        }

        public Criteria andHRemarkIsNotNull() {
            addCriterion("h_remark is not null");
            return (Criteria) this;
        }

        public Criteria andHRemarkEqualTo(String value) {
            addCriterion("h_remark =", value, "hRemark");
            return (Criteria) this;
        }

        public Criteria andHRemarkNotEqualTo(String value) {
            addCriterion("h_remark <>", value, "hRemark");
            return (Criteria) this;
        }

        public Criteria andHRemarkGreaterThan(String value) {
            addCriterion("h_remark >", value, "hRemark");
            return (Criteria) this;
        }

        public Criteria andHRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("h_remark >=", value, "hRemark");
            return (Criteria) this;
        }

        public Criteria andHRemarkLessThan(String value) {
            addCriterion("h_remark <", value, "hRemark");
            return (Criteria) this;
        }

        public Criteria andHRemarkLessThanOrEqualTo(String value) {
            addCriterion("h_remark <=", value, "hRemark");
            return (Criteria) this;
        }

        public Criteria andHRemarkLike(String value) {
            addCriterion("h_remark like", value, "hRemark");
            return (Criteria) this;
        }

        public Criteria andHRemarkNotLike(String value) {
            addCriterion("h_remark not like", value, "hRemark");
            return (Criteria) this;
        }

        public Criteria andHRemarkIn(List<String> values) {
            addCriterion("h_remark in", values, "hRemark");
            return (Criteria) this;
        }

        public Criteria andHRemarkNotIn(List<String> values) {
            addCriterion("h_remark not in", values, "hRemark");
            return (Criteria) this;
        }

        public Criteria andHRemarkBetween(String value1, String value2) {
            addCriterion("h_remark between", value1, value2, "hRemark");
            return (Criteria) this;
        }

        public Criteria andHRemarkNotBetween(String value1, String value2) {
            addCriterion("h_remark not between", value1, value2, "hRemark");
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