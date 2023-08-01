package BasePizzas;

public class MargeritaPizza implements BasePizza {
    @Override
    public int getCost() {
        return 100;
    }

    @Override
    public String getOrderDetails() {
        return "Margerita Pizza";
    }
}
