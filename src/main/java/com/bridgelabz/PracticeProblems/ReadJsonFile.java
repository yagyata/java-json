package com.bridgelabz.PracticeProblems;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

class Student {
    public int id;
    public String name;
    public int age;
    public String email;

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getEmail() { return email; }

    public void setId() { this.id = id; }
    public void setName() { this.name = name; }
    public void setAge() { this.age = age; }
    public void setEmail() { this.email = email; }
}

public class ReadJsonFile {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Student student = mapper.readValue(new File("src/main/java/com/bridgelabz/PracticeProblems/student.json"), Student.class);
            System.out.println("Name: " + student.getName());
            System.out.println("Email: " + student.getEmail());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
