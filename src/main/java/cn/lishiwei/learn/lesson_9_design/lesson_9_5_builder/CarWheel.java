package cn.lishiwei.learn.lesson_9_design.lesson_9_5_builder;

/**
 * @Author: LiShiwei.
 * @Date:Created in 2018-09-12.
 * @Description:
 * @Modified By:
 */
public class CarWheel implements IWheel{

    @Override
    public float getRedius() {
        return 75.0f;
    }

    @Override
    public String getName() {
        return "汽车轮子";
    }
}
