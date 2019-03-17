package com.monkey1024.factory.abstractfactory;

public class Test03 {

    public static void main(String[] args) {
        IPhoneXFactory iPhoneXFactory = new IPhoneXFactory();
        Telephone iPhoneX = iPhoneXFactory.producePhone();
        Charger appleCharger = iPhoneXFactory.produceCharger();
        appleCharger.charge();
        iPhoneX.play();

    }
}
