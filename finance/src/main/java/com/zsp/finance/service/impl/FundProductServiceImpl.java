package com.zsp.finance.service.impl;

import com.zsp.finance.bean.FundProduct;
import com.zsp.finance.dao.FundProductDao;
import com.zsp.finance.service.FundProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FundProductServiceImpl implements FundProductService {

    @Autowired(required = false)
    private FundProductDao fundProductDao;

    @Override
    public List<FundProduct> selectAllFundProduct() {
        return fundProductDao.selectAllFundProduct();
    }

    @Override
    public FundProduct selectFundProductById(Integer fundProductId) {
        return fundProductDao.selectFundProductById(fundProductId);
    }

    @Transactional
    @Override
    public void insertFundProduct(FundProduct fundProduct) {
               fundProductDao.insertFundProduct(fundProduct);
    }

    @Transactional
    @Override
    public void updateFundProduct(FundProduct fundProduct) {
        fundProductDao.updateFundProduct(fundProduct);
    }

    @Transactional
    @Override
    public void deleteFundProductById(Integer id) {
        fundProductDao.deleteFundProductById(id);
    }
}
