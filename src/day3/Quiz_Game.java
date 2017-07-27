package day3;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Quiz_Game {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Welcome to the MATH Quiz");
		Timer t = new javax.swing.Timer(200, null);
		t.start();
		String word = JOptionPane.showInputDialog("What is cosine of 0?");
		if (word.equals("1")) {
			JOptionPane.showMessageDialog(null, "Good job!");
		} else {
			JOptionPane.showMessageDialog(null, "YOU FAILED!");
		}
		String number = JOptionPane
				.showInputDialog("A man walked into a car dealership. He bought a car" + " for $6000 and the final price was $7800. What was the amount of tax in percentage?");
		{
			if (number.equals("30%")) {
				JOptionPane.showMessageDialog(null, "Good Job");
			} else {
				JOptionPane.showMessageDialog(null, "YOU FAILED");
				String x = JOptionPane.showInputDialog("Approximatly how many radians are in 114 degrees?");
				if (x.equals("2")) {
					JOptionPane.showMessageDialog(null, "Good Job");
				} else {
					JOptionPane.showMessageDialog(null, "You Failed");

					JOptionPane.showMessageDialog(null, "YOU FINISHED THE 3 Question MATH Quiz!");
				}
			}
		}
	}
}
