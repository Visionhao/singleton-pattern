package com.vincent.edu.pattern.singleton.test;

import com.vincent.edu.pattern.singleton.register.EnumSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class EnumSingletonTest {

    /*public static void main(String[] args) {
        EnumSingleton s1 = null;
        EnumSingleton s2 = EnumSingleton.getInstance();
        s2.setData(new Object());

        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream("EnumSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("EnumSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (EnumSingleton) ois.readObject();
            ois.close();

            System.out.println(s1.getData());
            System.out.println(s2.getData());
            System.out.println(s1.getData() == s2.getData());

        }catch (Exception e ){
            e.printStackTrace();
        }
    }*/

    public static void main(String[] args) {
        try{
            Class clazz = EnumSingleton.class;
            Constructor c = clazz.getDeclaredConstructor(String.class,int.class);
            //Constructor c = clazz.getDeclaredConstructor(String.class,int.class);
            c.setAccessible(true);
            //c.newInstance();
            EnumSingleton obj = (EnumSingleton) c.newInstance("vincent",6666);
            System.out.println(obj);

            //从JDK层面就为枚举不被序列化和反射破坏来保驾护航
        }catch (Exception e){
            e.printStackTrace();
        }

    }


}
