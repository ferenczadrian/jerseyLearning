package com.adi.model;

public class Fahrenheit {
    private double value;

    public Fahrenheit(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public double toCelsius() {
        return (value - 32) * 5 / 9;
    }
}
