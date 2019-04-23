package leon.designpattern.builderPattern.menu;

import leon.designpattern.builderPattern.menu.item.Burger;


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

