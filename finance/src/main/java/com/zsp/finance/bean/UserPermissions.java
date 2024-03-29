package com.zsp.finance.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class UserPermissions {
    private Integer id;

    private Integer userId;

    private Integer permissionId;



    private Permissions permissions;
}
