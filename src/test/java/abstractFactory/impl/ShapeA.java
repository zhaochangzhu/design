package abstractFactory.impl;

import abstractFactory.inter.Shape;

/**
 * @program: design
 * @description: xx
 * @author: MrZhao
 * @time: 2021/11/2 9:34
 */
public class ShapeA implements Shape {
    public void draw() {
        System.out.println("A");
    }
}
