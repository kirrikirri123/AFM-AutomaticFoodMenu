package com.ahlenius.afm.entitys;

import com.ahlenius.afm.entitys.ENUM.Carb;
import com.ahlenius.afm.entitys.ENUM.Protein;
import com.ahlenius.afm.entitys.ENUM.TypeOfDish;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "dish")
public class Dish {
    //En maträtt
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long dishId ;
    @Column(unique = true,nullable = false, length = 100)
    private String name;
    @Column(length = 11)
    private Protein protein;
    @Column(nullable = false, length =15)
    private Carb carb;
    @Column(nullable = false, length =10)
    private TypeOfDish type;
    @OneToOne
    @JoinColumn(name = "recipe_id")
    private Recipe recipe;
    @Column(name= "can_prepp")
    private boolean canPrepp;// if true = går preppa dagen innan.
    private boolean favourite; // om true en favorit
    @OneToMany(mappedBy = "dish")
    private List<DayMenu> dayMenuList = new ArrayList<>();

    public Dish() {}

    public Dish(String name, Recipe recipe, Protein protein, Carb carb, TypeOfDish type, boolean canPrepp) {
        this.name = name;
        this.recipe = recipe;
        this.protein = protein;
        this.carb = carb;
        this.type = type;
        this.canPrepp = canPrepp;
    }

}
