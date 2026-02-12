package com.ahlenius.afm.entitys;

import com.ahlenius.afm.entitys.ENUM.Weekdays;
import jakarta.persistence.*;

@Entity
@Table(name ="day_menu")
public class DayMenu {
    //kopplar maträtt mot dag och sedan dag mot meny Ägande i realtionerna, håller foreignKey.
    // Listorna i dem andra klasserna populeras med hjälp av denna realtionen och FK!

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name = "day_menu_id")
    private long dayMenuId;

    @ManyToOne
    @JoinColumn(name = "food_menu_id")
    FoodMenu foodMenu;

    @ManyToOne
    @JoinColumn (name = "dish_id")
    private Dish dish;

    @Column (nullable = false,length = 8)
    private Weekdays weekday;
}
