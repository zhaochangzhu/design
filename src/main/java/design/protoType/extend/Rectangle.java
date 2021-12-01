package design.protoType.extend;

import design.abstractFactory.inter.Shap;
import design.protoType.impl.Shape;

/**
 * @program: design
 * @description: xx
 * @author: MrZhao
 * @time: 2021/11/2 17:17
 */
public  class Rectangle extends Shape {
    public Rectangle(){
        type = "Rectangle";
    }
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
