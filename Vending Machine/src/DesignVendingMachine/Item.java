package DesignVendingMachine;

public class Item {
    public ItemType type;
    public String brand;
    public int price;

    public Item(ItemType type, String brand, int price){
         this.type = type;
         this.brand = brand;
         this.price = price;
    }
}
