package state;

public class ChickenNoodlesBuilder extends NoodlesBuilder {
	public ChickenNoodlesBuilder(){
		this.name="Chicken Noodles";
	}
	@Override
	public NoodlesBuilder addEgg() {
		return this;
	}

	@Override
	public NoodlesBuilder addCabbage() {
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
		this.Ingredients.add("Chicken");
		return this;
	}
	

}
