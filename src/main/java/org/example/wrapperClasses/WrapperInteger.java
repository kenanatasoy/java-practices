package org.example.wrapperClasses;

public class WrapperInteger {

    public static void main(String[] args) {

        Integer x = 6;
        Integer y = 6;

        // -128, +127

        System.out.println(x.hashCode());
        System.out.println(y.hashCode());

        System.out.println(x == y);

        Integer z = 400;
        Integer l = 400;

        System.out.println(z == l);

    }
}
