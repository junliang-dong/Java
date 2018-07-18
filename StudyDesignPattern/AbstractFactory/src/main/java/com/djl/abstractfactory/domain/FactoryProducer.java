package com.djl.abstractfactory.domain;

/**
 * Created by linshi on 2018-5-18.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(){
        return new BeanFactory();
    }
}
