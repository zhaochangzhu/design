package design.abstractFactory.impl;

import design.abstractFactory.inter.Shap;

/**
 * @program: design
 * @description: xx
 * @author: MrZhao
 * @time: 2021/10/28 16:52
 */
public class Rectangle implements Shap {
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
