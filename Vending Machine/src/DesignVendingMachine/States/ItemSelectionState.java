package DesignVendingMachine.States;

import DesignVendingMachine.Coin;
import DesignVendingMachine.*;

public class ItemSelectionState extends State {

    @Override
    public void clickInsertCoinButton(VendingMachine vm) throws Exception {
        throw new Exception("Invalid steps");
    }

    @Override
    public void chooseProduct(VendingMachine vm, int code) throws Exception {
        Inventory inventory = vm.getInventory();
        ItemShelf[][] itemlist = inventory.itemList;
        boolean itemFound = false;
        for(int i = 0; i < itemlist.length; i++){
            if(itemFound == true) break;
            for(int j = 0; j < itemlist[0].length; j++){
                if(itemFound == true) break;
                ItemShelf itemShelf = itemlist[i][j];
                if(itemShelf.code == code){
                    vm.setState(new DispenseState(vm, i, j));
                    itemFound = true;
                }
            }
        }
    }

    @Override
    public void clickCancelOrRefund(VendingMachine vm) throws Exception {
        getChange(vm, 0);
        vm.setState(new IdleState());
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
