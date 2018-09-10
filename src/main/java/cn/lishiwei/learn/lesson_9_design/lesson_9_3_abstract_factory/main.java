package cn.lishiwei.learn.lesson_9_design.lesson_9_3_abstract_factory;

/**
 * @Author: LiShiwei.
 * @Date:Created in 2018-09-10.
 * @Description:
 * @Modified By:
 */
public class main {

    public static void main(String[] args) {

        AbstractPcFactory abstractPcFactory = FactoryProducer.createFactory(1);
        IMouse iMouse = abstractPcFactory.createMouse();
        iMouse.createMouse();
        IKeyBoard keyBoard = abstractPcFactory.createKeyBoard();
        keyBoard.createKeyBoard();
    }
}
