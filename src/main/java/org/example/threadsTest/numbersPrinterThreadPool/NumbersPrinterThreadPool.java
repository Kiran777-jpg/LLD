package org.example.threadsTest.numbersPrinterThreadPool;

public class NumbersPrinterThreadPool implements Runnable{

    private int num;
    public NumbersPrinterThreadPool(int num) {
        this.num=num;
    }
    @Override
    public void run() {
        System.out.println(num + " " + Thread.currentThread().getName());
    }
}
