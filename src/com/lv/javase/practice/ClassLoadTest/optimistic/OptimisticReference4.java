package com.lv.javase.practice.ClassLoadTest.optimistic;

/**
 * 类加载主动引用之反射
 */
public class OptimisticReference4 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName(OptimisticReference3.Child.class.getName());
    }
}