package design.builder.extend;

import design.builder.abstracts.Burger;

/**
 * @program: design
 * @description: xx
 * @author: MrZhao
 * @time: 2021/11/2 16:31
 */
public class VegBurger extends Burger {
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
