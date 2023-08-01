package ToppingDecorators;

import BasePizzas.BasePizza;

public class ExtraMushroomDecorator extends ToppingDecorator {
    BasePizza pizza;

    public ExtraMushroomDecorator(BasePizza pizza){
        this.pizza = pizza;
    }
    @Override
    public int getCost() {
        return pizza.getCost() + 20;
    }

    @Override
    public String getOrderDetails() {
        return "Extra Mushroom " + pizza.getOrderDetails();
    }
}
