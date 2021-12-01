package abstractFactory.factory;

import abstractFactory.impl.ColorGreen;
import abstractFactory.impl.ColorRed;
import abstractFactory.inter.Color;
import abstractFactory.inter.Shape;

/**
 * @program: design
 * @description: xx
 * @author: MrZhao
 * @time: 2021/11/2 9:38
 */
public class ColorFactory extends Factory {
    @Override
    public Color getColor(String color) {
        if(color.equalsIgnoreCase("red")){
            return new ColorRed();
        }else if(color.equalsIgnoreCase("green")){
            return new ColorGreen();
        }
        return null;
    }
    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
