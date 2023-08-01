package DesignVendingMachine.States;

import DesignVendingMachine.Coin;
import DesignVendingMachine.VendingMachine;

public class IdleState extends State {
    @Override
    public void clickInsertCoinButton(VendingMachine vm) throws Exception {
        vm.setState(new MoneyCollectionState());
    }

    @Override
    public void chooseProduct(VendingMachine vm, int code) throws Exception {
        throw new Exception("Invalid steps");
    }

    @Override
    public void clickCancelOrRefund(VendingMachine vm) throws Exception {
        throw new Exception("Invalid steps");
    }

    @Override
    public void clickSelectProductButton(VendingMachine vm) throws Exception {
        throw new Exception("Invalid steps");
    }

    @Override
    public void insertCoin(VendingMachine vm) throws Exception {
        throw new Exception("Invalid steps");
    }

    @Override
    public void productDispense(VendingMachine vm) throws Exception {
        throw new Exception("Invalid steps");
    }
}
