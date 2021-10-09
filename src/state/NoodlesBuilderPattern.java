package state;

public class NoodlesBuilderPattern {
	public static void main(String[] args) {
	Noodle noodle=new Noodle();
	noodle.getnewNoodles();
	noodle.BrokenNoodles();
	noodle.dryNoodles();
	noodle.softNoodles();
	noodle.getnewNoodles();
	System.out.println(noodle);
}
}
