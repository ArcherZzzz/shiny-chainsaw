package com.zsp.finance.dao;

import com.zsp.finance.bean.UserFundProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserFundProductDao {
    void insertUserFundProduct(@Param("userFundProduct") UserFundProduct userFundProduct);

    List<UserFundProduct> selectAllUserFundProductById(Integer userId);


}
