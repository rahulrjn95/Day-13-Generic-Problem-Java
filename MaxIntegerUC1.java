package com.bridgelabz;

public class MaxIntegerUC1 {
    public static void main(String[] args) {
        System.out.println("Program to find Maximum among three float values");

        //TC1.1 - given max integer to the first position
        System.out.printf("Maximum from %d, %d, and %d is:  %d\n",89,45,58,maximum(45,89,58));

        //TC1.2 - given max integer to the second position
        System.out.printf("Maximum from %d, %d, and %d is:  %d\n",45,89,58,maximum(45,89,58));

        //TC1.3 - given max integer to the third position
        System.out.printf("Maximum from %d, %d, and %d is:  %d\n",45,58,89,maximum(45,89,58));
    }
    public static <T extends Comparable<T>> T maximum(T n1, T n2, T n3) {

        //Initializing the Variable
        T max = n1;
        if (n2.compareTo(n1) > 0)
            max = n2;

        if (n3.compareTo(max) > 0)
            max = n3;

        return max;
    }
}
