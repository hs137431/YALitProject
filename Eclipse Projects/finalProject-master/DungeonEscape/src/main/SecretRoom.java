package main;

import javax.swing.JOptionPane;

public class SecretRoom {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		puzzle();
	}
	public static void puzzle() {
		String solution;
		
		//answers are secret and coffin
		JOptionPane.showMessageDialog(null, "You walk into the room and the door closes behind you.");
		JOptionPane.showMessageDialog(null, "You hear the voice booming in your ears again");
		solution = JOptionPane.showInputDialog("'I have two riddles for you to leave you must answer one'"
				+ "\n1 If you have me you want to share me. If you share me you won't have me. What am I?"
				+ "\n2 The first man makes me but doesn't use me, the second man sells me but doesn't need me, the "
				+ "third man uses me but doesn't know it what am I?");
		if ("Secret".equalsIgnoreCase(solution) || "Coffin".equalsIgnoreCase(solution)) {
			JOptionPane.showMessageDialog(null, "You are correct");
			UniversalWin.win();
		}
		else {
			JOptionPane.showMessageDialog(null, "You have a heart attack there must have been something that sets it up to"
					+ " kill you when you fail");
			UniversalDeath.death();
		}
	}
}
