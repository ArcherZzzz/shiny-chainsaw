package com.zsp.finance.service;

import com.zsp.finance.bean.TermFinancial;

import java.util.List;

public interface TermFinancialService {
    List<TermFinancial> selectAllTermFinancial();
    TermFinancial selectTermFinancialById(Integer termFinancialId);

    void insertTermFinancial(TermFinancial termFinancial);

    void updateTermFinancial(TermFinancial termFinancial);

    void deleteTermFinancialById(Integer id);
}
