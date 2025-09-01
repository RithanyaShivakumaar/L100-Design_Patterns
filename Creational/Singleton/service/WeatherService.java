package service;

public class WeatherService {

    public static String fetchWeatherFromAPI(String city) {
        try {
            // Simulate the time it takes to make an API call
            // In real-world: this could be 100ms to several seconds
            System.out.println("Fetching weather for " + city + " from API...");
            
            // Simulate network delay and API processing time
            // This 1-second delay demonstrates the performance benefit of caching
            Thread.sleep(1000);  
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Return mock weather data
        return "Sunny in " + city;
    }
}
