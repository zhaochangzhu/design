package abstractFactory.factory;

import abstractFactory.impl.ShapB;
import abstractFactory.impl.ShapeA;
import abstractFactory.inter.Color;
import abstractFactory.inter.Shape;

/**
 * @program: design
 * @description: xx
 * @author: MrZhao
 * @time: 2021/11/2 9:39
 */
public class ShapeFactory extends Factory {

    public Color getColor(String color) {
        return null;
    }

    public Shape getShape(String shape) {
        if(shape.equalsIgnoreCase("A")){
            return new ShapeA();
        }else if(shape.equalsIgnoreCase("B")){
            return new ShapB();
        }
        return null;
    }
}
