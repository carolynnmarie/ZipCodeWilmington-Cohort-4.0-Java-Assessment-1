package com.zipcodewilmington.assessment1.part2;

/**
 * Created by leon on 2/16/18.
 */
public class StringUtils {

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return an array of strings, representative of each word in the sentence
     * given a string containing words delimited by spaces, representative of a sentence, return an array of strings, each element representative of a respective word in the sentence
     */
    public static String[] getWords(String sentence) {
        String [] sentenceSplit = sentence.split(" ");
        return sentenceSplit;
    }


    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence
     * given a string containing words delimited by spaces, representative of a sentence, return the first word of the sentence
     */
    public static String getFirstWord(String sentence) {
        String [] sentenceSplit = sentence.split(" ");
        String firstWord = sentenceSplit[0];
        return firstWord;
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order
     */
    public static String reverseFirstWord(String sentence) {
        String [] sentenceSplit = sentence.split(" ");
        String firstWord = sentenceSplit[0];
        StringBuilder reverseIt = new StringBuilder(firstWord);
        String reversed = reverseIt.reverse().toString();
        return reversed;
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order and the first character capitalized
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order with the first character capitalized
     */
    public static String reverseFirstWordThenCamelCase(String sentence) {
        String [] sentenceSplit = sentence.split(" ");
        String firstWord = sentenceSplit[0];
        StringBuilder reverseIt = new StringBuilder(firstWord);
        String reversed = reverseIt.reverse().toString();
        String substringOne = reversed.substring(0,1).toUpperCase();
        String substringTwo = reversed.substring(1);
        String together = substringOne + substringTwo;
        return together;
    }


    /**
     * @param str string input from client
     * @param index the index of the character to be removed from `str`
     * @return string with identical contents, excluding the character at the specified index
     * given a string and index, return an identical string excluding the character at the specified index
     */
    public static String removeCharacterAtIndex(String str, int index) {
        String substringOne = str.substring(0,index);
        String substringTwo = str.substring(index+1);
        return substringOne + substringTwo;
    }

}
