import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BatchProcessor {
    public static void main(String[] args) {
        List<Data> data = ... // Load your data here

        // Create a thread pool
        ExecutorService executor = Executors.newFixedThreadPool(10);

        // Process data in batches
        int batchSize = 1000;
        for (int i = 0; i < data.size(); i += batchSize) {
            List<Data> batch = data.subList(i, Math.min(i + batchSize, data.size()));
            executor.submit(() -> processBatch(batch));
        }

        executor.shutdown();
    }

    private static void processBatch(List<Data> batch) {
        // Process the batch here
        for (Data data : batch) {
            // Perform database operations or other processing
        }
    }
}
