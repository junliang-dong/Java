package com.djl.abstractfactory.domain;;

/**
 * Created by linshi on 2018-5-18.
 */
public abstract class AbstractFactory {
    public abstract <T> T getBean(Class<? extends T> clazz);
}
