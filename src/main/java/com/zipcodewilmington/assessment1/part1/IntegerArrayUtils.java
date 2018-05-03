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
        Integer x= 0;
        for(Integer item: intArray){
            x += item;
        }
        return x;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        Integer x = 1;
        for(Integer item: intArray){
            x *= item;
        }
        return x;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
        Double x = 0.0;
        for(Integer item: intArray){
            x+=item;
        }
        x = x / intArray.length;
        return x;
    }
}
