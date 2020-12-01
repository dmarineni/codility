package com.codility.app.lessons;

import java.util.Arrays;

public class PermMissingElement {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int res = 0;
        for (int i : A){
            if(i == ++res){

            }else{
                return res;
            }
        }
        return A.length+1;
    }
}
