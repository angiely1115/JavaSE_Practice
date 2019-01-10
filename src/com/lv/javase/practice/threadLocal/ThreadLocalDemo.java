package com.lv.javase.practice.threadLocal;

import org.junit.jupiter.api.Test;

/**
 * @Author: lvrongzhuan
 * @Description: ThreadLocal分析
 * @Date: 2019/1/10 9:44
 * @Version: 1.0
 * modified by:
 */
public class ThreadLocalDemo {
//    public static ThreadLocal<String> threadLocal = new ThreadLocal<>();


    public static void main(String[] args) {
        ThreadLocal<String> threadLocal = new ThreadLocal<>();
        threadLocal.set("rr");
        threadLocal.get();
        Thread t = Thread.currentThread();
        System.gc();
        System.out.println(threadLocal);
    }
    @Test
    public void set(){


    }

}
