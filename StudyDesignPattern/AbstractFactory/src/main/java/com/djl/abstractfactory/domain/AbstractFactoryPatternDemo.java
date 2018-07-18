package com.djl.abstractfactory.domain;

import com.djl.abstractfactory.bean.Circle;
import com.djl.abstractfactory.bean.Green;
import com.djl.abstractfactory.bean.Rectangle;
import com.djl.abstractfactory.bean.Red;

/**
 * Created by linshi on 2018-5-18.
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory();
        AbstractFactory colorFactory = FactoryProducer.getFactory();
        shapeFactory.getBean(Circle.class).draw();
        shapeFactory.getBean(Rectangle.class).draw();
        colorFactory.getBean(Green.class).fill();
        colorFactory.getBean(Red.class).fill();
    }
}
