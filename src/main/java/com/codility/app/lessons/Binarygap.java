package com.codility.app.lessons;

import java.util.ArrayList;
import java.util.List;

//    Binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at
//    both ends in the binary representation of N.
//
//    For example, number 9 has binary representation 1001 and contains a binary gap of length 2.
//    The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3.
//    The number 20 has binary representation 10100 and contains one binary gap of length 1.
//    The number 15 has binary representation 1111 and has no binary gaps.
//    The number 32 has binary representation 100000 and has no binary gaps.
public class Binarygap {
    public int solution(int n){
        int result = 0;
        List<Integer> binayGaps = new ArrayList<Integer>();
        String binaryRepresentation = Integer.toBinaryString(n);
        int length = 0;
        for(char c : binaryRepresentation.toCharArray()){
            if(c == '1') {
                binayGaps.add(length);
                length = 0;
            }
            else if (c == '0') {
                length++;
            }
        }
        result = binayGaps.stream().reduce((x,y) -> (x>y) ? x : y).get();
        return result;
    }
}
