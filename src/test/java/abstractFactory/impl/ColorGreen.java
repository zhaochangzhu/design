package abstractFactory.impl;

import abstractFactory.inter.Color;

/**
 * @program: design
 * @description: xx
 * @author: MrZhao
 * @time: 2021/11/2 9:33
 */
public class ColorGreen implements Color {
    public void fill() {
        System.out.println("green");
    }
}
