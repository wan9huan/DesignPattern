package leon.designpattern.buildtype.builderPattern.meal;

import leon.designpattern.buildtype.builderPattern.menu.ChickenBurger;
import leon.designpattern.buildtype.builderPattern.menu.Coke;
import leon.designpattern.buildtype.builderPattern.menu.Pepsi;
import leon.designpattern.buildtype.builderPattern.menu.VegBurger;

public class MealBuilder {

    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
