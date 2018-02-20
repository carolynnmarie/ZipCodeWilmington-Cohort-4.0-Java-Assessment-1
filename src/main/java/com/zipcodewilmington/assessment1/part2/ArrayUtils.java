package com.zipcodewilmington.assessment1.part2;

import java.sql.Array;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

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
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
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
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        Object [] output = {};
        StringBuilder removeObject = new StringBuilder();
        for(int i = 0; i<objectArray.length; i++) {
            if (!objectArray[i].equals(objectToRemove)) {
                removeObject.append(objectArray[i])
                        .append("/");
            }
        }
        String remove = removeObject.toString();
        String[] removedValues = remove.split("/");

        Integer[] exactIntRemoved = new Integer [removedValues.length];
        for(int i = 0; i<removedValues.length; i++) {
            exactIntRemoved[i] = Integer.parseInt(removedValues[i]);
        }
        return exactIntRemoved;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Integer getMostCommon(Integer[] objectArray) {

        return null;
    }



/*        protected void extractIndexValueAndAppendToOutput(Integer i){
        Integer value = this.array[i];
        Integer[] tempArray = new Integer[this.output.length + 1];
        System.arraycopy(this.output, 0, tempArray, 0, this.output.length);
        tempArray[tempArray.length -1 ] = value;
        this.output = tempArray;
        }
*/
    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        return null;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Integer[] mergeArrays(Integer [] objectArray, Integer[] objectArrayToAdd) {
        StringBuilder middle = new StringBuilder();
        for(int i = 0; i<objectArray.length; i++) {
            middle.append(objectArray[i])
                    .append("/");
        }
        for(int j = 0; j<objectArrayToAdd.length; j++) {
            middle.append(objectArrayToAdd[j])
                    .append("/");
        }
        String[] nextStep = middle.toString().split("/");
        Integer[] mergedArrays = new Integer [nextStep.length];
        for(int i = 0; i<nextStep.length; i++) {
            mergedArrays[i] = Integer.parseInt(nextStep[i]);
        }
        return mergedArrays;

            }
}
