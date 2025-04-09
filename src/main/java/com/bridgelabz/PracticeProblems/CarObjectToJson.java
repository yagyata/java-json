package com.bridgelabz.PracticeProblems;

import com.fasterxml.jackson.databind.ObjectMapper;

class Car {
    public String model;
    public int year;
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
}
public class CarObjectToJson {
    public static void main(String[] args) {
        try{
            ObjectMapper mapper = new ObjectMapper();
            Car car1 = new Car("Audi", 2022);
            Car car2 = new Car("Creta", 2023);

            String jsonCar1 = mapper.writeValueAsString(car1);
            String jsonCar2 = mapper.writeValueAsString(car2);

            System.out.println(jsonCar1 + "\n" + jsonCar2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
