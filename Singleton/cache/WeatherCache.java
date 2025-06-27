package cache;

import java.util.HashMap;
import java.util.Map;

public class WeatherCache {
    private static volatile WeatherCache instance;
    private static final Object lock = new Object();

    private final Map<String, String> weatherData;

    private WeatherCache() {
        System.out.println("[Singleton] WeatherCache instance created");
        weatherData = new HashMap<>();
    }

    public static WeatherCache getInstance() {
        if (instance == null) {
            synchronized (lock) {
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
