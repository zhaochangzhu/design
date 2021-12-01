package design.observer.extend;

import design.observer.source.Observer;
import design.observer.source.Subject;

/**
 * @program: design
 * @description: xx
 * @author: MrZhao
 * @time: 2021/10/29 15:18
 */
public class HexaObserver extends Observer {
    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println( "Hex String: "
                + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}
