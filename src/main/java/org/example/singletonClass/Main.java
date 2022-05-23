package org.example.singletonClass;

public class Main {

    public static void main(String[] args) {

        SingletonClass reference1 = SingletonClass.getInstance();

        SingletonClass reference2 = SingletonClass.getInstance();

        System.out.println(reference1 + "\n" + reference2);

        System.out.println(reference1.hashCode() + "\n" + reference2.hashCode());

    }
}
