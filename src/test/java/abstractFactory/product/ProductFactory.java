package abstractFactory.product;

import abstractFactory.factory.ColorFactory;
import abstractFactory.factory.Factory;
import abstractFactory.factory.ShapeFactory;

/**
 * @program: design
 * @description: xx
 * @author: MrZhao
 * @time: 2021/11/2 9:40
 */
public class ProductFactory {
    public static Factory getFactory(String name){
        if(name.equalsIgnoreCase("color")){
            return new ColorFactory();
        }else if(name.equalsIgnoreCase("shape")){
            return new ShapeFactory();
        }
        return null;
    }
}
