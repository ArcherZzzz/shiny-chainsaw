package com.zsp.finance.service;

import com.zsp.finance.bean.FlowOfFunds;

import java.util.List;

public interface FlowOfFundsService {
    List<FlowOfFunds> selectAllFlowOfFunds();

    List<FlowOfFunds> selectAllFlowOfFundsByUserId(Integer id);
}
