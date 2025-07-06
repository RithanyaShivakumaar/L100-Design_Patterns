package weather.adapters;
public class AccuWeatherAdapter implements WeatherService {
    private AccuWeatherAPI api;

    public AccuWeatherAdapter(AccuWeatherAPI api) {
        this.api = api;
    }

    public double getTemperatureCelsius() {
        double f = api.fetchTemperatureFahrenheit();
        return (f - 32) * 5 / 9;
    }

    public String getSource() {
        return "AccuWeather";
    }
}
