package com.adi.commons.mapper;

import com.adi.commons.dto.CelsiusDTO;
import com.adi.model.Celsius;

public class CelsiusMapper {
    public static Celsius celsiusDTOtoCelsius(CelsiusDTO celsiusDTO) {
        return new Celsius(celsiusDTO.getValueInCelsius());
    }

    public static CelsiusDTO celsiusToCelsiusDTO(Celsius celsius) {
        return new CelsiusDTO(celsius.getValue());
    }
}
