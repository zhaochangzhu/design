package design.protoType.extend;

import design.protoType.impl.Shape;

/**
 * @program: design
 * @description: xx
 * @author: MrZhao
 * @time: 2021/11/2 17:21
 */
public class Circle extends Shape {
    public Circle(){
        type = "Circle";
    }
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
