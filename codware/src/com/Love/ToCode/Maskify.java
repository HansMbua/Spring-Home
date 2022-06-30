package com.Love.ToCode;

public class Maskify {

    private String word;
//
//    "4556364607935616" --> "############5616"
//            "64607935616" -->      "#######5616"
//            "1" -->                "1"
//            "" -->                 ""

    public Maskify() {


    }

    private static String maskkyWord(String word) {
        char[] str = word.toCharArray();

        String message1 = String.valueOf(str);

        StringBuilder stringBuilder = new StringBuilder();

        if (word.length() <= 4) {
            return word;
        } else {
            String newWord = word.substring(0, word.length() - 4);
            String oldWord = word.substring(word.length() - 4);
            for (int i = 0; i < newWord.length(); i++) {
                message1 = "" + newWord.charAt(i);

                message1 = message1.replaceAll("\\w+", "#");
                stringBuilder.append(message1);


            }
            stringBuilder.append(oldWord);
            String output = stringBuilder.toString();

            return output;
        }

    }


}

