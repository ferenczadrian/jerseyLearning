package com.adi.controller;

import com.adi.commons.dto.CelsiusDTO;
import com.adi.commons.dto.FahrenheitDTO;
import com.adi.service.DegreeTransformerService;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/transformer")
public class DegreeTransformerController {
    @GET
    @Path("/celsius")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response fahrenheitToCelsius(FahrenheitDTO fahrenheitDTO) {
        CelsiusDTO result = DegreeTransformerService.fahrenheitToCelsius(fahrenheitDTO);
        return Response.status(200).entity(result).build();
    }

    @GET
    @Path("/fahrenheit")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response fahrenheitToCelsius(CelsiusDTO celsiusDTO) {
        FahrenheitDTO result = DegreeTransformerService.celsiusToFahrenheit(celsiusDTO);
        return Response.status(200).entity(result).build();
    }
}
