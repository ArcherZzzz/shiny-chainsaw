package com.zsp.finance.dao;

import com.zsp.finance.bean.FlowOfFunds;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface FlowOfFundsDao {

    void insertFlowOfFundsDao(@Param("flowOfFunds") FlowOfFunds flowOfFunds);

    List<FlowOfFunds> selectAllFlowOfFunds();

    List<FlowOfFunds> selectAllFlowOfFundsByUserId(Integer id);
}
