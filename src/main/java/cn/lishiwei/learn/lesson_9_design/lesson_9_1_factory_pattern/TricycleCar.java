package cn.lishiwei.learn.lesson_9_design.lesson_9_1_factory_pattern;

/**
 * @Author: LiShiwei.
 * @Date:Created in 2018-09-10.
 * @Description:
 * @Modified By:
 */
public class TricycleCar implements IFactory{

    @Override
    public String getCarName() {
        return "I am tricycle";
    }
}
