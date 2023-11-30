package edu.hw3;

import edu.hw3.Task6.Stock;
import edu.hw3.Task6.StockMarket;
import edu.hw3.Task6.Task6;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task6Test {
    @Test
    void test() {
        StockMarket stockMarket = new Task6();
        stockMarket.add(new Stock("Аэрофлот", 40));
        stockMarket.add(new Stock("QIWI", 620));
        stockMarket.add(new Stock("Яндекс", 2600));

        Stock stock = stockMarket.mostValuableStock();

        assertEquals(stock, new Stock("Яндекс", 2600));
    }

}
