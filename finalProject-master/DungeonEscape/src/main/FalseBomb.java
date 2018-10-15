package main;

import javax.swing.JOptionPane;

public class FalseBomb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		puzzle();
	}
	public static void puzzle() {
		int loopStop = 0;
		String choice;
		JOptionPane.showMessageDialog(null, "You walk into a room you see a bomb in the middle.");
		JOptionPane.showMessageDialog(null, "You start shaking as you see a door but it is closed");
		JOptionPane.showMessageDialog(null, "You walk up to the bomb you see 2 Red Wires 4 Green Wires 7 White Wires"
				+ " 3 Black Wires \n & 1 wire labeled 'random crits are fair and balanced' it is blue");
		choice = JOptionPane.showInputDialog("It seems you have to disarm the bomb to leave. "
				+ "Which wire do you cut RED, GREEN, WHITE, BLACK, or CRIT");
		if ("Crit".equalsIgnoreCase(choice)) {
			JOptionPane.showMessageDialog(null, "You cut the crit wire and it blows up in a glowing blue explosion you see"
					+ " the words Random Crit in the air as you turn into ashes");
			loopStop = 1;
			UniversalDeath.death();
		}
		else
		if ("Red".equalsIgnoreCase(choice) || "Green".equalsIgnoreCase(choice) || 
				"White".equalsIgnoreCase(choice) || "Black".equalsIgnoreCase(choice)) {
			JOptionPane.showMessageDialog(null, "You cut the " + choice + " wire and the bomb explodes you into ashes");
			loopStop = 1;
			UniversalDeath.death();
		}
		else
		if ("Leave".equalsIgnoreCase(choice) || "Exit".equalsIgnoreCase(choice) || "Escape".equalsIgnoreCase(choice)) {
			JOptionPane.showMessageDialog(null, "You open the door and realize it wasn't locked");
			loopStop = 1;
			UniversalWin.win();
			
		}
		else
		if (loopStop == 0) {
			puzzle();
		}
	}
}
