package edu.hw2.Task3;

public class DefaultConnectionManager implements ConnectionManager {
    @Override
    public Connection getConnection() {
        double rnd = Math.random();

        if (rnd > 0.8) {
            return new FaultyConnection();
        }
        return new StableConnection();
    }
}
