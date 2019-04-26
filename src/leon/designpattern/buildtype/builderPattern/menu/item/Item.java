package leon.designpattern.buildtype.builderPattern.menu.item;

import leon.designpattern.buildtype.builderPattern.menu.item.packing.Packing;

public interface Item {

     String name();
     Packing packing();
     float price();

}
