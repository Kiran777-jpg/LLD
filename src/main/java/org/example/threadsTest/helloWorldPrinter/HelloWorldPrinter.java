package org.example.threadsTest.helloWorldPrinter;

public class HelloWorldPrinter implements Runnable{

    private static void doSomething() {
        System.out.println("Hello world from doSomething() " + Thread.currentThread().getName());
    }
    @Override
    public void run() {
        System.out.println("Hello world from run() " + Thread.currentThread().getName());
        doSomething();
    }
}
