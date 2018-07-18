package com.djl.factory.bean;

import com.djl.factory.interfaces.Shape;

/**
 * Created by linshi on 2018-5-18.
 */
public class Circle implements Shape {
    public void draw() {
        System.out.println("draw a circle...");
    }
}
