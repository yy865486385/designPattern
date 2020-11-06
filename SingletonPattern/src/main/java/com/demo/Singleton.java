package com.demo;

/**
 * description
 *
 * @author Yu_Yang
 * @date 2020-11-05
 */
public class Singleton {

    private static Singleton singleton;

    public static Singleton getInstance(){
        if (singleton==null){
            return  new Singleton();
        }
        return singleton;
    }

    private Singleton(){

    }
    
    public void print(){
        System.out.println("单例");
    }
}
