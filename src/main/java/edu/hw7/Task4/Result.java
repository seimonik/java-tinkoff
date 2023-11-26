package edu.hw7.Task4;

@SuppressWarnings("MagicNumber")
public class Result {
    private static final MonteCarloMethodParallel PARALLEL = new MonteCarloMethodParallel();
    private static final MonteCarloMethod CONCURRENT = new MonteCarloMethod();
    private static final double ORIGINAL_PI = Math.PI;

    public double averageExecutingTime;

    public double averageDelta;

    public void getResult(int simulations, int threadAmount) {
        double executingTimeSum = 0;
        double deltaSum = 0;

        for (int i = 0; i < simulations; i++) {
            var startTime = System.nanoTime();
            double val = PARALLEL.calculatePiAsync(threadAmount);
            var endTime = System.nanoTime();

            double delta = Math.abs(val - ORIGINAL_PI);

            executingTimeSum += convertNanosecondsToMilliseconds(endTime - startTime);
            deltaSum += delta;
        }

        averageExecutingTime = executingTimeSum / simulations;
        averageDelta = deltaSum / simulations;
    }

    private double convertNanosecondsToMilliseconds(double nanoseconds) {
        return nanoseconds / 1_000_000d;
    }
}
