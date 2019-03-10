package com.vincent.edu.pattern.singleton.test;

import com.vincent.edu.pattern.singleton.lazy.LazyDoubleCheckSingleton;
import com.vincent.edu.pattern.singleton.lazy.LazySimpleSingleton;
import com.vincent.edu.pattern.singleton.threadlocal.ThreadLocalSingleton;

/**
 * 不用线程池，就用2个线程来演示全过程
 */
public class ExectorThread implements Runnable{

    @Override
    public void run() {
        //LazySimpleSingleton singleton = LazySimpleSingleton.getInstance();

        //LazyDoubleCheckSingleton singleton = LazyDoubleCheckSingleton.getInstance();

        ThreadLocalSingleton singleton = ThreadLocalSingleton.getInstance();

        System.out.println(Thread.currentThread().getName() + ":" + singleton);
    }
}
