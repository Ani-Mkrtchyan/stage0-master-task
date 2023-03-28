package com.epam.conditions;

public class BitwiseValuesSwap {

    public void swap(int first, int second) {
        if (first > 0 && second > 0) {
            first += second;
            second = first - second;
            first = first - second;
            System.out.println(first);
            System.out.println(second);
        } else {
            System.out.println(0);
        }
    }

    public static void main(String[] args) {
        BitwiseValuesSwap bitwiseValuesSwap = new BitwiseValuesSwap();
        bitwiseValuesSwap.swap(5,3);
    }
}
