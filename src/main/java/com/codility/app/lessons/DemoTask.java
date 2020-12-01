package com.codility.app.lessons;

//that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
//        For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5
//Given A = [1, 2, 3], the function should return 4.
//        Given A = [−1, −3], the function should return 1.

import java.util.Arrays;

public class DemoTask {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int small = 1;
        Arrays.sort(A);
        for(int i : A){
            if(i == small){
                small ++;
            }
        }
        return small;
    }
}
