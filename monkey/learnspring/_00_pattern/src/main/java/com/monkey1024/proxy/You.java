package com.monkey1024.proxy;

public class You {

    private Beauty beauty;

    public You(Beauty beauty) {
        this.beauty = beauty;
    }

    /**
     * 交朋友
     */
    public void makeFriend(){
        beauty.eat();
    }


    /**
     * 送礼物
     */
    public void show(){
        beauty.gift(10);
    }
}
