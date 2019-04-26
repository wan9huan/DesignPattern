package leon.designpattern.buildtype.builderPattern.menu;

import leon.designpattern.buildtype.builderPattern.menu.item.Burger;


public class ChickenBurger extends Burger {

        @Override
        public float price() {
            return 50.5f;
        }

        @Override
        public String name() {
            return "Chicken Burger";
        }
}

