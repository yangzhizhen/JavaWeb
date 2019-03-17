package com.monkey1024.proxy;

/**
 * 中间人，你的女性朋友娜娜
 */
public class NaNa implements Beauty {

    private Beauty beauty;

    /**
     * 通过构造方法传入目标对象
     * @param beauty
     */
    public NaNa(Beauty beauty) {
        this.beauty = beauty;
    }

    @Override
    public void eat() {
        System.out.println("打扮的帅帅的");
        //调用目标对象上的吃饭方法
        beauty.eat();
        System.out.println("结果");
    }

    @Override
    public void gift(int count) {

    }
}
