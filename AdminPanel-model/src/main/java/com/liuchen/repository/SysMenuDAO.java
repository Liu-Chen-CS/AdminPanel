package com.liuchen.repository;

import com.liuchen.model.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Package: com.liuchen.repository
 * Description:
 *
 * @Author: Liu-Chen-CS
 * @Create: 4/7/2024 - 3:46 PM
 * @Version: v1.0
 */
@Repository
public interface SysMenuDAO extends JpaRepository<Menu, Long> {

}
