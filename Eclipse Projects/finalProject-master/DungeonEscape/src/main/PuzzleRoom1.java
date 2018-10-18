package main;

import javax.swing.JOptionPane;

public class PuzzleRoom1 {
	public static String choice;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		puzzle();
	}
	public static void puzzle() {
		
		JOptionPane.showMessageDialog(null, "This room seems decrepit and old the door tries to close behind you but short"
				+ " circuits and as you walk forward you hear a small explosion.");
		JOptionPane.showMessageDialog(null, "You turn around just in time to see rocks fall to close the door "
				+ "behind you.");
		JOptionPane.showMessageDialog(null, "There is a sign that says make the water green and put it on the pedestal.");
		JOptionPane.showMessageDialog(null, "On top of the pedestal is a green glass bottle.");
		JOptionPane.showMessageDialog(null, "In the corner is what appears to be a small broken pipe "
				+ "constantly spewing water out. ");
		JOptionPane.showMessageDialog(null, "You grab the green bottle.");
		choice();
		
	}
	public static void choice() {
		choice = JOptionPane.showInputDialog("You have 3 Options \n1 Use Bottle \n2 "
				+ "Use the Mine Turtle \n3 Use your hands to put water on the pedestal");
		if ("1".equals(choice)) {
			JOptionPane.showMessageDialog(null, "You fill the Green Bottle with water and place it on the pedestal");
			JOptionPane.showMessageDialog(null, "The pedestal hums for a second and then the door clicks open you proceed");
		}
		if ("2".equals(choice)) {
			JOptionPane.showMessageDialog(null, "You press the button and you get consumed in the resulting explosion");
			UniversalDeath.death();
		}
		if ("3".equals(choice)) {
			JOptionPane.showMessageDialog(null, "You hear a voice booming in your ears "
					+ "'I don't know what you were trying to do but it didn't work'");
			choice();
		}
	}
}
