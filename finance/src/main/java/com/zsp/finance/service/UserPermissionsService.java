package com.zsp.finance.service;

import com.zsp.finance.bean.UserPermissions;

import java.util.List;

public interface UserPermissionsService {
    List<UserPermissions> selectUserPermissionsByUserId(Integer id);

    void deleteAllUserPermissionsByUserId(Integer id);

    void insertUserPermissions(UserPermissions up);
}
