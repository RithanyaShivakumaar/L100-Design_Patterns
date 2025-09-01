package cache;

import java.util.HashMap;
import java.util.Map;

public class WeatherCache {
    // The single instance of WeatherCache - shared across all threads
    // 'volatile' ensures visibility of this variable across all threads
    private static volatile WeatherCache instance;
    
    // Lock object for synchronization during instance creation
    // Using a separate lock object is a best practice for better control
    private static final Object lock = new Object();

    // HashMap to store city -> weather data mappings
    // This is the actual cache storage that holds our weather information
    private final Map<String, String> weatherData;

    private WeatherCache() {
        System.out.println("[Singleton] WeatherCache instance created");
        weatherData = new HashMap<>();
    }

    public static WeatherCache getInstance() {
        // First check: if instance already exists, return it immediately
        // This is the fast path that avoids synchronization overhead
        if (instance == null) {
            // Synchronize only when we need to create the instance
            synchronized (lock) {
                // Second check: ensure instance is still null after acquiring lock
                // This prevents multiple threads from creating instances
                if (instance == null) {
                    instance = new WeatherCache();
                }
            }
        }
        return instance;
    }

    public boolean contains(String city) {
        return weatherData.containsKey(city);
    }

    public void put(String city, String data) {
        weatherData.put(city, data);
    }

    public String get(String city) {
        return weatherData.get(city);
    }
}
