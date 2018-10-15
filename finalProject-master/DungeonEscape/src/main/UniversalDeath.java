package main;

import javax.swing.JOptionPane;

public class UniversalDeath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		death();
	}
	public static void death() {
		JOptionPane.showMessageDialog(null, "Congratulations! You died in the dungeon but somehow you feel it isn't over");
		PsuedoMain.continueChoice();
	}
}
