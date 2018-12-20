package cn.lishiwei.learn.lesson_9_design.lesson_9_7_2_observer;

import java.util.Observable;

/**
 * @Author: LiShiwei.
 * @Date:Created in 2018-10-16.
 * @Description:
 * @Modified By:
 */
public class Subject extends Observable {

    private Integer state;

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
        super.setChanged();
        super.notifyObservers(this.state);
    }

}
