### 3.2_Patterns_Level1
## Builder
Develop a pizza order management system using the Builder design pattern in Java. The system should allow the creation of different types of pizzas with different size, dough, and topping configurations.

Define a Pizza class with the following attributes:
* size
* dough
* toppings

Create a PizzaBuilder interface with the methods needed to configure the size, dough, and toppings of a pizza.

Implement one or more classes that act as specific builders (PizzaBuilder) for different types of pizzas. For example, you could have a builder for Hawaiian pizza, another for vegetarian pizza, and so on.

Develop a MestrePizzer class that receives a PizzaBuilder and allows you to build pizzas in a specific way.

In the main program (Main), create instances of PizzaBuilder and MestrePizzer, and use them to build pizzas with different configurations.
