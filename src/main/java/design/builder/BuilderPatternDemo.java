package design.builder;

import design.builder.build.Meal;
import design.builder.build.MealBuilder;

/**
 * @program: design
 * @description: 建造者模式
 * @author: MrZhao
 * @time: 2021/11/2 16:40
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
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
