package state;

public class NewNoodlesState implements State {
	Noodle noodle;
	public NewNoodlesState(Noodle noodle) {
		this.noodle = noodle;
	}
	@Override
	public void getnewNoodles() {
		System.out.println("Preparing  noodles....");
		
		NoodlesBuilder builder=new ChickenNoodlesBuilder();
		NoodlesType type=builder.addCabbage().addChicken().addGreenChilli().addEgg().addPepper().addSalt().addSoyaSauce().build();
		
		type.prepare();

		type.BoiledWater();
		type.RemoveWater();
		type.AllIngredients();
		System.out.println(type);
		builder=new EggnoodlesBuilder();
		type=builder.addCabbage().addChicken().addGreenChilli().addEgg().addPepper().addSalt().addSoyaSauce().build();
		
		type.prepare();

		type.BoiledWater();
		type.RemoveWater();
		type.AllIngredients();
		System.out.println(type);
	}
	@Override
	public void dryNoodles() {
		System.out.println("dry noodles");
		
	}
	@Override
	public void wetNoodles() {
		System.out.println("wet noodles");
		noodle.setState(noodle.getdryState());		
	}
	@Override
	public void hardNoodles() {
		System.out.println("hard noodles");
		noodle.setState(noodle.getwetState());		
	}
	@Override
	public void softNoodles() {
		System.out.println("soft noodles");
		noodle.setState(noodle.getdryState());		
	}
	@Override
	public void BrokenNoodles() {
		System.out.println("Broken noodles");
		noodle.setState(noodle.getwetState());
	}
	public String toString() {
		return "New Noodles State";
	}
}

	