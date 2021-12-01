package design.observer.extend;

import design.observer.source.Observer;
import design.observer.source.Subject;

/**
 * @program: design
 * @description: xx
 * @author: MrZhao
 * @time: 2021/10/29 15:15
 */
public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: "
                + Integer.toBinaryString( subject.getState() ) );
    }
}
