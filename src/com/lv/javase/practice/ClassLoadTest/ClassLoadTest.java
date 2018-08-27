package com.lv.javase.practice.ClassLoadTest;

import com.lv.javase.practice.ClassLoadTest.myClassLoad.Parent2;
import org.junit.jupiter.api.Test;
import sun.misc.ClassLoaderUtil;

import java.util.Arrays;

/**
 * @Author lvrongzhuan
 * @desc: 类加载器
 * @createTime 2018/2/27 20:45
 * @Modified by:
 */
public class ClassLoadTest {
    @Test
    public void test1(){
       String[] sysStr =  System.getProperty("sun.boot.class.path").split(";");
        Arrays.stream(sysStr).forEach(s-> System.out.println(s));

        System.out.println("*****java.ext.dirs*****");
        System.out.println(System.getProperty("java.ext.dirs"));
        System.out.println("*****java.class.path******");
        String[] paths = System.getProperty("java.class.path").split(";");
        Arrays.stream(paths).forEach(p-> System.out.println(p));

        //********ClassLoad
        System.out.println("this.getClass().getClassLoader():"+this.getClass().getClassLoader());
        System.out.println("Thread.currentThread().getContextClassLoader():"+Thread.currentThread().getContextClassLoader());
        System.out.println("ClassLoadTest.class.getClassLoader():"+ClassLoadTest.class.getClassLoader());
        System.out.println("Parent2.class.getClassLoader():"+Parent2.class.getClassLoader());
        System.out.println(Parent2.class);
        try {
            //执行类的静态块 类的静态快只加载一次
            Class<?> parent2 = Class.forName("com.lv.javase.practice.ClassLoadTest.myClassLoad.Parent2");
            System.out.println("Parent2.class==parent2:"+(Parent2.class==parent2));
            System.out.println("class getClassLoader:"+parent2.getClassLoader());
            System.out.println(Class.forName("com.lv.javase.practice.ClassLoadTest.myClassLoad.Parent2"));
            Parent2 p = (Parent2) parent2.newInstance();
            //不执行类的静态块
            ClassLoader.getSystemClassLoader().loadClass("com.lv.javase.practice.ClassLoadTest.myClassLoad.Parent2").newInstance();
            new Parent2();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
