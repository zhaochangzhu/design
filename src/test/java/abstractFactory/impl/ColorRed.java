package abstractFactory.impl;

import abstractFactory.inter.Color;

/**
 * @program: design
 * @description: xx
 * @author: MrZhao
 * @time: 2021/11/2 9:31
 */
public class ColorRed implements Color {
    public void fill() {
        System.out.println("red");
    }
}
