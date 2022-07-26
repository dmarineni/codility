package com.codility.app.lessons;

import java.util.Arrays;

public class OddOccurrencesInArray {
    private static int solution(int[] x){
        Arrays.sort(x);
        boolean flag = true;
        for(int i=0; i< x.length; i++){
            if(i == x.length - 1){
                return x[i];
            }
            if(x[i] == x[i+1]){
                i++;
            }else{
                return x[i];
            }
        }
        return  0;
    }

    public static void main(String[] args) {
        int[] a = new int[7];
        a[0] = 2;
        a[1] = 3;
        a[2] = 3;
        a[3] = 5;
        a[4] = 6;
        a[5] = 2;
        a[6] = 6;
        System.out.println(solution(a));
        int[] b = new int[7];
        b[0] = 2;
        System.out.println(solution(b));
        int[] c = new int[7];
        System.out.println(solution(c));
    }
}
