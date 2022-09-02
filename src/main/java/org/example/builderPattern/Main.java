package org.example.builderPattern;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {

        ClassA a = new ClassA.Builder()
                .f(5.0)
                .b("Yağmur")
                .a("Kenan")
                .build();

//        ClassB b1 = new ClassB.ClassBBuilder()
//                .id(5)
//                .firstName("Jack")
//                .lastName("Ma")
//                .phoneNumber("546 454 45 45")
//                .build();

        ClassB b2 = ClassB.builder()
                .id(5)
                .firstName("Jack")
                .lastName("Ma")
                .phoneNumber("546 454 45 45")
                .build();


//        out.println(b1.toString());
//        out.println(Integer.toHexString(b1.hashCode()));

        out.println(b2.toString());
        out.println(Integer.toHexString(b2.hashCode()));


    }

}
