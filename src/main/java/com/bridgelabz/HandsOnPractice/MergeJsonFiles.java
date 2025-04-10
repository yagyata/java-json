package com.bridgelabz.HandsOnPractice;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;

public class MergeJsonFiles {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();

        try {
            JsonNode node1 = mapper.readTree(new File("src/main/java/com/bridgelabz/HandsOnPractice/file1.json"));
            JsonNode node2 = mapper.readTree(new File("src/main/java/com/bridgelabz/HandsOnPractice/file2.json"));

            if(node1.isObject() && node2.isObject()) {
                ObjectNode merged = node1.deepCopy();
                merged.setAll((ObjectNode) node2);

                mapper.writerWithDefaultPrettyPrinter().writeValue(new File("src/main/java/com/bridgelabz/HandsOnPractice/merged.json"), merged);
                System.out.println(mapper.writeValueAsString(merged));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
