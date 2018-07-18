package com.djl.factory.domain;

/**
 * Created by linshi on 2018-5-18.
 */
public class ShapeFactory {

    public static <T> T getClass(Class<? extends T> clazz) {
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
