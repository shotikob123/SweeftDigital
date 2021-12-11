package com.company;


import java.util.Arrays;
import java.util.Random;

public class Main {
    static Random random = new Random();

    public static void main(String[] args) {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        // run multiple tests
        for (int i = 0; i < 5; i++) {
            String randomWord = getRandomWord(random.nextInt(1,20),randomString);
            System.out.println("Check Palindrome: input - " + randomWord + " Result: " + palindromeChecker.isPalindrome(randomWord));
        }

        CoinCounter coinCounter = new CoinCounter();
        // run multiple tests
        for (int i = 0; i < 5; i++) {
            int randomAmount = random.nextInt(1, 1000);
            System.out.println("Count Coins: input - " + randomAmount + " Result: " + coinCounter.minSplit(randomAmount));
        }

        LowestInteger lowestInteger = new LowestInteger();
        // run multiple tests
        for (int i = 0; i < 5; i++) {
            int[] randomArray = getRandomArray(random.nextInt(1,10));
            System.out.println("Lowest Integer: input - " + Arrays.toString(randomArray) + " Result: " + lowestInteger.notContains(randomArray));
        }

        ProperString properString = new ProperString();
        // run multiple tests
        for (int i = 0; i < 5; i++) {
            String randomString = getRandomWord(random.nextInt(1,10),"()");
            System.out.println("Proper String: input - " + randomString + " Result: " + properString.isProperly(randomString));
        }

        ClimbVariants climbVariants = new ClimbVariants();
        // run multiple tests
        for (int i = 0; i < 5; i++) {
            int randomStairs = random.nextInt(1, 10);
            System.out.println("Climb Variants: input - " + randomStairs + " Result: " + climbVariants.countVariants(randomStairs));
        }

        DataStructure<String,String> dataStructure = new DataStructure<>();

    }

    static String randomString = "ქწერტყუიოპასდფგჰჯკლზხცვბნმ0123456789";

    static String getRandomWord(int size, String randomSymbols) {
        String word = "";
        for (int i = 0; i < size; i++) {
            word += randomSymbols.charAt(random.nextInt(0, randomSymbols.length()));
        }
        return word;
    }
    static int[] getRandomArray(int size){
        int[] randomArray = new int[size];
        for (int i = 0; i < size; i++) {
            randomArray[i] = random.nextInt(1,15);
        }
        return randomArray;
    }
}
