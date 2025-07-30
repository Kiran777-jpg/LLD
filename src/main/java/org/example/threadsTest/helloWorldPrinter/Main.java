package org.example.threadsTest.helloWorldPrinter;

public class Main {
    public static void main(String[] args) {

        HelloWorldPrinter hwp = new HelloWorldPrinter();
        Thread t1 = new Thread(hwp);
        t1.start();
        System.out.println("Hello world from main() " + Thread.currentThread().getName());
    }
}
