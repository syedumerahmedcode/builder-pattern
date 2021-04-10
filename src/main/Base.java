package main;

public enum Base {

	BIANCA, 
	ROSSA;

	@Override
	public String toString() {
		return name().toLowerCase();
	}
}
