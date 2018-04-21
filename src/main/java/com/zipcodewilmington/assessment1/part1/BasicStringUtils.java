package com.zipcodewilmington.assessment1.part1;

import static java.lang.Character.*;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        return str.substring(0,1).toUpperCase() + str.substring(1);
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        StringBuilder builder = new StringBuilder(str);
         return builder.reverse().toString();

    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        StringBuilder build = new StringBuilder(str);
        build.reverse();
        return build.toString().substring(0,1).toUpperCase() + build.toString().substring(1);

    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str){
        return str.substring(1,str.length()-1);

    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        String reason = "";
        for(int i=0; i<str.length(); i++){
            Character x = str.charAt(i);
            if(isLowerCase(str.charAt(i))){
                x = toUpperCase(str.charAt(i));
            }
            if(isUpperCase(str.charAt(i))){
                x = toLowerCase(str.charAt(i));
            }
            reason += x.toString();
        }
        return reason;
    }
}
