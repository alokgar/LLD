package Observer;

import Observable.StockObservable;

public class MessageStockObserver implements StockObserver {
    String mobileNo;
    StockObservable observable;

    public MessageStockObserver(String mobileNo, StockObservable observable){
        this.mobileNo = mobileNo;
        this.observable = observable;
    }
    @Override
    public void update() {
        int currentStockCount = observable.getStockCount();
        System.out.println("Dear Customer with MobileNo. " + mobileNo + ", Hurry Samsung mobile stock count got updated to " + currentStockCount
                + ".");
    }
}
