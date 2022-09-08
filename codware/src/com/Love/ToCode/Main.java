package com.Love.ToCode;

import javax.lang.model.element.NestingKind;
import java.util.Arrays;

public class Main {

    //
//    "4556364607935616" --> "############5616"
//            "64607935616" -->      "#######5616"
//            "1" -->                "1"
//            "" -->                 ""

    public static void main(String[] args) {

       ProgramChecker programChecker = new ProgramChecker();
     Boolean isAProgram =   programChecker.check("aThe quick brown fox jumps over the lazy dog");
        System.out.println(isAProgram);
    }


}



