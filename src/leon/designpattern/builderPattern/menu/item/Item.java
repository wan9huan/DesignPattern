package leon.designpattern.builderPattern.menu.item;

import leon.designpattern.builderPattern.menu.item.packing.Packing;

public interface Item {

     String name();
     Packing packing();
     float price();

}
