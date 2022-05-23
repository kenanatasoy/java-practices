package org.example.immutableClass;

import java.util.List;

public final class ImmutableClass {

    private final String name;
    private final String birthYear;
    private final List<String> marks;

    public ImmutableClass(String name, String birthYear, List<String> marks) {
        this.name = name;
        this.birthYear = birthYear;
        this.marks = marks;//TODO deep copy
    }

    public String getName() {
        return name;
    }


    public String getBirthYear() {
        return birthYear;
    }


    public List<String> getMarks() {

        //TODO deep copy
        return marks;
    }

    @Override
    public String toString() {
        return "ImmutableClass{" +
                "name='" + name + '\'' +
                ", birthYear='" + birthYear + '\'' +
                ", marks=" + marks +
                '}';
    }
}
