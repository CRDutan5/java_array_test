package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class RemoveDuplicatesFromSortedStringArray {



    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static String[] removeDuplicatesFromSortedStringArray(String[] arr) {
        ArrayList<String> list = new ArrayList<>();

        if (arr == null) {
            throw new IllegalArgumentException();
        }
        if (arr.length == 0) {
            return new String[0];
        }

        list.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            String top = list.get(list.size() - 1);
            if (!top.equals(arr[i])) {
                list.add(arr[i]);
            }
        }
        return list.toArray(new String[0]);
    }


}
