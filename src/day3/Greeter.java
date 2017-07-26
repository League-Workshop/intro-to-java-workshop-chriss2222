package day3;

import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What is Your Name?");
		JOptionPane.showMessageDialog(null, "Hello "+ name);
		JOptionPane.showInputDialog("How are you?");
		JOptionPane.showMessageDialog(null, "Goodbye");
		
		
		

	}

}
