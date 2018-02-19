package com.zipcodewilmington.assessment1.part2;

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
        StringBuilder holder = new StringBuilder();
        for(int i = 0; i<ints.length; i++) {
            int it = ints[i];
            if((it%2) != 0){
                holder.append(ints[i])
                        .append("/");
            }
        }
        String stepTwo = holder.toString();
        String[] stepThree = stepTwo.split("/");
        Integer[] evenIntRemoved = new Integer [stepThree.length];
        for(int i = 0; i<stepThree.length; i++) {
            evenIntRemoved[i] = Integer.parseInt(stepThree[i]);
        }

        return evenIntRemoved;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        StringBuilder holder = new StringBuilder();
        for(int i = 0; i<ints.length; i++) {
            int it = ints[i];
            if((it%2) == 0){
                holder.append(ints[i])
                        .append("/");
            }
        }
        String stepTwo = holder.toString();
        String[] stepThree = stepTwo.split("/");
        Integer[] oddIntRemoved = new Integer [stepThree.length];
        for(int i = 0; i<stepThree.length; i++) {
            oddIntRemoved[i] = Integer.parseInt(stepThree[i]);
        }

        return oddIntRemoved;

    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        StringBuilder holder = new StringBuilder();
        for(int i = 0; i<ints.length; i++) {
            int it = ints[i];
            if((it%3) != 0){
                holder.append(ints[i])
                        .append("/");
            }
        }
        String stepTwo = holder.toString();
        String[] stepThree = stepTwo.split("/");
        Integer[] thirdIntRemoved = new Integer [stepThree.length];
        for(int i = 0; i<stepThree.length; i++) {
            thirdIntRemoved[i] = Integer.parseInt(stepThree[i]);
        }

        return thirdIntRemoved;

    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        StringBuilder holder = new StringBuilder();
        for(int i = 0; i<ints.length; i++) {
            int it = ints[i];
            if((it%multiple) != 0){
                holder.append(ints[i])
                        .append("/");
            }
        }
        String stepTwo = holder.toString();
        String[] stepThree = stepTwo.split("/");
        Integer[] multipleIntRemoved = new Integer [stepThree.length];
        for(int i = 0; i<stepThree.length; i++) {
            multipleIntRemoved[i] = Integer.parseInt(stepThree[i]);
        }

        return multipleIntRemoved;
    }
}
