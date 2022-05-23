package org.example.functionalInterfaces;

import java.util.function.Supplier;


public class Main {

    public static void main(String[] args) {

        C c = new C();
        c.setName("Kenan");

        C c1 = new C();
        c1.setName("sdfsdfds");

        Supplier<Double> supplier = () -> Math.ceil(5.2);

        //System.out.println(function1.apply(c));
        System.out.println(supplier.get());


    }
}
