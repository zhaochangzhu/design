package design.proxy.impl;

import design.proxy.inter.Image;

/**
 * @program: design
 * @description: xx
 * @author: MrZhao
 * @time: 2021/10/29 15:50
 */
public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
