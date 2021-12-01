package design.abstractFactory.impl;

import design.abstractFactory.inter.Shap;

/**
 * @program: design
 * @description: xx
 * @author: MrZhao
 * @time: 2021/10/28 16:59
 */
public class Square implements Shap {
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
