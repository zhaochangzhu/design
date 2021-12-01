package design.builder.extend;

import design.builder.abstracts.ColdDrink;

/**
 * @program: design
 * @description: xx
 * @author: MrZhao
 * @time: 2021/11/2 16:36
 */
public class Pepsi extends ColdDrink {
    public String name() {
        return "Pepsi";
    }
    @Override
    public float price() {
        return 35.0f;
    }
}
