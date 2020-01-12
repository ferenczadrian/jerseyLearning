package com.adi.commons.mapper;

import com.adi.commons.dto.FahrenheitDTO;
import com.adi.model.Fahrenheit;

public class FahrenheitMapper {
    public static Fahrenheit fahrenheitDTOtoFahrenheit(FahrenheitDTO fahrenheitDTO) {
        return new Fahrenheit(fahrenheitDTO.getValueInFahrenheit());
    }

    public static FahrenheitDTO fahrenheitToFahrenheitDTO(Fahrenheit fahrenheit) {
        return new FahrenheitDTO(fahrenheit.getValue());
    }
}
