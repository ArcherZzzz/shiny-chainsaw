package com.zsp.finance.dao;

import com.zsp.finance.bean.UserChangeMoney;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserChangeMoneyDao {

    void insertUserChangeMoney(@Param("userChangeMoney") UserChangeMoney userChangeMoney);

    List<UserChangeMoney> selectAllUserChangeMoneyById(Integer userId);


    void updateUserChange(@Param("userChangeMoney") UserChangeMoney userChangeMoney);

    UserChangeMoney selectUserChangeMoneyById(Integer id);

    void  deleteUserChangeMoneyById(Integer id);
}
