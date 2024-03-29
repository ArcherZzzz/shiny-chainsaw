package com.zsp.finance.dao;

import com.zsp.finance.bean.UserPermissions;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserPermissionsDao {
    List<UserPermissions> selectUserPermissionsByUserId(Integer id);

    void deleteAllUserPermissionsByUserId(Integer id);

    void insertUserPermissions(@Param("up") UserPermissions up);
}
