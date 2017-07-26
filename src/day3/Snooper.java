package day3;

import javax.swing.JOptionPane;

import jdk.nashorn.internal.scripts.JO;

public class Snooper {
	public static void main(String[] args) {
	String SSID = JOptionPane.showInputDialog("What is your SSID?");
	String Password =JOptionPane.showInputDialog("What is your Password for your Email");
	JOptionPane.showMessageDialog(null, "Your SSID number is"+ SSID);
	JOptionPane.showMessageDialog(null, "Your Email password is"+ Password);
	JOptionPane.showMessageDialog(null, "Thank For your cooperation");
}

}
