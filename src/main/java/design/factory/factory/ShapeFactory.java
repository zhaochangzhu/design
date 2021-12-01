package design.factory.factory;

import design.factory.impl.Rectangle;
import design.factory.impl.Square;
import design.factory.inter.Shape;
import javafx.scene.shape.Circle;

/**
 * @program: design
 * @description: xx
 * @author: MrZhao
 * @time: 2021/10/29 10:36
 */
public class ShapeFactory {
    public Shape getShape(String shapeType){
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
