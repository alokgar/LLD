import Observable.*;
import Observer.*;

public class Store {
    public static void main(String[] args) {
        StockObservable samsungMobileStockObservableObject = new SamsungStockObservable();
        // user-1 clicked notify me
        StockObserver observer1 = new EmailStockObserver("Alok Garg", samsungMobileStockObservableObject);
        samsungMobileStockObservableObject.add(observer1);

        // user-2 clicked notify me
        StockObserver observer2 = new MessageStockObserver("9799053931", samsungMobileStockObservableObject);
        samsungMobileStockObservableObject.add(observer2);

        samsungMobileStockObservableObject.addStockCount(100);
        //samsungMobileStockObservableObject.addStockCount(0);
        samsungMobileStockObservableObject.addStockCount(200);

    }
}