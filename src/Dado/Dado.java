package Dado;
import java.util.Random;
import javax.imageio.*;
import java.awt.*;
import java.io.*;
public class Dado {

	private int val;
	
	public Dado() {
		
		Random rand = new Random();
		
		val = rand.nextInt(6) + 1;
	}
	
	public int getVal() {
		
		return val;
}
	public void capturar() {
		
		Image i;
		
		//aqui se faz a captura da imagem
		try {
			switch(val) {
				case 1:
					i = ImageIO.read(new File("Dado1.png"));
					
					break;
				case 2:
					i = ImageIO.read(new File("Dado2.png"));
					break;
				case 3:
					i = ImageIO.read(new File("Dado3.png"));
					break;
				case 4:
					i = ImageIO.read(new File("Dado4.png"));
					break;
				case 5:
					i = ImageIO.read(new File("Dado5.png"));
					break;
				case 6:
					i = ImageIO.read(new File("Dado6.png"));
					break;
			}
		}
		catch(IOException e){
			System.out.println(e.getMessage());
			System.exit(1);
		}
		
	}
	
		
	
}
