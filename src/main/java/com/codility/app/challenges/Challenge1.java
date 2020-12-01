package com.codility.app.challenges;

public class Challenge1 {

    public int[] solution(int[] A, int F, int M) {
        // write your code in Java SE 8
        int sum = 0;
        for(int i : A ){
          sum = sum + i;
        }
        int rolls = A.length + F;

        int x = (M * rolls) - sum;

        if(F > x || x/F > 6){
            return new int[]{0};
        }

        int length = F;
        int[] result = new int[length];
        for(int i =0; i < length ; i++){
            result[i] = x/F--;
            x = x-result[i];
        }
        return result;
    }
}
