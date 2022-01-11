package com.zsp.finance.service.impl;

import com.zsp.finance.bean.AdminPermissions;
import com.zsp.finance.dao.AdminPermissionsDao;
import com.zsp.finance.service.AdminPermissionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminPermissionsServiceImpl implements AdminPermissionsService {
    @Autowired(required = false)
    private AdminPermissionsDao adminPermissionsDao;
    @Override
    public List<AdminPermissions> selectAdminPermissionsByAdminId(Integer id) {
        return adminPermissionsDao.selectAdminPermissionsByAdminId(id);
    }

    @Override
    public void updateAllAdminPermissions() {
         adminPermissionsDao.updateAllAdminPermissions();
    }

    @Override
    public void updateAdminPermissions(AdminPermissions ap) {
          adminPermissionsDao.updateAdminPermissions(ap);
    }
}
