package DesignVendingMachine;

public class ItemShelf {
    public int code;
    public boolean isAvailable;
    public Item item;

    public ItemShelf(int code, boolean isAvailable, Item item){
        this.code = code;
        this.isAvailable = isAvailable;
        this.item = item;
    }

}
