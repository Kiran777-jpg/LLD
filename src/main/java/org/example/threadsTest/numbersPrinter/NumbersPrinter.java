package org.example.threadsTest.numbersPrinter;

public class NumbersPrinter implements Runnable{

    private int num;
    public NumbersPrinter(int num) {
        this.num=num;
    }
    @Override
    public void run() {
        System.out.println(num + " " + Thread.currentThread().getName());
    }
}
