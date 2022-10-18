package com.bridgelabz;

public class MaxFloatUC2 {
    public static void main(String[] args) {
        System.out.println("Program to find Maximum among three float values");
        System.out.printf("Maximum of %.2f,%.2f and %.2f is %.2f\n\n", 87.8,17.7,90.5,getMaximum(87.8,17.7,90.5));
    }
    public static <T extends Comparable<T>> T getMaximum(T f1, T f2, T f3) {
        //Initializing the Variable
        T max1 = f1;
        if (f2.compareTo(f1) > 0)
            max1 = f2;

        if (f3.compareTo(max1) > 0)
            max1 = f3;

        return max1;
    }
}
