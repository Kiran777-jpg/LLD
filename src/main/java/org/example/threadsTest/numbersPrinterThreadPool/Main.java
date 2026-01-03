package org.example.threadsTest.numbersPrinterThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

//        ExecutorService e = Executors.newCachedThreadPool();
        
        try (ExecutorService e = Executors.newFixedThreadPool(10)) {
            for (int i = 1; i <= 100; i++) {
                if (i == 80) {
                    System.out.println("STOP");
                }
                NumbersPrinterThreadPool np = new NumbersPrinterThreadPool(i);
                e.execute(np);
    //            Thread t=new Thread(np);
    //            t.start();
            }
        }
    }
}
