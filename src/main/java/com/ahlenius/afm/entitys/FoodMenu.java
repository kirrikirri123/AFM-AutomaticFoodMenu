package com.ahlenius.afm.entitys;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name ="food_menu")
public class FoodMenu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "food_menu_id")
    private long menuId;
    @Column(name= "created_at", nullable = false)
    private LocalDate createdAt;
    @OneToMany(mappedBy = "foodMenu",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<DayMenu> Menu = new ArrayList<>();  // 5 rätter kopplat till rader.
}
