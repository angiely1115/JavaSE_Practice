package com.lv.javase.practice.collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: lvrongzhuan
 * @Description:
 * HashMap是数组加链表的数据结构存储，Node内部类是链表结构，维护了K和value以及Next下一个节点。
 * HashMap中维护了一个Node<K,V>[] table;Node节点的数组
 *hash算法的作用：为了给数据落在数组哪个下标节点上做前期准备工作，java8才用Hashcode的值高16位与低16位做异或运算
 * 为什么扩容一定要是2的n次幂，因为这样做会减少hash冲突，使得hash值分布均匀，提高效率。
 *
 *
 * @Date: 2018/7/26 0:46
 * @Version: 1.0
 * modified by:
 */
public class MapTest {
    @Test
    public void mapTest(){
        //如果自定义对象作为key 一定要重新equals和hashcode方法
        //定义容量 (预存储大小/0.75)+1
        Map<String,String> stringMap = new HashMap<>();
        stringMap.put("1","吕荣砖");
        stringMap.put("2","赵雅芝");
        stringMap.put("3","彭雪梅");
        stringMap.put(null,"SB");
        stringMap.forEach((x,y)-> System.out.println("key:"+x+" value:"+y));
        System.out.println(hash("0"));

    }
     int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }
}
