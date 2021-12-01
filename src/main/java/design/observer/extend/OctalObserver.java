package design.observer.extend;

import design.observer.source.Observer;
import design.observer.source.Subject;

/**
 * @program: design
 * @description: xx
 * @author: MrZhao
 * @time: 2021/10/29 15:17
 */
public class OctalObserver extends Observer {
    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: "
                + Integer.toOctalString( subject.getState() ) );
    }
}
