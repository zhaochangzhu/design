package design.abstractFactory.factory;

import design.abstractFactory.inter.Color;
import design.abstractFactory.inter.Shap;

/**
 * @program: design
 * @description: xx
 * @author: MrZhao
 * @time: 2021/10/28 17:03
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shap getShape(String shape) ;
}
