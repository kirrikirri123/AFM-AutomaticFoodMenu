package com.ahlenius.afm.entitys;

import jakarta.persistence.*;

@Entity
public class Recipe {
    //Fullt recept eller url eller likn.
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long recipeId;
    @OneToOne
    @JoinColumn(name = "dish_id")
    private Dish dish;
    @Column(length = 200)
    private String info;

    public Recipe() {}

    public Recipe(Dish dish, String info) {
        this.dish = dish;
        this.info = info;
    }
}
