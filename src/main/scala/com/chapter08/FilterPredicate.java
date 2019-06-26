package com.chapter08;

import java.util.function.Predicate;
import java.util.regex.Pattern;

/**
 * @author ： fjl
 * @date ： 2019/6/26/026 10:04
 */
public class FilterPredicate implements Predicate<String> {
    private static Pattern pattern = Pattern.compile("[a-z]");

    @Override
    public boolean test(String s) {
        return pattern.matcher(String.valueOf(s.charAt(0))).matches();
    }

    public static void main(String[] args) {
        System.out.println(pattern.matcher(String.valueOf("Alice".charAt(0))).matches());
    }
}
