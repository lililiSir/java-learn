package cn.lishiwei.learn.lesson_9_design.lesson_9_5_builder;

/**
 * @Author: LiShiwei.
 * @Date:Created in 2018-09-12.
 * @Description:
 * @Modified By:
 */
public class ModalBuilder {

    public Modal modal = new Modal();

    public ModalBuilder createWheel(Integer type) {
        //建造自行车
        if (type == 1) {
            this.modal.iWheel = new BikeWheel();
        }
        //建造电动车
        if (type == 2) {
            this.modal.iWheel = new ElectrombileWheel();
        }
        //建造汽车
        if (type == 3) {
            this.modal.iWheel = new CarWheel();
        }

        return this;
    }

    public ModalBuilder createPower(Integer type) {
        //建造自行车
        if (type == 1) {
            this.modal.iPower = new BikePower();
        }
        //建造电动车
        if (type == 2) {
            this.modal.iPower = new ElectrombilePower();
        }
        //建造汽车
        if (type == 3) {
            this.modal.iPower = new CarPower();
        }

        return this;
    }


    public Modal getModal() {
        return this.modal;
    }


}
