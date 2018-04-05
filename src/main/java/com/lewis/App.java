package com.lewis;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        ArrayList<Integer> integers = Lists.newArrayList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);

        List<Integer> integers1 = integers.subList(0, 5);
        integers.add(12);
        System.out.println(integers1);
    }
}
