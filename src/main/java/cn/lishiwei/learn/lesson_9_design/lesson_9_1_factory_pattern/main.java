package cn.lishiwei.learn.lesson_9_design.lesson_9_1_factory_pattern;

/**
 * @Author: LiShiwei.
 * @Date:Created in 2018-09-10.
 * @Description: 简单工厂模式
 * @Modified By:
 */
public class main {


    public static void main(String[] args) {

        //创建汽车工厂，并初始化相应的产品
        CarFactory bmwCar = new CarFactory(1);
        System.out.println(bmwCar.getCarName());
        CarFactory jeepCar = new CarFactory(2);
        System.out.println(jeepCar.getCarName());
        CarFactory tricycleCar = new CarFactory(3);
        System.out.println(tricycleCar.getCarName());
    }

}
