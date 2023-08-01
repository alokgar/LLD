package DesignVendingMachine.States;

import DesignVendingMachine.Coin;
import DesignVendingMachine.VendingMachine;
import java.util.Scanner;

public class MoneyCollectionState extends State {
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
        getChange(vm, 0);
        vm.setState(new IdleState());
    }

    @Override
    public void clickSelectProductButton(VendingMachine vm) throws Exception {
        vm.setState(new ItemSelectionState());
    }

    @Override
    public void insertCoin(VendingMachine vm) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your coins :  press " );
        System.out.println("0 for Penny, 1 for Dime, 2 for Nickel, 3 for Quarter");
        String input = scan.nextLine();
        int pressedKey = Integer.parseInt(input);
        switch(pressedKey) {
            case 0:
                vm.setCoins(Coin.PENNY);
                break;

            case 1:
                vm.setCoins(Coin.DIME);
                break;

            case 2:
                vm.setCoins(Coin.NICKEL);
                break;

            case 3:
                vm.setCoins(Coin.QUARTER);
                break;

            default:
                System.out.println("!!!!!!!!!!Wrong key pressed!!!!!!!");
                insertCoin(vm);
                break;
        }
        return;
    }

    @Override
    public void productDispense(VendingMachine vm) throws Exception {
        throw new Exception("Invalid steps");
    }

}
