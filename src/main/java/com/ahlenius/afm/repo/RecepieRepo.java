package com.ahlenius.afm.repo;

import com.ahlenius.afm.entitys.Dish;
import com.ahlenius.afm.entitys.Recipe;

import java.util.Optional;

public interface RecepieRepo {

    void save(Recipe recipe);

    Optional<Recipe> findById(long id);

    void update(Recipe recipe);

    void delete(Recipe recipe);



}
