package cn.lishiwei.learn.lesson_9_design.lesson_9_3_abstract_factory;

/**
 * @Author: LiShiwei.
 * @Date:Created in 2018-09-10.
 * @Description:
 * @Modified By:
 */
public class FactoryProducer {

    public static AbstractPcFactory createFactory(Integer type) {

        if (type == 1) {
            return new DellFactory();
        }

        if (type == 2) {
            return new HpFactory();
        }

        return null;
    }

}
