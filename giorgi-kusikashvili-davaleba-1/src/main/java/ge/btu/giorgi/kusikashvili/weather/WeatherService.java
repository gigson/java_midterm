package ge.btu.giorgi.kusikashvili.weather;

import ge.btu.giorgi.kusikashvili.weather.model.DirectionType;
import ge.btu.giorgi.kusikashvili.weather.model.Weather;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("")
public class WeatherService {

    private final List<Weather> weatherList = new ArrayList<>();

    public WeatherService() {
        weatherList.add(new Weather("Tbilisi", 20, 20, 20, DirectionType.EAST, 20));
        weatherList.add(new Weather("Batumi", 20, 20, 20, DirectionType.EAST, 20));
        weatherList.add(new Weather("Kutaisi", 20, 20, 20, DirectionType.EAST, 20));
    }


    @GET
    @Path("/weather")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Weather> getWeather() {
        return weatherList;
    }

    @GET
    @Path("/weather/{city}")
    @Produces(MediaType.APPLICATION_JSON)
    public Object getWeather(@PathParam("city") String city) {
        for (Weather weather : weatherList) {
            if (weather.getCityName().equals(city)) {
                return weather;
            }
        }

        return Response.status(Response.Status.NOT_FOUND).build();
    }

}