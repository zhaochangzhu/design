package design.observer.source;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: design
 * @description: xx
 * @author: MrZhao
 * @time: 2021/10/29 15:07
 */
public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
