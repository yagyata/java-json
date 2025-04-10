package com.bridgelabz.PracticeProblems;

import org.json.JSONObject;

public class MergeJsonObjects {
    public static void main(String[] args) {
        JSONObject obj1 = new JSONObject();
        obj1.put("name", "Yagyata");
        obj1.put("age", 21);

        JSONObject obj2 = new JSONObject();
        obj2.put("city", "Ludhiana");
        obj2.put("pin code", "141008");

        for(String key : obj2.keySet()) {
            obj1.put(key, obj2.get(key));
        }
        System.out.println(obj1.toString());
    }
}
