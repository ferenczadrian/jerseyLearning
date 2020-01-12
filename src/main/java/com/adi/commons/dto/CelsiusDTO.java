package com.adi.commons.dto;

public class CelsiusDTO {
    private double valueInCelsius;

    public CelsiusDTO() {
    }

    public CelsiusDTO(double valueInCelsius) {
        this.valueInCelsius = valueInCelsius;
    }

    public double getValueInCelsius() {
        return valueInCelsius;
    }

    public void setValueInCelsius(double valueInCelsius) {
        this.valueInCelsius = valueInCelsius;
    }
}
