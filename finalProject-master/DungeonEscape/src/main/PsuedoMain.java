package main;

import javax.swing.JOptionPane;

public class PsuedoMain {
	static int loopStop = 1;
	public static void main(String[] args) {
		
		game();
	}
	public static void game() {
		String choicePath, continueGame = "no";
		String puzzleItems1;
		loopStop = 0;
		continueGame = JOptionPane.showInputDialog("Pre-Start note words in all CAPS are options. Take "
				+ "If so type YES. ");
		if ("Yes".equalsIgnoreCase(continueGame)) {
			loopStop = 1;
		}
		else {
			System.exit(0);
	}
		do {
		JOptionPane.showMessageDialog(null, "You wake up in an unfamiliar room you have no idea how you got there.");
		JOptionPane.showMessageDialog(null, "You appear to have an empty backpack & amnesia you don’t like where"
				+ " you are now escape from what appears to be a dungeon.");
		JOptionPane.showMessageDialog(null, "You see two paths in front of you. One leads left and the "
				+ "other leads right.");
		choicePath = JOptionPane.showInputDialog("Please choose a path LEFT or RIGHT");
		
		if ("Left".equalsIgnoreCase(choicePath) || "l".equalsIgnoreCase(choicePath)) {
			StartLeft.mineTurtle();
			String push;
			push = JOptionPane.showInputDialog("Do you PRESS the button or KEEP it");
			if ("Press".equalsIgnoreCase(push)) {
				UniversalDeath.death();
			}
		}
		if("Right".equalsIgnoreCase(choicePath)) {
			RightPath.right();
		}
		PuzzleRoom1.puzzle();
		JOptionPane.showMessageDialog(null, "You see two more paths ahead of you, what is up with this labyrinth?");
		JOptionPane.showMessageDialog(null, "On the right you feel a mystical energy remenating.");
		JOptionPane.showMessageDialog(null, "On the left you see something faintly glimmering.");
		puzzleItems1 = JOptionPane.showInputDialog("Which way do you choose LEFT or RIGHT");
		if ("Right".equalsIgnoreCase(puzzleItems1)) {
			PuzzleShield.item();
			DecievingEnemy.enemy();
			PocketKnife.item();
		}
		if ("Left".equalsIgnoreCase(puzzleItems1)) {
			KeyRoom.item();
		}
		}while(loopStop == 1);
	}
	public static void win() {
		String continueGame = "no";
		continueGame = JOptionPane.showInputDialog("You have beaten the game do you wish to try for a"
				+ "different ending? YES or NO");
		if ("Yes".equalsIgnoreCase(continueGame)) {
			game();	
		}
		else {
			System.exit(0);
		}
		
	}
	public static void continueChoice() {
		String yesNo;
		yesNo = JOptionPane.showInputDialog("Do you wish to continue? YES or NO.");
		if ("Yes".equalsIgnoreCase(yesNo)) {
			loopStop = 1;
		}
		else {
			System.exit(0);

		}

	}
}