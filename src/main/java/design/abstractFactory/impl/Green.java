package design.abstractFactory.impl;

import design.abstractFactory.inter.Color;

/**
 * @program: design
 * @description: xx
 * @author: MrZhao
 * @time: 2021/10/28 17:01
 */
public class Green implements Color {
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
