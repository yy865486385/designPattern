package com.demo;

import com.demo.factory.Icar;
import org.junit.Test;


/**
 * 工厂模式测试
 *
 * @author Yu_Yang
 * @date 2020-11-02
 */
public class FactoryPatternTest {

    @Test
    public void test(){
        CarFactory carFactory = new CarFactory();
        Icar policeCar = carFactory.getCar("police");
        policeCar.compose("轮子牌","门牌","窗牌");

        Icar crane = carFactory.getCar("crane");
        crane.compose("轮子牌","门牌","窗牌");

    }
}
