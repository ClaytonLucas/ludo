package Dado;
import java.util.Random;

public class Dado {

	private int val;
	
	public Dado() {
		
		Random rand = new Random();
		
		val = rand.nextInt(6) + 1;
	}
	
	public int getVal() {
		
		return val;
	}
}
