package com.zsp.finance.service;

import com.zsp.finance.bean.FundProduct;
import com.zsp.finance.bean.UserFundProduct;

import java.util.List;

public interface UserFundProductService {
    void buyFundProduct(Integer userId, FundProduct fundProduct) throws Exception;

    void insertUserFundProduct( UserFundProduct userFundProduct);

    List<UserFundProduct> selectAllUserFundProductById(Integer userId);


}
