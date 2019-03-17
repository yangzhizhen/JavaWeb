package com.monkey1024.proxy;

public class Test01 {

    public static void main(String[] args) {
        XiaoMan xiaoMan = new XiaoMan();
        NaNa naNa = new NaNa(xiaoMan);
        You you = new You(naNa);

        you.makeFriend();
    }
}
