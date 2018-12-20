package cn.lishiwei.learn.lesson_9_design.lesson_9_7_observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: LiShiwei.
 * @Date:Created in 2018-10-16.
 * @Description: 被观察者
 * @Modified By:
 */
public class Subject {

    private List<Observer> observerList = new ArrayList<>();

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyObserver();
    }


    public void addObserver(Observer observer) {
        observerList.add(observer);
    }


    public void notifyObserver() {

        for (Observer observer : observerList) {
            observer.update();
        }
    }


}
