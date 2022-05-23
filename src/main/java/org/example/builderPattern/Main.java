package org.example.builderPattern;

public class Main {
    public static void main(String[] args) {

        ClassA a = new ClassA.Builder()
                .f(5.0)
                .b("Yağmur")
                .a("Kenan")
                .build();
}
}
