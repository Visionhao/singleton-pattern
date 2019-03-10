package com.vincent.edu.pattern.singleton.threadlocal;

/**
 * 伪线程安全
 * 使用ThreadLocal来实现多数据源动态切换
 */
public class ThreadLocalSingleton {

    private ThreadLocalSingleton(){}

    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance =
            new ThreadLocal<ThreadLocalSingleton>(){
                @Override
                protected ThreadLocalSingleton initialValue(){
                    return new ThreadLocalSingleton();
                }
            };

    public static ThreadLocalSingleton getInstance(){
        return threadLocalInstance.get();
    }

}
