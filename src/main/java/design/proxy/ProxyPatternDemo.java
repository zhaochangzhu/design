package design.proxy;

import design.proxy.impl.ProxyImage;
import design.proxy.inter.Image;

/**
 * @program: design
 * @description: 代理模式
 * @author: MrZhao
 * @time: 2021/10/29 15:51
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        // 图像将从磁盘加载
        image.display();
        System.out.println("");
        // 图像不需要从磁盘加载
        image.display();
    }
}
