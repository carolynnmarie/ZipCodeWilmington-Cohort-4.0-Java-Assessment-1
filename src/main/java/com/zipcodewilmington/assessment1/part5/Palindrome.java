package com.zipcodewilmington.assessment1.part5;

import java.util.ArrayList;

public class Palindrome {

    public Integer countPalindromes(String input) {

        Integer x = 0;
        for(int i = 0; i<input.length(); i++){
            for(int j = i; j<input.length(); j++){
                StringBuilder list = new StringBuilder(input.substring(i,j+1));
                    if(list.toString().equals(list.reverse().toString())) {
                        x++;
                    }
            }
        }
        return x;
    }
}
