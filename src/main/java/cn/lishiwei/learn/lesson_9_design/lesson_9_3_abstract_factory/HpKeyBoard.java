package cn.lishiwei.learn.lesson_9_design.lesson_9_3_abstract_factory;

/**
 * @Author: LiShiwei.
 * @Date:Created in 2018-09-10.
 * @Description:
 * @Modified By:
 */
public class HpKeyBoard implements IKeyBoard{

    @Override
    public void createKeyBoard() {
        System.out.println("生产一个惠普的键盘");
    }
}
