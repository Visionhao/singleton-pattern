package com.vincent.edu.pattern.singleton.lazy;

public class LazyDoubleCheckSingleton {

    //加上 volatile 关键字可以防止指令重排序的问题
    private volatile static LazyDoubleCheckSingleton lazy = null ;

    private LazyDoubleCheckSingleton(){}

    //双重检查锁
    public static LazyDoubleCheckSingleton getInstance(){
        if(lazy == null){
            synchronized (LazySimpleSingleton.class){
                if(lazy == null){
                    lazy = new LazyDoubleCheckSingleton();
                    //CPU执行时候会转换成JVM执行
                    // 指令重排序的问题，volatile关键字
                    //1.分配内存给这个对象
                    //2.初始化对象
                    //3.将初始化好的对象和内存地址建立关联，赋值
                    //4.用户初次访问


                }
            }
        }
        return lazy;
    }
}
