package main;

public class Restaurant {
	
	public static void main(String[] args) {
		
		Pizza tunFishPizza=new Pizza.PizzaBuilder(Base.ROSSA, Size.MEDIUM)
									.crust(Crust.NAPOLI)
									.cheese(Cheese.CHEEDAR)
									.topping(Topping.CHERRY_TOMATO)
									.topping(Topping.GRILLED_VEG)
									.topping(Topping.HOT_SAUCE)
									.topping(Topping.TUNA)
									.topping(Topping.RICOTTA)
									.build();
		System.out.println(tunFishPizza.toString());
		
	}

}
