package org.example.immutableClass;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ImmutableClass immutableClass = new ImmutableClass("Hatice", "1966", new ArrayList());

        immutableClass.getMarks().add("70");

        System.out.println(immutableClass);

    }

}
