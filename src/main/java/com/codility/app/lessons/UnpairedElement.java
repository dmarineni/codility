package com.codility.app.lessons;

import java.util.ArrayList;
import java.util.List;

//A non-empty array A consisting of N integers is given.
// The array contains an odd number of elements, and each element of the array can be paired with another element
// that has the same value, except for one element that is left unpaired
public class UnpairedElement {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int res = 0;
        List<Integer> vals = new ArrayList<>();

        for(int i : A){
            if(vals.contains(i)){
                vals.remove(vals.indexOf(i));
            }else {
                vals.add(i);
            }
        }
        if(vals.size() == 1)
            res = vals.get(0);
        return res;
    }
}
