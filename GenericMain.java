package com.bridgelabz;

import static com.bridgelabz.GenericMaxInteger.*;

public class GenericMain <T extends Comparable<T>> {
    public static void main(String[] args) {
        System.out.println("Welcome to Test Case Program");

        Integer[] intArray = {10,15,25,50,42};
        Float[] floatArray = {45.5f, 65.2f, 23.1f, 34.7f, 98.6f};
        String[] strArray = {"Sayali", "Yash", "Manalai", "Sourabh", "Datta"};

        new GenericMaxInteger(intArray).getMaximum();
        new GenericMaxInteger(floatArray).getMaximum();
        new GenericMaxInteger(strArray).getMaximum();
    }
}
