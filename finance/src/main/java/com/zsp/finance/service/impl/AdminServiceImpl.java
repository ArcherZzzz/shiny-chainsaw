package com.zsp.finance.service.impl;

import com.zsp.finance.bean.Admin;
import com.zsp.finance.dao.AdminDao;
import com.zsp.finance.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired(required = false)
    private AdminDao adminDao;

    @Override
    public Admin selectAdminByUserName(String adminName) {
        return adminDao.selectAdminByAdminName(adminName);
    }

    @Override
    public Admin selectUserByUserPassword(String adminName, String password) {
        Admin admin = adminDao.selectAdminByAdminName(adminName);
            return admin;
    }
    @Transactional
    @Override
    public void updateAdminStatus(Admin admin) {
        adminDao.updateAdminStatus(admin);
    }
}
