package com.zsp.finance.service.impl;

import com.zsp.finance.bean.News;
import com.zsp.finance.dao.NewsDao;
import com.zsp.finance.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NewsServiceImpl implements NewsService {
    @Autowired(required = false)
    private NewsDao newsDao;
    @Override
    public List<News> selectAllNews() {
        return newsDao.selectAllNews();
    }
}
