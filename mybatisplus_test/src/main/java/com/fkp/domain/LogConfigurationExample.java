package com.fkp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LogConfigurationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LogConfigurationExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andLogNameIsNull() {
            addCriterion("logName is null");
            return (Criteria) this;
        }

        public Criteria andLogNameIsNotNull() {
            addCriterion("logName is not null");
            return (Criteria) this;
        }

        public Criteria andLogNameEqualTo(String value) {
            addCriterion("logName =", value, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameNotEqualTo(String value) {
            addCriterion("logName <>", value, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameGreaterThan(String value) {
            addCriterion("logName >", value, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameGreaterThanOrEqualTo(String value) {
            addCriterion("logName >=", value, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameLessThan(String value) {
            addCriterion("logName <", value, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameLessThanOrEqualTo(String value) {
            addCriterion("logName <=", value, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameLike(String value) {
            addCriterion("logName like", value, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameNotLike(String value) {
            addCriterion("logName not like", value, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameIn(List<String> values) {
            addCriterion("logName in", values, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameNotIn(List<String> values) {
            addCriterion("logName not in", values, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameBetween(String value1, String value2) {
            addCriterion("logName between", value1, value2, "logName");
            return (Criteria) this;
        }

        public Criteria andLogNameNotBetween(String value1, String value2) {
            addCriterion("logName not between", value1, value2, "logName");
            return (Criteria) this;
        }

        public Criteria andLogRotationIsNull() {
            addCriterion("logRotation is null");
            return (Criteria) this;
        }

        public Criteria andLogRotationIsNotNull() {
            addCriterion("logRotation is not null");
            return (Criteria) this;
        }

        public Criteria andLogRotationEqualTo(String value) {
            addCriterion("logRotation =", value, "logRotation");
            return (Criteria) this;
        }

        public Criteria andLogRotationNotEqualTo(String value) {
            addCriterion("logRotation <>", value, "logRotation");
            return (Criteria) this;
        }

        public Criteria andLogRotationGreaterThan(String value) {
            addCriterion("logRotation >", value, "logRotation");
            return (Criteria) this;
        }

        public Criteria andLogRotationGreaterThanOrEqualTo(String value) {
            addCriterion("logRotation >=", value, "logRotation");
            return (Criteria) this;
        }

        public Criteria andLogRotationLessThan(String value) {
            addCriterion("logRotation <", value, "logRotation");
            return (Criteria) this;
        }

        public Criteria andLogRotationLessThanOrEqualTo(String value) {
            addCriterion("logRotation <=", value, "logRotation");
            return (Criteria) this;
        }

        public Criteria andLogRotationLike(String value) {
            addCriterion("logRotation like", value, "logRotation");
            return (Criteria) this;
        }

        public Criteria andLogRotationNotLike(String value) {
            addCriterion("logRotation not like", value, "logRotation");
            return (Criteria) this;
        }

        public Criteria andLogRotationIn(List<String> values) {
            addCriterion("logRotation in", values, "logRotation");
            return (Criteria) this;
        }

        public Criteria andLogRotationNotIn(List<String> values) {
            addCriterion("logRotation not in", values, "logRotation");
            return (Criteria) this;
        }

        public Criteria andLogRotationBetween(String value1, String value2) {
            addCriterion("logRotation between", value1, value2, "logRotation");
            return (Criteria) this;
        }

        public Criteria andLogRotationNotBetween(String value1, String value2) {
            addCriterion("logRotation not between", value1, value2, "logRotation");
            return (Criteria) this;
        }

        public Criteria andFilesNumIsNull() {
            addCriterion("filesNum is null");
            return (Criteria) this;
        }

        public Criteria andFilesNumIsNotNull() {
            addCriterion("filesNum is not null");
            return (Criteria) this;
        }

        public Criteria andFilesNumEqualTo(Integer value) {
            addCriterion("filesNum =", value, "filesNum");
            return (Criteria) this;
        }

        public Criteria andFilesNumNotEqualTo(Integer value) {
            addCriterion("filesNum <>", value, "filesNum");
            return (Criteria) this;
        }

        public Criteria andFilesNumGreaterThan(Integer value) {
            addCriterion("filesNum >", value, "filesNum");
            return (Criteria) this;
        }

        public Criteria andFilesNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("filesNum >=", value, "filesNum");
            return (Criteria) this;
        }

        public Criteria andFilesNumLessThan(Integer value) {
            addCriterion("filesNum <", value, "filesNum");
            return (Criteria) this;
        }

        public Criteria andFilesNumLessThanOrEqualTo(Integer value) {
            addCriterion("filesNum <=", value, "filesNum");
            return (Criteria) this;
        }

        public Criteria andFilesNumIn(List<Integer> values) {
            addCriterion("filesNum in", values, "filesNum");
            return (Criteria) this;
        }

        public Criteria andFilesNumNotIn(List<Integer> values) {
            addCriterion("filesNum not in", values, "filesNum");
            return (Criteria) this;
        }

        public Criteria andFilesNumBetween(Integer value1, Integer value2) {
            addCriterion("filesNum between", value1, value2, "filesNum");
            return (Criteria) this;
        }

        public Criteria andFilesNumNotBetween(Integer value1, Integer value2) {
            addCriterion("filesNum not between", value1, value2, "filesNum");
            return (Criteria) this;
        }

        public Criteria andLogLevelIsNull() {
            addCriterion("logLevel is null");
            return (Criteria) this;
        }

        public Criteria andLogLevelIsNotNull() {
            addCriterion("logLevel is not null");
            return (Criteria) this;
        }

        public Criteria andLogLevelEqualTo(Integer value) {
            addCriterion("logLevel =", value, "logLevel");
            return (Criteria) this;
        }

        public Criteria andLogLevelNotEqualTo(Integer value) {
            addCriterion("logLevel <>", value, "logLevel");
            return (Criteria) this;
        }

        public Criteria andLogLevelGreaterThan(Integer value) {
            addCriterion("logLevel >", value, "logLevel");
            return (Criteria) this;
        }

        public Criteria andLogLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("logLevel >=", value, "logLevel");
            return (Criteria) this;
        }

        public Criteria andLogLevelLessThan(Integer value) {
            addCriterion("logLevel <", value, "logLevel");
            return (Criteria) this;
        }

        public Criteria andLogLevelLessThanOrEqualTo(Integer value) {
            addCriterion("logLevel <=", value, "logLevel");
            return (Criteria) this;
        }

        public Criteria andLogLevelIn(List<Integer> values) {
            addCriterion("logLevel in", values, "logLevel");
            return (Criteria) this;
        }

        public Criteria andLogLevelNotIn(List<Integer> values) {
            addCriterion("logLevel not in", values, "logLevel");
            return (Criteria) this;
        }

        public Criteria andLogLevelBetween(Integer value1, Integer value2) {
            addCriterion("logLevel between", value1, value2, "logLevel");
            return (Criteria) this;
        }

        public Criteria andLogLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("logLevel not between", value1, value2, "logLevel");
            return (Criteria) this;
        }

        public Criteria andMaxLogSizeIsNull() {
            addCriterion("maxLogSize is null");
            return (Criteria) this;
        }

        public Criteria andMaxLogSizeIsNotNull() {
            addCriterion("maxLogSize is not null");
            return (Criteria) this;
        }

        public Criteria andMaxLogSizeEqualTo(Integer value) {
            addCriterion("maxLogSize =", value, "maxLogSize");
            return (Criteria) this;
        }

        public Criteria andMaxLogSizeNotEqualTo(Integer value) {
            addCriterion("maxLogSize <>", value, "maxLogSize");
            return (Criteria) this;
        }

        public Criteria andMaxLogSizeGreaterThan(Integer value) {
            addCriterion("maxLogSize >", value, "maxLogSize");
            return (Criteria) this;
        }

        public Criteria andMaxLogSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("maxLogSize >=", value, "maxLogSize");
            return (Criteria) this;
        }

        public Criteria andMaxLogSizeLessThan(Integer value) {
            addCriterion("maxLogSize <", value, "maxLogSize");
            return (Criteria) this;
        }

        public Criteria andMaxLogSizeLessThanOrEqualTo(Integer value) {
            addCriterion("maxLogSize <=", value, "maxLogSize");
            return (Criteria) this;
        }

        public Criteria andMaxLogSizeIn(List<Integer> values) {
            addCriterion("maxLogSize in", values, "maxLogSize");
            return (Criteria) this;
        }

        public Criteria andMaxLogSizeNotIn(List<Integer> values) {
            addCriterion("maxLogSize not in", values, "maxLogSize");
            return (Criteria) this;
        }

        public Criteria andMaxLogSizeBetween(Integer value1, Integer value2) {
            addCriterion("maxLogSize between", value1, value2, "maxLogSize");
            return (Criteria) this;
        }

        public Criteria andMaxLogSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("maxLogSize not between", value1, value2, "maxLogSize");
            return (Criteria) this;
        }

        public Criteria andCreatebyIsNull() {
            addCriterion("createby is null");
            return (Criteria) this;
        }

        public Criteria andCreatebyIsNotNull() {
            addCriterion("createby is not null");
            return (Criteria) this;
        }

        public Criteria andCreatebyEqualTo(String value) {
            addCriterion("createby =", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotEqualTo(String value) {
            addCriterion("createby <>", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyGreaterThan(String value) {
            addCriterion("createby >", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyGreaterThanOrEqualTo(String value) {
            addCriterion("createby >=", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLessThan(String value) {
            addCriterion("createby <", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLessThanOrEqualTo(String value) {
            addCriterion("createby <=", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLike(String value) {
            addCriterion("createby like", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotLike(String value) {
            addCriterion("createby not like", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyIn(List<String> values) {
            addCriterion("createby in", values, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotIn(List<String> values) {
            addCriterion("createby not in", values, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyBetween(String value1, String value2) {
            addCriterion("createby between", value1, value2, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotBetween(String value1, String value2) {
            addCriterion("createby not between", value1, value2, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("createdate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("createdate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("createdate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("createdate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("createdate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("createdate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("createdate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("createdate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("createdate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("createdate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("createdate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("createdate not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andUpdatebyIsNull() {
            addCriterion("updateby is null");
            return (Criteria) this;
        }

        public Criteria andUpdatebyIsNotNull() {
            addCriterion("updateby is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatebyEqualTo(String value) {
            addCriterion("updateby =", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotEqualTo(String value) {
            addCriterion("updateby <>", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyGreaterThan(String value) {
            addCriterion("updateby >", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyGreaterThanOrEqualTo(String value) {
            addCriterion("updateby >=", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyLessThan(String value) {
            addCriterion("updateby <", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyLessThanOrEqualTo(String value) {
            addCriterion("updateby <=", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyLike(String value) {
            addCriterion("updateby like", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotLike(String value) {
            addCriterion("updateby not like", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyIn(List<String> values) {
            addCriterion("updateby in", values, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotIn(List<String> values) {
            addCriterion("updateby not in", values, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyBetween(String value1, String value2) {
            addCriterion("updateby between", value1, value2, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotBetween(String value1, String value2) {
            addCriterion("updateby not between", value1, value2, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNull() {
            addCriterion("updatedate is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNotNull() {
            addCriterion("updatedate is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateEqualTo(Date value) {
            addCriterion("updatedate =", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotEqualTo(Date value) {
            addCriterion("updatedate <>", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThan(Date value) {
            addCriterion("updatedate >", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("updatedate >=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThan(Date value) {
            addCriterion("updatedate <", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThanOrEqualTo(Date value) {
            addCriterion("updatedate <=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIn(List<Date> values) {
            addCriterion("updatedate in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotIn(List<Date> values) {
            addCriterion("updatedate not in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateBetween(Date value1, Date value2) {
            addCriterion("updatedate between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotBetween(Date value1, Date value2) {
            addCriterion("updatedate not between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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