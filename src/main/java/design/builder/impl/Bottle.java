package design.builder.impl;

import design.builder.inter.Packing;

/**
 * @program: design
 * @description: xx
 * @author: MrZhao
 * @time: 2021/11/2 16:25
 */
public class Bottle implements Packing {
    public String pack() {
        return "Bottle";
    }
}
