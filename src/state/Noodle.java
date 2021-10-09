package state;

public class Noodle {
	State newNoodlesState;
	State dryState;
	State wetState;
	State hardState;
	State softState;
	State brokenState;
	State state;
	
	public Noodle() {
		newNoodlesState = new NewNoodlesState(this);
		dryState = new DryStateNoodles(this);
		wetState = new WetStateNoodles(this);
		hardState = new HardStateNoodles(this);
		softState = new SoftStateNoodles(this);
		brokenState = new BrokenStateNoodles(this);
		state = newNoodlesState;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public State getnewNoodlesState() {
		return newNoodlesState;
	}
	public State getdryState() {
		return dryState;
	}
	public State getwetState() {
		return wetState;
	}
	public State gethardState() {
		return hardState;
	}
	public State getsoftState() {
		return softState;
	}
	public State getbrokenState() {
		return brokenState;
	}
	public void getnewNoodles() {
		state.getnewNoodles();
	}
	public void dryNoodles() {
		state.dryNoodles();
	}
	public void wetNoodles() {
		state.wetNoodles();
	}
	public void hardNoodles() {
		state.hardNoodles();
	}
	public void softNoodles() {
		state.softNoodles();
	}
	public void BrokenNoodles() {
		state.BrokenNoodles();
	}
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("\n----------Noodle preparation --------\n");
		
		result.append("Noodless " + state + "\n");
		
		return result.toString();
	}
	
	
	
}
