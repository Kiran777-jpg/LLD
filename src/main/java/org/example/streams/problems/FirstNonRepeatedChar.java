package org.example.streams.problems;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedChar {

    private static void firstNonRepeat(String s) {
        Character ans = s.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue()==1)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();
        System.out.println(ans);
    }

    private static void firstNonRepeat1(String s) {
        Character ans = s.chars()
                .mapToObj(ch -> (char)ch)
                .filter(ch -> s.indexOf(ch)==s.lastIndexOf(ch))
                .findFirst()
                .orElse(null);
        System.out.println(ans);
    }

    public static void main(String[] args) {
        String s = "Java articles are awesome";
        firstNonRepeat(s);
        firstNonRepeat1(s);
    }
}
