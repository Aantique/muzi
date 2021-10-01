package com.antique.muzi.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class HmsDeptExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HmsDeptExample() {
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

        public Criteria andTextInfoIsNull() {
            addCriterion("text_info is null");
            return (Criteria) this;
        }

        public Criteria andTextInfoIsNotNull() {
            addCriterion("text_info is not null");
            return (Criteria) this;
        }

        public Criteria andTextInfoEqualTo(String value) {
            addCriterion("text_info =", value, "textInfo");
            return (Criteria) this;
        }

        public Criteria andTextInfoNotEqualTo(String value) {
            addCriterion("text_info <>", value, "textInfo");
            return (Criteria) this;
        }

        public Criteria andTextInfoGreaterThan(String value) {
            addCriterion("text_info >", value, "textInfo");
            return (Criteria) this;
        }

        public Criteria andTextInfoGreaterThanOrEqualTo(String value) {
            addCriterion("text_info >=", value, "textInfo");
            return (Criteria) this;
        }

        public Criteria andTextInfoLessThan(String value) {
            addCriterion("text_info <", value, "textInfo");
            return (Criteria) this;
        }

        public Criteria andTextInfoLessThanOrEqualTo(String value) {
            addCriterion("text_info <=", value, "textInfo");
            return (Criteria) this;
        }

        public Criteria andTextInfoLike(String value) {
            addCriterion("text_info like", value, "textInfo");
            return (Criteria) this;
        }

        public Criteria andTextInfoNotLike(String value) {
            addCriterion("text_info not like", value, "textInfo");
            return (Criteria) this;
        }

        public Criteria andTextInfoIn(List<String> values) {
            addCriterion("text_info in", values, "textInfo");
            return (Criteria) this;
        }

        public Criteria andTextInfoNotIn(List<String> values) {
            addCriterion("text_info not in", values, "textInfo");
            return (Criteria) this;
        }

        public Criteria andTextInfoBetween(String value1, String value2) {
            addCriterion("text_info between", value1, value2, "textInfo");
            return (Criteria) this;
        }

        public Criteria andTextInfoNotBetween(String value1, String value2) {
            addCriterion("text_info not between", value1, value2, "textInfo");
            return (Criteria) this;
        }

        public Criteria andPicInfoIsNull() {
            addCriterion("pic_info is null");
            return (Criteria) this;
        }

        public Criteria andPicInfoIsNotNull() {
            addCriterion("pic_info is not null");
            return (Criteria) this;
        }

        public Criteria andPicInfoEqualTo(String value) {
            addCriterion("pic_info =", value, "picInfo");
            return (Criteria) this;
        }

        public Criteria andPicInfoNotEqualTo(String value) {
            addCriterion("pic_info <>", value, "picInfo");
            return (Criteria) this;
        }

        public Criteria andPicInfoGreaterThan(String value) {
            addCriterion("pic_info >", value, "picInfo");
            return (Criteria) this;
        }

        public Criteria andPicInfoGreaterThanOrEqualTo(String value) {
            addCriterion("pic_info >=", value, "picInfo");
            return (Criteria) this;
        }

        public Criteria andPicInfoLessThan(String value) {
            addCriterion("pic_info <", value, "picInfo");
            return (Criteria) this;
        }

        public Criteria andPicInfoLessThanOrEqualTo(String value) {
            addCriterion("pic_info <=", value, "picInfo");
            return (Criteria) this;
        }

        public Criteria andPicInfoLike(String value) {
            addCriterion("pic_info like", value, "picInfo");
            return (Criteria) this;
        }

        public Criteria andPicInfoNotLike(String value) {
            addCriterion("pic_info not like", value, "picInfo");
            return (Criteria) this;
        }

        public Criteria andPicInfoIn(List<String> values) {
            addCriterion("pic_info in", values, "picInfo");
            return (Criteria) this;
        }

        public Criteria andPicInfoNotIn(List<String> values) {
            addCriterion("pic_info not in", values, "picInfo");
            return (Criteria) this;
        }

        public Criteria andPicInfoBetween(String value1, String value2) {
            addCriterion("pic_info between", value1, value2, "picInfo");
            return (Criteria) this;
        }

        public Criteria andPicInfoNotBetween(String value1, String value2) {
            addCriterion("pic_info not between", value1, value2, "picInfo");
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