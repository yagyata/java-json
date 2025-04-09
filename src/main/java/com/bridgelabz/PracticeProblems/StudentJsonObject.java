package com.bridgelabz.PracticeProblems;


import org.json.JSONArray;
import org.json.JSONObject;

public class StudentJsonObject {
    public static void main(String[] args) {
        JSONArray subjects = new JSONArray();
        subjects.put("Maths");
        subjects.put("Physics");
        subjects.put("Chemistry");

        JSONObject student = new JSONObject();
        student.put("name", "Yagyata");
        student.put("age", 21);
        student.put("subjects", subjects);

        JSONObject student1 = new JSONObject();
        student1.put("name", "Riya");
        student1.put("age", 20);
        student1.put("subjects", subjects);

        System.out.println(student.toString() + "\n" + student1.toString());
    }
}
