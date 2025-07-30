package org.example.threadsTest;

public class Main {

    private static void doSomething() {
        int c=3;
        int d=4;
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        int a=1;
        int b=2;
        System.out.println(Thread.currentThread().getName());
        doSomething();
    }
}
