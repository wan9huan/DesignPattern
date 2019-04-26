package leon.designpattern.buildtype.abstractfactorypattern.factory;


import leon.designpattern.buildtype.abstractfactorypattern.color.Color;
import leon.designpattern.buildtype.abstractfactorypattern.shape.Shape;

//抽象工厂
public abstract  class AbstractFactory {

    public abstract Color produceColor(String color);
    public abstract Shape produceShape(String shape) ;

}
