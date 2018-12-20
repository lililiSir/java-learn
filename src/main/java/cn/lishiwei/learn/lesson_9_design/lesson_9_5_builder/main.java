package cn.lishiwei.learn.lesson_9_design.lesson_9_5_builder;

/**
 * @Author: LiShiwei.
 * @Date:Created in 2018-09-12.
 * @Description:
 * @Modified By:
 */
public class main {

    public static void main(String[] args) {

        Modal modal = new ModalBuilder().createPower(3).createWheel(2).getModal();

        System.out.println(modal.toString());


    }

}
