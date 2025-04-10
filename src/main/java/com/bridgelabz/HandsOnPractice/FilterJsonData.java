package com.bridgelabz.HandsOnPractice;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

import java.io.File;
import java.io.IOException;

public class FilterJsonData {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        try{
            JsonNode node = mapper.readTree(new File("src/main/java/com/bridgelabz/HandsOnPractice/record.json"));
            ArrayNode arrayNode = mapper.createArrayNode();

            for(JsonNode n : node) {
                if(n.get("age").asInt() > 25) {
                    arrayNode.add(n);
                }
            }
            System.out.println(mapper.writeValueAsString(arrayNode));
        } catch (IOException e) {
            System.out.println("Error reading JSON file: " + e.getMessage());
        }
    }
}
