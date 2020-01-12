package com.adi.model;

public class Celsius {
    private final double value;

    public Celsius(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public double toFahrenheit() {
        return ((value * 9) / 5) + 32;
    }
}
