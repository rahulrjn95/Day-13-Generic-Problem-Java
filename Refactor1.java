package com.bridgelabz;

public class Refactor1 <T extends Comparable<T>> {

    public T x, y, z;

    public Refactor1(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
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

    private <T extends Comparable<T>> T maximum() {

        if (x.compareTo(y) > 0 && x.compareTo(z) > 0) {
            return (T) x;
        } else if (y.compareTo(x) > 0 && y.compareTo(z) > 0) {
            return (T) y;
        } else {
            return (T) z;
        }
    }

    public static void main(String[] args) {
        Integer xInt = 8, yInt = 6, zInt = 5;
        Float xFloat = 5.9f, yFloat = 9.8f, zFloat = 9.3f;
        String xStr = "kiwi", yStr = "apple", zStr = "watermelon";
        System.out.println("Maximum Interger Number is: " + new Refactor1(xInt, yInt, zInt).maximum());
        System.out.println("Maximum Float Number is: " + new Refactor1(xFloat, yFloat, zFloat).maximum());
        System.out.println("Maximum Srting is: " + new Refactor1(xStr, yStr, zStr).maximum());
    }
}
