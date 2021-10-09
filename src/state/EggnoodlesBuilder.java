package state;

public class EggnoodlesBuilder extends NoodlesBuilder{
	public EggnoodlesBuilder() {
		this.name="Egg Noodles";
	}
	
	@Override
	public NoodlesBuilder addEgg() {
		this.Ingredients.add("Eggs");
		return this;
	}

	@Override
	public NoodlesBuilder addCabbage() {
		this.Ingredients.add("cabbage");
		return this;
	}

	@Override
	public NoodlesBuilder addPepper() {
		this.Ingredients.add("Pepper");
		return this;
	}

	@Override
	public NoodlesBuilder addGreenChilli() {
		this.Ingredients.add("Green Chilli");
		return this;
	}

	@Override
	public NoodlesBuilder addSoyaSauce() {
		this.Ingredients.add("SoyaSauce");
		return this;
	}

	@Override
	public NoodlesBuilder addSalt() {
		this.Ingredients.add("Salt");
		return this;
	}

	@Override
	public NoodlesBuilder addChicken() {
		return this;
	}

}
