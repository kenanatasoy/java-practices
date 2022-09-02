package org.example.trickyExamples;

class MyTest {

    static {
        initialize();
    }

    private static int sum;

    public static int getSum() {
        initialize();
        return sum;
    }

    private static boolean initialized = false;

    private static void initialize() {
        if (!initialized) {
            for (int i = 0; i < 100; i++)
                sum += i;
            initialized = true;
        }
    }


    public static void main(String[] args) {

        System.out.println(MyTest.getSum());

    }
}
