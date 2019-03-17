package com.monkey1024.factory.staticfactory;

public class IPhoneFactory {

    public static IPhone produce(String model){

        if ("iPhonex".equalsIgnoreCase(model)){

            //生产iPhone X
            return new IPhoneX();
        }else if ("iPhone8plus".equalsIgnoreCase(model)){
            //生产iPhone 8 plus
            return new IPhone8Plus();
        }else {
            //不生产任何产品
            return null;
        }
    }

}
