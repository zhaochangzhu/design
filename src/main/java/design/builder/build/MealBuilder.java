package design.builder.build;

import design.builder.extend.ChickenBurger;
import design.builder.extend.Coke;
import design.builder.extend.Pepsi;
import design.builder.extend.VegBurger;

/**
 * @program: design
 * @description: xx
 * @author: MrZhao
 * @time: 2021/11/2 16:40
 */
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
