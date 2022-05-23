package org.example.functionalInterfaces;

public class C extends B {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "C{" +
                "name='" + name + '\'' +
                '}';
    }
}
