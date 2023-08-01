package DesignVendingMachine.States;

import DesignVendingMachine.Coin;
import DesignVendingMachine.*;

public class DispenseState extends State {
    ItemShelf itemShelf;
    int itemRowPosition;
    int itemColumnPosition;

    public DispenseState(VendingMachine vm, int rowPosition, int columnPosition){
        this.itemShelf = vm.getInventory().itemList[rowPosition][columnPosition];
        this.itemRowPosition = rowPosition;
        this.itemColumnPosition = columnPosition;
    }

    @Override
    public void clickInsertCoinButton(VendingMachine vm) throws Exception {
        throw new Exception("Invalid steps");
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
        if(vm.getTotalMoneyAdded() < itemShelf.item.price) {
            System.out.println("Insufficient Balance");
            getChange(vm, 0);
        }
        else if(itemShelf.isAvailable == false) {
            System.out.println("Sorry Item not available");
            getChange(vm, 0);
        }
        else{
            System.out.println("Please Collect Your " +
                    itemShelf.item.brand + " " + itemShelf.item.type +
                    " from the dispense tray" );
            vm.removeItemFromInventory(itemRowPosition, itemColumnPosition);
            getChange(vm, itemShelf.item.price);
        }
        vm.setState(new IdleState());
    }
}
