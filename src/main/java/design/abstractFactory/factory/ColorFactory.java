package design.abstractFactory.factory;

import design.abstractFactory.impl.Green;
import design.abstractFactory.impl.Red;
import design.abstractFactory.inter.Color;
import design.abstractFactory.inter.Shap;

/**
 * @program: design
 * @description: xx
 * @author: MrZhao
 * @time: 2021/10/28 17:08
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        }
        return null;
    }

    @Override
    public Shap getShape(String shape) {
        return null;
    }
}
