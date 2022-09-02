package org.example.javaReflection;

import java.lang.reflect.*;
import java.util.Arrays;
import java.util.Optional;

import static java.lang.System.*;

public class Main {

    public static void main( String[] args ) throws Exception {

        Class<?> class1 = Class.forName("org.example.Student");
        Constructor<?> constructor = class1.getDeclaredConstructor();
        constructor.setAccessible(true);
        A a = (A) constructor.newInstance();
        Method method1 = class1.getDeclaredMethod("intGenerator", Integer.TYPE);
        method1.setAccessible(true);
        out.println(method1.invoke(a, 50));
        Optional<Method> method = Arrays.stream(class1.getDeclaredMethods()).findFirst();
        method.get().setAccessible(true);
        Field field = class1.getDeclaredField("a");
        field.setAccessible(true);

        out.println(method.get().invoke(a));
        out.println(field.get(a));

    }
}
