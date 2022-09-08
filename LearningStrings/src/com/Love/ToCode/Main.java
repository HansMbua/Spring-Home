package com.Love.ToCode;

import java.util.*;
import java.util.stream.Stream;

public class Main {


    public static void main(String[] args) {
//        you1 are4 smart3,
        SortString("you5 are4 smart3");

        List<String> spm = Arrays.asList("heho", "hif", "dfni");
        Map<String, String> cap = st -> st.
    }

    private static void SortString(String sentence) {
        //splitting the words
        String arr[] = sentence.split(" ", 3);
        List<String> unsorted = new ArrayList<>();
        //adding words in List
        for (int i = 0; i < arr.length; i++) {
            unsorted.add(arr[i]);
        }

        Collections.sort(unsorted, comparator);

        for (int i = 0; i < unsorted.size(); i++) {
            System.out.print(" " + unsorted.get(i));
        }
    }

    static Comparator comparator = new Comparator<String>() {


        @Override
        public int compare(String o1, String o2) {
            return (
                    o1.substring(o1.length() - 1).compareTo(o2.substring(o2.length() - 1))

            );
        }
    };

}


