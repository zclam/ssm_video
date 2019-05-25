package com.lzc.video.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VideoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VideoExample() {
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

        public Criteria andVid_nameIsNull() {
            addCriterion("vid_name is null");
            return (Criteria) this;
        }

        public Criteria andVid_nameIsNotNull() {
            addCriterion("vid_name is not null");
            return (Criteria) this;
        }

        public Criteria andVid_nameEqualTo(String value) {
            addCriterion("vid_name =", value, "vid_name");
            return (Criteria) this;
        }

        public Criteria andVid_nameNotEqualTo(String value) {
            addCriterion("vid_name <>", value, "vid_name");
            return (Criteria) this;
        }

        public Criteria andVid_nameGreaterThan(String value) {
            addCriterion("vid_name >", value, "vid_name");
            return (Criteria) this;
        }

        public Criteria andVid_nameGreaterThanOrEqualTo(String value) {
            addCriterion("vid_name >=", value, "vid_name");
            return (Criteria) this;
        }

        public Criteria andVid_nameLessThan(String value) {
            addCriterion("vid_name <", value, "vid_name");
            return (Criteria) this;
        }

        public Criteria andVid_nameLessThanOrEqualTo(String value) {
            addCriterion("vid_name <=", value, "vid_name");
            return (Criteria) this;
        }

        public Criteria andVid_nameLike(String value) {
            addCriterion("vid_name like", value, "vid_name");
            return (Criteria) this;
        }

        public Criteria andVid_nameNotLike(String value) {
            addCriterion("vid_name not like", value, "vid_name");
            return (Criteria) this;
        }

        public Criteria andVid_nameIn(List<String> values) {
            addCriterion("vid_name in", values, "vid_name");
            return (Criteria) this;
        }

        public Criteria andVid_nameNotIn(List<String> values) {
            addCriterion("vid_name not in", values, "vid_name");
            return (Criteria) this;
        }

        public Criteria andVid_nameBetween(String value1, String value2) {
            addCriterion("vid_name between", value1, value2, "vid_name");
            return (Criteria) this;
        }

        public Criteria andVid_nameNotBetween(String value1, String value2) {
            addCriterion("vid_name not between", value1, value2, "vid_name");
            return (Criteria) this;
        }

        public Criteria andVid_timeIsNull() {
            addCriterion("vid_time is null");
            return (Criteria) this;
        }

        public Criteria andVid_timeIsNotNull() {
            addCriterion("vid_time is not null");
            return (Criteria) this;
        }

        public Criteria andVid_timeEqualTo(Date value) {
            addCriterion("vid_time =", value, "vid_time");
            return (Criteria) this;
        }

        public Criteria andVid_timeNotEqualTo(Date value) {
            addCriterion("vid_time <>", value, "vid_time");
            return (Criteria) this;
        }

        public Criteria andVid_timeGreaterThan(Date value) {
            addCriterion("vid_time >", value, "vid_time");
            return (Criteria) this;
        }

        public Criteria andVid_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("vid_time >=", value, "vid_time");
            return (Criteria) this;
        }

        public Criteria andVid_timeLessThan(Date value) {
            addCriterion("vid_time <", value, "vid_time");
            return (Criteria) this;
        }

        public Criteria andVid_timeLessThanOrEqualTo(Date value) {
            addCriterion("vid_time <=", value, "vid_time");
            return (Criteria) this;
        }

        public Criteria andVid_timeIn(List<Date> values) {
            addCriterion("vid_time in", values, "vid_time");
            return (Criteria) this;
        }

        public Criteria andVid_timeNotIn(List<Date> values) {
            addCriterion("vid_time not in", values, "vid_time");
            return (Criteria) this;
        }

        public Criteria andVid_timeBetween(Date value1, Date value2) {
            addCriterion("vid_time between", value1, value2, "vid_time");
            return (Criteria) this;
        }

        public Criteria andVid_timeNotBetween(Date value1, Date value2) {
            addCriterion("vid_time not between", value1, value2, "vid_time");
            return (Criteria) this;
        }

        public Criteria andVid_cliIsNull() {
            addCriterion("vid_cli is null");
            return (Criteria) this;
        }

        public Criteria andVid_cliIsNotNull() {
            addCriterion("vid_cli is not null");
            return (Criteria) this;
        }

        public Criteria andVid_cliEqualTo(Integer value) {
            addCriterion("vid_cli =", value, "vid_cli");
            return (Criteria) this;
        }

        public Criteria andVid_cliNotEqualTo(Integer value) {
            addCriterion("vid_cli <>", value, "vid_cli");
            return (Criteria) this;
        }

        public Criteria andVid_cliGreaterThan(Integer value) {
            addCriterion("vid_cli >", value, "vid_cli");
            return (Criteria) this;
        }

        public Criteria andVid_cliGreaterThanOrEqualTo(Integer value) {
            addCriterion("vid_cli >=", value, "vid_cli");
            return (Criteria) this;
        }

        public Criteria andVid_cliLessThan(Integer value) {
            addCriterion("vid_cli <", value, "vid_cli");
            return (Criteria) this;
        }

        public Criteria andVid_cliLessThanOrEqualTo(Integer value) {
            addCriterion("vid_cli <=", value, "vid_cli");
            return (Criteria) this;
        }

        public Criteria andVid_cliIn(List<Integer> values) {
            addCriterion("vid_cli in", values, "vid_cli");
            return (Criteria) this;
        }

        public Criteria andVid_cliNotIn(List<Integer> values) {
            addCriterion("vid_cli not in", values, "vid_cli");
            return (Criteria) this;
        }

        public Criteria andVid_cliBetween(Integer value1, Integer value2) {
            addCriterion("vid_cli between", value1, value2, "vid_cli");
            return (Criteria) this;
        }

        public Criteria andVid_cliNotBetween(Integer value1, Integer value2) {
            addCriterion("vid_cli not between", value1, value2, "vid_cli");
            return (Criteria) this;
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

        public Criteria andVideo_urlIsNull() {
            addCriterion("video_url is null");
            return (Criteria) this;
        }

        public Criteria andVideo_urlIsNotNull() {
            addCriterion("video_url is not null");
            return (Criteria) this;
        }

        public Criteria andVideo_urlEqualTo(String value) {
            addCriterion("video_url =", value, "video_url");
            return (Criteria) this;
        }

        public Criteria andVideo_urlNotEqualTo(String value) {
            addCriterion("video_url <>", value, "video_url");
            return (Criteria) this;
        }

        public Criteria andVideo_urlGreaterThan(String value) {
            addCriterion("video_url >", value, "video_url");
            return (Criteria) this;
        }

        public Criteria andVideo_urlGreaterThanOrEqualTo(String value) {
            addCriterion("video_url >=", value, "video_url");
            return (Criteria) this;
        }

        public Criteria andVideo_urlLessThan(String value) {
            addCriterion("video_url <", value, "video_url");
            return (Criteria) this;
        }

        public Criteria andVideo_urlLessThanOrEqualTo(String value) {
            addCriterion("video_url <=", value, "video_url");
            return (Criteria) this;
        }

        public Criteria andVideo_urlLike(String value) {
            addCriterion("video_url like", value, "video_url");
            return (Criteria) this;
        }

        public Criteria andVideo_urlNotLike(String value) {
            addCriterion("video_url not like", value, "video_url");
            return (Criteria) this;
        }

        public Criteria andVideo_urlIn(List<String> values) {
            addCriterion("video_url in", values, "video_url");
            return (Criteria) this;
        }

        public Criteria andVideo_urlNotIn(List<String> values) {
            addCriterion("video_url not in", values, "video_url");
            return (Criteria) this;
        }

        public Criteria andVideo_urlBetween(String value1, String value2) {
            addCriterion("video_url between", value1, value2, "video_url");
            return (Criteria) this;
        }

        public Criteria andVideo_urlNotBetween(String value1, String value2) {
            addCriterion("video_url not between", value1, value2, "video_url");
            return (Criteria) this;
        }

        public Criteria andPic_urlIsNull() {
            addCriterion("pic_url is null");
            return (Criteria) this;
        }

        public Criteria andPic_urlIsNotNull() {
            addCriterion("pic_url is not null");
            return (Criteria) this;
        }

        public Criteria andPic_urlEqualTo(String value) {
            addCriterion("pic_url =", value, "pic_url");
            return (Criteria) this;
        }

        public Criteria andPic_urlNotEqualTo(String value) {
            addCriterion("pic_url <>", value, "pic_url");
            return (Criteria) this;
        }

        public Criteria andPic_urlGreaterThan(String value) {
            addCriterion("pic_url >", value, "pic_url");
            return (Criteria) this;
        }

        public Criteria andPic_urlGreaterThanOrEqualTo(String value) {
            addCriterion("pic_url >=", value, "pic_url");
            return (Criteria) this;
        }

        public Criteria andPic_urlLessThan(String value) {
            addCriterion("pic_url <", value, "pic_url");
            return (Criteria) this;
        }

        public Criteria andPic_urlLessThanOrEqualTo(String value) {
            addCriterion("pic_url <=", value, "pic_url");
            return (Criteria) this;
        }

        public Criteria andPic_urlLike(String value) {
            addCriterion("pic_url like", value, "pic_url");
            return (Criteria) this;
        }

        public Criteria andPic_urlNotLike(String value) {
            addCriterion("pic_url not like", value, "pic_url");
            return (Criteria) this;
        }

        public Criteria andPic_urlIn(List<String> values) {
            addCriterion("pic_url in", values, "pic_url");
            return (Criteria) this;
        }

        public Criteria andPic_urlNotIn(List<String> values) {
            addCriterion("pic_url not in", values, "pic_url");
            return (Criteria) this;
        }

        public Criteria andPic_urlBetween(String value1, String value2) {
            addCriterion("pic_url between", value1, value2, "pic_url");
            return (Criteria) this;
        }

        public Criteria andPic_urlNotBetween(String value1, String value2) {
            addCriterion("pic_url not between", value1, value2, "pic_url");
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