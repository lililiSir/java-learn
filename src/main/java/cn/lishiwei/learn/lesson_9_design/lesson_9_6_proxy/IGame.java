package cn.lishiwei.learn.lesson_9_design.lesson_9_6_proxy;

/**
 * @Author: LiShiwei.
 * @Date:Created in 2018-09-14.
 * @Description:
 * @Modified By:
 */
public interface IGame extends IGameParent{

    //打怪
    void killBoss();

    //升级
    void upgrade();

    //登录
    void login();
}
