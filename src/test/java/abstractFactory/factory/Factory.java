package abstractFactory.factory;

import abstractFactory.inter.Color;
import abstractFactory.inter.Shape;

/**
 * @program: design
 * @description: xx
 * @author: MrZhao
 * @time: 2021/11/2 9:37
 */
public abstract class Factory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
