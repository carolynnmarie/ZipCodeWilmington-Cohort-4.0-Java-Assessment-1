package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        int jumping = 0;

        if (k < j) {
            jumping = k;
        }
        if (k == j) {
            jumping = 1;
        }
        if ((k > j)){
            jumping = (k / j) + k%j;
        }

        return jumping;
    }
}
