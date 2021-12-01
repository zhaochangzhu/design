package abstractFactory;

import abstractFactory.factory.Factory;
import abstractFactory.inter.Color;
import abstractFactory.product.ProductFactory;
import java.awt.*;

/**
 * @program: design
 * @description: xx
 * @author: MrZhao
 * @time: 2021/11/2 9:45
 */
public class FactoryTest {
    public static void main(String[] args) {
        Factory factory = ProductFactory.getFactory("color");
        Color colors = factory.getColor("red");
        colors.fill();
    }

}
