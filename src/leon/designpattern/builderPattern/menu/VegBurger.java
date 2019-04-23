package leon.designpattern.builderPattern.menu;

import leon.designpattern.builderPattern.menu.item.Burger;

public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}