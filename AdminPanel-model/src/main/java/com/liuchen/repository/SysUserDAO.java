package com.liuchen.repository;

import com.liuchen.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Package: com.liuchen.repository
 * Description:
 *
 * @Author: Liu-Chen-CS
 * @Create: 4/7/2024 - 2:27 PM
 * @Version: v1.0
 */

@Repository
public interface SysUserDAO extends JpaRepository<User, Long> {

}
