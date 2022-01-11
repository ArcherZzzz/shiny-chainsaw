package com.zsp.finance.dao;

import com.zsp.finance.bean.Info;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InfoDao {

    List<Info> selectInfoByUserId(Integer userId);

    void deleteInfoById(Integer id);

    void updateInfoStatusById(Integer infoId);

    void insertInfo(@Param("info") Info info);
}
