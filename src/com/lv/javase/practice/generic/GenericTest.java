package com.lv.javase.practice.generic;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author: lvrongzhuan
 * @Description: 泛型基本测试
 * @Date: 2019/2/21 22:43
 * @Version: 1.0
 * modified by:
 */
public class GenericTest {
    /**
     * 测试泛型擦除
     */
    @Test
    public void test1() {
        List<String> stringList = new ArrayList<>();
        List<Boolean> booleanList = new ArrayList<>();
        System.out.println(booleanList.getClass() == stringList.getClass());
    }

    @Test
    public void test2() {
        List<String> stringList = new ArrayList<>();
//        this.testDemo(stringList); 这里会编译不通过 在泛型中Object已经算指明了类型  可以通过通配符来处理
        this.testDemo2(stringList);
    }

    @Test
    public void test3() {
        List<String>[] lists = new ArrayList[3];
        List<String> stringList = new ArrayList<>();
        stringList.add("1");
        lists[0] = stringList;
        stringList.add("2");
        lists[1] = stringList;
        stringList.add("3");
        lists[2] = stringList;
        System.out.println(lists);
        List<?>[] objects = new ArrayList[10];
    }

    private void testDemo(List<Object> objectList) {
        System.out.println("接受一个Object的list");
    }

    private void testDemo2(List<?> objectList) {
        System.out.println("接受一个统配符的list" + objectList);
    }

}
