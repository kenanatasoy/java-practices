package org.example.diamondProblem;

public class C implements A, B {

    @Override
    public void fly() {
        B.super.fly();
        System.out.println("C is flying");
    }


}
