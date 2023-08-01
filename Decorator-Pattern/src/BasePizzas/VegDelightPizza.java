package BasePizzas;

public class VegDelightPizza implements BasePizza {
    @Override
    public int getCost() {
        return 200;
    }

    @Override
    public String getOrderDetails() {
        return "Veg Delight Pizza";
    }
}
