package com.Love.ToCode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ProgramChecker {

    public ProgramChecker(){

    }

    public boolean check(String sentence){
        //I get the sentence and check if the sentence is a program and returns true for false

        char[] alphabet = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

       //get the sentence
     char[] theSentence = sentence.toCharArray();
      //check if it contains every letter of the alphabet

   for (int i = 0; i >= sentence.length(); i++){
       if (sentence.contains(Character.toString(alphabet[0]))){
           return true;
       }
   }


        char[] theSentence1 = sentence.toCharArray();


          //converting sentence to array char



       //if the sentence contains all the char of the alphabet true return ture and vise vesa
        return false;
    }

    static boolean contains(char c, char[] array) {
        for (char x : array) {
            if (x == c) {
                return true;
            }
        }
        return false;
    }


}
