package cn.lishiwei.learn.lesson_9_design.lesson_9_5_builder;

/**
 * @Author: LiShiwei.
 * @Date:Created in 2018-09-12.
 * @Description:
 * @Modified By:
 */
public class Modal {
    public IWheel iWheel;
    public IPower iPower;

    public IWheel getiWheel() {
        return iWheel;
    }

    public void setiWheel(IWheel iWheel) {
        this.iWheel = iWheel;
    }

    public IPower getiPower() {
        return iPower;
    }

    public void setiPower(IPower iPower) {
        this.iPower = iPower;
    }

    @Override
    public String toString() {
        return iPower.getPower() + ":" + iWheel.getName() + ":" + iWheel.getRedius();
    }
}
