package main;

public enum Cheese {

	MOZZARELLA, 
	CHEEDAR, 
	FETA;

	@Override
	public String toString() {
		return name().toLowerCase();
	}

}
