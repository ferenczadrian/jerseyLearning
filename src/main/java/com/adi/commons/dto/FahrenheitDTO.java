package com.adi.commons.dto;

public class FahrenheitDTO {
    private double valueInFahrenheit;

    public FahrenheitDTO() {
    }

    public FahrenheitDTO(double valueInFahrenheit) {
        this.valueInFahrenheit = valueInFahrenheit;
    }

    public double getValueInFahrenheit() {
        return valueInFahrenheit;
    }

    public void setValueInFahrenheit(double valueInFahrenheit) {
        this.valueInFahrenheit = valueInFahrenheit;
    }
}
