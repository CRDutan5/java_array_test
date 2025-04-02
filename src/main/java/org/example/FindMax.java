package org.example;

public class FindMax {

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );


    }

    public static int findMax(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int maxValue = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
