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
     * @param m count of real elements x
     * @param n count of real elements y
     * @return merged array
     */
    public static int[] mergeArray(int[] arrayX, int m, int[] arrayY, int n) {
        m--;
        n--;
        int index = arrayX.length - 1;

        while (index >= 0) {
            if (m < 0) {
                arrayX[index] = arrayY[n];
                n--;
            } else if (n < 0) {
                arrayX[index] = arrayX[m];
                m--;
            } else {
                arrayX[index] = (arrayX[m] > arrayY[n]) ? arrayX[m--] : arrayY[n--];
            }
            index--;
        }
        return arrayX;
    }
}

