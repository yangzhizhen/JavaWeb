package com.monkey1024.factory.abstractfactory;

/**
 * 苹果手机的充电器
 */
public class AppleCharger implements Charger {
    @Override
    public void charge() {
        System.out.println("给苹果手机充电");
    }
}
