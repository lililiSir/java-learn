package cn.lishiwei.learn.lesson_9_design.lesson_9_6_proxy;

import jdk.nashorn.internal.ir.annotations.Ignore;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Author: LiShiwei.
 * @Date:Created in 2018-09-14.
 * @Description:
 * @Modified By:
 */
public class main {


    public static void main(String[] args) {

        GamePlayer player = new GamePlayer("张三");
        // //普通代理
        // GamePlayProxy proxy = new GamePlayProxy(player);
        // proxy.login();

        // //强制代理
        // IGame iGame = player.getAgent();
        // iGame.login();


        //动态代理
        InvocationHandler handler = new GamePlayDynamicProxy(player);

        ClassLoader classLoader = player.getClass().getClassLoader();

        IGameParent iGameProxy = (IGame) Proxy.newProxyInstance(classLoader, new Class[]{IGame.class, IGameProduct.class}, handler);
        // IGameProduct product = (IGameProduct) Proxy.newProxyInstance(classLoader, new Class[]{IGameProduct.class}, handler);
        iGameProxy.login();
        iGameProxy.killBoss();
        iGameProxy.upgrade();
        iGameProxy.sell();
        // product.sell();

    }

}
