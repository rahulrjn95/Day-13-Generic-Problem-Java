package com.bridgelabz;

public class MaxValueCheckUC5 <T extends Comparable<T>> {
    public T x, y, z;

    public MaxValueCheckUC5(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    private T maximum() {
        return MaxValueCheckUC5.maximum(x, y, z);
    }

    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        printMax(x, y, z, max);
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
        printMax(x, y, z, max);
        return max;
    }

    public static <T> void printMax(T x, T y, T z, T max) {
        System.out.printf("Maximum value between %s, %s and %s is %s\n", x, y, z, max);
    }

    public static void main(String[] args) {
        Integer xInt = 8, yInt = 6, zInt = 5;
        Float xFloat = 5.9f, yFloat = 9.8f, zFloat = 9.3f;
        String xStr = "kiwi", yStr = "apple", zStr = "watermelon";
        new MaxValueCheckUC5(xInt, yInt, zInt).maximum();
        new MaxValueCheckUC5(xFloat, yFloat, zFloat).maximum();
        new MaxValueCheckUC5(xStr, yStr, zStr).maximum();
    }
}
