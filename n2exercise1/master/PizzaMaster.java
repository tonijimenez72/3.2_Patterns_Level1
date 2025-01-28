package n2exercise1.master;

import n2exercise1.enums.PizzaType;
import n2exercise1.builder.HawaiianPizzaBuilder;
import n2exercise1.builder.PizzaBuilder;
import n2exercise1.builder.VegetarianPizzaBuilder;

public class PizzaMaster {

    public static PizzaBuilder builder (PizzaType type) {
        if (type==PizzaType.HAWAIIAN)
            return new HawaiianPizzaBuilder();
        if (type==PizzaType.VEGETARIAN)
            return new VegetarianPizzaBuilder();
        else
            return null;
    }
}