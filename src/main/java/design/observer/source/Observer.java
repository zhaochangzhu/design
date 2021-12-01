package design.observer.source;

/**
 * @program: design
 * @description: xx
 * @author: MrZhao
 * @time: 2021/10/29 15:09
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
