package test.java.com.huawei.mergeArrays;

import main.java.com.huawei.mergeArrays.MergeLogicAsArray;

import java.util.Arrays;

/**
 * Test of the MergeLogicAsArray
 *
 * @author Vasilieva
 */
public class MergeLogicAsArrayTest {

    /**
     * Test of the MergeLogicAsArray
     *
     * @param args
     */
    public static void main(String[] args) {
        //size of array x
        int m = 3;
        //size of array y
        int n = 3;

        int[] arrayX = new int[] {1,5,7,0,0,0};
        int[] arrayY = new int[] {1,8,9};

        System.out.println("First array: ");
        System.out.println(Arrays.toString(arrayX));
        System.out.println("Second array: ");
        System.out.println(Arrays.toString(arrayY));

        int[] resultArray = MergeLogicAsArray.mergeArray(arrayX, m, arrayY, n);
        System.out.println("Result array: ");
        System.out.println(Arrays.toString(resultArray));
    }

}
