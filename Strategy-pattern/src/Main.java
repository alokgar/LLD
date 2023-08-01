
import Vehicles.*;

public class Main {
    public static void main(String[] args) {
        Vehicle sportyVehicle = new SportyVehicle();
        sportyVehicle.drive();
        Vehicle normalVehicle = new NormalVehicle();
        normalVehicle.drive();
    }
}