package org.example.javaReflection;

import java.util.Random;

public class A {

    private A(){
        System.out.println(this.getClass().getName());
    }

    private int intGenerator(){
        Random random = new Random();
        return random.nextInt();
    }

    private int intGenerator(int bound){
        Random random = new Random();
        return random.nextInt(bound);
    }

    private long a = 700L;

}
