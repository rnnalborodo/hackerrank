package hackerrank.tutorials.daysofCode.day20Sorting;

import java.util.Scanner;

public class Solution {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    final int n = scan.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = scan.nextInt();
    }
    scan.close();
    int swaps = 0;
    for (int i = 0; i < n; i++) {
      // Track number of elements swapped during a single array traversal
      int numberOfSwaps = 0;

      for (int j = 0; j < n - 1; j++) {
        // Swap adjacent elements if they are in decreasing order
        if (a[j] > a[j + 1]) {
          int temp = a[j];
          a[j] = a[j + 1];
          a[j+1] = temp;
          numberOfSwaps++;
        }
      }
      swaps+= numberOfSwaps;
      // If no elements were swapped during a traversal, array is sorted
      if (numberOfSwaps == 0) {
        break;
      }
    }

    System.out.format("Array is sorted in %d swaps.\n", swaps);
    System.out.format("First Element: %d\n",a[0]);
    System.out.format("Last Element: %d\n", a[n-1]);
  }
}