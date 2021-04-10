package main;

public enum Crust {

	ROMA("roma"), 
	NAPOLI("napoli");

	private String crust;

	Crust(String crust) {
		this.crust = crust;
	}

	@Override
	public String toString() {
		return crust;
	}

}
