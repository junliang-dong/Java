package com.djl.factory.domain;

import com.djl.factory.bean.Circle;
import com.djl.factory.bean.Rectangle;
import com.djl.factory.interfaces.Shape;

/**
 * Created by linshi on 2018-5-18.
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape shape = factory.getClass(Circle.class);
        Shape shape1 = factory.getClass(Rectangle.class);
        shape.draw();
        shape1.draw();
    }
}
