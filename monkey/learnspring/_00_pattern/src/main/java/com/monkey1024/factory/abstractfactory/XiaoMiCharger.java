package com.monkey1024.factory.abstractfactory;

/**
 * 小米手机充电器
 */
public class XiaoMiCharger implements Charger {

    @Override
    public void charge() {
        System.out.println("给小米手机充电");
    }
}
