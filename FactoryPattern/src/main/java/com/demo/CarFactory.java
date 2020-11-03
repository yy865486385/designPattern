package com.demo;

import com.demo.factory.Icar;
import com.demo.factory.impl.Crane;
import com.demo.factory.impl.PoliceCar;

/**
 * description
 *
 * @author Yu_Yang
 * @date 2020-11-02
 */
public class CarFactory {

    public Icar getCar(String type){
        switch (type){
            case "crane":
                return new Crane();
            case "police":
                return new PoliceCar();
            default:
                return null;
        }
    }
}
