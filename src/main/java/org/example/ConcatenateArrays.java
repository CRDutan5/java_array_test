package org.example;


import java.util.Arrays;

public class ConcatenateArrays {



    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );


    }

    public static int[] concatenateArraysFunc(int[] arr1, int[] arr2) {
        if (arr1 == null && arr2 == null) {
            throw new IllegalArgumentException("Both arrays cannot be null");
        }
        if (arr1 == null || arr2 == null) {
            throw new IllegalArgumentException("Input array cannot be null");
        }

        if (arr1.length == 0 && arr2.length == 0) {
            return new int[0];
        }

        int[] res = new int[arr1.length + arr2.length];
        int index = 0;

        for (int num : arr1) {
            res[index] = num;
            index++;
        }
        for (int num : arr2) {
            res[index] = num;
            index++;
        }
        return res;
    }

}
