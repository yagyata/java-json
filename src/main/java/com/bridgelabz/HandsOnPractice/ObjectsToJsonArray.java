package com.bridgelabz.HandsOnPractice;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Arrays;
import java.util.List;

class Person {
    public String name;
    public int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class ObjectsToJsonArray {
    public static void main(String[] args) {
        try{
            List<Person> person = Arrays.asList(
                    new Person("Yagyata", 21),
                    new Person("Loveleen", 21)
            );

            ObjectMapper mapper = new ObjectMapper();
            String jsonArray = mapper.writeValueAsString(person);
            System.out.println(jsonArray);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
