package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
        Integer sumTotal = 0;
        for(int i = 0; i<intArray.length; i++) {
            sumTotal += intArray[i];
        }
        return sumTotal;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        Integer productTotal = 1;
        for(int i = 0; i<intArray.length; i++) {
            productTotal *= intArray[i];
        }
        return productTotal;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
        Double average = 0.0;
        for(int i = 0; i<intArray.length; i++) {
            average += intArray[i];
        }
        Double actualAverage = average / intArray.length;
        return actualAverage;
    }
}
