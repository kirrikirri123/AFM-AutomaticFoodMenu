package com.ahlenius.afm.entitys;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
@Entity
public class PriorWeeks {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long priorWeekId;
    @OneToMany
    private List<FoodMenu> priorWeeks = new ArrayList<>(); // tidigare veckomatsedlar
}
