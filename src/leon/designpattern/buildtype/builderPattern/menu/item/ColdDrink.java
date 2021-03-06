package leon.designpattern.buildtype.builderPattern.menu.item;

import leon.designpattern.buildtype.builderPattern.menu.item.packing.Bottle;
import leon.designpattern.buildtype.builderPattern.menu.item.packing.Packing;

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
