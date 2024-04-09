package com.liuchen;

import com.liuchen.model.entity.Menu;
import com.liuchen.model.entity.Role;
import com.liuchen.model.entity.User;
import com.liuchen.model.enums.MenuOptions;
import com.liuchen.repository.SysMenuDAO;
import com.liuchen.repository.SysRoleDAO;
import com.liuchen.repository.SysUserDAO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;

/**
 * Package: com.liuchen
 * Description:
 *
 * @Author: Liu-Chen-CS
 * @Create: 4/7/2024 - 2:18 PM
 * @Version: v1.0
 */

@SpringBootTest
public class ApplicationTest {

    @Autowired
    SysUserDAO sysUserDAO;

    @Autowired
    SysRoleDAO roleRepo;

    @Autowired
    SysMenuDAO sysMenuDAO;

    @Test
    void test_01(){

        User user1 = new User();
        User user2 = new User();
        user1.setUsername("Liu Chen");
        user2.setUsername("Lisa Guillard");

        Role role1 = new Role();
        Role role2 = new Role();
        role1.setRoleName("Teacher");
        role2.setRoleName("Fireman");

        Menu menu1 = new Menu();
        Menu menu2 = new Menu();
        menu1.setTitle(String.valueOf(MenuOptions.region));
        menu2.setTitle(String.valueOf(MenuOptions.sysMenu));

        HashSet<User> users = new HashSet<>();
        HashSet<Role> roles = new HashSet<>();
        HashSet<Menu> menus = new HashSet<>();

        users.add(user1);
        users.add(user2);

        roles.add(role1);
        roles.add(role2);

        menus.add(menu1);
        menus.add(menu2);

        user1.setRoles(roles);
        user2.setRoles(roles);

        role1.setUsers(users);
        role2.setUsers(users);

        role1.setMenus(menus);
        role2.setMenus(menus);

        menu1.setRoles(roles);
        menu2.setRoles(roles);

        sysUserDAO.save(user1);
        sysUserDAO.save(user2);

        roleRepo.save(role1);
        roleRepo.save(role2);

        sysMenuDAO.save(menu1);
        sysMenuDAO.save(menu2);

    }

}
