package design.abstractFactory.factory;

import design.abstractFactory.impl.Rectangle;
import design.abstractFactory.impl.Square;
import design.abstractFactory.inter.Color;
import design.abstractFactory.inter.Shap;
import javafx.scene.shape.Circle;

/**
 * @program: design
 * @description: xx
 * @author: MrZhao
 * @time: 2021/10/28 17:05
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shap getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
