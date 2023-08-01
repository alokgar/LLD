package Observable;

import Observer.StockObserver;

public interface StockObservable {
    public void add(StockObserver observer);
    public void remove(StockObserver observer);
    public void notifyObservers();
    public void addStockCount(int stockCount); // setter method
    public int getStockCount();
}
