package com.Love.ToCode;

//import com.sun.tools.javac.util.ArrayUtils;

public class Main {

    public static void main(String[] args) {
        // write your code here

        solveString("you1 smart3 are4");

    }


    public static void solveString(String sentence) {
//
// Build a python program that can arrange string is the other of the numbers inside for example: you1 are4 smart3,
//
// Answer:  you1 smart3 are4
//
// It’s should arrange the string of words in that order

//        char[] wordChar = sentence.toCharArray();
        System.out.println(new String(sentence).indexOf("1"));

        int index = new String(sentence).indexOf("1");
        String[] word = {};
        for (int i = 0; i <= sentence.length(); i++) {
            // get the number form the words and compare there numbers and sort them according to their numbers
            //get the number from the words
            if (sentence.contains("1")) {

            }
        }

    }
}
