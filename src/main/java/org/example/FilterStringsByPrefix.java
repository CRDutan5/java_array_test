package org.example;

import java.util.ArrayList;
import java.util.List;

public class FilterStringsByPrefix {


    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    public static String[] filterStringsByPrefix(String[] arr, String prefix) {
        if (arr == null || prefix == null) {
            throw new IllegalArgumentException();
        }
        if (arr.length == 0) {
            return new String[0];
        }
        if (prefix.isEmpty()) {
            return arr;
        }

        List<String> words = new ArrayList<>();

        for (String word : arr) {
            if (word.startsWith(prefix)) {
                words.add(word);
            }
        }

        return words.toArray(new String[0]);
    }
}
