package com.zipcodewilmington.assessment1.part2;

import java.util.Arrays;

import static java.lang.Integer.parseInt;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {
        int x = 0;
        Integer[] aSD = Arrays.copyOf(ints, ints.length);
        for(Integer each: ints){
            Integer a = each%2;
            if(!a.equals(0)){
                aSD[x] = each;
                x++;
            }
        }
        aSD = Arrays.copyOf(aSD, aSD.length-x);
        return aSD;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        int x = 0;
        Integer[] aSD = Arrays.copyOf(ints, ints.length);
        for(Integer each: ints){
            Integer a = each%2;
            if(a.equals(0)){
                aSD[x] = each;
                x++;
            }
        }
        aSD = Arrays.copyOf(aSD, aSD.length-x);
        return aSD;

    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        int x = 0;
        Integer[] aSD = Arrays.copyOf(ints, ints.length);
        for(Integer each: ints){
            Integer a = each%3;
            if(!a.equals(0)){
                aSD[x] = each;
                x++;
            }
        }
        aSD = Arrays.copyOf(aSD, aSD.length-x);
        return aSD;
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        StringBuilder builder = new StringBuilder();
        for(Integer each: ints){
            Integer a = each%multiple;
            if(!a.equals(0)){
                builder.append(each);
                builder.append("/");
            }
        }
        String[] answer = builder.toString().split("/");
        Integer[] ans = new Integer[answer.length];
        for(int i=0; i<answer.length; i++){
            ans[i] = parseInt(answer[i]);
        }
        return ans;
    }
}
