package com.zipcodewilmington.assessment1.part2;

import java.sql.Array;
import java.util.*;

import static java.util.Arrays.copyOf;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Integer[] objectArray, Integer objectToCount) {
        Integer counter = 0;
        for(int i = 0; i< objectArray.length; i++) {
            if(objectArray[i].equals(objectToCount))
                counter++;
        }
        return counter;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Integer[] removeValue(Integer[] objectArray, Integer objectToRemove) {
//option 1
        int x = getNumberOfOccurrences(objectArray, objectToRemove);
        Integer[] intArray = new Integer[objectArray.length-x];
        int count = 0;
        for(Integer item: objectArray){
            if(!item.equals(objectToRemove)){
                intArray[count] = item;
                count++;
            }
        }
//option2
//        ArrayList<Integer> removed = new ArrayList<>();
//        for(Integer item: objectArray){
//            if(!item.equals(objectToRemove)){
//                removed.add(item);
//            }
//        }
//        Integer[] intArray = removed.toArray(new Integer[objectArray.length - getNumberOfOccurrences(objectArray, objectToRemove)]);
        return intArray;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occurring object in the array
     */
    public static Integer getMostCommon(Integer[] objectArray) {
        Integer most = 0;
        for(Integer item: objectArray){
            if(getNumberOfOccurrences(objectArray, item)>most){
                most = item;
            }
        }
        return most;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Integer getLeastCommon(Integer[] objectArray) {
        Integer x = objectArray.length+1;
        Integer least = 0;
        for(Integer item: objectArray){
            if(getNumberOfOccurrences(objectArray, item)<x){
                least = item;
                x = getNumberOfOccurrences(objectArray, item);
            }
        }
        return least;
    }


    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Integer[] mergeArrays(Integer [] objectArray, Integer[] objectArrayToAdd) {
        Integer[] merged = Arrays.copyOf(objectArray, objectArray.length + objectArrayToAdd.length);
        int x = 0;
        for(int i = objectArray.length; i < merged.length; i++){
            merged[i] = objectArrayToAdd[x];
            x++;
        }
        return merged;
    }
}
