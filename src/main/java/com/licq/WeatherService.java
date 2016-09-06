package com.licq;

import java.util.Random;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("weather")
public class WeatherService {
	private static String[] wtGrp ={"晴天","小雨","中雨","雷阵雨","暴雨","小雪","中雪","大雪","晴转多云"};
	/**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "application/json" media type.
     *
     * @return String that will be returned as a application/json response.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("v1/{city}")
    public String getWeather(@PathParam("city") String city ) {
    	String response = "{\"city\":"+city+",\"weather\":\""+wtGrp[new Random().nextInt(wtGrp.length)]+"\"}";
        return response;
    }
}
