package DesignVendingMachine;
import DesignVendingMachine.*;

public class Inventory {
    public ItemShelf[][] itemList;

    public Inventory(){
        this.itemList = new ItemShelf[2][3];
        fillInventory();
    }

    private void fillInventory(){
        itemList[0][0] = new ItemShelf(
                101,
                true,
                new Item(ItemType.CAKE, "Britannia", 10)
        );

        itemList[0][1] = new ItemShelf(
                102,
                true,
                new Item(ItemType.CHIPS, "Lays", 20)
        );

        itemList[0][2] = new ItemShelf(
                103,
                true,
                new Item(ItemType.CHOCLATE, "KitKat", 15)
        );

        itemList[1][0] = new ItemShelf(
                201,
                true,
                new Item(ItemType.JUICE, "Real", 30)
        );

        itemList[1][1] = new ItemShelf(
                202,
                true,
                new Item(ItemType.COLD_DRINK, "Coca Cola", 45)
        );

        itemList[1][2] = new ItemShelf(
                203,
                true,
                new Item(ItemType.ICECREAM, "Baskin Robins", 125)
        );
    }

    public void displayInventory(){
        for(int i = 0; i < itemList.length; i++){
            System.out.print("[ ");
            for(int j = 0; j < itemList[0].length; j++){
                Item item = itemList[i][j].item;
                System.out.print(item.brand + " " + item.type + "   ");
            }
            System.out.println(" ]");
        }
    }

}
