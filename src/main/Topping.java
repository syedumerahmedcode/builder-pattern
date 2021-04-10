package main;

public enum Topping {
	
	ASPARAGUS("asparagus"),
	BASIL("basil"),
    BLACK_OLIVES("black olives"),
    BURRATA("burrata"),
    CHERRY_TOMATO("cherry tomato"),
    CHILI_PEPPER("chili pepper"),
    FRENCH_FRIES("french fries"),
    GREEN_OLIVES("green olives"),
    GRILLED_VEG("grilled vegetables"),
    HOT_SAUCE("hot sauce"),
    MUSHROOM("mushroom"),
    ONION("onion"),
    OREGANO("oregano"),
    RICOTTA("ricotta"),
    PARSLEY("parsley"),
    SPINACH("spinach"),
    TOMATO("tomato"),
    TUNA("tuna"),
    ZUCCHINI("zucchini");
	
	private String topping;

	Topping(String topping) {
		this.topping = topping;
	}

	@Override
	public String toString() {
		return topping;
	}

}
