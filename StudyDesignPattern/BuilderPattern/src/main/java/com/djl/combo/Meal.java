package com.djl.combo;

import com.djl.interfaces.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by linshi on 2018-5-18.
 */
public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item: items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.print("name: " + item.name());
            System.out.print(",packing: " + item.packing());
            System.out.println(",price: " + item.price());
        }
    }
}
