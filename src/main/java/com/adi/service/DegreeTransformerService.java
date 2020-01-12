package com.adi.service;

import com.adi.commons.dto.CelsiusDTO;
import com.adi.commons.dto.FahrenheitDTO;
import com.adi.commons.mapper.CelsiusMapper;
import com.adi.commons.mapper.FahrenheitMapper;
import com.adi.model.Celsius;
import com.adi.model.Fahrenheit;

public class DegreeTransformerService {
    public static CelsiusDTO fahrenheitToCelsius(FahrenheitDTO fahrenheitDTO) {
        Fahrenheit fahrenheit = FahrenheitMapper.fahrenheitDTOtoFahrenheit(fahrenheitDTO);
        Celsius celsius = new Celsius(fahrenheit.toCelsius());
        return CelsiusMapper.celsiusToCelsiusDTO(celsius);
    }

    public static FahrenheitDTO celsiusToFahrenheit(CelsiusDTO celsiusDTO) {
        Celsius celsius = CelsiusMapper.celsiusDTOtoCelsius(celsiusDTO);
        Fahrenheit fahrenheit = new Fahrenheit(celsius.toFahrenheit());
        return FahrenheitMapper.fahrenheitToFahrenheitDTO(fahrenheit);
    }
}
