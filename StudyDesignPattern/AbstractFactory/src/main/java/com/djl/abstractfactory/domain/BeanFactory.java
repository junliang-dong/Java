package com.djl.abstractfactory.domain;

/**
 * Created by linshi on 2018-5-18.
 */
public class BeanFactory extends AbstractFactory {

    public <T> T getBean(Class<? extends T> clazz) {
        T obj = null;
        try {
            obj = (T)Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return obj;
    }
}
