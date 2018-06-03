package com.zipcodewilmington.assessment1.part1;

import static java.lang.Integer.parseInt;
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
        int x = 0;
        for(int i = 0; i<n; i++){
            x+=i;
        }
        return x;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and including `n`
     */
    public static Integer getProductOfN(Integer n) {
        int x = 1;
        for(int i = 1; i<=n; i++){
            x*=i;
        }
        return x;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        StringBuilder build = new StringBuilder(val.toString());
        String x = build.reverse().toString();
        Integer y = parseInt(x);
        return y;
    }
}
