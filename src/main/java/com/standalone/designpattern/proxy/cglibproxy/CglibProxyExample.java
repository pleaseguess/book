package com.standalone.designpattern.proxy.cglibproxy;


import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * TODO
 * 2019/1/16 12:11
 */
public class CglibProxyExample implements MethodInterceptor {

    public static void main(String[] args) {
        CglibProxyExample cglibProxyExample = new CglibProxyExample();
        CglibServiceImpl c = (CglibServiceImpl) cglibProxyExample.getProxy(CglibServiceImpl.class);
        c.SayHello();
    }


    /**
     * 生成CGLIB代理对象
     * @param parentClass   真实对象
     * @return              CGLIB生成的代理对象
     */
    public Object getProxy(Class parentClass){
        //CGLIB Enhancer 增强类对象
        Enhancer enhancer = new Enhancer();
        //设置增强的类型
        enhancer.setSuperclass(parentClass);
        //定义代理逻辑对象为当前对象,要求当前对象实现MethodInterceptor接口
        enhancer.setCallback(this);
        return enhancer.create();
    }

    /**
     * 代理逻辑方法
     * @param o         代理对象
     * @param method    真实对象方法
     * @param objects   方法参数
     * @param methodProxy   方法代理
     * @return              代理逻辑返回
     * @throws Throwable
     */
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("---CGLIB---");
        System.out.println("进入代理逻辑方法");
        System.out.println("调度真实对象之前的服务");
        Object resule = methodProxy.invokeSuper(o,objects);
        System.out.println("调用真实对象之后的服务");
        return resule;
    }
}
