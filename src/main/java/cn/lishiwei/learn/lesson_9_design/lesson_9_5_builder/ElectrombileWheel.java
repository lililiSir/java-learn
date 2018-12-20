package cn.lishiwei.learn.lesson_9_design.lesson_9_5_builder;

/**
 * @Author: LiShiwei.
 * @Date:Created in 2018-09-12.
 * @Description: 电动车轮子
 * @Modified By:
 */
public class ElectrombileWheel implements IWheel {

    @Override
    public float getRedius() {
        return 35.0f;
    }

    @Override
    public String getName() {
        return "电动车轮子";
    }
}
