package com.zsp.finance.service;

import com.zsp.finance.bean.Permissions;

import java.util.List;

public interface PermissionService {

    List<Permissions> selectUserById(Integer userid);

    List<Permissions> selectAdminById(Integer adminid);


    Permissions selectPermissionsByPermission(String permissionName);
}
