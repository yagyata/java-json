package com.bridgelabz.HandsOnPractice;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class JsonToXmlFormat {
    public static void main(String[] args) {
        try {
            String jsonFormat = "{\"name\":\"Yagyata\",\"age\":21}";

            ObjectMapper mapper = new ObjectMapper();
            JsonNode jsonNode = mapper.readTree(jsonFormat);

            XmlMapper xmlMapper = new XmlMapper();
            String xml = xmlMapper.writeValueAsString(jsonNode);

            System.out.println(xml);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
