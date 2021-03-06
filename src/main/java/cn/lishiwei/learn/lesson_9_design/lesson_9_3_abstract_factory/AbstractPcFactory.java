package cn.lishiwei.learn.lesson_9_design.lesson_9_3_abstract_factory;

/**
 * @Author: LiShiwei.
 * @Date:Created in 2018-09-10.
 * @Description:
 * @Modified By:
 */
public abstract class AbstractPcFactory {

    public abstract IMouse createMouse();

    public abstract IKeyBoard createKeyBoard();
}
