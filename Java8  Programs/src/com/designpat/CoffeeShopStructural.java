package com.designpat;


abstract class Beverage {
	private String description;
    
	public Beverage(String description) {
		super();
		this.description = description;
	}
    
	public String getDescription() {
		return description;
	}
    
	public abstract double cost();
}


 class HouseBlend extends Beverage {
	public HouseBlend() {
		super("House blend");
	}

	@Override
	public double cost() {
		return 250;
	}
}

 class DarkRoast extends Beverage {
	public DarkRoast() {
		super("Dark roast");
	}

	@Override
	public double cost() {
		return 300;
	}
}

 abstract class AddOn extends Beverage {
	protected Beverage beverage;

	public AddOn(String description, Beverage bev) {
		super(description);
		this.beverage = bev;
	}

	public abstract String getDescription();
}

 class Sugar extends AddOn {
	public Sugar(Beverage bev) {
		super("Sugar", bev);
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " with Mocha";
	}

	@Override
	public double cost() {
		return beverage.cost() + 50;
	}
}

 class Milk extends AddOn {
	public Milk(Beverage bev) {
		super("Milk", bev);
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " with Milk";
	}

	@Override  public double cost() {
		return beverage.cost() + 100;
	}
}
public class CoffeeShopStructural {
	public static void main(String[] args) {
		HouseBlend houseblend = new HouseBlend();
		System.out.println(houseblend.getDescription() + ":" + houseblend.cost());

		Milk milkAddOn = new Milk(houseblend);
		System.out.println(milkAddOn.getDescription() + ":" + milkAddOn.cost());

		Sugar sugarAddOn = new Sugar(milkAddOn);
		System.out.println(sugarAddOn.getDescription() +":" + sugarAddOn.cost());
	}
}
