package com.monkey1024.factory.factorymethod;

/**
 * 生产iPhone X的工厂
 */
public class IPhoneXFactory implements IPhoneFactory {

    @Override
    public IPhone produce() {

        return new IPhoneX();
    }
}
