package com.ahlenius.afm.entitys;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
@Entity
public class FoodMenu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long menuId;
    private


    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name= "join_dish_with_menu",
            joinColumns = {@JoinColumn(name = "food_menu_id")},
            inverseJoinColumns = {@JoinColumn(name = "dish_id")})
    List<Dish> Menu = new ArrayList<>();  // 5 rätter
}
