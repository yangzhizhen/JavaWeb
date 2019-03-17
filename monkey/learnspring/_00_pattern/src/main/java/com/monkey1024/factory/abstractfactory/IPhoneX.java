package com.monkey1024.factory.abstractfactory;

/**
 * IPhoneX手机
 */
public class IPhoneX implements Telephone {
    @Override
    public void play() {
        System.out.println("iPhoneX");
    }
}
