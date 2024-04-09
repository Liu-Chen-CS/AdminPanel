package com.liuchen.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

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
@Table(name = "user")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uid;

    private String username;

    private String password;

    private String phone;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "user_role",
            joinColumns = {@JoinColumn(name = "uid", referencedColumnName = "uid")},
            inverseJoinColumns = {@JoinColumn(name = "roleId", referencedColumnName = "rid")}
    )
    @EqualsAndHashCode.Exclude
    private Set<Role> roles;
}
