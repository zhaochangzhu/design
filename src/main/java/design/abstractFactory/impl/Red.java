package design.abstractFactory.impl;

import design.abstractFactory.inter.Color;

/**
 * @program: design
 * @description: xx
 * @author: MrZhao
 * @time: 2021/10/28 17:00
 */
public class Red implements Color {
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
