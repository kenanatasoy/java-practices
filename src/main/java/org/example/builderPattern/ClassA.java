package org.example.builderPattern;

public class ClassA {

    private String a;
    private String b;
    private int c;
    private double f;

    private ClassA(String a, String b, int c, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.f = f;
    }

    public String getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public double getF() {
        return f;
    }

    public ClassA(Builder builder) {
        this(builder.a, builder.b, builder.c, builder.f);
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.f = builder.f;
    }

    public static class Builder {
        private String a;
        private String b;
        private int c;
        private double f;

        public Builder a(String a) {
            this.a = a;
            return this;
        }

        public Builder b(String b) {
            this.b = b;
            return this;
        }

        public Builder c(int c) {
            this.c = c;
            return this;
        }

        public Builder f(double f) {
            this.f = f;
            return this;
        }

        public ClassA build() {
            return new ClassA(this);
        }

    }



}
