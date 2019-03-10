package com.vincent.edu.pattern.singleton.hungry;

/**
 * 饿汉式单例
 */
public class HungryStaticSingleton {

    private static final HungryStaticSingleton hungrySingleton;

    static {
        hungrySingleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton(){}

    public static HungryStaticSingleton getInstance(){
        return hungrySingleton;
    }

}
