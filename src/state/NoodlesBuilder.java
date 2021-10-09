package state;

import java.util.ArrayList;
import java.util.List;

public abstract class NoodlesBuilder {
	
	String name;
	List<String> Ingredients = new ArrayList<String>();
	public abstract NoodlesBuilder addEgg();
	public abstract NoodlesBuilder addCabbage();
	public abstract NoodlesBuilder addPepper();
	public abstract NoodlesBuilder addGreenChilli();
	public abstract NoodlesBuilder addSoyaSauce();
	public abstract NoodlesBuilder addSalt();
	public abstract NoodlesBuilder addChicken();

	public NoodlesType build() {
		NoodlesType type = new NoodlesType();

		type.setName(this.name);
		type.addParts(Ingredients);
		return type;
	}
}
