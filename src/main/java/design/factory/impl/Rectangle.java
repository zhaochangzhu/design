package design.factory.impl;

import design.factory.inter.Shape;

/**
 * @program: design
 * @description: xx
 * @author: MrZhao
 * @time: 2021/10/29 10:33
 */
public class Rectangle implements Shape {
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
