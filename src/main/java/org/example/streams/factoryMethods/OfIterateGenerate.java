package org.example.streams.factoryMethods;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class OfIterateGenerate {
    public static void main(String[] args) {

        Stream<String> names = Stream.of("adam", "dan", "julie");
        names.forEach(System.out::println);

        Stream.iterate(1, i -> i*2)
                .limit(10)
                .forEach(System.out::println);

        Supplier<Integer> supplier = new Random()::nextInt;
        Stream.generate(supplier)
                .limit(5)
                .forEach(System.out::println);
    }
}
