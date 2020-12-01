package com.codility.app.lessons;

//An array A consisting of N integers is given.
// Rotation of the array means that each element is shifted right by one index,
// and the last element of the array is moved to the first place. For example,
// the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7]
// (elements are shifted right by one index and 6 is moved to the first place).
//
//The goal is to rotate array A K times; that is, each element of A will be shifted to the right K times.

public class CyclicRotation {
    public int[] solution(int[] A, int k) {
        if( k == 0 || A.length % k == 0){
            return A;
        }
        // write your code in Java SE 8
        int[] res = new int[A.length];
        int index = 0;
        if(k > A.length){
            k = A.length % k;
        }
//        index = A.length - k;
        for (int i = A.length - k ; i <= A.length - 1; i++){
            res[index] = A[i];
            index++;
        }
        for(int i = 0; i < A.length - k; i ++){
            res[index] = A[i];
            index++;
        }
        return res;
    }
}
