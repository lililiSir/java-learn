package cn.lishiwei.learn.lesson_9_design.lesson_9_2_factory;

/**
 * @Author: LiShiwei.
 * @Date:Created in 2018-09-10.
 * @Description:
 * @Modified By:
 */
public class main {

    public static void main(String[] args) {

        MouseFactory dellMouseFactory = new DellMouseFactory();
        IMouse dell = dellMouseFactory.createMouse();
        dell.createMouse();


        MouseFactory hpMouseFactory = new HpMouseFactory();
        IMouse hp = hpMouseFactory.createMouse();
        hp.createMouse();

    }

}
