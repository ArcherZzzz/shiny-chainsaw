package com.zsp.finance.dao;

import com.zsp.finance.bean.News;

import java.util.List;

public interface NewsDao {

    List<News> selectAllNews();
}