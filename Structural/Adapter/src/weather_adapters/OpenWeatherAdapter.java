package weather_adapters;

import interfaces.WeatherService;
import apis.OpenWeatherAPI;

public class OpenWeatherAdapter implements WeatherService {
    private OpenWeatherAPI api;

    public OpenWeatherAdapter(OpenWeatherAPI api) {
        this.api = api;
    }

    @Override
    public double getTemperatureCelsius() {
        double k = api.getKelvinTemp();
        return k - 273.15;
    }

    @Override
    public String getSource() {
        return "OpenWeather";
    }
}
