package org.example;

import java.util.Arrays;

public class FindSecondLargest {



    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );


    }

    public static int findSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException();
        }
        int secondLargest = Integer.MIN_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            }
            else if (num > secondLargest) {
                secondLargest = num;
            }
        }

        if (secondLargest == largest) {
            throw new IllegalArgumentException();
        }
        return secondLargest;

        // if all duplicates throw error





    }

}
