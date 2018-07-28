package com.lv.javase.practice.ClassLoadTest.optimistic;

/**
 * 类加载主动引用之main方法在初始类中
 */
public class OptimisticReference0 {
    static {
        System.out.println(OptimisticReference0.class.getName() + " is referred!");
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
