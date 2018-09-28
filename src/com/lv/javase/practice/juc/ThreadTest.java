package com.lv.javase.practice.juc;

import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

/**
 * @Author: lvrongzhuan
 * @Description:
 * @Date: 2018/9/28 10:57
 * @Version: 1.0
 * modified by:
 */
public class ThreadTest {
    @Test
    public void testThread(){
        new Thread(()->{
            System.out.println(Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(3);
                System.out.println(Thread.currentThread().getName()+"end");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }).start();

        System.out.println(Thread.currentThread().getName());
        new Thread(()->{
            System.out.println(Thread.currentThread().getName());
        }).start();
    }


}
