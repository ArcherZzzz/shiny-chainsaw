package com.zsp.finance.service.impl;

import com.zsp.finance.bean.PayMoney;
import com.zsp.finance.dao.PayMoneyDao;
import com.zsp.finance.service.PayMoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PayMoneyServiceImpl implements PayMoneyService {
    @Autowired(required = false)
    private PayMoneyDao payMoneyDao;
    @Override
    public List<PayMoney> selectAllPayMoney() {
        return payMoneyDao.selectAllPayMoney();
    }
}
