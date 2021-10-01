package com.antique.muzi.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class CmsHospitalInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CmsHospitalInfoExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andIconIsNull() {
            addCriterion("icon is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion("icon is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(String value) {
            addCriterion("icon =", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(String value) {
            addCriterion("icon <>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(String value) {
            addCriterion("icon >", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(String value) {
            addCriterion("icon >=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(String value) {
            addCriterion("icon <", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(String value) {
            addCriterion("icon <=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLike(String value) {
            addCriterion("icon like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotLike(String value) {
            addCriterion("icon not like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<String> values) {
            addCriterion("icon in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<String> values) {
            addCriterion("icon not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(String value1, String value2) {
            addCriterion("icon between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(String value1, String value2) {
            addCriterion("icon not between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andSwiperlistIsNull() {
            addCriterion("swiperlist is null");
            return (Criteria) this;
        }

        public Criteria andSwiperlistIsNotNull() {
            addCriterion("swiperlist is not null");
            return (Criteria) this;
        }

        public Criteria andSwiperlistEqualTo(String value) {
            addCriterion("swiperlist =", value, "swiperlist");
            return (Criteria) this;
        }

        public Criteria andSwiperlistNotEqualTo(String value) {
            addCriterion("swiperlist <>", value, "swiperlist");
            return (Criteria) this;
        }

        public Criteria andSwiperlistGreaterThan(String value) {
            addCriterion("swiperlist >", value, "swiperlist");
            return (Criteria) this;
        }

        public Criteria andSwiperlistGreaterThanOrEqualTo(String value) {
            addCriterion("swiperlist >=", value, "swiperlist");
            return (Criteria) this;
        }

        public Criteria andSwiperlistLessThan(String value) {
            addCriterion("swiperlist <", value, "swiperlist");
            return (Criteria) this;
        }

        public Criteria andSwiperlistLessThanOrEqualTo(String value) {
            addCriterion("swiperlist <=", value, "swiperlist");
            return (Criteria) this;
        }

        public Criteria andSwiperlistLike(String value) {
            addCriterion("swiperlist like", value, "swiperlist");
            return (Criteria) this;
        }

        public Criteria andSwiperlistNotLike(String value) {
            addCriterion("swiperlist not like", value, "swiperlist");
            return (Criteria) this;
        }

        public Criteria andSwiperlistIn(List<String> values) {
            addCriterion("swiperlist in", values, "swiperlist");
            return (Criteria) this;
        }

        public Criteria andSwiperlistNotIn(List<String> values) {
            addCriterion("swiperlist not in", values, "swiperlist");
            return (Criteria) this;
        }

        public Criteria andSwiperlistBetween(String value1, String value2) {
            addCriterion("swiperlist between", value1, value2, "swiperlist");
            return (Criteria) this;
        }

        public Criteria andSwiperlistNotBetween(String value1, String value2) {
            addCriterion("swiperlist not between", value1, value2, "swiperlist");
            return (Criteria) this;
        }

        public Criteria andSwiperlist1IsNull() {
            addCriterion("swiperlist1 is null");
            return (Criteria) this;
        }

        public Criteria andSwiperlist1IsNotNull() {
            addCriterion("swiperlist1 is not null");
            return (Criteria) this;
        }

        public Criteria andSwiperlist1EqualTo(String value) {
            addCriterion("swiperlist1 =", value, "swiperlist1");
            return (Criteria) this;
        }

        public Criteria andSwiperlist1NotEqualTo(String value) {
            addCriterion("swiperlist1 <>", value, "swiperlist1");
            return (Criteria) this;
        }

        public Criteria andSwiperlist1GreaterThan(String value) {
            addCriterion("swiperlist1 >", value, "swiperlist1");
            return (Criteria) this;
        }

        public Criteria andSwiperlist1GreaterThanOrEqualTo(String value) {
            addCriterion("swiperlist1 >=", value, "swiperlist1");
            return (Criteria) this;
        }

        public Criteria andSwiperlist1LessThan(String value) {
            addCriterion("swiperlist1 <", value, "swiperlist1");
            return (Criteria) this;
        }

        public Criteria andSwiperlist1LessThanOrEqualTo(String value) {
            addCriterion("swiperlist1 <=", value, "swiperlist1");
            return (Criteria) this;
        }

        public Criteria andSwiperlist1Like(String value) {
            addCriterion("swiperlist1 like", value, "swiperlist1");
            return (Criteria) this;
        }

        public Criteria andSwiperlist1NotLike(String value) {
            addCriterion("swiperlist1 not like", value, "swiperlist1");
            return (Criteria) this;
        }

        public Criteria andSwiperlist1In(List<String> values) {
            addCriterion("swiperlist1 in", values, "swiperlist1");
            return (Criteria) this;
        }

        public Criteria andSwiperlist1NotIn(List<String> values) {
            addCriterion("swiperlist1 not in", values, "swiperlist1");
            return (Criteria) this;
        }

        public Criteria andSwiperlist1Between(String value1, String value2) {
            addCriterion("swiperlist1 between", value1, value2, "swiperlist1");
            return (Criteria) this;
        }

        public Criteria andSwiperlist1NotBetween(String value1, String value2) {
            addCriterion("swiperlist1 not between", value1, value2, "swiperlist1");
            return (Criteria) this;
        }

        public Criteria andSwiperlist2IsNull() {
            addCriterion("swiperlist2 is null");
            return (Criteria) this;
        }

        public Criteria andSwiperlist2IsNotNull() {
            addCriterion("swiperlist2 is not null");
            return (Criteria) this;
        }

        public Criteria andSwiperlist2EqualTo(String value) {
            addCriterion("swiperlist2 =", value, "swiperlist2");
            return (Criteria) this;
        }

        public Criteria andSwiperlist2NotEqualTo(String value) {
            addCriterion("swiperlist2 <>", value, "swiperlist2");
            return (Criteria) this;
        }

        public Criteria andSwiperlist2GreaterThan(String value) {
            addCriterion("swiperlist2 >", value, "swiperlist2");
            return (Criteria) this;
        }

        public Criteria andSwiperlist2GreaterThanOrEqualTo(String value) {
            addCriterion("swiperlist2 >=", value, "swiperlist2");
            return (Criteria) this;
        }

        public Criteria andSwiperlist2LessThan(String value) {
            addCriterion("swiperlist2 <", value, "swiperlist2");
            return (Criteria) this;
        }

        public Criteria andSwiperlist2LessThanOrEqualTo(String value) {
            addCriterion("swiperlist2 <=", value, "swiperlist2");
            return (Criteria) this;
        }

        public Criteria andSwiperlist2Like(String value) {
            addCriterion("swiperlist2 like", value, "swiperlist2");
            return (Criteria) this;
        }

        public Criteria andSwiperlist2NotLike(String value) {
            addCriterion("swiperlist2 not like", value, "swiperlist2");
            return (Criteria) this;
        }

        public Criteria andSwiperlist2In(List<String> values) {
            addCriterion("swiperlist2 in", values, "swiperlist2");
            return (Criteria) this;
        }

        public Criteria andSwiperlist2NotIn(List<String> values) {
            addCriterion("swiperlist2 not in", values, "swiperlist2");
            return (Criteria) this;
        }

        public Criteria andSwiperlist2Between(String value1, String value2) {
            addCriterion("swiperlist2 between", value1, value2, "swiperlist2");
            return (Criteria) this;
        }

        public Criteria andSwiperlist2NotBetween(String value1, String value2) {
            addCriterion("swiperlist2 not between", value1, value2, "swiperlist2");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andInfoIsNull() {
            addCriterion("info is null");
            return (Criteria) this;
        }

        public Criteria andInfoIsNotNull() {
            addCriterion("info is not null");
            return (Criteria) this;
        }

        public Criteria andInfoEqualTo(String value) {
            addCriterion("info =", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotEqualTo(String value) {
            addCriterion("info <>", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoGreaterThan(String value) {
            addCriterion("info >", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoGreaterThanOrEqualTo(String value) {
            addCriterion("info >=", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLessThan(String value) {
            addCriterion("info <", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLessThanOrEqualTo(String value) {
            addCriterion("info <=", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLike(String value) {
            addCriterion("info like", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotLike(String value) {
            addCriterion("info not like", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoIn(List<String> values) {
            addCriterion("info in", values, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotIn(List<String> values) {
            addCriterion("info not in", values, "info");
            return (Criteria) this;
        }

        public Criteria andInfoBetween(String value1, String value2) {
            addCriterion("info between", value1, value2, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotBetween(String value1, String value2) {
            addCriterion("info not between", value1, value2, "info");
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