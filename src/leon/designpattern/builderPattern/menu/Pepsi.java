package leon.designpattern.builderPattern.menu;

import leon.designpattern.builderPattern.menu.item.ColdDrink;

public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}



