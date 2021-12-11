package com.company;

public class CoinCounter {
    int[] coins = {50,20,10,5,1};
    public int minSplit(int amount){
        int count = 0;
        for (int coin : coins){
            count+=amount/coin;
            amount=Math.floorMod(amount,coin);
            if(amount==0){
                return count;
            }
        }

        return count;
    }
}
