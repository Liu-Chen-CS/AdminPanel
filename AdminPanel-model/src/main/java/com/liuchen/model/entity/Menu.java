package com.liuchen.model.entity;

import com.liuchen.model.enums.MenuOptions;
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
 * @Create: 4/7/2024 - 1:47 PM
 * @Version: v1.0
 */

@Entity
@Table(name = "menu")
@Data
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mid;

    private String title;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "menu_role",
            joinColumns = {@JoinColumn(name = "mid", referencedColumnName = "mid")},
            inverseJoinColumns = {@JoinColumn(name = "roleId", referencedColumnName = "rid")}
    )
    @EqualsAndHashCode.Exclude
    private Set<Role> roles;
}
