package com.monkey1024.factory.staticfactory;

public class Test01 {

    public static void main(String[] args) {
        //生产iPhone X手机
        IPhone iphonex = IPhoneFactory.produce("iphonex");
        iphonex.play();
    }
}
