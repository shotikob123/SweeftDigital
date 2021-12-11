package com.company;


public class LowestInteger {
    public int notContains(int[] array) {
        int integer = 1;
        for (int element : array) {
            if (element == integer) {
                integer++;
            }
        }
        return integer;
    }
}
