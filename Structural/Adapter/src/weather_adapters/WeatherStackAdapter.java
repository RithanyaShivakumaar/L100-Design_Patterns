package weather_adapters;

import interfaces.WeatherService;
import apis.WeatherStackAPI;

public class WeatherStackAdapter implements WeatherService {
    private WeatherStackAPI api;

    public WeatherStackAdapter(WeatherStackAPI api) {
        this.api = api;
    }

    @Override
    public double getTemperatureCelsius() {
        String json = api.getWeatherData();
        // Example: {"temperature": 301.15, "unit": "kelvin"}

        // Very basic parsing for demo purposes
        int start = json.indexOf(":") + 1;
        int end = json.indexOf(",", start);
        String tempStr = json.substring(start, end).trim();

        double kelvin = Double.parseDouble(tempStr);
        return kelvin - 273.15;
    }

    @Override
    public String getSource() {
        return "WeatherStack";
    }
}
