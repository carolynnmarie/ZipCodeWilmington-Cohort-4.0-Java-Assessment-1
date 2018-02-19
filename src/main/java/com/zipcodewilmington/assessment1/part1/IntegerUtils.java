package com.zipcodewilmington.assessment1.part1;

import static java.lang.Integer.reverse;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        int counter = 0;
        int x = 0;
        while(counter <= n) {
            x += counter;
            counter++;
        }
        return x;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {
        int counter = 1;
        int x = 1;
        while(counter <= n) {
            x *= counter;
            counter++;
        }
        return x;

    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        String first = val.toString();
        String reverse = "";
        for (int i = first.length() - 1; i >= 0; i--) {
            reverse += first.charAt(i);
        }
        Integer reversed = Integer.parseInt(reverse);
        return reversed;
    }
}
