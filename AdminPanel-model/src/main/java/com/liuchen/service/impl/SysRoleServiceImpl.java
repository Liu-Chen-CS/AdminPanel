package com.liuchen.service.impl;

import com.liuchen.model.entity.Role;
import com.liuchen.repository.SysRoleDAO;
import com.liuchen.service.SysRoleService;
import com.liuchen.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Package: com.liuchen.service.impl
 * Description:
 *
 * @Author: Liu-Chen-CS
 * @Create: 4/9/2024 - 1:50 PM
 * @Version: v1.0
 */
@Service
public class SysRoleServiceImpl implements SysRoleService {

    @Autowired
    SysRoleDAO sysRoleDAO;
    @Override
    public void saveSysRole(Role role) {
        try{
            role.setCreateTime(new Date());
            role.setUpdateTime(new Date());
            sysRoleDAO.save(role);
        }
        catch(RuntimeException e){
            e.printStackTrace();
        }
    }
}
