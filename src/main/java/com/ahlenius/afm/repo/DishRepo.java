package com.ahlenius.afm.repo;

import com.ahlenius.afm.entitys.Dish;

import java.util.Optional;

public interface DishRepo {

    void save(Dish dish);

    Optional<Dish> findById(long id);

    void update(Dish dish);

    void delete(Dish dish);


}
