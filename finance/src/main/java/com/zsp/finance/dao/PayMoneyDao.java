package com.zsp.finance.dao;

import com.zsp.finance.bean.PayMoney;

import java.util.List;

public interface PayMoneyDao {

    List<PayMoney> selectAllPayMoney();
}
