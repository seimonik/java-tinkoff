package edu.hw7.Task4;

import java.util.concurrent.ThreadLocalRandom;

public class MonteCarloMethod {
    private static final double RADIUS = 1;
    private static final Point CENTER = new Point(RADIUS, RADIUS);

    @SuppressWarnings("MagicNumber")
    public double calculatePi(int pointsAmount) {
        int circleCount = 0;
        int totalCount = 0;

        for (int i = 0; i < pointsAmount; i++) {
            Point randomPoint = getRandomPoint();
            if (isInCircle(randomPoint)) {
                circleCount++;
            }
            totalCount++;
        }

        return 4 * ((double) circleCount / totalCount);
    }

    private double getDistance(Point a, Point b) {
        return Math.sqrt(Math.pow((a.x - b.x), 2) + Math.pow((a.y - b.y), 2));
    }

    private boolean isInCircle(Point point) {
        return getDistance(CENTER, point) <= RADIUS;
    }

    private Point getRandomPoint() {
        return new Point(
            ThreadLocalRandom.current().nextDouble(0, 2 * RADIUS),
            ThreadLocalRandom.current().nextDouble(0, 2 * RADIUS)
        );
    }

    private record Point(double x, double y) {
    }
}
