package me.grubhart.packt.java7.concurrency.chapter1;


public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 10 ; i++) {
            Calculator calculator = new Calculator(i);
            Thread thread = new Thread(calculator);
            thread.start();
        }
    }
}
