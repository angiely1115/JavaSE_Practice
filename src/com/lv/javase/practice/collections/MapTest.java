package com.lv.javase.practice.collections;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: lvrongzhuan
 * @Description:
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
    }
}
