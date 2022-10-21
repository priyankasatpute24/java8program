
package com.designpat;

abstract class Pizza {

	String description = "Basic Pizza";

	public String getDescription() {
		return description;
	}

	public abstract double Cost();
}

abstract class ToppingsDecorator extends Pizza {
	public abstract String getDescription();
}

class ThinkcrustPizza extends Pizza {
	public ThinkcrustPizza() {
		description = "ThinkcrustPizza";
	}

	public double Cost() {
		return 200;
	}
}

class ThincrustPizza extends Pizza {
	public ThincrustPizza() {
		description = "ThincrustPizza";
	}

	public double Cost() {
		return 200;
	}
}

class ThincrustPizzaCheese extends Pizza {
	public ThincrustPizzaCheese() {
		description = "ThincrustPizzaCheese";
	}

	public double Cost() {
		return 200;
	}
}




class ThincrustPizzaCheeseOlives extends ToppingsDecorator {

	Pizza pizza;

	public ThincrustPizzaCheeseOlives(Pizza pizza) {
		this.pizza = pizza;
	}

	public String getDescription() {
		return pizza.getDescription() + "Olive ";
	}

	public double Cost() {
		return 40 + pizza.Cost();
	}
}

public class DecoratorPatternExample {
	public static void main(String args[]) {

		Pizza pizza = new ThincrustPizzaCheese();
		System.out.println(pizza.getDescription() + " Cost :" + pizza.Cost());

		Pizza pizza2 = new ThincrustPizza();

		pizza2 = new ThincrustPizzaCheeseOlives(pizza2);

		System.out.println(pizza2.getDescription() + " Cost :" + pizza2.Cost());

	}
}