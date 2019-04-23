package leon.designpattern.builderPattern.menu;

import leon.designpattern.builderPattern.menu.item.ColdDrink;

public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}