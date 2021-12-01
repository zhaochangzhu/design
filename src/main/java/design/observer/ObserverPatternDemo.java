package design.observer;

import design.observer.extend.BinaryObserver;
import design.observer.extend.HexaObserver;
import design.observer.extend.OctalObserver;
import design.observer.source.Subject;

/**
 * @program: design
 * @description:  观察者模式
 * @author: MrZhao
 * @time: 2021/10/29 15:19
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
