package com.monkey1024.proxy;


/**
 * 你的目标对象小曼
 * 你女性朋友娜娜的闺蜜
 */
public class XiaoMan implements Beauty {

    @Override
    public void eat() {
        System.out.println("小曼吃饭");
    }


    /**
     * 接收礼物
     * @param count
     */
    @Override
    public void gift(int count) {
        System.out.println("小曼收到" + count + "礼物");
    }
}
