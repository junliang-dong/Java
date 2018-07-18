package com.djl.bean;

import com.djl.interfaces.Item;
import com.djl.interfaces.Packing;

/**
 * Created by linshi on 2018-5-18.
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
