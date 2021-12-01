package design.protoType.extend;

import design.protoType.impl.Shape;

/**
 * @program: design
 * @description: xx
 * @author: MrZhao
 * @time: 2021/11/2 17:20
 */
public  class Square extends Shape {
    public Square(){
        type = "Square";
    }

    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
