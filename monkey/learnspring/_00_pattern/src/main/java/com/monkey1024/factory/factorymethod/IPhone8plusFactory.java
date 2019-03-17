package com.monkey1024.factory.factorymethod;

/**
 * 生产IPhone 8 plus的工厂
 */
public class IPhone8plusFactory implements IPhoneFactory {

    @Override
    public IPhone produce() {

        return new IPhone8Plus();
    }
}
