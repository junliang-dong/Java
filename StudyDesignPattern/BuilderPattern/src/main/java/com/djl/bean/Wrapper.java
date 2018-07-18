package com.djl.bean;

import com.djl.interfaces.Packing;

/**
 * Created by linshi on 2018-5-18.
 */
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
