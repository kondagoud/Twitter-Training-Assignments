package com.sid.implementation;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * This class provides services to perform sort operations.
 *
 * @author kmerugu.
 */
public class SortOperationsManager {
    /**
     * This generic method is used to sort the elements in ascending order.
     * @param listOfElements List of elements.
     * @param <T>        Generic type.
     * @param comparator Generic type of comparator.
     * @return Returns sorted list.
     */
    public static <T> List<T> getSortedList(List<T> listOfElements, Comparator<T> comparator) {
        Collections.sort(listOfElements, comparator);
        return listOfElements;
    }

    /**
     * This generic method is used to display list of elements.
     * @param sortedList List of elements.
     * @param <T>
     */
    public static <T> void displaySortedElements(List<T> sortedList) {
        try {
            if (sortedList.isEmpty()) {
                System.out.println("List is empty. No data found in the list.");
            } else {
                sortedList.forEach(
                        (elements) -> System.out.println(elements)
                );
            }
        } catch (NullPointerException nullPointerException) {
            System.out.println("List should not be null.");
        }
    }
}
