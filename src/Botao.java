package Frames;

import javax.swing.*;

public class Botao extends JPanel{
	
	JButton b1 = new JButton("Rolar");
	
	
	public Botao() {
		
		setLayout(null);
		b1.setBounds(700, 400, 100, 40);
		add(b1);
		
	}

}
