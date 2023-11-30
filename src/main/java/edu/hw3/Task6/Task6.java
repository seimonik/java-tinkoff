package edu.hw3.Task6;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Task6 implements StockMarket {
    final Comparator<Stock> myComp = Comparator.comparingDouble(Stock::price).reversed();
    final PriorityQueue<Stock> stocks = new PriorityQueue<>(myComp);

    @Override
    public void add(Stock stock) {
        stocks.add(stock);
    }

    @Override
    public Stock mostValuableStock() {
        return stocks.peek();
    }
}
