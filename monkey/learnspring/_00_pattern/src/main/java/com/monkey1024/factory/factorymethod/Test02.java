package com.monkey1024.factory.factorymethod;

public class Test02 {
    public static void main(String[] args) {
        IPhoneXFactory iPhoneXFactory = new IPhoneXFactory();
        IPhone iPhoneX = iPhoneXFactory.produce();
        iPhoneX.play();

    }
}
