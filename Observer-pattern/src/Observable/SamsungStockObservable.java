package Observable;

import Observer.StockObserver;

import java.util.ArrayList;
import java.util.List;

public class SamsungStockObservable implements StockObservable {
    int stockCount;
    List<StockObserver> observers;

    public SamsungStockObservable(){
        this.stockCount = 0;
        this.observers = new ArrayList<StockObserver>();
    }
    @Override
    public void add(StockObserver observer) {
        observers.add(observer);
    }

    @Override
    public void remove(StockObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(StockObserver observer : observers){
            observer.update();
        }
    }

    @Override
    public void addStockCount(int newStockCount) {
        if(stockCount == 0) {
            stockCount = newStockCount;
            notifyObservers();
        }
        else{
            stockCount = newStockCount;
        }
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
