package com.zsp.finance.dao;

import com.zsp.finance.bean.AdminPermissions;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdminPermissionsDao {
    List<AdminPermissions> selectAdminPermissionsByAdminId(Integer id);

    void updateAllAdminPermissions();

    void updateAdminPermissions(@Param("ap") AdminPermissions ap);
}
