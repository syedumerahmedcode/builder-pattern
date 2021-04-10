package main;

import java.util.ArrayList;
import java.util.List;

final class Pizza {

	private final Base base;
	private final Size size;
	private final Crust crust;
	private final Cheese cheese;
	private List<Topping> topping;

	public Pizza(PizzaBuilder builder) {
		this.base = builder.base;
		this.size = builder.size;
		this.crust = builder.crust;
		this.cheese = builder.cheese;
		this.topping = builder.topping;
	}

	public Base getBase() {
		return base;
	}

	public Size getSize() {
		return size;
	}

	public Crust getCrust() {
		return crust;
	}

	public Cheese getCheese() {
		return cheese;
	}

	public List<Topping> getTopping() {
		return topping;
	}

	@Override
	public String toString() {
		StringBuilder descriptionOfPizza = new StringBuilder();

		describeBaseAndSize(descriptionOfPizza);
		describeCrust(descriptionOfPizza);
		describeCheese(descriptionOfPizza);
		describeToppings(descriptionOfPizza);

		return descriptionOfPizza.toString();
	}

	private void describeToppings(StringBuilder sb) {
		if (topping != null) {
			sb.append("In addition it has the following specialities on top: ");
			for (int i = 0; i < topping.size(); i++) {
				sb.append(topping.get(i));
				if (i < topping.size() - 1) {
					sb.append(", ");
				}
			}
			sb.append(". ");
		}
	}

	private void describeCheese(StringBuilder sb) {
		if (cheese != null) {
			sb.append("With softly and yummy ")
				.append(cheese)
				.append(" cheese. ")
				.append("\n");
		}
	}

	private void describeCrust(StringBuilder sb) {
		if (crust != null) {
			sb.append("surrounded by ")
				.append(crust)
				.append(" crust. ")
				.append("\n");
		}
	}

	private void describeBaseAndSize(StringBuilder sb) {
		sb.append("This is a typical ")
				.append(base)
				.append(" pizza of size ")
				.append(size)
				.append("\n");
	}

	/**
	 * Builder class
	 */
	public static class PizzaBuilder {

		private final Base base;
		private final Size size;
		private Crust crust;
		private Cheese cheese;
		private List<Topping> topping = new ArrayList<>();

		public PizzaBuilder(Base base, Size size) {
			throwExceptionIfBaseOrSizeAreNull(base, size);
			this.base = base;
			this.size = size;
		}

		private void throwExceptionIfBaseOrSizeAreNull(Base base, Size size) {
			if (base == null || size == null) {
				throw new IllegalArgumentException("base or size can't be null!");
			}
		}

		public PizzaBuilder crust(Crust crust) {
			this.crust = crust;
			return this;
		}

		public PizzaBuilder cheese(Cheese cheese) {
			this.cheese = cheese;
			return this;
		}

		public PizzaBuilder topping(Topping topping) {
			this.topping.add(topping);
			return this;
		}

		public Pizza build() {
			return new Pizza(this);
		}

	}
}