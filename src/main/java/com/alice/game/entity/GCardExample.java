package com.alice.game.entity;

import java.util.ArrayList;
import java.util.List;

public class GCardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GCardExample() {
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

        public Criteria andCardnameIsNull() {
            addCriterion("cardName is null");
            return (Criteria) this;
        }

        public Criteria andCardnameIsNotNull() {
            addCriterion("cardName is not null");
            return (Criteria) this;
        }

        public Criteria andCardnameEqualTo(String value) {
            addCriterion("cardName =", value, "cardname");
            return (Criteria) this;
        }

        public Criteria andCardnameNotEqualTo(String value) {
            addCriterion("cardName <>", value, "cardname");
            return (Criteria) this;
        }

        public Criteria andCardnameGreaterThan(String value) {
            addCriterion("cardName >", value, "cardname");
            return (Criteria) this;
        }

        public Criteria andCardnameGreaterThanOrEqualTo(String value) {
            addCriterion("cardName >=", value, "cardname");
            return (Criteria) this;
        }

        public Criteria andCardnameLessThan(String value) {
            addCriterion("cardName <", value, "cardname");
            return (Criteria) this;
        }

        public Criteria andCardnameLessThanOrEqualTo(String value) {
            addCriterion("cardName <=", value, "cardname");
            return (Criteria) this;
        }

        public Criteria andCardnameLike(String value) {
            addCriterion("cardName like", value, "cardname");
            return (Criteria) this;
        }

        public Criteria andCardnameNotLike(String value) {
            addCriterion("cardName not like", value, "cardname");
            return (Criteria) this;
        }

        public Criteria andCardnameIn(List<String> values) {
            addCriterion("cardName in", values, "cardname");
            return (Criteria) this;
        }

        public Criteria andCardnameNotIn(List<String> values) {
            addCriterion("cardName not in", values, "cardname");
            return (Criteria) this;
        }

        public Criteria andCardnameBetween(String value1, String value2) {
            addCriterion("cardName between", value1, value2, "cardname");
            return (Criteria) this;
        }

        public Criteria andCardnameNotBetween(String value1, String value2) {
            addCriterion("cardName not between", value1, value2, "cardname");
            return (Criteria) this;
        }

        public Criteria andCardsourceIsNull() {
            addCriterion("cardSource is null");
            return (Criteria) this;
        }

        public Criteria andCardsourceIsNotNull() {
            addCriterion("cardSource is not null");
            return (Criteria) this;
        }

        public Criteria andCardsourceEqualTo(String value) {
            addCriterion("cardSource =", value, "cardsource");
            return (Criteria) this;
        }

        public Criteria andCardsourceNotEqualTo(String value) {
            addCriterion("cardSource <>", value, "cardsource");
            return (Criteria) this;
        }

        public Criteria andCardsourceGreaterThan(String value) {
            addCriterion("cardSource >", value, "cardsource");
            return (Criteria) this;
        }

        public Criteria andCardsourceGreaterThanOrEqualTo(String value) {
            addCriterion("cardSource >=", value, "cardsource");
            return (Criteria) this;
        }

        public Criteria andCardsourceLessThan(String value) {
            addCriterion("cardSource <", value, "cardsource");
            return (Criteria) this;
        }

        public Criteria andCardsourceLessThanOrEqualTo(String value) {
            addCriterion("cardSource <=", value, "cardsource");
            return (Criteria) this;
        }

        public Criteria andCardsourceLike(String value) {
            addCriterion("cardSource like", value, "cardsource");
            return (Criteria) this;
        }

        public Criteria andCardsourceNotLike(String value) {
            addCriterion("cardSource not like", value, "cardsource");
            return (Criteria) this;
        }

        public Criteria andCardsourceIn(List<String> values) {
            addCriterion("cardSource in", values, "cardsource");
            return (Criteria) this;
        }

        public Criteria andCardsourceNotIn(List<String> values) {
            addCriterion("cardSource not in", values, "cardsource");
            return (Criteria) this;
        }

        public Criteria andCardsourceBetween(String value1, String value2) {
            addCriterion("cardSource between", value1, value2, "cardsource");
            return (Criteria) this;
        }

        public Criteria andCardsourceNotBetween(String value1, String value2) {
            addCriterion("cardSource not between", value1, value2, "cardsource");
            return (Criteria) this;
        }

        public Criteria andCardqualityIsNull() {
            addCriterion("cardQuality is null");
            return (Criteria) this;
        }

        public Criteria andCardqualityIsNotNull() {
            addCriterion("cardQuality is not null");
            return (Criteria) this;
        }

        public Criteria andCardqualityEqualTo(Integer value) {
            addCriterion("cardQuality =", value, "cardquality");
            return (Criteria) this;
        }

        public Criteria andCardqualityNotEqualTo(Integer value) {
            addCriterion("cardQuality <>", value, "cardquality");
            return (Criteria) this;
        }

        public Criteria andCardqualityGreaterThan(Integer value) {
            addCriterion("cardQuality >", value, "cardquality");
            return (Criteria) this;
        }

        public Criteria andCardqualityGreaterThanOrEqualTo(Integer value) {
            addCriterion("cardQuality >=", value, "cardquality");
            return (Criteria) this;
        }

        public Criteria andCardqualityLessThan(Integer value) {
            addCriterion("cardQuality <", value, "cardquality");
            return (Criteria) this;
        }

        public Criteria andCardqualityLessThanOrEqualTo(Integer value) {
            addCriterion("cardQuality <=", value, "cardquality");
            return (Criteria) this;
        }

        public Criteria andCardqualityIn(List<Integer> values) {
            addCriterion("cardQuality in", values, "cardquality");
            return (Criteria) this;
        }

        public Criteria andCardqualityNotIn(List<Integer> values) {
            addCriterion("cardQuality not in", values, "cardquality");
            return (Criteria) this;
        }

        public Criteria andCardqualityBetween(Integer value1, Integer value2) {
            addCriterion("cardQuality between", value1, value2, "cardquality");
            return (Criteria) this;
        }

        public Criteria andCardqualityNotBetween(Integer value1, Integer value2) {
            addCriterion("cardQuality not between", value1, value2, "cardquality");
            return (Criteria) this;
        }

        public Criteria andCarddescriptionIsNull() {
            addCriterion("cardDescription is null");
            return (Criteria) this;
        }

        public Criteria andCarddescriptionIsNotNull() {
            addCriterion("cardDescription is not null");
            return (Criteria) this;
        }

        public Criteria andCarddescriptionEqualTo(String value) {
            addCriterion("cardDescription =", value, "carddescription");
            return (Criteria) this;
        }

        public Criteria andCarddescriptionNotEqualTo(String value) {
            addCriterion("cardDescription <>", value, "carddescription");
            return (Criteria) this;
        }

        public Criteria andCarddescriptionGreaterThan(String value) {
            addCriterion("cardDescription >", value, "carddescription");
            return (Criteria) this;
        }

        public Criteria andCarddescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("cardDescription >=", value, "carddescription");
            return (Criteria) this;
        }

        public Criteria andCarddescriptionLessThan(String value) {
            addCriterion("cardDescription <", value, "carddescription");
            return (Criteria) this;
        }

        public Criteria andCarddescriptionLessThanOrEqualTo(String value) {
            addCriterion("cardDescription <=", value, "carddescription");
            return (Criteria) this;
        }

        public Criteria andCarddescriptionLike(String value) {
            addCriterion("cardDescription like", value, "carddescription");
            return (Criteria) this;
        }

        public Criteria andCarddescriptionNotLike(String value) {
            addCriterion("cardDescription not like", value, "carddescription");
            return (Criteria) this;
        }

        public Criteria andCarddescriptionIn(List<String> values) {
            addCriterion("cardDescription in", values, "carddescription");
            return (Criteria) this;
        }

        public Criteria andCarddescriptionNotIn(List<String> values) {
            addCriterion("cardDescription not in", values, "carddescription");
            return (Criteria) this;
        }

        public Criteria andCarddescriptionBetween(String value1, String value2) {
            addCriterion("cardDescription between", value1, value2, "carddescription");
            return (Criteria) this;
        }

        public Criteria andCarddescriptionNotBetween(String value1, String value2) {
            addCriterion("cardDescription not between", value1, value2, "carddescription");
            return (Criteria) this;
        }

        public Criteria andCardstarIsNull() {
            addCriterion("cardStar is null");
            return (Criteria) this;
        }

        public Criteria andCardstarIsNotNull() {
            addCriterion("cardStar is not null");
            return (Criteria) this;
        }

        public Criteria andCardstarEqualTo(Integer value) {
            addCriterion("cardStar =", value, "cardstar");
            return (Criteria) this;
        }

        public Criteria andCardstarNotEqualTo(Integer value) {
            addCriterion("cardStar <>", value, "cardstar");
            return (Criteria) this;
        }

        public Criteria andCardstarGreaterThan(Integer value) {
            addCriterion("cardStar >", value, "cardstar");
            return (Criteria) this;
        }

        public Criteria andCardstarGreaterThanOrEqualTo(Integer value) {
            addCriterion("cardStar >=", value, "cardstar");
            return (Criteria) this;
        }

        public Criteria andCardstarLessThan(Integer value) {
            addCriterion("cardStar <", value, "cardstar");
            return (Criteria) this;
        }

        public Criteria andCardstarLessThanOrEqualTo(Integer value) {
            addCriterion("cardStar <=", value, "cardstar");
            return (Criteria) this;
        }

        public Criteria andCardstarIn(List<Integer> values) {
            addCriterion("cardStar in", values, "cardstar");
            return (Criteria) this;
        }

        public Criteria andCardstarNotIn(List<Integer> values) {
            addCriterion("cardStar not in", values, "cardstar");
            return (Criteria) this;
        }

        public Criteria andCardstarBetween(Integer value1, Integer value2) {
            addCriterion("cardStar between", value1, value2, "cardstar");
            return (Criteria) this;
        }

        public Criteria andCardstarNotBetween(Integer value1, Integer value2) {
            addCriterion("cardStar not between", value1, value2, "cardstar");
            return (Criteria) this;
        }

        public Criteria andCardurlIsNull() {
            addCriterion("cardURL is null");
            return (Criteria) this;
        }

        public Criteria andCardurlIsNotNull() {
            addCriterion("cardURL is not null");
            return (Criteria) this;
        }

        public Criteria andCardurlEqualTo(String value) {
            addCriterion("cardURL =", value, "cardurl");
            return (Criteria) this;
        }

        public Criteria andCardurlNotEqualTo(String value) {
            addCriterion("cardURL <>", value, "cardurl");
            return (Criteria) this;
        }

        public Criteria andCardurlGreaterThan(String value) {
            addCriterion("cardURL >", value, "cardurl");
            return (Criteria) this;
        }

        public Criteria andCardurlGreaterThanOrEqualTo(String value) {
            addCriterion("cardURL >=", value, "cardurl");
            return (Criteria) this;
        }

        public Criteria andCardurlLessThan(String value) {
            addCriterion("cardURL <", value, "cardurl");
            return (Criteria) this;
        }

        public Criteria andCardurlLessThanOrEqualTo(String value) {
            addCriterion("cardURL <=", value, "cardurl");
            return (Criteria) this;
        }

        public Criteria andCardurlLike(String value) {
            addCriterion("cardURL like", value, "cardurl");
            return (Criteria) this;
        }

        public Criteria andCardurlNotLike(String value) {
            addCriterion("cardURL not like", value, "cardurl");
            return (Criteria) this;
        }

        public Criteria andCardurlIn(List<String> values) {
            addCriterion("cardURL in", values, "cardurl");
            return (Criteria) this;
        }

        public Criteria andCardurlNotIn(List<String> values) {
            addCriterion("cardURL not in", values, "cardurl");
            return (Criteria) this;
        }

        public Criteria andCardurlBetween(String value1, String value2) {
            addCriterion("cardURL between", value1, value2, "cardurl");
            return (Criteria) this;
        }

        public Criteria andCardurlNotBetween(String value1, String value2) {
            addCriterion("cardURL not between", value1, value2, "cardurl");
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