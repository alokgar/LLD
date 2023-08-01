package DesignVendingMachine.States;
import DesignVendingMachine.Coin;
import DesignVendingMachine.VendingMachine;

import java.util.List;

public abstract class State {
    // IdleState
    public abstract void clickInsertCoinButton(VendingMachine vm) throws Exception;
    // MoneyCollectionState
    public abstract void insertCoin(VendingMachine vm) throws Exception;
    public abstract void clickSelectProductButton(VendingMachine vm) throws Exception;
    public abstract void clickCancelOrRefund(VendingMachine vm) throws Exception;
    // ItemSelectionState
    public abstract void chooseProduct(VendingMachine vm,int code) throws Exception;
    // DispenseState
    public abstract void productDispense(VendingMachine vm) throws Exception;

    public void getChange(VendingMachine vm, int cost){
        List<Coin> coins = vm.getCoins();
        int totalSumReceived = 0;
        for(Coin coin : coins){
            totalSumReceived += coin.value;
        }
        int totalRefundEligible = totalSumReceived - cost;
        System.out.println("Please Collect Rs." + totalRefundEligible + " From The Refund Tray");
        vm.clearCoins();
    }
}

