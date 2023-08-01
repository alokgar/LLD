package DesignVendingMachine;

import java.util.ArrayList;
import java.util.List;
import DesignVendingMachine.States.*;

public class VendingMachine {
    private State state;
    private Inventory inventory;
    private List<Coin> coins;

    public VendingMachine(){
        this.inventory = new Inventory();
        this.coins = new ArrayList<>();
        this.state = new IdleState();
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return this.state;
    }

    public Inventory getInventory(){
        return this.inventory;
    }

    public void setCoins(Coin coin){
        this.coins.add(coin);
    }

    public List<Coin> getCoins(){
        return this.coins;
    }

    public void clearCoins(){
        this.coins = new ArrayList<>();
        return;
    }

    public void removeItemFromInventory(int rowPosition, int columnPosition){
        this.inventory.itemList[rowPosition][columnPosition].isAvailable = false;
    }

    public int getTotalMoneyAdded(){
        int totalMoney = 0;
        for(Coin coin : this.coins){
            totalMoney += coin.value;
        }
        return totalMoney;
    }
}
