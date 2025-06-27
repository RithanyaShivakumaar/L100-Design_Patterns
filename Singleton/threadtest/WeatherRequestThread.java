package threadtest;

import cache.WeatherCache;
import service.WeatherService;

public class WeatherRequestThread extends Thread {
    private final String city;

    public WeatherRequestThread(String city) {
        this.city = city;
    }

    @Override
    public void run() {
    WeatherCache cache = WeatherCache.getInstance();

    synchronized (cache) { 
        if (cache.contains(city)) {
            System.out.println("[" + Thread.currentThread().getName() + "] Got cached data: " + cache.get(city));
        } else {
            String data = WeatherService.fetchWeatherFromAPI(city);
            cache.put(city, data);
            System.out.println("[" + Thread.currentThread().getName() + "] Stored in cache: " + data);
        }
    }
}
}
