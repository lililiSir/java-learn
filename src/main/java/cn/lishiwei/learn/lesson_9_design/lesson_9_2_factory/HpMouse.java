package cn.lishiwei.learn.lesson_9_design.lesson_9_2_factory;

/**
 * @Author: LiShiwei.
 * @Date:Created in 2018-09-10.
 * @Description:
 * @Modified By:
 */
public class HpMouse implements IMouse{

    @Override
    public void createMouse() {
        System.out.println("生产一个HP的鼠标");
    }
}
