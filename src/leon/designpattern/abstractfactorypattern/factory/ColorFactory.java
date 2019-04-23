package leon.designpattern.abstractfactorypattern.factory;


import leon.designpattern.abstractfactorypattern.color.Blue;
import leon.designpattern.abstractfactorypattern.color.Color;
import leon.designpattern.abstractfactorypattern.color.Green;
import leon.designpattern.abstractfactorypattern.color.Red;
import leon.designpattern.abstractfactorypattern.shape.Shape;

public class ColorFactory extends AbstractFactory {

    /**
     *
     * @param color
     * @return Color(Red or Green or Blue or null)
     */
    @Override
    public Color produceColor(String color) {

        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        }
        else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        }
        else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape produceShape(String shape) {
        return null;
    }
}
