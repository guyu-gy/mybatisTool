package com.xiaoniu56.dao;

import com.xiaoniu56.model.defaults.FinancingCompany;
import com.xiaoniu56.model.defaults.FinancingCompanyExample;
import java.util.List;

public interface FinancingCompanyMapper {
    int countByExample(FinancingCompanyExample example);

    int deleteByExample(FinancingCompanyExample example);

    int deleteByPrimaryKey(String companyId);

    int insert(FinancingCompany record);

    int insertSelective(FinancingCompany record);

    List<FinancingCompany> selectByExample(FinancingCompanyExample example);

    FinancingCompany selectByPrimaryKey(String companyId);

    int updateByPrimaryKeySelective(FinancingCompany record);

    int updateByPrimaryKey(FinancingCompany record);
}