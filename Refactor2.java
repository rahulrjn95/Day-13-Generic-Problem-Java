package com.bridgelabz;

public class Refactor2 <T extends Comparable<T>> {
    public T x, y, z;

    public Refactor2(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    private T maximum() {
        return Refactor2.maximum(x, y, z);
    }

    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }

    public static String testMaximum(String x, String y, String z) {
        String max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }

    public static void main(String[] args) {
        Integer xInt = 8, yInt = 6, zInt = 5;
        Float xFloat = 5.9f, yFloat = 9.8f, zFloat = 9.3f;
        String xStr = "kiwi", yStr = "apple", zStr = "watermelon";
        System.out.println("Maximum Integer Number is: " + new Refactor2(xInt, yInt, zInt).maximum());
        System.out.println("Maximum Float Number is: " + new Refactor2(xFloat, yFloat, zFloat).maximum());
        System.out.println("Maximum Srting is: " + new Refactor2(xStr, yStr, zStr).maximum());
    }

}
