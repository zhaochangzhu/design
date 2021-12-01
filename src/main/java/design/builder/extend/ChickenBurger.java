package design.builder.extend;

import design.builder.abstracts.Burger;

/**
 * @program: design
 * @description: xx
 * @author: MrZhao
 * @time: 2021/11/2 16:34
 */
public class ChickenBurger extends Burger {
    public String name() {
        return "Chicken Burger";
    }
    @Override
    public float price() {
        return 50.5f;
    }
}
