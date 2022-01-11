package com.zsp.finance.service;

import com.zsp.finance.bean.Info;

import java.util.List;

public interface InfoService {

    List<Info> selectInfoByUserId(Integer userId);

    void deleteInfoById(Integer infoId);

    void updateInfoStatusById(Integer userId);

    void insertInfo(Info info);
}
