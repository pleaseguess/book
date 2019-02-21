package com.standalone.designpattern.proxy.jdkproxy;

/**
 * TODO
 * 2019/1/16 11:12
 */
public class HelloWorldTest {
    public static void main(String[] args) {
        JdkProxyExample jdk = new JdkProxyExample();
        HelloWorld proxy = (HelloWorld) jdk.bind(new HelloWorldImpl());
        proxy.sayHello();
    }
}
