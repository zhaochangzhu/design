package design.builder.extend;

import design.builder.abstracts.ColdDrink;

/**
 * @program: design
 * @description: xx
 * @author: MrZhao
 * @time: 2021/11/2 16:35
 */
public class Coke extends ColdDrink {
    public String name() {
        return "Coke";
    }
    @Override
    public float price() {
        return 30.0f;
    }
}
