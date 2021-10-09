package state;

import java.util.List;

public class NoodlesType {
	
	String name;
	List<String> Ingredients;
	public void addParts(List<String> ingredients) {
		this.Ingredients = ingredients;
	}
	void prepare() {
		System.out.println("Prepare " + name);
		for(String Ingredient: Ingredients) {
			System.out.println("   " + Ingredient);
		}
	}
	void BoiledWater() {
		System.out.println("Drop the Noodles in boiled water with salt added.");
	}
	void RemoveWater() {
		System.out.println("After 5mins, drain the cooked noodles in a colander or sieve. ");
	}
	void AllIngredients() {
		System.out.println("Add all the Ingredients according to your requirement.");
	}
	public void setName(String name) {
		this.name = name;

	}
	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("" + this.name + "\n");
		for(String Ingredient : Ingredients) {
			display.append(Ingredient + "\n");
		}
		return display.toString();
	}

}
