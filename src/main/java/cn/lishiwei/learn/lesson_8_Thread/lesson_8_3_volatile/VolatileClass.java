package cn.lishiwei.learn.lesson_8_Thread.lesson_8_3_volatile;

public class VolatileClass implements Runnable {


    private volatile boolean isOver = false;


    public boolean isOver() {
        return isOver;
    }

    public void setOver(boolean over) {
        isOver = over;
    }


    @Override
    public synchronized void run() {

        while (!isOver) {
        }

        System.out.println("我终于停止了");
    }
}
