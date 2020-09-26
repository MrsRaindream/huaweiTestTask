package main.java.com.huawei.addTwoNumbers;

import java.util.LinkedList;
import java.util.List;

/**
 * Add Two Numbers
 * You are given two or more non-empty linked lists representing two or more non-negative integers.
 * The integers are stored in reverse order with each node of the list containing a single digit.
 * Implement a sum of those lists, return it as a linked list.
 * Integers do not have leading zeros, the only exception is the number 0 itself.
 * Example:
 * Input: (7 -> 8 -> 9 -> 0 -> 1) + 0 + (9-> 8 -> 9)
 * Output: 6 -> 7 -> 9 -> 1 -> 1
 * Explanation: 10987 + 0 + 989 = 11976.
 *
 * @author Vasilieva
 */
public class AddNumbersLogic {

    /**
     * Add Two Numbers
     * You are given two or more non-empty linked lists representing two or more non-negative integers.
     * The integers are stored in reverse order with each node of the list containing a single digit.
     * Return sum of those lists, return it as a linked list.
     *
     * @param providedData list of linked lists of integers
     * @return a sum of those lists, return it as a linked list
     */
    public static LinkedList<Integer> addNumbers(List<LinkedList<Integer>> providedData) {
        //validate input data
        if (providedData == null || providedData.size() == 0) {
            return new LinkedList<>();
        }

        Integer resultSumInt = 0;
        for (int i = 0; i < providedData.size(); i++) {
            Integer reverseInteger = makeReverseIntFromList(providedData.get(i));
            resultSumInt += reverseInteger;
        }
        return makeReverseLinkedListFromInt(resultSumInt);
    }

    /**
     * Make reverse integer from the list
     *
     * @param list
     * @return integer
     */
    private static Integer makeReverseIntFromList(LinkedList<Integer> list) {
        //validate data
        if (list == null || list.size() == 0) {
            return 0;
        }

        String integerString = new String();
        while (list.size() > 0) {
            integerString += list.removeLast();
        }
        return Integer.parseInt(integerString);
    }

    /**
     * Make reverse LinkedList from integer
     *
     * @param integer
     * @return linked list
     */
    private static LinkedList<Integer> makeReverseLinkedListFromInt(Integer integer) {
        //validate data
        if (integer == null) {
            return new LinkedList<>();
        }

        LinkedList<Integer> resultList = new LinkedList<>();
        String str = Integer.toString(integer);
        for (int i = 0; i < str.length(); i++) {
            resultList.addFirst(Character.getNumericValue(str.charAt(i)));
        }
        return resultList;
    }

}
