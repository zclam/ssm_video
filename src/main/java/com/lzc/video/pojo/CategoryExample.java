package com.lzc.video.pojo;

import java.util.ArrayList;
import java.util.List;

public class CategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CategoryExample() {
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

        public Criteria andCat_idIsNull() {
            addCriterion("cat_id is null");
            return (Criteria) this;
        }

        public Criteria andCat_idIsNotNull() {
            addCriterion("cat_id is not null");
            return (Criteria) this;
        }

        public Criteria andCat_idEqualTo(Integer value) {
            addCriterion("cat_id =", value, "cat_id");
            return (Criteria) this;
        }

        public Criteria andCat_idNotEqualTo(Integer value) {
            addCriterion("cat_id <>", value, "cat_id");
            return (Criteria) this;
        }

        public Criteria andCat_idGreaterThan(Integer value) {
            addCriterion("cat_id >", value, "cat_id");
            return (Criteria) this;
        }

        public Criteria andCat_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("cat_id >=", value, "cat_id");
            return (Criteria) this;
        }

        public Criteria andCat_idLessThan(Integer value) {
            addCriterion("cat_id <", value, "cat_id");
            return (Criteria) this;
        }

        public Criteria andCat_idLessThanOrEqualTo(Integer value) {
            addCriterion("cat_id <=", value, "cat_id");
            return (Criteria) this;
        }

        public Criteria andCat_idIn(List<Integer> values) {
            addCriterion("cat_id in", values, "cat_id");
            return (Criteria) this;
        }

        public Criteria andCat_idNotIn(List<Integer> values) {
            addCriterion("cat_id not in", values, "cat_id");
            return (Criteria) this;
        }

        public Criteria andCat_idBetween(Integer value1, Integer value2) {
            addCriterion("cat_id between", value1, value2, "cat_id");
            return (Criteria) this;
        }

        public Criteria andCat_idNotBetween(Integer value1, Integer value2) {
            addCriterion("cat_id not between", value1, value2, "cat_id");
            return (Criteria) this;
        }

        public Criteria andCat_nameIsNull() {
            addCriterion("cat_name is null");
            return (Criteria) this;
        }

        public Criteria andCat_nameIsNotNull() {
            addCriterion("cat_name is not null");
            return (Criteria) this;
        }

        public Criteria andCat_nameEqualTo(String value) {
            addCriterion("cat_name =", value, "cat_name");
            return (Criteria) this;
        }

        public Criteria andCat_nameNotEqualTo(String value) {
            addCriterion("cat_name <>", value, "cat_name");
            return (Criteria) this;
        }

        public Criteria andCat_nameGreaterThan(String value) {
            addCriterion("cat_name >", value, "cat_name");
            return (Criteria) this;
        }

        public Criteria andCat_nameGreaterThanOrEqualTo(String value) {
            addCriterion("cat_name >=", value, "cat_name");
            return (Criteria) this;
        }

        public Criteria andCat_nameLessThan(String value) {
            addCriterion("cat_name <", value, "cat_name");
            return (Criteria) this;
        }

        public Criteria andCat_nameLessThanOrEqualTo(String value) {
            addCriterion("cat_name <=", value, "cat_name");
            return (Criteria) this;
        }

        public Criteria andCat_nameLike(String value) {
            addCriterion("cat_name like", value, "cat_name");
            return (Criteria) this;
        }

        public Criteria andCat_nameNotLike(String value) {
            addCriterion("cat_name not like", value, "cat_name");
            return (Criteria) this;
        }

        public Criteria andCat_nameIn(List<String> values) {
            addCriterion("cat_name in", values, "cat_name");
            return (Criteria) this;
        }

        public Criteria andCat_nameNotIn(List<String> values) {
            addCriterion("cat_name not in", values, "cat_name");
            return (Criteria) this;
        }

        public Criteria andCat_nameBetween(String value1, String value2) {
            addCriterion("cat_name between", value1, value2, "cat_name");
            return (Criteria) this;
        }

        public Criteria andCat_nameNotBetween(String value1, String value2) {
            addCriterion("cat_name not between", value1, value2, "cat_name");
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