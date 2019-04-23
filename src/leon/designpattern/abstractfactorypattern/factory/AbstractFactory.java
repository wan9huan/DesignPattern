package leon.designpattern.abstractfactorypattern.factory;


import leon.designpattern.abstractfactorypattern.color.Color;
import leon.designpattern.abstractfactorypattern.shape.Shape;

//抽象工厂
public abstract  class AbstractFactory {

    public abstract Color produceColor(String color);
    public abstract Shape produceShape(String shape) ;

}
