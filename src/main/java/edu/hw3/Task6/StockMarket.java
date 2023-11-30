package edu.hw3.Task6;


public interface StockMarket {
    /** Добавить акцию */
    void add(Stock stock);

    /** Самая дорогая акция */
    Stock mostValuableStock();
}
