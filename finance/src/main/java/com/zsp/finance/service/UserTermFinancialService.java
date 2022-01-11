package com.zsp.finance.service;

import com.zsp.finance.bean.TermFinancial;
import com.zsp.finance.bean.UserTermFinancial;

import java.util.List;

public interface UserTermFinancialService {
    void insertuserTermFinancial(UserTermFinancial userTermFinancial);

    void buyTermFinancial(Integer userId, TermFinancial termFinancial) throws Exception;

    List<UserTermFinancial> selectAllUserTermFinancialById(Integer userId);


}
