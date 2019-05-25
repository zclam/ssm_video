package com.lzc.video.pojo;

import java.util.ArrayList;
import java.util.List;

public class ReviewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReviewExample() {
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

        public Criteria andRev_idIsNull() {
            addCriterion("rev_id is null");
            return (Criteria) this;
        }

        public Criteria andRev_idIsNotNull() {
            addCriterion("rev_id is not null");
            return (Criteria) this;
        }

        public Criteria andRev_idEqualTo(Integer value) {
            addCriterion("rev_id =", value, "rev_id");
            return (Criteria) this;
        }

        public Criteria andRev_idNotEqualTo(Integer value) {
            addCriterion("rev_id <>", value, "rev_id");
            return (Criteria) this;
        }

        public Criteria andRev_idGreaterThan(Integer value) {
            addCriterion("rev_id >", value, "rev_id");
            return (Criteria) this;
        }

        public Criteria andRev_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("rev_id >=", value, "rev_id");
            return (Criteria) this;
        }

        public Criteria andRev_idLessThan(Integer value) {
            addCriterion("rev_id <", value, "rev_id");
            return (Criteria) this;
        }

        public Criteria andRev_idLessThanOrEqualTo(Integer value) {
            addCriterion("rev_id <=", value, "rev_id");
            return (Criteria) this;
        }

        public Criteria andRev_idIn(List<Integer> values) {
            addCriterion("rev_id in", values, "rev_id");
            return (Criteria) this;
        }

        public Criteria andRev_idNotIn(List<Integer> values) {
            addCriterion("rev_id not in", values, "rev_id");
            return (Criteria) this;
        }

        public Criteria andRev_idBetween(Integer value1, Integer value2) {
            addCriterion("rev_id between", value1, value2, "rev_id");
            return (Criteria) this;
        }

        public Criteria andRev_idNotBetween(Integer value1, Integer value2) {
            addCriterion("rev_id not between", value1, value2, "rev_id");
            return (Criteria) this;
        }

        public Criteria andRev_conIsNull() {
            addCriterion("rev_con is null");
            return (Criteria) this;
        }

        public Criteria andRev_conIsNotNull() {
            addCriterion("rev_con is not null");
            return (Criteria) this;
        }

        public Criteria andRev_conEqualTo(String value) {
            addCriterion("rev_con =", value, "rev_con");
            return (Criteria) this;
        }

        public Criteria andRev_conNotEqualTo(String value) {
            addCriterion("rev_con <>", value, "rev_con");
            return (Criteria) this;
        }

        public Criteria andRev_conGreaterThan(String value) {
            addCriterion("rev_con >", value, "rev_con");
            return (Criteria) this;
        }

        public Criteria andRev_conGreaterThanOrEqualTo(String value) {
            addCriterion("rev_con >=", value, "rev_con");
            return (Criteria) this;
        }

        public Criteria andRev_conLessThan(String value) {
            addCriterion("rev_con <", value, "rev_con");
            return (Criteria) this;
        }

        public Criteria andRev_conLessThanOrEqualTo(String value) {
            addCriterion("rev_con <=", value, "rev_con");
            return (Criteria) this;
        }

        public Criteria andRev_conLike(String value) {
            addCriterion("rev_con like", value, "rev_con");
            return (Criteria) this;
        }

        public Criteria andRev_conNotLike(String value) {
            addCriterion("rev_con not like", value, "rev_con");
            return (Criteria) this;
        }

        public Criteria andRev_conIn(List<String> values) {
            addCriterion("rev_con in", values, "rev_con");
            return (Criteria) this;
        }

        public Criteria andRev_conNotIn(List<String> values) {
            addCriterion("rev_con not in", values, "rev_con");
            return (Criteria) this;
        }

        public Criteria andRev_conBetween(String value1, String value2) {
            addCriterion("rev_con between", value1, value2, "rev_con");
            return (Criteria) this;
        }

        public Criteria andRev_conNotBetween(String value1, String value2) {
            addCriterion("rev_con not between", value1, value2, "rev_con");
            return (Criteria) this;
        }

        public Criteria andUser_idIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUser_idIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUser_idEqualTo(Integer value) {
            addCriterion("user_id =", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThan(Integer value) {
            addCriterion("user_id >", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThan(Integer value) {
            addCriterion("user_id <", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idIn(List<Integer> values) {
            addCriterion("user_id in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andVid_idIsNull() {
            addCriterion("vid_id is null");
            return (Criteria) this;
        }

        public Criteria andVid_idIsNotNull() {
            addCriterion("vid_id is not null");
            return (Criteria) this;
        }

        public Criteria andVid_idEqualTo(Integer value) {
            addCriterion("vid_id =", value, "vid_id");
            return (Criteria) this;
        }

        public Criteria andVid_idNotEqualTo(Integer value) {
            addCriterion("vid_id <>", value, "vid_id");
            return (Criteria) this;
        }

        public Criteria andVid_idGreaterThan(Integer value) {
            addCriterion("vid_id >", value, "vid_id");
            return (Criteria) this;
        }

        public Criteria andVid_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("vid_id >=", value, "vid_id");
            return (Criteria) this;
        }

        public Criteria andVid_idLessThan(Integer value) {
            addCriterion("vid_id <", value, "vid_id");
            return (Criteria) this;
        }

        public Criteria andVid_idLessThanOrEqualTo(Integer value) {
            addCriterion("vid_id <=", value, "vid_id");
            return (Criteria) this;
        }

        public Criteria andVid_idIn(List<Integer> values) {
            addCriterion("vid_id in", values, "vid_id");
            return (Criteria) this;
        }

        public Criteria andVid_idNotIn(List<Integer> values) {
            addCriterion("vid_id not in", values, "vid_id");
            return (Criteria) this;
        }

        public Criteria andVid_idBetween(Integer value1, Integer value2) {
            addCriterion("vid_id between", value1, value2, "vid_id");
            return (Criteria) this;
        }

        public Criteria andVid_idNotBetween(Integer value1, Integer value2) {
            addCriterion("vid_id not between", value1, value2, "vid_id");
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