package test.java.com.huawei.addTwoNumbers;

import main.java.com.huawei.addTwoNumbers.AddNumbersLogic;
import main.java.com.huawei.util.dataProduce.ListProvider;

import java.util.LinkedList;
import java.util.List;

/**
 * Test of AddNumbersLogic
 *
 * @author Vasilieva
 */
public class AddNumbersLogicTest {

    /**
     * Size of the List of LinkedLists
     */
    public static final int LIST_SIZE = 3;

    /**
     * Test of AddNumbersLogic
     *
     * @param args
     */
    public static void main(String[] args) {
        List<LinkedList<Integer>> providedData = ListProvider.provideListOfLinkedLists(LIST_SIZE);
        System.out.println("Input data: ");
        System.out.println(providedData);

        LinkedList<Integer> integers = AddNumbersLogic.addNumbers(providedData);
        System.out.println("Result: ");
        System.out.println(integers);
    }
}
