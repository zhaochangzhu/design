package design.builder.abstracts;

import design.builder.impl.Wrapper;
import design.builder.inter.Item;
import design.builder.inter.Packing;

/**
 * @program: design
 * @description: xx
 * @author: MrZhao
 * @time: 2021/11/2 16:28
 */
public abstract class Burger implements Item {
    public Packing packing() {
        return new Wrapper();
    }

    public abstract float price();
}
