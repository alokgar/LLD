package ToppingDecorators;

import BasePizzas.BasePizza;

public class ExtraCheeseDecorator extends ToppingDecorator {
    BasePizza pizza;
    public ExtraCheeseDecorator(BasePizza pizza){
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 10;
    }

    @Override
    public String getOrderDetails() {
        return "Extra Cheese " + pizza.getOrderDetails();
    }
}
