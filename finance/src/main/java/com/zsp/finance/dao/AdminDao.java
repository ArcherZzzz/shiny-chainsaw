package com.zsp.finance.dao;

import com.zsp.finance.bean.Admin;
import org.apache.ibatis.annotations.Param;

public interface AdminDao {

    Admin selectAdminByAdminName(String adminName);

    void updateAdminStatus(@Param("admin") Admin admin);

    Admin selectAdminById(Integer id);
}
