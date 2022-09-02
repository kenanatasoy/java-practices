package org.example.completableFuture;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void delay(int seconds){

        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }



    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        delay(3);

        System.out.println("Hello world!");

        long endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime);

    }



}
