package n2exercise1;

import n2exercise1.enums.PizzaType;
import n2exercise1.model.Pizza;

public class Main {
    public static void main(String[] args) {
        Pizza pizza1 = Pizza.builder(PizzaType.HAWAIIAN)
                .setSize("large")
                .setDough("ameican")
                .build();

        Pizza pizza2 = Pizza.builder(PizzaType.VEGETARIAN)
                .setSize("small")
                .setDough("special")
                .setExtraToppings("pepper", "olives")
                .build();

        System.out.println(pizza1.toString());
        System.out.println(pizza2.toString());
    }
}