package cn.lishiwei.learn.lesson_9_design.lesson_9_3_abstract_factory;

/**
 * @Author: LiShiwei.
 * @Date:Created in 2018-09-10.
 * @Description:
 * @Modified By:
 */
public class DellFactory extends AbstractPcFactory {

    @Override
    public IMouse createMouse() {
        return new DellMouse();
    }

    @Override
    public IKeyBoard createKeyBoard() {
        return new DellKeyBoard();
    }
}
