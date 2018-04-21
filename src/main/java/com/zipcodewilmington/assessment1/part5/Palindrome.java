package com.zipcodewilmington.assessment1.part5;

import java.util.ArrayList;

public class Palindrome {

    public Integer countPalindromes(String input) {
        ArrayList<String> list = new ArrayList<>();
        Integer x = 0;
        for(int i = 0; i<input.length(); i++){
            for(int j = i; j<input.length(); j++){
                list.add(input.substring(i,j));
            }
        }
        for(String item: list){
            StringBuilder b = new StringBuilder(item);
            if(b.equals(b.reverse())){
                x++;
            }
        }
        return x;
    }
}
