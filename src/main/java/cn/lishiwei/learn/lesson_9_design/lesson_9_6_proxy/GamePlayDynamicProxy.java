package cn.lishiwei.learn.lesson_9_design.lesson_9_6_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: LiShiwei.
 * @Date:Created in 2018-09-14.
 * @Description:
 * @Modified By:
 */
public class GamePlayDynamicProxy implements InvocationHandler {

    Object object = null;

    public GamePlayDynamicProxy(Object _obj) {
        this.object = _obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result = method.invoke(this.object, args);
        return result;
    }
}
