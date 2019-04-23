package leon.designpattern.builderPattern.menu.item;

import leon.designpattern.builderPattern.menu.item.packing.Packing;
import leon.designpattern.builderPattern.menu.item.packing.Wrapper;

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}