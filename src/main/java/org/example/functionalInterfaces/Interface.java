package org.example.functionalInterfaces;

@FunctionalInterface
interface Interface<A extends B>{
    void run(A a);
}
