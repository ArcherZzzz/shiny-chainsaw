package com.zsp.finance.service.impl;


import com.zsp.finance.bean.ChangeMoney;
import com.zsp.finance.dao.ChangeMoneyDao;
import com.zsp.finance.service.ChangeMoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ChangeMoneyServiceImpl implements ChangeMoneyService {
    @Autowired(required = false)
    private ChangeMoneyDao changeMoneyDao;

    @Override
    public List<ChangeMoney> selectAllChangeMoney() {
        return changeMoneyDao.selectAllChangeMoney();
    }

    @Override
    public ChangeMoney selectChangeMoneyById(Integer id) {

        return changeMoneyDao.selectChangeMoneyById(id);
    }

    @Transactional
    @Override
    public void insertChangeMoney(ChangeMoney changeMoney) {
       changeMoneyDao.insertChangeMoney(changeMoney);
    }

    @Transactional
    @Override
    public void deleteChangeMoneyById(Integer id) {
        changeMoneyDao.deleteChangeMoneyById(id);
    }

    @Transactional
    @Override
    public void updateChangeMoney(ChangeMoney changeMoney) {
        changeMoneyDao.updateChangeMoney(changeMoney);
    }
}
