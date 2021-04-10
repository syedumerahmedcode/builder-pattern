package main;

public enum Size {
	SMALL("25"), 
	MEDIUM("35"), 
	LARGE("45");

	private String size;

	Size(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return size + "cm";
	}

}
