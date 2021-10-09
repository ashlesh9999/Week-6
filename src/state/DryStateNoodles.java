package state;

public class DryStateNoodles implements State {
	Noodle noodle;
	public DryStateNoodles(Noodle noodle) {
		this.noodle = noodle;
	}
	@Override
	public void getnewNoodles() {
		System.out.println("Preparing  noodles....");

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
		return "Dry State Noodles";
	}
}

	