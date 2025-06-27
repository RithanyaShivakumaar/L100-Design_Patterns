package service;

public class WeatherService {

    public static String fetchWeatherFromAPI(String city) {
        try {
            // Simulate expensive API call
            System.out.println("Fetching weather for " + city + " from API...");
            Thread.sleep(1000);  // Simulated delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Sunny in " + city;
    }
}
