package com.bridgelabz;

public class MaxStringUC3 {
    public static void main(String[] args) {
        System.out.println("Program for finding maximum string");
        System.out.printf("Maximum string from %s, %s and %s is:  %s\n","Anjali","Seema","Pooja",MaxString("Anajli", "Seema", "Pooja"));


    }
    public static <T extends Comparable<T>> T MaxString(T u, T v, T w) {
        //Initializing the Variable
        T max2 = u;
        if (v.compareTo(u) > 0)
            max2 = v;

        if (w.compareTo(max2) > 0)
            max2 = w;
        System.out.println("Maximum string is: "+max2);
        return max2;
    }
}
