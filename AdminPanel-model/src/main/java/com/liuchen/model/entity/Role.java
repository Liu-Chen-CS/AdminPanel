package com.liuchen.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.awt.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Package: com.liuchen.model.entity
 * Description:
 *
 * @Author: Liu-Chen-CS
 * @Create: 4/7/2024 - 1:46 PM
 * @Version: v1.0
 */

@Entity
@Table(name = "role")
@Data
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rid;

    @Column(name = "role_name")
    private String roleName;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "role_code")
    private String roleCode;

    @ManyToMany(mappedBy = "roles", cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude
    private Set<User> users;

    @ManyToMany(mappedBy = "roles", cascade = CascadeType.ALL)
    private Set<Menu> menus;
}
