import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Welcome to the Sorting and Searching Application!\n");
        System.out.print("Enter the number of integers you want to sort: ");
        int listSize = scanner.nextInt();

        // Create a list of integers
        for (int i = 1; i <= listSize; i++){
            System.out.format("Enter integer %d: ", i);
            numbers.add(scanner.nextInt());
        }

        // Print original list
        System.out.println("Original List: " + numbers);

        // Select a sorting algorithm
        System.out.println("Choose a sorting algorithm:\n1. Bubble Sort\n2. Selection Sort");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            SortingAndSearching.bubbleSort(numbers);
            System.out.println("Sorted List (Bubble Sort): " + numbers);
        } else if (choice == 2) {
            SortingAndSearching.selectionSort(numbers);
            System.out.println("Sorted List (Selection Sort): " + numbers);
        } else {
            System.out.println("Invalid choice. Exiting program.");
            return;
        }

        // Perform Binary Search
        System.out.print("Enter the number to search for in the sorted list: ");
        int target = scanner.nextInt();

        int index = SortingAndSearching.binarySearch(numbers, target);
        if (index == -1) {
            System.out.println("The value " + target + " is NOT in the list.");
        } else {
            System.out.format("Number found at position " + index);
        }

        scanner.close();
    }
}