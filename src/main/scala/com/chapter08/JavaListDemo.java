package com.chapter08;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author ： fjl
 * @date ： 2019/6/25/025 16:08
 */
public class JavaListDemo {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        List<Integer> list1 = new ArrayList<>();
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(9);
        System.out.println(list1);


        List<String> list2 = new ArrayList<>();
        list2.add("Alice");
        list2.add("jack");
        list2.add("Mike");
        list2.add("mary");
        List<String> collect = list2.stream().filter(new FilterPredicate()).collect(Collectors.toList());
        System.out.println("collect list");
        System.out.println(collect);

    }
}
