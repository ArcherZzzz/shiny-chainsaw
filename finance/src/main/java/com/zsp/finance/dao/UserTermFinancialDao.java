package com.zsp.finance.dao;

import com.zsp.finance.bean.UserTermFinancial;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserTermFinancialDao {
    void insertuserTermFinancial(@Param("userTermFinancial") UserTermFinancial userTermFinancial);

    List<UserTermFinancial> selectAllUserTermFinancialById(Integer userId);


}
