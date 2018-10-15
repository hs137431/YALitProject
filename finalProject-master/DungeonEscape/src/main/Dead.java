package main;

import javax.swing.JOptionPane;

public class Dead {
	static String choice5;
	public static void main(String[] args) {
		Death();
	}
		
	public static void Death() {
		JOptionPane.showMessageDialog(null, "YOU DIED");
		choice5 = JOptionPane.showInputDialog("Would you like to continue yes or no ");
		if("YES".equalsIgnoreCase(choice5)) {
			PsuedoMain.game();
		}
		if ("No".equalsIgnoreCase(choice5)){
			System.exit(0);
		}
		
	}
	public static void finish() {
		choice5 = JOptionPane.showInputDialog("Would you like to try again yes or no ");
		if("YES".equalsIgnoreCase(choice5)) {
			PsuedoMain.game();
		}
		if ("No".equalsIgnoreCase(choice5)){
			System.exit(0);
		}
		
	}

}
