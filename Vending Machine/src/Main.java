import DesignVendingMachine.*;
import DesignVendingMachine.States.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        boolean exit = false;
        while(exit == false){
            machine.getInventory().displayInventory();
            System.out.println("Press 1 : For clicking insert Coin");
            System.out.println("Press 2 : For display again");
            System.out.println("Press 3 : For Exit");
            int key1 = getPressedKey();
            if(key1 == 2) continue;
            if(key1 == 3){
                exit = true;
                continue;
            }
            try { machine.getState().clickInsertCoinButton(machine);} catch(Exception e){}
            boolean stopInsertingCoin = false;
            boolean hasUserCanceled = false;
            while(stopInsertingCoin == false){
                System.out.println("Press 1 : For inserting Coin");
                System.out.println("Press 2 : To stop inserting Coin");
                System.out.println("Press 3 : Cancel / Refund");
                int key2 = getPressedKey();
                if(key2 == 3) {
                    hasUserCanceled = true;
                    stopInsertingCoin = true;
                    try { machine.getState().clickCancelOrRefund(machine);} catch (Exception e) {}
                    continue;
                }
                else if(key2 == 2){
                    stopInsertingCoin = true;
                    continue;
                }
                else{
                    try { machine.getState().insertCoin(machine);} catch (Exception e) {}
                }
            }
            if(hasUserCanceled == true) continue;
            machine.getInventory().displayInventory();
            System.out.println("Please enter your items code : ");
            int code  = getPressedKey();
            try { machine.getState().clickSelectProductButton(machine);} catch (Exception e) {}
            boolean itemSelectionConfirmed = false;
            while(itemSelectionConfirmed == false){
                System.out.println("Press 1 : For Adding Code Again");
                System.out.println("Press 2 : For Confirming Code");
                System.out.println("Press 3 : For Cancel / Refund");
                int key3 = getPressedKey();
                if(key3 == 3) {
                    hasUserCanceled = true;
                    itemSelectionConfirmed = true;
                    try { machine.getState().clickCancelOrRefund(machine);} catch (Exception e) {}
                    continue;
                }
                else if(key3 == 2){
                    itemSelectionConfirmed = true;
                    continue;
                }
                else{
                    System.out.println("Please enter your items code : ");
                    code  = getPressedKey();
                }
            }
            if(hasUserCanceled == true) continue;
            try { machine.getState().chooseProduct(machine, code);} catch (Exception e) {}
            try { machine.getState().productDispense(machine);} catch (Exception e) {}
        }
        System.out.println("Thank You For Choosing Our Vending Machine");
    }

    public static int getPressedKey(){
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        return Integer.parseInt(input);
    }
}