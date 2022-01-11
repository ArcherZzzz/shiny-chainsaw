package com.zsp.finance.service;

import com.zsp.finance.bean.ChangeMoney;

import java.util.List;

public interface ChangeMoneyService {
    List<ChangeMoney> selectAllChangeMoney();
    ChangeMoney selectChangeMoneyById(Integer id);

    void insertChangeMoney(ChangeMoney changeMoney);

    void deleteChangeMoneyById(Integer id);

    void updateChangeMoney(ChangeMoney changeMoney);
}
