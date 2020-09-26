package main.java.com.huawei.util.dataProduce;

import java.util.Random;

/**
 * Data Provider
 * Array Provider
 *
 * @author Vasilieva
 */
public class ArrayProvider {

    /**
     * Low bound values
     */
    public static final int LOW_BOUND = (int) (-1 * Math.pow(10, 9));

    /**
     * High bound values
     */
    public static final int HIGH_BOUND = (int) Math.pow(10, 9);

    /**
     * Provide sorted array of int's
     * Array values fall into [LOW_BOUND, HIGH_BOUND] range.
     *
     * @param size size of array
     * @return array of integers
     */
    public static int[] provideSortedArray(int size) {
        return new Random()
                .ints(size, LOW_BOUND, HIGH_BOUND)
                .sorted()
                .toArray();
    }

}
