package com.bridgelabz.HandsOnPractice;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.*;

class User {
    private String name;
    private int age;
    private String email;

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getEmail() { return email; }

    public void setName() { this.name = name; }
    public void setAge() { this.age = age; }
    public void setEmail() { this.email = email; }

}
public class PrintKeysValues {
    public static void main(String[] args) {
        String file = "src/main/java/com/bridgelabz/HandsOnPractice/user.json";

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            List<User> users = objectMapper.readValue(new File(file), new TypeReference<List<User>>() {});

            for (User u : users) {
                Map<String, Object> map = objectMapper.convertValue(u, new TypeReference<Map<String, Object>>() {});
                for (String key : map.keySet()) {
                    System.out.println(key + ": " + map.get(key));
                }
                System.out.println();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
