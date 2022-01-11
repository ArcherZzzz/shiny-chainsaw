package com.zsp.finance.service;

import com.zsp.finance.bean.FundProduct;

import java.util.List;

public interface FundProductService {
    List<FundProduct> selectAllFundProduct();

    FundProduct selectFundProductById(Integer fundProductId);

    void insertFundProduct(FundProduct fundProduct);

    void updateFundProduct(FundProduct fundProduct);

    void deleteFundProductById(Integer id);
}
