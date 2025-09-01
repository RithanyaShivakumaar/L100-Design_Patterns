package threadtest;

import cache.WeatherCache;
import service.WeatherService;

public class WeatherRequestThread extends Thread {
    // The city this thread will request weather for
    // Each thread represents one user asking for one city's weather
    private final String city;
    
    public WeatherRequestThread(String city) {
        this.city = city;
    }

    @Override
    public void run() {
        // Get the singleton cache instance
        WeatherCache cache = WeatherCache.getInstance();

        // Synchronize access to the cache to ensure thread safety
        // This prevents multiple threads from corrupting the cache data
        synchronized (cache) { 
            // STEP 1: Check if weather data already exists in cache
            if (cache.contains(city)) {
                // CACHE HIT: Data exists, return it instantly
                // This is the performance win - no API call needed!
                String cachedData = cache.get(city);
                System.out.println("[" + Thread.currentThread().getName() + 
                    "] Got cached data: " + cachedData);
                
            } else {
                // CACHE MISS: Data doesn't exist, need to fetch from API
                // This is the expensive operation that caching optimizes
                System.out.println("[" + Thread.currentThread().getName() + 
                    "] Cache miss for " + city + ", calling API...");
                
                // Fetch weather data from external API (expensive operation)
                String data = WeatherService.fetchWeatherFromAPI(city);
                
                // Store the fetched data in cache for future requests
                // This is the key to the caching strategy - future requests will be fast
                cache.put(city, data);
                
                // Log the successful cache storage
                System.out.println("[" + Thread.currentThread().getName() + 
                    "] Stored in cache: " + data);
            }
        }
        // Thread completes and terminates
    }
}
          