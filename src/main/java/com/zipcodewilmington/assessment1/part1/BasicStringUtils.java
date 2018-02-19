package com.zipcodewilmington.assessment1.part1;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String substringOne = str.substring(0,1).toUpperCase();
        String substringTwo = str.substring(1);
        String together = substringOne + substringTwo;
        return together;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        StringBuilder reverseString = new StringBuilder(str);
        String reversed = reverseString.reverse().toString();
        return reversed;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        StringBuilder reverseString = new StringBuilder(str);
        String reversed = reverseString.reverse().toString();
        String substringOne = reversed.substring(0,1).toUpperCase();
        String substringTwo = reversed.substring(1);
        String together = substringOne + substringTwo;
        return together;

    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str){
        StringBuilder takeOffChar = new StringBuilder(str);
        takeOffChar.deleteCharAt(0);
        takeOffChar.deleteCharAt(takeOffChar.length()-1);
        String takenOff = takeOffChar.toString();
        return takenOff;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        char[] inverted = str.toCharArray();
        for(int i = 0; i<inverted.length; i++) {
            if(isUpperCase(inverted[i])) {
                inverted[i] = Character.toLowerCase(inverted[i]);
            } else {
                inverted[i] = Character.toUpperCase(inverted[i]);

            }
        }
        String invert = String.copyValueOf(inverted);
        return invert;

    }
}
