package design.builder.abstracts;

import design.builder.impl.Bottle;
import design.builder.inter.Item;
import design.builder.inter.Packing;

/**
 * @program: design
 * @description: xx
 * @author: MrZhao
 * @time: 2021/11/2 16:30
 */
public abstract class ColdDrink implements Item {
    public Packing packing() {
        return new Bottle();
    }

    public abstract float price();
}
