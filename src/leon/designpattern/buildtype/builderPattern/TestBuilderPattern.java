package leon.designpattern.buildtype.builderPattern;

import leon.designpattern.buildtype.builderPattern.meal.Meal;
import leon.designpattern.buildtype.builderPattern.meal.MealBuilder;
import org.junit.Test;

public class TestBuilderPattern {

    @Test
    public void testBuilderPattern(){

        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " +vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " +nonVegMeal.getCost());
    }
}
