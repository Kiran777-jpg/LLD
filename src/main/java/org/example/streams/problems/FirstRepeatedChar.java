package org.example.streams.problems;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatedChar {
    private static void firstRepeat(String s) {
        Character ans = s.chars()
                .mapToObj(ch -> (char)ch)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue()>1)
                .map(entry -> entry.getKey())
                .findFirst()
                .orElse(null);
        System.out.println(ans);
    }

    private static void firstRepeat1(String s) {
        Character ans = s.chars()
                .mapToObj(ch -> (char)ch)
                .filter(ch -> s.indexOf(ch)!=s.lastIndexOf(ch))
                .findFirst()
                .orElse(null);
        System.out.println(ans);
    }

    private static void usingHashset(String s) {
        Set<Character> set=new HashSet<>();
        Character ans = s.chars()
                .mapToObj(ch -> (char)ch)
                .filter(ch -> !set.add(ch))
                .findFirst()
                .orElse(null);
        System.out.println(ans);
    }

    public static void main(String[] args) {
        String s = "Java articles are awesome";
        firstRepeat(s);
        firstRepeat1(s);
        s="abba";
        usingHashset(s); // not working
    }
}
