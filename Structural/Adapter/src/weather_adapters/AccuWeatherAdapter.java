package weather_adapters;

import interfaces.WeatherService;
import apis.*;;

public class AccuWeatherAdapter implements WeatherService {
    private AccuWeatherAPI api;

    public AccuWeatherAdapter(AccuWeatherAPI api) {
        this.api = api;
    }

    @Override
    public double getTemperatureCelsius() {
        double f = api.fetchTemperatureFahrenheit();
        return (f - 32) * 5 / 9;
    }

    @Override
    public String getSource() {
        return "AccuWeather";
    }
}
