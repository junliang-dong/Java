package com.djl.builder;

import com.djl.bean.ChickenBurger;
import com.djl.bean.Coke;
import com.djl.bean.Pepsi;
import com.djl.bean.VegBurger;
import com.djl.combo.Meal;

/**
 * Created by linshi on 2018-5-18.
 */
public class MealBuilder {

    public Meal PrepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }
    public Meal PrepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
