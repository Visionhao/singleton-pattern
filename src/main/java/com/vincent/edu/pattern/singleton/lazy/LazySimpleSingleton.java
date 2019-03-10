package com.vincent.edu.pattern.singleton.lazy;

public class LazySimpleSingleton {

    private static LazySimpleSingleton lazy = null ;

    private LazySimpleSingleton(){}

    /*public static LazySimpleSingleton getInstance(){
        if(lazy == null){
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }*/

    /**
     * JDK1.6 之后对synchronized 性能优化了很多
     * 不可避免地还是存在一定的性能问题
     * @return
     */
    public synchronized static LazySimpleSingleton getInstance(){
        if(lazy == null){
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }

}
