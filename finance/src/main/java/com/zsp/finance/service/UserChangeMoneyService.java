package com.zsp.finance.service;

import com.zsp.finance.bean.ChangeMoney;
import com.zsp.finance.bean.UserChangeMoney;

import java.util.List;

public interface UserChangeMoneyService {
    void insertUserChangeMoney(UserChangeMoney userChangeMoney);

    void buyChangeMoney(Integer userId, ChangeMoney changeMoney) throws Exception;


    List<UserChangeMoney> selectAllUserChangeMoneyById(Integer userId);


    void deleteUserChangeMoneyById(Integer userChangeMoneyId,Integer userId);

    UserChangeMoney selectUserChangeMoneyById(Integer id);

}
