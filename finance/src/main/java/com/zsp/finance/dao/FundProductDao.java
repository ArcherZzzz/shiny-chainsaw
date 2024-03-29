package com.zsp.finance.dao;

import com.zsp.finance.bean.FundProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FundProductDao {
    List<FundProduct> selectAllFundProduct();

    FundProduct selectFundProductById(Integer fundProductId);

    void insertFundProduct(@Param("fundProduct") FundProduct fundProduct);

    void updateFundProduct(@Param("fundProduct")FundProduct fundProduct);

    void deleteFundProductById(Integer id);
}
