package ge.btu.giorgi.kusikashvili.weather.model;

public class Weather {

    private String cityName;

    private double temperature;

    private double humidity;

    private double pressure;

    private DirectionType windDirection;

    private double windSpeed;


    public Weather(String cityName, double temperature, double humidity,
                   double pressure, DirectionType windDirection, double windSpeed) {
        this.cityName = cityName;
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.windDirection = windDirection;
        this.windSpeed = windSpeed;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public DirectionType getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(DirectionType windDirection) {
        this.windDirection = windDirection;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }
}
