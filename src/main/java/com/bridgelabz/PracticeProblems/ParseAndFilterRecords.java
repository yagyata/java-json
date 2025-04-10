package com.bridgelabz.PracticeProblems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

import java.io.File;
import java.io.IOException;

public class ParseAndFilterRecords {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            JsonNode jsonNode = objectMapper.readTree(new File("src/main/java/com/bridgelabz/PracticeProblems/record.json"));

            ArrayNode filteredArray = objectMapper.createArrayNode();

            for (JsonNode node : jsonNode) {
                if (node.get("age").asInt() > 25) {
                    filteredArray.add(node);
                }
            }

            // Print the filtered JSON
            System.out.println(objectMapper.writeValueAsString(filteredArray));

        } catch (IOException e) {
            System.out.println("Error reading JSON file: " + e.getMessage());
        }
    }
}
