import interfaces.WeatherService;
import weather_adapters.*;
import apis.*;

public class WeatherDashboard {
    public static void main(String[] args) {
        WeatherService[] sources = {
            new AccuWeatherAdapter(new AccuWeatherAPI()),
            new OpenWeatherAdapter(new OpenWeatherAPI()),
            new WeatherStackAdapter(new WeatherStackAPI())
        };
        

        double total = 0;
        for (WeatherService service : sources) {
            double temp = service.getTemperatureCelsius();
            System.out.printf("Temperature from %s: %.2f  deg C%n", service.getSource(), temp);
            total += temp;
        }

        double avg = total / sources.length;
        System.out.printf("Average Temperature: %.2f deg C%n", avg);
    }
}
