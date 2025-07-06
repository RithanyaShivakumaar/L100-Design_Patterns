package without_adapter;
public class WeatherDashboardWithoutAdapter {

    public static void main(String[] args) {
        // AccuWeather - Fahrenheit
        AccuWeatherAPI accuWeather = new AccuWeatherAPI();
        double f = accuWeather.fetchTemperatureFahrenheit();
        double c1 = (f - 32) * 5 / 9;

        // OpenWeather - Kelvin
        OpenWeatherAPI openWeather = new OpenWeatherAPI();
        double k = openWeather.getKelvinTemp();
        double c2 = k - 273.15;

        // WeatherStack - JSON-like String
        WeatherStackAPI weatherStack = new WeatherStackAPI();
        String json = weatherStack.getWeatherData();

        // Manual parsing logic
        int start = json.indexOf(":") + 1;
        int end = json.indexOf(",", start);
        double k2 = Double.parseDouble(json.substring(start, end).trim());
        double c3 = k2 - 273.15;

        System.out.printf("Temperature from AccuWeather: %.2f °C%n", c1);
        System.out.printf("Temperature from OpenWeather: %.2f °C%n", c2);
        System.out.printf("Temperature from WeatherStack: %.2f °C%n", c3);

        double avg = (c1 + c2 + c3) / 3;
        System.out.printf("Average Temperature: %.2f °C%n", avg);
    }
}

// Simulated APIs

class AccuWeatherAPI {
    public double fetchTemperatureFahrenheit() {
        return 98.6;
    }
}

class OpenWeatherAPI {
    public double getKelvinTemp() {
        return 310.15;
    }
}

class WeatherStackAPI {
    public String getWeatherData() {
        return "{\"temperature\": 301.15, \"unit\": \"kelvin\"}";
    }
}
