import Dado.*;
import Frames.*;

public class Main {

	public static void main(String[] args) {
		GameFrame main = new GameFrame();
		Board board = new Board();
		
		main.add(board);
		main.setVisible(true);
		
		Dado roll = new Dado();
		
		System.out.println(roll.getVal());
	}
}
