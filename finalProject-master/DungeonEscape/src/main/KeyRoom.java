package main;

import javax.swing.JOptionPane;

public class KeyRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		item();
	}
	public static void item() {
		String choice;
		String deathChoice;
		JOptionPane.showMessageDialog(null, "You find a golden key with a skull design on the base of it, just looking"
				+ " at it you feel like it \n might fall apart it’s probably only going to work for one door.");
		JOptionPane.showMessageDialog(null, "As you look around you find not only a door but a hole in the wall that "
				+ "looks like you could climb through and a keyhole.");
		choice = JOptionPane.showInputDialog("You must make a choice do you \n1 climb through the hole in the wall \n2 "
				+ "Use the key on the keyhole \n3 You walk through the open door.");
		if ("1".equalsIgnoreCase(choice)) {
			JOptionPane.showMessageDialog(null, "For whatever reason you walk through the hole in the wall when an odor "
					+ "hits your nose, you try to go back but you get a bit stuck");
			JOptionPane.showMessageDialog(null, "The walls must slowly be closing you continue to move towards the odor"
					+ " and it gets shorter and you have to crawl you soon encounter that there is a large pit with"
					+ "\nspikes, skeletons, and a dead body that must be the cause of the odor you feel your feet getting "
					+ "cramped.");
			deathChoice = JOptionPane.showInputDialog("You see only two paths ahead of you do you JUMP or STAY and get "
					+ "get crushed");
			if ("Jump".equalsIgnoreCase(deathChoice)) {
				JOptionPane.showMessageDialog(null, "You jump out of the closing tunnel and you land on the spikes and "
						+ "are forced to deal with the pain of bleeding out with rotting bodies.");
			UniversalDeath.death();
			}
			else {
				JOptionPane.showMessageDialog(null, "You stay in the tunnel and slowly feel all your bones breaking start"
						+ "ing with your feet and moving on to your legs until it gets to your torso then you finally "
						+ "die");
			}
		}
		if ("2".equals(choice)) {
			SecretRoom.puzzle();
		}
		if ("3".equals(choice)) {
			DecievingEnemy.enemy();
		}
	}
}
