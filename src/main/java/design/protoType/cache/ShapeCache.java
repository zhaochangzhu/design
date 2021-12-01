package design.protoType.cache;

import design.protoType.extend.Circle;
import design.protoType.extend.Rectangle;
import design.protoType.extend.Square;
import design.protoType.impl.Shape;

import java.util.Hashtable;

/**
 * @program: design
 * @description: xx
 * @author: MrZhao
 * @time: 2021/11/2 17:22
 */
public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    // 对每种形状都运行数据库查询，并创建该形状
    // shapeMap.put(shapeKey, shape);
    // 例如，我们要添加三种形状
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
    }
}
