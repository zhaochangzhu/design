package design.abstractFactory.factoryProduct;

import design.abstractFactory.factory.AbstractFactory;
import design.abstractFactory.factory.ColorFactory;
import design.abstractFactory.factory.ShapeFactory;

/**
 * @program: design
 * @description: xx
 * @author: MrZhao
 * @time: 2021/10/28 17:11
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
