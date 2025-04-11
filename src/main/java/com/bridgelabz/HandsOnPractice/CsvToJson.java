package com.bridgelabz.HandsOnPractice;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.List;

public class CsvToJson {
    public static void main(String[] args) {
        String csvFile = "src/main/java/com/bridgelabz/HandsOnPractice/data.csv";
        try(CSVReader reader = new CSVReader(new FileReader(csvFile))) {
            List<String[]> rows = reader.readAll();
            ObjectMapper mapper = new ObjectMapper();
            ArrayNode jsonArray = mapper.createArrayNode();

            String[] firstRow = rows.get(0);

            for(int i=1; i<rows.size(); i++) {
                ObjectNode jsonObject = mapper.createObjectNode();
                String[] row = rows.get(i);
                for(int j=0; j<firstRow.length; j++) {
                    jsonObject.put(firstRow[j], row[j]);
                }
                jsonArray.add(jsonObject);
            }
            System.out.println(mapper.writeValueAsString(jsonArray));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
