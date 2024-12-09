package com.bhavesh.practice.collections.illutration;

public class Car {
    public String brand;
    public String model;
    public int manufacturingYear;

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", manufacturingYear=" + manufacturingYear +
                '}';
    }
}
