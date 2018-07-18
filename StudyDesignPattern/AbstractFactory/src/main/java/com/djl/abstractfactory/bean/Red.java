package com.djl.abstractfactory.bean;

import com.djl.abstractfactory.interfaces.Color;

/**
 * Created by linshi on 2018-5-18.
 */
public class Red implements Color {
    public void fill() {
        System.out.println("fill red...");
    }
}
