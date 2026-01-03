package org.example.threadsTest.mergeSortMultiThreading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> arrayList = Arrays.asList(7,5,1,4,2,6,3);
        ExecutorService es = Executors.newCachedThreadPool();
        Future<List<Integer>> futureSortedList = es.submit(new Sorter(arrayList, es));
        List<Integer> sortedList = futureSortedList.get();
        es.close();
        System.out.println(sortedList);
    }
}
