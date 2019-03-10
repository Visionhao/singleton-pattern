package com.vincent.edu.pattern.singleton.lazy;

/**
 * 内部类实现单例
 *
 * 全程没有用到synchronized关键字
 *
 * 性能最优的一种写法
 */
public class LazyInnerClassSingleton {

    //虽然构造方法私有了，但是，逃不过反射的问题
    private LazyInnerClassSingleton(){
        //为了防止反射攻击，破坏单例
        if(LazyHolder.lazy != null){
            throw new RuntimeException("不允许构建多个实例");
        }
    }

    //懒汉式单例
    //LazyHolder里面的逻辑需要等到外部方法调用时才执行
    //巧妙利用了内部类的特性
    //JVM底层执行逻辑，完美地避免了线程安全问题
    public static final LazyInnerClassSingleton getInstance(){
        return LazyHolder.lazy;
    }

    //饿汉式
    private static class LazyHolder{
        private static final LazyInnerClassSingleton lazy = new LazyInnerClassSingleton();
    }


}
