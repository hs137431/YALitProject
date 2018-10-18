package main;

import javax.swing.JOptionPane;

public class UniversalWin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		win();
	}
	public static void win() {
		JOptionPane.showMessageDialog(null, "The door lead to an exit you are now "
				+ "free to suffer at the will of the world rather than the dungeon master.");
		JOptionPane.showMessageDialog(null, "That is until he hits you on the head and drags you back into the begining");
		PsuedoMain.continueChoice();
	}
	public static void fightwin() {
		JOptionPane.showMessageDialog(null, "you are finaly free of the dungeon \nuntil someone knocks you unconscious and drags you back to the start");
	
	}
}
