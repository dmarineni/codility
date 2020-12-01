package com.codility.app.challenges;

public class Challenge2 {

    public int[] solution(int N) {
        // write your code in Java SE 8
        int max = 1000;
        int min = 1;
        int range = (max - min) + 1;
        int[] A = new int[N];
        for(int i= 0; i< N; i++){
            A[i] = (int) (Math.random() * 1000) + 1;
        }
        for(int i : A){
            System.out.println(i);
        }
        return A;
    }

    public static void main(String[] args) {
        Challenge2 obj = new Challenge2();
        obj.solution(3);
    }
}
