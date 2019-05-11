package personal.bs.domain.po;

import java.util.ArrayList;
import java.util.List;

public class SpecTemplatePOExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table spec_template
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table spec_template
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table spec_template
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spec_template
     *
     * @mbg.generated
     */
    public SpecTemplatePOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spec_template
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spec_template
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spec_template
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spec_template
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spec_template
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spec_template
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spec_template
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spec_template
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spec_template
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spec_template
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table spec_template
     *
     * @mbg.generated
     */
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

        public Criteria andSpecValueIdsIsNull() {
            addCriterion("spec_value_ids is null");
            return (Criteria) this;
        }

        public Criteria andSpecValueIdsIsNotNull() {
            addCriterion("spec_value_ids is not null");
            return (Criteria) this;
        }

        public Criteria andSpecValueIdsEqualTo(String value) {
            addCriterion("spec_value_ids =", value, "specValueIds");
            return (Criteria) this;
        }

        public Criteria andSpecValueIdsNotEqualTo(String value) {
            addCriterion("spec_value_ids <>", value, "specValueIds");
            return (Criteria) this;
        }

        public Criteria andSpecValueIdsGreaterThan(String value) {
            addCriterion("spec_value_ids >", value, "specValueIds");
            return (Criteria) this;
        }

        public Criteria andSpecValueIdsGreaterThanOrEqualTo(String value) {
            addCriterion("spec_value_ids >=", value, "specValueIds");
            return (Criteria) this;
        }

        public Criteria andSpecValueIdsLessThan(String value) {
            addCriterion("spec_value_ids <", value, "specValueIds");
            return (Criteria) this;
        }

        public Criteria andSpecValueIdsLessThanOrEqualTo(String value) {
            addCriterion("spec_value_ids <=", value, "specValueIds");
            return (Criteria) this;
        }

        public Criteria andSpecValueIdsLike(String value) {
            addCriterion("spec_value_ids like", value, "specValueIds");
            return (Criteria) this;
        }

        public Criteria andSpecValueIdsNotLike(String value) {
            addCriterion("spec_value_ids not like", value, "specValueIds");
            return (Criteria) this;
        }

        public Criteria andSpecValueIdsIn(List<String> values) {
            addCriterion("spec_value_ids in", values, "specValueIds");
            return (Criteria) this;
        }

        public Criteria andSpecValueIdsNotIn(List<String> values) {
            addCriterion("spec_value_ids not in", values, "specValueIds");
            return (Criteria) this;
        }

        public Criteria andSpecValueIdsBetween(String value1, String value2) {
            addCriterion("spec_value_ids between", value1, value2, "specValueIds");
            return (Criteria) this;
        }

        public Criteria andSpecValueIdsNotBetween(String value1, String value2) {
            addCriterion("spec_value_ids not between", value1, value2, "specValueIds");
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

        public Criteria andExtendAttributesIsNull() {
            addCriterion("extend_attributes is null");
            return (Criteria) this;
        }

        public Criteria andExtendAttributesIsNotNull() {
            addCriterion("extend_attributes is not null");
            return (Criteria) this;
        }

        public Criteria andExtendAttributesEqualTo(String value) {
            addCriterion("extend_attributes =", value, "extendAttributes");
            return (Criteria) this;
        }

        public Criteria andExtendAttributesNotEqualTo(String value) {
            addCriterion("extend_attributes <>", value, "extendAttributes");
            return (Criteria) this;
        }

        public Criteria andExtendAttributesGreaterThan(String value) {
            addCriterion("extend_attributes >", value, "extendAttributes");
            return (Criteria) this;
        }

        public Criteria andExtendAttributesGreaterThanOrEqualTo(String value) {
            addCriterion("extend_attributes >=", value, "extendAttributes");
            return (Criteria) this;
        }

        public Criteria andExtendAttributesLessThan(String value) {
            addCriterion("extend_attributes <", value, "extendAttributes");
            return (Criteria) this;
        }

        public Criteria andExtendAttributesLessThanOrEqualTo(String value) {
            addCriterion("extend_attributes <=", value, "extendAttributes");
            return (Criteria) this;
        }

        public Criteria andExtendAttributesLike(String value) {
            addCriterion("extend_attributes like", value, "extendAttributes");
            return (Criteria) this;
        }

        public Criteria andExtendAttributesNotLike(String value) {
            addCriterion("extend_attributes not like", value, "extendAttributes");
            return (Criteria) this;
        }

        public Criteria andExtendAttributesIn(List<String> values) {
            addCriterion("extend_attributes in", values, "extendAttributes");
            return (Criteria) this;
        }

        public Criteria andExtendAttributesNotIn(List<String> values) {
            addCriterion("extend_attributes not in", values, "extendAttributes");
            return (Criteria) this;
        }

        public Criteria andExtendAttributesBetween(String value1, String value2) {
            addCriterion("extend_attributes between", value1, value2, "extendAttributes");
            return (Criteria) this;
        }

        public Criteria andExtendAttributesNotBetween(String value1, String value2) {
            addCriterion("extend_attributes not between", value1, value2, "extendAttributes");
            return (Criteria) this;
        }

        public Criteria andSpecValueIdsLikeInsensitive(String value) {
            addCriterion("upper(spec_value_ids) like", value.toUpperCase(), "specValueIds");
            return (Criteria) this;
        }

        public Criteria andNameLikeInsensitive(String value) {
            addCriterion("upper(name) like", value.toUpperCase(), "name");
            return (Criteria) this;
        }

        public Criteria andExtendAttributesLikeInsensitive(String value) {
            addCriterion("upper(extend_attributes) like", value.toUpperCase(), "extendAttributes");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table spec_template
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table spec_template
     *
     * @mbg.generated
     */
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