package com.antique.muzi.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UmsMemberDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UmsMemberDetailExample() {
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
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
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

        public Criteria andMemIdIsNull() {
            addCriterion("mem_id is null");
            return (Criteria) this;
        }

        public Criteria andMemIdIsNotNull() {
            addCriterion("mem_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemIdEqualTo(Long value) {
            addCriterion("mem_id =", value, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdNotEqualTo(Long value) {
            addCriterion("mem_id <>", value, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdGreaterThan(Long value) {
            addCriterion("mem_id >", value, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdGreaterThanOrEqualTo(Long value) {
            addCriterion("mem_id >=", value, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdLessThan(Long value) {
            addCriterion("mem_id <", value, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdLessThanOrEqualTo(Long value) {
            addCriterion("mem_id <=", value, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdIn(List<Long> values) {
            addCriterion("mem_id in", values, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdNotIn(List<Long> values) {
            addCriterion("mem_id not in", values, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdBetween(Long value1, Long value2) {
            addCriterion("mem_id between", value1, value2, "memId");
            return (Criteria) this;
        }

        public Criteria andMemIdNotBetween(Long value1, Long value2) {
            addCriterion("mem_id not between", value1, value2, "memId");
            return (Criteria) this;
        }

        public Criteria andPNameIsNull() {
            addCriterion("p_name is null");
            return (Criteria) this;
        }

        public Criteria andPNameIsNotNull() {
            addCriterion("p_name is not null");
            return (Criteria) this;
        }

        public Criteria andPNameEqualTo(String value) {
            addCriterion("p_name =", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotEqualTo(String value) {
            addCriterion("p_name <>", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameGreaterThan(String value) {
            addCriterion("p_name >", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameGreaterThanOrEqualTo(String value) {
            addCriterion("p_name >=", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLessThan(String value) {
            addCriterion("p_name <", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLessThanOrEqualTo(String value) {
            addCriterion("p_name <=", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLike(String value) {
            addCriterion("p_name like", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotLike(String value) {
            addCriterion("p_name not like", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameIn(List<String> values) {
            addCriterion("p_name in", values, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotIn(List<String> values) {
            addCriterion("p_name not in", values, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameBetween(String value1, String value2) {
            addCriterion("p_name between", value1, value2, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotBetween(String value1, String value2) {
            addCriterion("p_name not between", value1, value2, "pName");
            return (Criteria) this;
        }

        public Criteria andPPhoneIsNull() {
            addCriterion("p_phone is null");
            return (Criteria) this;
        }

        public Criteria andPPhoneIsNotNull() {
            addCriterion("p_phone is not null");
            return (Criteria) this;
        }

        public Criteria andPPhoneEqualTo(String value) {
            addCriterion("p_phone =", value, "pPhone");
            return (Criteria) this;
        }

        public Criteria andPPhoneNotEqualTo(String value) {
            addCriterion("p_phone <>", value, "pPhone");
            return (Criteria) this;
        }

        public Criteria andPPhoneGreaterThan(String value) {
            addCriterion("p_phone >", value, "pPhone");
            return (Criteria) this;
        }

        public Criteria andPPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("p_phone >=", value, "pPhone");
            return (Criteria) this;
        }

        public Criteria andPPhoneLessThan(String value) {
            addCriterion("p_phone <", value, "pPhone");
            return (Criteria) this;
        }

        public Criteria andPPhoneLessThanOrEqualTo(String value) {
            addCriterion("p_phone <=", value, "pPhone");
            return (Criteria) this;
        }

        public Criteria andPPhoneLike(String value) {
            addCriterion("p_phone like", value, "pPhone");
            return (Criteria) this;
        }

        public Criteria andPPhoneNotLike(String value) {
            addCriterion("p_phone not like", value, "pPhone");
            return (Criteria) this;
        }

        public Criteria andPPhoneIn(List<String> values) {
            addCriterion("p_phone in", values, "pPhone");
            return (Criteria) this;
        }

        public Criteria andPPhoneNotIn(List<String> values) {
            addCriterion("p_phone not in", values, "pPhone");
            return (Criteria) this;
        }

        public Criteria andPPhoneBetween(String value1, String value2) {
            addCriterion("p_phone between", value1, value2, "pPhone");
            return (Criteria) this;
        }

        public Criteria andPPhoneNotBetween(String value1, String value2) {
            addCriterion("p_phone not between", value1, value2, "pPhone");
            return (Criteria) this;
        }

        public Criteria andChildbirthIsNull() {
            addCriterion("childbirth is null");
            return (Criteria) this;
        }

        public Criteria andChildbirthIsNotNull() {
            addCriterion("childbirth is not null");
            return (Criteria) this;
        }

        public Criteria andChildbirthEqualTo(Date value) {
            addCriterionForJDBCDate("childbirth =", value, "childbirth");
            return (Criteria) this;
        }

        public Criteria andChildbirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("childbirth <>", value, "childbirth");
            return (Criteria) this;
        }

        public Criteria andChildbirthGreaterThan(Date value) {
            addCriterionForJDBCDate("childbirth >", value, "childbirth");
            return (Criteria) this;
        }

        public Criteria andChildbirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("childbirth >=", value, "childbirth");
            return (Criteria) this;
        }

        public Criteria andChildbirthLessThan(Date value) {
            addCriterionForJDBCDate("childbirth <", value, "childbirth");
            return (Criteria) this;
        }

        public Criteria andChildbirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("childbirth <=", value, "childbirth");
            return (Criteria) this;
        }

        public Criteria andChildbirthIn(List<Date> values) {
            addCriterionForJDBCDate("childbirth in", values, "childbirth");
            return (Criteria) this;
        }

        public Criteria andChildbirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("childbirth not in", values, "childbirth");
            return (Criteria) this;
        }

        public Criteria andChildbirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("childbirth between", value1, value2, "childbirth");
            return (Criteria) this;
        }

        public Criteria andChildbirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("childbirth not between", value1, value2, "childbirth");
            return (Criteria) this;
        }

        public Criteria andPAddressIsNull() {
            addCriterion("p_address is null");
            return (Criteria) this;
        }

        public Criteria andPAddressIsNotNull() {
            addCriterion("p_address is not null");
            return (Criteria) this;
        }

        public Criteria andPAddressEqualTo(String value) {
            addCriterion("p_address =", value, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressNotEqualTo(String value) {
            addCriterion("p_address <>", value, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressGreaterThan(String value) {
            addCriterion("p_address >", value, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressGreaterThanOrEqualTo(String value) {
            addCriterion("p_address >=", value, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressLessThan(String value) {
            addCriterion("p_address <", value, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressLessThanOrEqualTo(String value) {
            addCriterion("p_address <=", value, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressLike(String value) {
            addCriterion("p_address like", value, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressNotLike(String value) {
            addCriterion("p_address not like", value, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressIn(List<String> values) {
            addCriterion("p_address in", values, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressNotIn(List<String> values) {
            addCriterion("p_address not in", values, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressBetween(String value1, String value2) {
            addCriterion("p_address between", value1, value2, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAddressNotBetween(String value1, String value2) {
            addCriterion("p_address not between", value1, value2, "pAddress");
            return (Criteria) this;
        }

        public Criteria andPAgeIsNull() {
            addCriterion("p_age is null");
            return (Criteria) this;
        }

        public Criteria andPAgeIsNotNull() {
            addCriterion("p_age is not null");
            return (Criteria) this;
        }

        public Criteria andPAgeEqualTo(String value) {
            addCriterion("p_age =", value, "pAge");
            return (Criteria) this;
        }

        public Criteria andPAgeNotEqualTo(String value) {
            addCriterion("p_age <>", value, "pAge");
            return (Criteria) this;
        }

        public Criteria andPAgeGreaterThan(String value) {
            addCriterion("p_age >", value, "pAge");
            return (Criteria) this;
        }

        public Criteria andPAgeGreaterThanOrEqualTo(String value) {
            addCriterion("p_age >=", value, "pAge");
            return (Criteria) this;
        }

        public Criteria andPAgeLessThan(String value) {
            addCriterion("p_age <", value, "pAge");
            return (Criteria) this;
        }

        public Criteria andPAgeLessThanOrEqualTo(String value) {
            addCriterion("p_age <=", value, "pAge");
            return (Criteria) this;
        }

        public Criteria andPAgeLike(String value) {
            addCriterion("p_age like", value, "pAge");
            return (Criteria) this;
        }

        public Criteria andPAgeNotLike(String value) {
            addCriterion("p_age not like", value, "pAge");
            return (Criteria) this;
        }

        public Criteria andPAgeIn(List<String> values) {
            addCriterion("p_age in", values, "pAge");
            return (Criteria) this;
        }

        public Criteria andPAgeNotIn(List<String> values) {
            addCriterion("p_age not in", values, "pAge");
            return (Criteria) this;
        }

        public Criteria andPAgeBetween(String value1, String value2) {
            addCriterion("p_age between", value1, value2, "pAge");
            return (Criteria) this;
        }

        public Criteria andPAgeNotBetween(String value1, String value2) {
            addCriterion("p_age not between", value1, value2, "pAge");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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