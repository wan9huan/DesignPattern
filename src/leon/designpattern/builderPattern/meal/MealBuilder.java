package leon.designpattern.builderPattern.meal;

import leon.designpattern.builderPattern.menu.ChickenBurger;
import leon.designpattern.builderPattern.menu.Coke;
import leon.designpattern.builderPattern.menu.Pepsi;
import leon.designpattern.builderPattern.menu.VegBurger;

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
