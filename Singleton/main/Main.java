package main;

import threadtest.WeatherRequestThread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String[] cities = {"Chennai", "Mumbai", "Chennai", "Delhi", "Mumbai"};

        Thread[] threads = new Thread[cities.length];

        for (int i = 0; i < cities.length; i++) {
            threads[i] = new WeatherRequestThread(cities[i]);
            threads[i].setName("Thread-" + i);
            threads[i].start();
        }

        for (Thread t : threads) {
            t.join();
        }

        System.out.println("All weather data fetched or retrieved from cache.");
    }
}
