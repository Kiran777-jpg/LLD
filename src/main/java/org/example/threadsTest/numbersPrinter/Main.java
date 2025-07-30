package org.example.threadsTest.numbersPrinter;

public class Main {
    public static void main(String[] args) {

        for(int i=1;i<=100;i++) {
            NumbersPrinter np = new NumbersPrinter(i);
            Thread t=new Thread(np);
            t.start();
        }
    }
}
