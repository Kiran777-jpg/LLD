package org.example.threadsTest.mergeSortMultiThreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {

    private List<Integer> arrayList;
    ExecutorService es;

    public Sorter(List<Integer> arrayList, ExecutorService es) {
        this.arrayList = arrayList;
        this.es = es;
    }

    @Override
    public List<Integer> call() throws Exception {
        int size = arrayList.size();
        if(size==1) return arrayList;

        int mid = size/2;
        List<Integer> leftArrayList = new ArrayList<>();
        List<Integer> rightArrayList = new ArrayList<>();

        for(int i=0;i<mid;i++)
            leftArrayList.add(arrayList.get(i));
        for(int i=mid;i<size;i++)
            rightArrayList.add(arrayList.get(i));

//        ExecutorService es = Executors.newCachedThreadPool();
        Future<List<Integer>> futureSortedLeftArray = es.submit(new Sorter(leftArrayList, es));
        Future<List<Integer>> futureSortedRightArray = es.submit(new Sorter(rightArrayList, es));

        List<Integer> sortedLeftArray = futureSortedLeftArray.get();
        List<Integer> sortedRightArray = futureSortedRightArray.get();
//        es.close();

        int i=0;
        int j=0;
        int k=0;

        while(i < sortedLeftArray.size() && j < sortedRightArray.size()) {
            if(sortedLeftArray.get(i) <= sortedRightArray.get(j)) {
                arrayList.set(k, sortedLeftArray.get(i));
                i++;
                k++;
            }
            else {
                arrayList.set(k, sortedRightArray.get(j));
                j++;
                k++;
            }
        }

        while(i < sortedLeftArray.size()) {
            arrayList.set(k, sortedLeftArray.get(i));
            i++;
            k++;
        }

        while(j < sortedRightArray.size()) {
            arrayList.set(k, sortedRightArray.get(j));
            j++;
            k++;
        }

        return arrayList;
    }
}
