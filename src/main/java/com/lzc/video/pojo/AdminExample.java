package com.lzc.video.pojo;

import java.util.ArrayList;
import java.util.List;

public class AdminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminExample() {
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

        public Criteria andAdm_idIsNull() {
            addCriterion("adm_id is null");
            return (Criteria) this;
        }

        public Criteria andAdm_idIsNotNull() {
            addCriterion("adm_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdm_idEqualTo(Integer value) {
            addCriterion("adm_id =", value, "adm_id");
            return (Criteria) this;
        }

        public Criteria andAdm_idNotEqualTo(Integer value) {
            addCriterion("adm_id <>", value, "adm_id");
            return (Criteria) this;
        }

        public Criteria andAdm_idGreaterThan(Integer value) {
            addCriterion("adm_id >", value, "adm_id");
            return (Criteria) this;
        }

        public Criteria andAdm_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("adm_id >=", value, "adm_id");
            return (Criteria) this;
        }

        public Criteria andAdm_idLessThan(Integer value) {
            addCriterion("adm_id <", value, "adm_id");
            return (Criteria) this;
        }

        public Criteria andAdm_idLessThanOrEqualTo(Integer value) {
            addCriterion("adm_id <=", value, "adm_id");
            return (Criteria) this;
        }

        public Criteria andAdm_idIn(List<Integer> values) {
            addCriterion("adm_id in", values, "adm_id");
            return (Criteria) this;
        }

        public Criteria andAdm_idNotIn(List<Integer> values) {
            addCriterion("adm_id not in", values, "adm_id");
            return (Criteria) this;
        }

        public Criteria andAdm_idBetween(Integer value1, Integer value2) {
            addCriterion("adm_id between", value1, value2, "adm_id");
            return (Criteria) this;
        }

        public Criteria andAdm_idNotBetween(Integer value1, Integer value2) {
            addCriterion("adm_id not between", value1, value2, "adm_id");
            return (Criteria) this;
        }

        public Criteria andAdm_nameIsNull() {
            addCriterion("adm_name is null");
            return (Criteria) this;
        }

        public Criteria andAdm_nameIsNotNull() {
            addCriterion("adm_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdm_nameEqualTo(String value) {
            addCriterion("adm_name =", value, "adm_name");
            return (Criteria) this;
        }

        public Criteria andAdm_nameNotEqualTo(String value) {
            addCriterion("adm_name <>", value, "adm_name");
            return (Criteria) this;
        }

        public Criteria andAdm_nameGreaterThan(String value) {
            addCriterion("adm_name >", value, "adm_name");
            return (Criteria) this;
        }

        public Criteria andAdm_nameGreaterThanOrEqualTo(String value) {
            addCriterion("adm_name >=", value, "adm_name");
            return (Criteria) this;
        }

        public Criteria andAdm_nameLessThan(String value) {
            addCriterion("adm_name <", value, "adm_name");
            return (Criteria) this;
        }

        public Criteria andAdm_nameLessThanOrEqualTo(String value) {
            addCriterion("adm_name <=", value, "adm_name");
            return (Criteria) this;
        }

        public Criteria andAdm_nameLike(String value) {
            addCriterion("adm_name like", value, "adm_name");
            return (Criteria) this;
        }

        public Criteria andAdm_nameNotLike(String value) {
            addCriterion("adm_name not like", value, "adm_name");
            return (Criteria) this;
        }

        public Criteria andAdm_nameIn(List<String> values) {
            addCriterion("adm_name in", values, "adm_name");
            return (Criteria) this;
        }

        public Criteria andAdm_nameNotIn(List<String> values) {
            addCriterion("adm_name not in", values, "adm_name");
            return (Criteria) this;
        }

        public Criteria andAdm_nameBetween(String value1, String value2) {
            addCriterion("adm_name between", value1, value2, "adm_name");
            return (Criteria) this;
        }

        public Criteria andAdm_nameNotBetween(String value1, String value2) {
            addCriterion("adm_name not between", value1, value2, "adm_name");
            return (Criteria) this;
        }

        public Criteria andAdm_pwdIsNull() {
            addCriterion("adm_pwd is null");
            return (Criteria) this;
        }

        public Criteria andAdm_pwdIsNotNull() {
            addCriterion("adm_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andAdm_pwdEqualTo(String value) {
            addCriterion("adm_pwd =", value, "adm_pwd");
            return (Criteria) this;
        }

        public Criteria andAdm_pwdNotEqualTo(String value) {
            addCriterion("adm_pwd <>", value, "adm_pwd");
            return (Criteria) this;
        }

        public Criteria andAdm_pwdGreaterThan(String value) {
            addCriterion("adm_pwd >", value, "adm_pwd");
            return (Criteria) this;
        }

        public Criteria andAdm_pwdGreaterThanOrEqualTo(String value) {
            addCriterion("adm_pwd >=", value, "adm_pwd");
            return (Criteria) this;
        }

        public Criteria andAdm_pwdLessThan(String value) {
            addCriterion("adm_pwd <", value, "adm_pwd");
            return (Criteria) this;
        }

        public Criteria andAdm_pwdLessThanOrEqualTo(String value) {
            addCriterion("adm_pwd <=", value, "adm_pwd");
            return (Criteria) this;
        }

        public Criteria andAdm_pwdLike(String value) {
            addCriterion("adm_pwd like", value, "adm_pwd");
            return (Criteria) this;
        }

        public Criteria andAdm_pwdNotLike(String value) {
            addCriterion("adm_pwd not like", value, "adm_pwd");
            return (Criteria) this;
        }

        public Criteria andAdm_pwdIn(List<String> values) {
            addCriterion("adm_pwd in", values, "adm_pwd");
            return (Criteria) this;
        }

        public Criteria andAdm_pwdNotIn(List<String> values) {
            addCriterion("adm_pwd not in", values, "adm_pwd");
            return (Criteria) this;
        }

        public Criteria andAdm_pwdBetween(String value1, String value2) {
            addCriterion("adm_pwd between", value1, value2, "adm_pwd");
            return (Criteria) this;
        }

        public Criteria andAdm_pwdNotBetween(String value1, String value2) {
            addCriterion("adm_pwd not between", value1, value2, "adm_pwd");
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