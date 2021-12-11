package com.company;

public class ClimbVariants {
    public int countVariants(int stairsCount){
        int one = 1;
        int two = 1;
        int temp = 0;
        for (int i = 0; i <stairsCount-1 ; i++) {
            temp = one;
            one += two;
            two = temp;
        }
        return one;
    }
}
