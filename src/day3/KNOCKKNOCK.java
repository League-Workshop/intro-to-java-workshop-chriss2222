package day3;

import javax.swing.JOptionPane;

public class KNOCKKNOCK {
	public static void main(String[] args) {	
	String joke = JOptionPane.showInputDialog("knock knock");
	if (joke.equals("who's there")){	
		String joke2 = JOptionPane.showInputDialog("boo");
			if (joke2.equals("boo who"));
			speak("why are you crying its just a joke");
			speak("HAHAHAHAHAHA!");
	}
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}