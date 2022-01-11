package com.zsp.finance.service;

import com.zsp.finance.bean.Admin;


public interface AdminService {

    Admin selectAdminByUserName(String adminName);

    Admin selectUserByUserPassword(String adminName,String password);

    void updateAdminStatus(Admin admin);
}
