package com.monkey1024.factory.abstractfactory;

/**
 * 生产苹果手机的工厂
 */
public class IPhoneXFactory implements PhoneFactory {

    @Override
    public Telephone producePhone() {
        return new IPhoneX();
    }

    @Override
    public Charger produceCharger() {
        return new AppleCharger();
    }
}
