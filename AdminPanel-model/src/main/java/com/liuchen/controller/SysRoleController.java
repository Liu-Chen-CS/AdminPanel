package com.liuchen.controller;

import com.liuchen.model.entity.Role;
import com.liuchen.service.SysRoleService;
import com.liuchen.service.impl.SysRoleServiceImpl;
import com.liuchen.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Package: com.liuchen.controller
 * Description:
 *
 * @Author: Liu-Chen-CS
 * @Create: 4/9/2024 - 1:42 PM
 * @Version: v1.0
 */

@RestController
@RequestMapping("/admin/system/sysRole")
public class SysRoleController {

    @Autowired
    SysRoleServiceImpl sysRoleService;
    //adding roles
    @PostMapping(value = "/saveSysRole")
    public Result saveSysRole(@RequestBody Role role){
        System.out.println("123");
        sysRoleService.saveSysRole(role);
        return Result.ok();
    }

}
