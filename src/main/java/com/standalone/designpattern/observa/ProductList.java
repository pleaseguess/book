package com.standalone.designpattern.observa;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * TODO 观察者模式实例
 *      被观察者
 * 2019/1/21 11:30
 */
public class ProductList extends Observable {

    private List<String> productList = null;    //产品列表

    private static ProductList instance;        //类唯一实例

    private ProductList(){}

    /**
     * 取得唯一实例
     * @return
     */
    public static ProductList getInstance(){
        if(instance == null){
            instance = new ProductList();
            instance.productList = new ArrayList<String>();
        }
        return instance;
    }

    /**
     * 增加观察者
     * @param observer
     */
    public void addProductListObserver(Observer observer){
        this.addObserver(observer);
    }

    /**
     * 新增产品
     * @param newProduct
     */
    public void addProduct(String newProduct){
        productList.add(newProduct);
        System.out.println("产品列表新增了产品:" + newProduct);
        this.setChanged();                  //设置被观察者对象发生变化
        this.notifyObservers(newProduct);   //通知观察者,传递新产品
    }
}
