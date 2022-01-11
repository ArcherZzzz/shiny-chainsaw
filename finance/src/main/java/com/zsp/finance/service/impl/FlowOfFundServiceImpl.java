package com.zsp.finance.service.impl;

import com.zsp.finance.bean.FlowOfFunds;
import com.zsp.finance.dao.FlowOfFundsDao;
import com.zsp.finance.service.FlowOfFundsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlowOfFundServiceImpl implements FlowOfFundsService {
    @Autowired(required = false)
    private FlowOfFundsDao flowOfFundsDao;

    @Override
    public List<FlowOfFunds> selectAllFlowOfFunds() {
        return flowOfFundsDao.selectAllFlowOfFunds();
    }

    @Override
    public List<FlowOfFunds> selectAllFlowOfFundsByUserId(Integer id) {
        return flowOfFundsDao.selectAllFlowOfFundsByUserId(id);
    }
}
