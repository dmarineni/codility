package com.codility.app.lessons;

// small frog wants to get to the other side of the road.
// The frog is currently located at position X and wants to get to a position greater than or equal to Y.
// The small frog always jumps a fixed distance, D.

// small frog wants to get to the other side of the road.
// The frog is currently located at position X and wants to get to a position greater than or equal to Y.
// The small frog always jumps a fixed distance, D.

public class FrogJump {
    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        int distance = Y-X;
        double noOfHops = (double) distance/ (double) D;
        System.out.println(noOfHops);
        if(distance == 0 )
            return 1;
        return (int) Math.ceil(noOfHops);
    }
}
