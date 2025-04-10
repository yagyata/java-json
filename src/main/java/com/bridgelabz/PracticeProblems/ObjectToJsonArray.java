package com.bridgelabz.PracticeProblems;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Arrays;
import java.util.List;

class Person {
    public String name;
    public int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}

public class ObjectToJsonArray {
    public static void main(String[] args) {
        try{
            List<Person> person = Arrays.asList(
                    new Person("Riya", 22),
                    new Person("Yagyata", 21)
            );
            ObjectMapper mapper = new ObjectMapper();
            String jsonArray = mapper.writeValueAsString(person);
            System.out.println(jsonArray);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
