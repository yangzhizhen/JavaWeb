package com.monkey1024.factory.abstractfactory;

/**
 * 生产小米8手机的工厂
 */
public class XiaoMi8Factory implements PhoneFactory {

    @Override
    public Telephone producePhone() {
        return new XiaoMi8();
    }

    @Override
    public Charger produceCharger() {
        return new XiaoMiCharger();
    }
}
