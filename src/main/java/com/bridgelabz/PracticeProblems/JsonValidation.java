package com.bridgelabz.PracticeProblems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonValidation {
    public static void main(String[] args) {
        String jsonString = "{\"name\":\"Yagyata\",\"age\":25}";

        ObjectMapper mapper = new ObjectMapper();
        try {
            JsonNode node = mapper.readTree(jsonString);
            System.out.println("Valid JSON Structure");
        } catch (Exception e) {
            System.out.println("Invalid JSON " + e.getMessage());
        }
    }
}
