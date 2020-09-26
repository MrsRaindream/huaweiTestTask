package main.java.com.huawei.mergeArrays;

/**
 * Huawei test task
 * Merge sorted array
 *
 * Given two sorted integer arrays x and y, merge y into x as one sorted array.
 * The number of elements initialized in x and y are m and n respectively.
 * You may assume that x has enough space to hold additional elements from y. It's size is m + n.
 * Array values fall into [-10^9, 10^9] range.
 *
 * @author Vasilieva
 */
public class MergeLogicAsArray {

    /**
     * Merge two arrays
     * @param arrayX first one array to merge
     * @param arrayY second one array to merge
     * @return merged array
     */
    public static int[] mergeArray(int[] arrayX, int[] arrayY) {
        int xPosition = 0;
        int yPosition = 0;
        int resPosition = 0;
        int[] resultArray = new int[arrayX.length + arrayY.length];

        while (xPosition < arrayX.length && yPosition < arrayY.length) {
            if (arrayX[xPosition] < arrayY[yPosition]) {
                resultArray[resPosition++] = arrayX[xPosition++];
            } else {
                resultArray[resPosition++] = arrayY[yPosition++];
            }
        }

        while (xPosition < arrayX.length) {
            resultArray[resPosition++] = arrayX[xPosition++];
        }

        while (yPosition < arrayY.length) {
            resultArray[resPosition++] = arrayY[yPosition++];
        }

        return resultArray;
    }
}

