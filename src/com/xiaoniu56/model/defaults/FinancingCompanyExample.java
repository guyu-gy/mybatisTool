package com.xiaoniu56.model.defaults;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FinancingCompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FinancingCompanyExample() {
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

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(String value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(String value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(String value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(String value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(String value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLike(String value) {
            addCriterion("company_id like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotLike(String value) {
            addCriterion("company_id not like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<String> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<String> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(String value1, String value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(String value1, String value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
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

        public Criteria andRepresentativeIsNull() {
            addCriterion("representative is null");
            return (Criteria) this;
        }

        public Criteria andRepresentativeIsNotNull() {
            addCriterion("representative is not null");
            return (Criteria) this;
        }

        public Criteria andRepresentativeEqualTo(String value) {
            addCriterion("representative =", value, "representative");
            return (Criteria) this;
        }

        public Criteria andRepresentativeNotEqualTo(String value) {
            addCriterion("representative <>", value, "representative");
            return (Criteria) this;
        }

        public Criteria andRepresentativeGreaterThan(String value) {
            addCriterion("representative >", value, "representative");
            return (Criteria) this;
        }

        public Criteria andRepresentativeGreaterThanOrEqualTo(String value) {
            addCriterion("representative >=", value, "representative");
            return (Criteria) this;
        }

        public Criteria andRepresentativeLessThan(String value) {
            addCriterion("representative <", value, "representative");
            return (Criteria) this;
        }

        public Criteria andRepresentativeLessThanOrEqualTo(String value) {
            addCriterion("representative <=", value, "representative");
            return (Criteria) this;
        }

        public Criteria andRepresentativeLike(String value) {
            addCriterion("representative like", value, "representative");
            return (Criteria) this;
        }

        public Criteria andRepresentativeNotLike(String value) {
            addCriterion("representative not like", value, "representative");
            return (Criteria) this;
        }

        public Criteria andRepresentativeIn(List<String> values) {
            addCriterion("representative in", values, "representative");
            return (Criteria) this;
        }

        public Criteria andRepresentativeNotIn(List<String> values) {
            addCriterion("representative not in", values, "representative");
            return (Criteria) this;
        }

        public Criteria andRepresentativeBetween(String value1, String value2) {
            addCriterion("representative between", value1, value2, "representative");
            return (Criteria) this;
        }

        public Criteria andRepresentativeNotBetween(String value1, String value2) {
            addCriterion("representative not between", value1, value2, "representative");
            return (Criteria) this;
        }

        public Criteria andRepresentativeTelIsNull() {
            addCriterion("representative_tel is null");
            return (Criteria) this;
        }

        public Criteria andRepresentativeTelIsNotNull() {
            addCriterion("representative_tel is not null");
            return (Criteria) this;
        }

        public Criteria andRepresentativeTelEqualTo(String value) {
            addCriterion("representative_tel =", value, "representativeTel");
            return (Criteria) this;
        }

        public Criteria andRepresentativeTelNotEqualTo(String value) {
            addCriterion("representative_tel <>", value, "representativeTel");
            return (Criteria) this;
        }

        public Criteria andRepresentativeTelGreaterThan(String value) {
            addCriterion("representative_tel >", value, "representativeTel");
            return (Criteria) this;
        }

        public Criteria andRepresentativeTelGreaterThanOrEqualTo(String value) {
            addCriterion("representative_tel >=", value, "representativeTel");
            return (Criteria) this;
        }

        public Criteria andRepresentativeTelLessThan(String value) {
            addCriterion("representative_tel <", value, "representativeTel");
            return (Criteria) this;
        }

        public Criteria andRepresentativeTelLessThanOrEqualTo(String value) {
            addCriterion("representative_tel <=", value, "representativeTel");
            return (Criteria) this;
        }

        public Criteria andRepresentativeTelLike(String value) {
            addCriterion("representative_tel like", value, "representativeTel");
            return (Criteria) this;
        }

        public Criteria andRepresentativeTelNotLike(String value) {
            addCriterion("representative_tel not like", value, "representativeTel");
            return (Criteria) this;
        }

        public Criteria andRepresentativeTelIn(List<String> values) {
            addCriterion("representative_tel in", values, "representativeTel");
            return (Criteria) this;
        }

        public Criteria andRepresentativeTelNotIn(List<String> values) {
            addCriterion("representative_tel not in", values, "representativeTel");
            return (Criteria) this;
        }

        public Criteria andRepresentativeTelBetween(String value1, String value2) {
            addCriterion("representative_tel between", value1, value2, "representativeTel");
            return (Criteria) this;
        }

        public Criteria andRepresentativeTelNotBetween(String value1, String value2) {
            addCriterion("representative_tel not between", value1, value2, "representativeTel");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIsNull() {
            addCriterion("org_code is null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIsNotNull() {
            addCriterion("org_code is not null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeEqualTo(String value) {
            addCriterion("org_code =", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotEqualTo(String value) {
            addCriterion("org_code <>", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeGreaterThan(String value) {
            addCriterion("org_code >", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeGreaterThanOrEqualTo(String value) {
            addCriterion("org_code >=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLessThan(String value) {
            addCriterion("org_code <", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLessThanOrEqualTo(String value) {
            addCriterion("org_code <=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLike(String value) {
            addCriterion("org_code like", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotLike(String value) {
            addCriterion("org_code not like", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIn(List<String> values) {
            addCriterion("org_code in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotIn(List<String> values) {
            addCriterion("org_code not in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeBetween(String value1, String value2) {
            addCriterion("org_code between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotBetween(String value1, String value2) {
            addCriterion("org_code not between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria andRegDateIsNull() {
            addCriterion("reg_date is null");
            return (Criteria) this;
        }

        public Criteria andRegDateIsNotNull() {
            addCriterion("reg_date is not null");
            return (Criteria) this;
        }

        public Criteria andRegDateEqualTo(Date value) {
            addCriterion("reg_date =", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateNotEqualTo(Date value) {
            addCriterion("reg_date <>", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateGreaterThan(Date value) {
            addCriterion("reg_date >", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateGreaterThanOrEqualTo(Date value) {
            addCriterion("reg_date >=", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateLessThan(Date value) {
            addCriterion("reg_date <", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateLessThanOrEqualTo(Date value) {
            addCriterion("reg_date <=", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateIn(List<Date> values) {
            addCriterion("reg_date in", values, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateNotIn(List<Date> values) {
            addCriterion("reg_date not in", values, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateBetween(Date value1, Date value2) {
            addCriterion("reg_date between", value1, value2, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateNotBetween(Date value1, Date value2) {
            addCriterion("reg_date not between", value1, value2, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegCapitalCurrencyIsNull() {
            addCriterion("reg_capital_currency is null");
            return (Criteria) this;
        }

        public Criteria andRegCapitalCurrencyIsNotNull() {
            addCriterion("reg_capital_currency is not null");
            return (Criteria) this;
        }

        public Criteria andRegCapitalCurrencyEqualTo(Long value) {
            addCriterion("reg_capital_currency =", value, "regCapitalCurrency");
            return (Criteria) this;
        }

        public Criteria andRegCapitalCurrencyNotEqualTo(Long value) {
            addCriterion("reg_capital_currency <>", value, "regCapitalCurrency");
            return (Criteria) this;
        }

        public Criteria andRegCapitalCurrencyGreaterThan(Long value) {
            addCriterion("reg_capital_currency >", value, "regCapitalCurrency");
            return (Criteria) this;
        }

        public Criteria andRegCapitalCurrencyGreaterThanOrEqualTo(Long value) {
            addCriterion("reg_capital_currency >=", value, "regCapitalCurrency");
            return (Criteria) this;
        }

        public Criteria andRegCapitalCurrencyLessThan(Long value) {
            addCriterion("reg_capital_currency <", value, "regCapitalCurrency");
            return (Criteria) this;
        }

        public Criteria andRegCapitalCurrencyLessThanOrEqualTo(Long value) {
            addCriterion("reg_capital_currency <=", value, "regCapitalCurrency");
            return (Criteria) this;
        }

        public Criteria andRegCapitalCurrencyIn(List<Long> values) {
            addCriterion("reg_capital_currency in", values, "regCapitalCurrency");
            return (Criteria) this;
        }

        public Criteria andRegCapitalCurrencyNotIn(List<Long> values) {
            addCriterion("reg_capital_currency not in", values, "regCapitalCurrency");
            return (Criteria) this;
        }

        public Criteria andRegCapitalCurrencyBetween(Long value1, Long value2) {
            addCriterion("reg_capital_currency between", value1, value2, "regCapitalCurrency");
            return (Criteria) this;
        }

        public Criteria andRegCapitalCurrencyNotBetween(Long value1, Long value2) {
            addCriterion("reg_capital_currency not between", value1, value2, "regCapitalCurrency");
            return (Criteria) this;
        }

        public Criteria andRegCapitalIsNull() {
            addCriterion("reg_capital is null");
            return (Criteria) this;
        }

        public Criteria andRegCapitalIsNotNull() {
            addCriterion("reg_capital is not null");
            return (Criteria) this;
        }

        public Criteria andRegCapitalEqualTo(BigDecimal value) {
            addCriterion("reg_capital =", value, "regCapital");
            return (Criteria) this;
        }

        public Criteria andRegCapitalNotEqualTo(BigDecimal value) {
            addCriterion("reg_capital <>", value, "regCapital");
            return (Criteria) this;
        }

        public Criteria andRegCapitalGreaterThan(BigDecimal value) {
            addCriterion("reg_capital >", value, "regCapital");
            return (Criteria) this;
        }

        public Criteria andRegCapitalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("reg_capital >=", value, "regCapital");
            return (Criteria) this;
        }

        public Criteria andRegCapitalLessThan(BigDecimal value) {
            addCriterion("reg_capital <", value, "regCapital");
            return (Criteria) this;
        }

        public Criteria andRegCapitalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("reg_capital <=", value, "regCapital");
            return (Criteria) this;
        }

        public Criteria andRegCapitalIn(List<BigDecimal> values) {
            addCriterion("reg_capital in", values, "regCapital");
            return (Criteria) this;
        }

        public Criteria andRegCapitalNotIn(List<BigDecimal> values) {
            addCriterion("reg_capital not in", values, "regCapital");
            return (Criteria) this;
        }

        public Criteria andRegCapitalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reg_capital between", value1, value2, "regCapital");
            return (Criteria) this;
        }

        public Criteria andRegCapitalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reg_capital not between", value1, value2, "regCapital");
            return (Criteria) this;
        }

        public Criteria andRegAddressIdIsNull() {
            addCriterion("reg_address_id is null");
            return (Criteria) this;
        }

        public Criteria andRegAddressIdIsNotNull() {
            addCriterion("reg_address_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegAddressIdEqualTo(String value) {
            addCriterion("reg_address_id =", value, "regAddressId");
            return (Criteria) this;
        }

        public Criteria andRegAddressIdNotEqualTo(String value) {
            addCriterion("reg_address_id <>", value, "regAddressId");
            return (Criteria) this;
        }

        public Criteria andRegAddressIdGreaterThan(String value) {
            addCriterion("reg_address_id >", value, "regAddressId");
            return (Criteria) this;
        }

        public Criteria andRegAddressIdGreaterThanOrEqualTo(String value) {
            addCriterion("reg_address_id >=", value, "regAddressId");
            return (Criteria) this;
        }

        public Criteria andRegAddressIdLessThan(String value) {
            addCriterion("reg_address_id <", value, "regAddressId");
            return (Criteria) this;
        }

        public Criteria andRegAddressIdLessThanOrEqualTo(String value) {
            addCriterion("reg_address_id <=", value, "regAddressId");
            return (Criteria) this;
        }

        public Criteria andRegAddressIdLike(String value) {
            addCriterion("reg_address_id like", value, "regAddressId");
            return (Criteria) this;
        }

        public Criteria andRegAddressIdNotLike(String value) {
            addCriterion("reg_address_id not like", value, "regAddressId");
            return (Criteria) this;
        }

        public Criteria andRegAddressIdIn(List<String> values) {
            addCriterion("reg_address_id in", values, "regAddressId");
            return (Criteria) this;
        }

        public Criteria andRegAddressIdNotIn(List<String> values) {
            addCriterion("reg_address_id not in", values, "regAddressId");
            return (Criteria) this;
        }

        public Criteria andRegAddressIdBetween(String value1, String value2) {
            addCriterion("reg_address_id between", value1, value2, "regAddressId");
            return (Criteria) this;
        }

        public Criteria andRegAddressIdNotBetween(String value1, String value2) {
            addCriterion("reg_address_id not between", value1, value2, "regAddressId");
            return (Criteria) this;
        }

        public Criteria andOfficeAddressIdIsNull() {
            addCriterion("office_address_id is null");
            return (Criteria) this;
        }

        public Criteria andOfficeAddressIdIsNotNull() {
            addCriterion("office_address_id is not null");
            return (Criteria) this;
        }

        public Criteria andOfficeAddressIdEqualTo(String value) {
            addCriterion("office_address_id =", value, "officeAddressId");
            return (Criteria) this;
        }

        public Criteria andOfficeAddressIdNotEqualTo(String value) {
            addCriterion("office_address_id <>", value, "officeAddressId");
            return (Criteria) this;
        }

        public Criteria andOfficeAddressIdGreaterThan(String value) {
            addCriterion("office_address_id >", value, "officeAddressId");
            return (Criteria) this;
        }

        public Criteria andOfficeAddressIdGreaterThanOrEqualTo(String value) {
            addCriterion("office_address_id >=", value, "officeAddressId");
            return (Criteria) this;
        }

        public Criteria andOfficeAddressIdLessThan(String value) {
            addCriterion("office_address_id <", value, "officeAddressId");
            return (Criteria) this;
        }

        public Criteria andOfficeAddressIdLessThanOrEqualTo(String value) {
            addCriterion("office_address_id <=", value, "officeAddressId");
            return (Criteria) this;
        }

        public Criteria andOfficeAddressIdLike(String value) {
            addCriterion("office_address_id like", value, "officeAddressId");
            return (Criteria) this;
        }

        public Criteria andOfficeAddressIdNotLike(String value) {
            addCriterion("office_address_id not like", value, "officeAddressId");
            return (Criteria) this;
        }

        public Criteria andOfficeAddressIdIn(List<String> values) {
            addCriterion("office_address_id in", values, "officeAddressId");
            return (Criteria) this;
        }

        public Criteria andOfficeAddressIdNotIn(List<String> values) {
            addCriterion("office_address_id not in", values, "officeAddressId");
            return (Criteria) this;
        }

        public Criteria andOfficeAddressIdBetween(String value1, String value2) {
            addCriterion("office_address_id between", value1, value2, "officeAddressId");
            return (Criteria) this;
        }

        public Criteria andOfficeAddressIdNotBetween(String value1, String value2) {
            addCriterion("office_address_id not between", value1, value2, "officeAddressId");
            return (Criteria) this;
        }

        public Criteria andContactIsNull() {
            addCriterion("contact is null");
            return (Criteria) this;
        }

        public Criteria andContactIsNotNull() {
            addCriterion("contact is not null");
            return (Criteria) this;
        }

        public Criteria andContactEqualTo(String value) {
            addCriterion("contact =", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotEqualTo(String value) {
            addCriterion("contact <>", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThan(String value) {
            addCriterion("contact >", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThanOrEqualTo(String value) {
            addCriterion("contact >=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThan(String value) {
            addCriterion("contact <", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThanOrEqualTo(String value) {
            addCriterion("contact <=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLike(String value) {
            addCriterion("contact like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotLike(String value) {
            addCriterion("contact not like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactIn(List<String> values) {
            addCriterion("contact in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotIn(List<String> values) {
            addCriterion("contact not in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactBetween(String value1, String value2) {
            addCriterion("contact between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotBetween(String value1, String value2) {
            addCriterion("contact not between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andBizLicenseIdIsNull() {
            addCriterion("biz_license_id is null");
            return (Criteria) this;
        }

        public Criteria andBizLicenseIdIsNotNull() {
            addCriterion("biz_license_id is not null");
            return (Criteria) this;
        }

        public Criteria andBizLicenseIdEqualTo(String value) {
            addCriterion("biz_license_id =", value, "bizLicenseId");
            return (Criteria) this;
        }

        public Criteria andBizLicenseIdNotEqualTo(String value) {
            addCriterion("biz_license_id <>", value, "bizLicenseId");
            return (Criteria) this;
        }

        public Criteria andBizLicenseIdGreaterThan(String value) {
            addCriterion("biz_license_id >", value, "bizLicenseId");
            return (Criteria) this;
        }

        public Criteria andBizLicenseIdGreaterThanOrEqualTo(String value) {
            addCriterion("biz_license_id >=", value, "bizLicenseId");
            return (Criteria) this;
        }

        public Criteria andBizLicenseIdLessThan(String value) {
            addCriterion("biz_license_id <", value, "bizLicenseId");
            return (Criteria) this;
        }

        public Criteria andBizLicenseIdLessThanOrEqualTo(String value) {
            addCriterion("biz_license_id <=", value, "bizLicenseId");
            return (Criteria) this;
        }

        public Criteria andBizLicenseIdLike(String value) {
            addCriterion("biz_license_id like", value, "bizLicenseId");
            return (Criteria) this;
        }

        public Criteria andBizLicenseIdNotLike(String value) {
            addCriterion("biz_license_id not like", value, "bizLicenseId");
            return (Criteria) this;
        }

        public Criteria andBizLicenseIdIn(List<String> values) {
            addCriterion("biz_license_id in", values, "bizLicenseId");
            return (Criteria) this;
        }

        public Criteria andBizLicenseIdNotIn(List<String> values) {
            addCriterion("biz_license_id not in", values, "bizLicenseId");
            return (Criteria) this;
        }

        public Criteria andBizLicenseIdBetween(String value1, String value2) {
            addCriterion("biz_license_id between", value1, value2, "bizLicenseId");
            return (Criteria) this;
        }

        public Criteria andBizLicenseIdNotBetween(String value1, String value2) {
            addCriterion("biz_license_id not between", value1, value2, "bizLicenseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNatureIsNull() {
            addCriterion("enterprise_nature is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNatureIsNotNull() {
            addCriterion("enterprise_nature is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNatureEqualTo(Long value) {
            addCriterion("enterprise_nature =", value, "enterpriseNature");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNatureNotEqualTo(Long value) {
            addCriterion("enterprise_nature <>", value, "enterpriseNature");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNatureGreaterThan(Long value) {
            addCriterion("enterprise_nature >", value, "enterpriseNature");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNatureGreaterThanOrEqualTo(Long value) {
            addCriterion("enterprise_nature >=", value, "enterpriseNature");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNatureLessThan(Long value) {
            addCriterion("enterprise_nature <", value, "enterpriseNature");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNatureLessThanOrEqualTo(Long value) {
            addCriterion("enterprise_nature <=", value, "enterpriseNature");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNatureIn(List<Long> values) {
            addCriterion("enterprise_nature in", values, "enterpriseNature");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNatureNotIn(List<Long> values) {
            addCriterion("enterprise_nature not in", values, "enterpriseNature");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNatureBetween(Long value1, Long value2) {
            addCriterion("enterprise_nature between", value1, value2, "enterpriseNature");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNatureNotBetween(Long value1, Long value2) {
            addCriterion("enterprise_nature not between", value1, value2, "enterpriseNature");
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

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationIdIsNull() {
            addCriterion("tax_registration_id is null");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationIdIsNotNull() {
            addCriterion("tax_registration_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationIdEqualTo(String value) {
            addCriterion("tax_registration_id =", value, "taxRegistrationId");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationIdNotEqualTo(String value) {
            addCriterion("tax_registration_id <>", value, "taxRegistrationId");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationIdGreaterThan(String value) {
            addCriterion("tax_registration_id >", value, "taxRegistrationId");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationIdGreaterThanOrEqualTo(String value) {
            addCriterion("tax_registration_id >=", value, "taxRegistrationId");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationIdLessThan(String value) {
            addCriterion("tax_registration_id <", value, "taxRegistrationId");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationIdLessThanOrEqualTo(String value) {
            addCriterion("tax_registration_id <=", value, "taxRegistrationId");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationIdLike(String value) {
            addCriterion("tax_registration_id like", value, "taxRegistrationId");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationIdNotLike(String value) {
            addCriterion("tax_registration_id not like", value, "taxRegistrationId");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationIdIn(List<String> values) {
            addCriterion("tax_registration_id in", values, "taxRegistrationId");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationIdNotIn(List<String> values) {
            addCriterion("tax_registration_id not in", values, "taxRegistrationId");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationIdBetween(String value1, String value2) {
            addCriterion("tax_registration_id between", value1, value2, "taxRegistrationId");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationIdNotBetween(String value1, String value2) {
            addCriterion("tax_registration_id not between", value1, value2, "taxRegistrationId");
            return (Criteria) this;
        }

        public Criteria andOrgCodeCertificateIdIsNull() {
            addCriterion("org_code_certificate_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeCertificateIdIsNotNull() {
            addCriterion("org_code_certificate_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeCertificateIdEqualTo(String value) {
            addCriterion("org_code_certificate_id =", value, "orgCodeCertificateId");
            return (Criteria) this;
        }

        public Criteria andOrgCodeCertificateIdNotEqualTo(String value) {
            addCriterion("org_code_certificate_id <>", value, "orgCodeCertificateId");
            return (Criteria) this;
        }

        public Criteria andOrgCodeCertificateIdGreaterThan(String value) {
            addCriterion("org_code_certificate_id >", value, "orgCodeCertificateId");
            return (Criteria) this;
        }

        public Criteria andOrgCodeCertificateIdGreaterThanOrEqualTo(String value) {
            addCriterion("org_code_certificate_id >=", value, "orgCodeCertificateId");
            return (Criteria) this;
        }

        public Criteria andOrgCodeCertificateIdLessThan(String value) {
            addCriterion("org_code_certificate_id <", value, "orgCodeCertificateId");
            return (Criteria) this;
        }

        public Criteria andOrgCodeCertificateIdLessThanOrEqualTo(String value) {
            addCriterion("org_code_certificate_id <=", value, "orgCodeCertificateId");
            return (Criteria) this;
        }

        public Criteria andOrgCodeCertificateIdLike(String value) {
            addCriterion("org_code_certificate_id like", value, "orgCodeCertificateId");
            return (Criteria) this;
        }

        public Criteria andOrgCodeCertificateIdNotLike(String value) {
            addCriterion("org_code_certificate_id not like", value, "orgCodeCertificateId");
            return (Criteria) this;
        }

        public Criteria andOrgCodeCertificateIdIn(List<String> values) {
            addCriterion("org_code_certificate_id in", values, "orgCodeCertificateId");
            return (Criteria) this;
        }

        public Criteria andOrgCodeCertificateIdNotIn(List<String> values) {
            addCriterion("org_code_certificate_id not in", values, "orgCodeCertificateId");
            return (Criteria) this;
        }

        public Criteria andOrgCodeCertificateIdBetween(String value1, String value2) {
            addCriterion("org_code_certificate_id between", value1, value2, "orgCodeCertificateId");
            return (Criteria) this;
        }

        public Criteria andOrgCodeCertificateIdNotBetween(String value1, String value2) {
            addCriterion("org_code_certificate_id not between", value1, value2, "orgCodeCertificateId");
            return (Criteria) this;
        }

        public Criteria andPostalCodeIsNull() {
            addCriterion("postal_code is null");
            return (Criteria) this;
        }

        public Criteria andPostalCodeIsNotNull() {
            addCriterion("postal_code is not null");
            return (Criteria) this;
        }

        public Criteria andPostalCodeEqualTo(String value) {
            addCriterion("postal_code =", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeNotEqualTo(String value) {
            addCriterion("postal_code <>", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeGreaterThan(String value) {
            addCriterion("postal_code >", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeGreaterThanOrEqualTo(String value) {
            addCriterion("postal_code >=", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeLessThan(String value) {
            addCriterion("postal_code <", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeLessThanOrEqualTo(String value) {
            addCriterion("postal_code <=", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeLike(String value) {
            addCriterion("postal_code like", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeNotLike(String value) {
            addCriterion("postal_code not like", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeIn(List<String> values) {
            addCriterion("postal_code in", values, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeNotIn(List<String> values) {
            addCriterion("postal_code not in", values, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeBetween(String value1, String value2) {
            addCriterion("postal_code between", value1, value2, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeNotBetween(String value1, String value2) {
            addCriterion("postal_code not between", value1, value2, "postalCode");
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