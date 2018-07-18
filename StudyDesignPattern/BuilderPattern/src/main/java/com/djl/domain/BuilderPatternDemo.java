package com.djl.domain;

import com.djl.builder.MealBuilder;
import com.djl.combo.Meal;

/**
 * Created by linshi on 2018-5-18.
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder builder = new MealBuilder();

        Meal vegMeal = builder.PrepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total cost: " + vegMeal.getCost());
        Meal nonVegMeal = builder.PrepareNonVegMeal();
        System.out.println("Non Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total cost: " + nonVegMeal.getCost());
    }
}
