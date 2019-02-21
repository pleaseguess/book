package com.standalone.designpattern.observa;

import java.util.Observable;
import java.util.Observer;

/**
 * TODO 观察者模式实例
 *      观察者
 * 2019/1/21 12:36
 */
public class JingdongObserver implements Observer {

    public static void main(String[] args) {
        ProductList obervable = ProductList.getInstance();
        JingdongObserver jingdongObserver = new JingdongObserver();
        obervable.addObserver(jingdongObserver);
        obervable.addProduct("HUAWEI mate20");
    }

    @Override
    public void update(Observable o, Object arg) {
        String newProduct = (String)arg;
        System.out.println("发送新产品【" + newProduct + "】同步到京东商城");
    }
}
