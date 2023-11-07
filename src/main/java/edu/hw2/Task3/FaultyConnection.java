package edu.hw2.Task3;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FaultyConnection implements Connection {
    private static final Logger LOGGER = LogManager.getLogger();
    @Override
    public void execute(String command) {
        LOGGER.info("Faulty connection:\n" + command);
        double rnd = Math.random();

        if (rnd > 0.5) {
            throw new ConnectionException();
        }
    }

    @Override
    public void close() throws Exception { }
}
