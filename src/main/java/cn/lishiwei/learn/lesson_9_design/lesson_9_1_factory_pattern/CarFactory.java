package cn.lishiwei.learn.lesson_9_design.lesson_9_1_factory_pattern;

/**
 * @Author: LiShiwei.
 * @Date:Created in 2018-09-10.
 * @Description:
 * @Modified By:
 */
public class CarFactory {


    public IFactory iFactory;


    public CarFactory(Integer type) {

        if (type == 1) {
            iFactory = new BmwCar();
        }
        if (type == 2) {
            iFactory = new JeepCar();
        }
        if (type == 3) {
            iFactory = new TricycleCar();
        }
    }


    public String getCarName() {
        return iFactory.getCarName();
    }


}
