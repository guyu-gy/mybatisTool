package com.xiaoniu56.model.defaults;

import java.math.BigDecimal;
import java.util.Date;

public class FinancingCompany {
    private String companyId;

    private String name;

    private String representative;

    private String representativeTel;

    private String orgCode;

    private Date regDate;

    private Long regCapitalCurrency;

    private BigDecimal regCapital;

    private String regAddressId;

    private String officeAddressId;

    private String contact;

    private String tel;

    private String bizLicenseId;

    private Long enterpriseNature;

    private Date createTime;

    private Date modifyTime;

    private String email;

    private String taxRegistrationId;

    private String orgCodeCertificateId;

    private String postalCode;

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getRepresentative() {
        return representative;
    }

    public void setRepresentative(String representative) {
        this.representative = representative == null ? null : representative.trim();
    }

    public String getRepresentativeTel() {
        return representativeTel;
    }

    public void setRepresentativeTel(String representativeTel) {
        this.representativeTel = representativeTel == null ? null : representativeTel.trim();
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode == null ? null : orgCode.trim();
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public Long getRegCapitalCurrency() {
        return regCapitalCurrency;
    }

    public void setRegCapitalCurrency(Long regCapitalCurrency) {
        this.regCapitalCurrency = regCapitalCurrency;
    }

    public BigDecimal getRegCapital() {
        return regCapital;
    }

    public void setRegCapital(BigDecimal regCapital) {
        this.regCapital = regCapital;
    }

    public String getRegAddressId() {
        return regAddressId;
    }

    public void setRegAddressId(String regAddressId) {
        this.regAddressId = regAddressId == null ? null : regAddressId.trim();
    }

    public String getOfficeAddressId() {
        return officeAddressId;
    }

    public void setOfficeAddressId(String officeAddressId) {
        this.officeAddressId = officeAddressId == null ? null : officeAddressId.trim();
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getBizLicenseId() {
        return bizLicenseId;
    }

    public void setBizLicenseId(String bizLicenseId) {
        this.bizLicenseId = bizLicenseId == null ? null : bizLicenseId.trim();
    }

    public Long getEnterpriseNature() {
        return enterpriseNature;
    }

    public void setEnterpriseNature(Long enterpriseNature) {
        this.enterpriseNature = enterpriseNature;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getTaxRegistrationId() {
        return taxRegistrationId;
    }

    public void setTaxRegistrationId(String taxRegistrationId) {
        this.taxRegistrationId = taxRegistrationId == null ? null : taxRegistrationId.trim();
    }

    public String getOrgCodeCertificateId() {
        return orgCodeCertificateId;
    }

    public void setOrgCodeCertificateId(String orgCodeCertificateId) {
        this.orgCodeCertificateId = orgCodeCertificateId == null ? null : orgCodeCertificateId.trim();
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode == null ? null : postalCode.trim();
    }
}