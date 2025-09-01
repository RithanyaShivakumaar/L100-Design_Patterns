import threadtest.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Define cities to request weather for
        // Note: Chennai and Mumbai appear twice to test cache efficiency
        String[] cities = {"Chennai", "Mumbai", "Chennai", "Delhi", "Mumbai"};

        // Create an array to hold all our weather request threads
        Thread[] threads = new Thread[cities.length];

        // Create and start each thread with a specific city
        for (int i = 0; i < cities.length; i++) {
            // Create a new thread that will request weather for a specific city
            threads[i] = new WeatherRequestThread(cities[i]);
            
            // Give each thread a meaningful name for debugging
            threads[i].setName("Thread-" + i);
            
            // Start the thread - it will begin executing immediately
            // All threads start concurrently, simulating real-world concurrent users
            threads[i].start();
        }

        // Wait for all threads to complete before ending the program
        // This ensures we see all the output before the program exits
        for (Thread t : threads) {
            t.join(); // Wait for this specific thread to finish
        }

        // All threads have completed
        System.out.println("All weather data fetched or retrieved from cache.");
    }
}
