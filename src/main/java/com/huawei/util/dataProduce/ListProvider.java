package main.java.com.huawei.util.dataProduce;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Data Provider
 * LinkedList Provider
 *
 * @author Vasilieva
 */
public class ListProvider {

    /**
     * Low bound values
     */
    public static final int LOW_BOUND = 1;

    /**
     * High bound values
     */
    public static final int HIGH_BOUND = 9;

    /**
     * Provide Linked list of Integers
     * List must contains two or more non-negative integers.
     * List values fall into [LOW_BOUND, HIGH_BOUND] range.
     *
     * @param size size of list
     * @return list of integers
     */
    public static LinkedList<Integer> provideLinkedList(int size) {
        return new Random()
                .ints(size, LOW_BOUND, HIGH_BOUND)
                .sorted()
                .boxed()
                .collect(Collectors.toCollection(LinkedList::new));
    }

    /**
     * Provide List of Linked list of Integers
     *
     * @param size size of list
     * @return list of integers
     */
    public static List<LinkedList<Integer>> provideListOfLinkedLists(int size) {
        List<LinkedList<Integer>> result = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            result.add(provideLinkedList(random.nextInt(HIGH_BOUND - 1) + 1));
        }
        return result;
    }

}
