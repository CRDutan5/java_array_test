package org.example;

import java.util.ArrayList;
import java.util.List;

public class FilterEvenNumbers {


    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );


    }

    public static int[] filterEvenNumbersFunc(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException();
        }

        if (arr.length == 0) {
            return new int[0];
        }

        List<Integer> list = new ArrayList<>();

        for (int num : arr) {
            if (num % 2 == 0) {
                list.add(num);
            }
        }

        if (list.isEmpty()) return new int[0];

        int[] res = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }

}



