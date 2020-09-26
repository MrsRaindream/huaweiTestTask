package test.java.com.huawei.mergeArrays;

import main.java.com.huawei.mergeArrays.MergeLogicAsArray;
import main.java.com.huawei.util.dataProduce.ArrayProvider;

import java.util.Arrays;

/**
 * Test of the MergeLogicAsArray
 *
 * @author Vasilieva
 */
public class MergeLogicAsArrayTest {

    /**
     * Size of array
     */
    public static final int ARRAY_SIZE = 10;

    /**
     * Test of the MergeLogicAsArray
     *
     * @param args
     */
    public static void main(String[] args) {
        //size of array x
        int m = ARRAY_SIZE;
        //size of array y
        int n = m / 2;

        int[] arrayX = ArrayProvider.provideSortedArray(m);
        int[] arrayY = ArrayProvider.provideSortedArray(n);

        System.out.println("First array: ");
        System.out.println(Arrays.toString(arrayX));
        System.out.println("Second array: ");
        System.out.println(Arrays.toString(arrayY));

        int[] resultArray = MergeLogicAsArray.mergeArray(arrayX, arrayY);
        System.out.println("Result array: ");
        System.out.println(Arrays.toString(resultArray));
    }

}
