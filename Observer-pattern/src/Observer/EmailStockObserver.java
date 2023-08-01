package Observer;

import Observable.StockObservable;

public class EmailStockObserver implements StockObserver {
    String userName;
    StockObservable observable;

    public EmailStockObserver(String userName, StockObservable observable){
        this.userName = userName;
        this.observable = observable;
    }
    @Override
    public void update() {
        int currentStockCount = observable.getStockCount();
        System.out.println("Dear " + userName + ", Hurry Samsung mobile stock count got updated to " + currentStockCount
        + ".");
    }
}
