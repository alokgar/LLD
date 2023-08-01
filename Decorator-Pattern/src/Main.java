import BasePizzas.*;
import ToppingDecorators.*;

public class Main {
    public static void main(String[] args) {
        // customer orders Extra Cheese + Veg Delight
        BasePizza pizzaOrder1 = new ExtraCheeseDecorator(new VegDelightPizza());
        System.out.println(pizzaOrder1.getOrderDetails());
        System.out.println(pizzaOrder1.getCost());

        // customer orders Extra Mushroom + Extra Cheese + Margerita pizza
        BasePizza pizzaOrder2 = new ExtraMushroomDecorator(new ExtraCheeseDecorator(new MargeritaPizza()));
        System.out.println(pizzaOrder2.getOrderDetails());
        System.out.println(pizzaOrder2.getCost());
    }
}