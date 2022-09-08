package com.love2cod.jackson.Json.Demo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.Arrays;

public class Driver {


    public static void main(String arg[]){


        try {

            //create object mapper
            ObjectMapper mapper = new ObjectMapper();
            // read JSon file and map/convert java POJO:

            //data/Sample-lite.json
            Student theStudent = mapper.readValue(new File("data/sample-full.json"),Student.class);
            //print first name and lastname

            System.out.println("First Name = "+theStudent.getFirstName());
            System.out.println("Last Name = "+theStudent.getLastName());
            //print languages
            Arrays.stream(theStudent.getLanguages()).forEach(System.out::println);

            System.out.println("address = "+theStudent.getAddress());

            System.out.println(">>> Or");

            Address theAddress = theStudent.getAddress();
            System.out.println("the city is : "+theAddress.getCity());

        }catch (Exception exception){
            exception.printStackTrace();
        }




    }
}
