package main;

import javax.swing.JOptionPane;

public class RightPath {
    static boolean windDagger = false;
    static boolean lightSpear = false;
	static String attack;
	static int random;
	static boolean player = true;
	static boolean enemy = true;
	public static void main (String [] args) {
		

	}


	public static void right() {
		JOptionPane.showMessageDialog(null, "You decided to go right and the door slams shut behind you.");
		String choice2 = JOptionPane.showInputDialog("Do you PROCEED or WAIT");
		
		
		if ("WAIT".equalsIgnoreCase(choice2)) {
			JOptionPane.showMessageDialog(null, "you can see the other door now matches the wall.");
			JOptionPane.showMessageDialog(null, "you should continue forward");
			dagger();
		}

		else if ("PROCEED".equalsIgnoreCase(choice2)) {
			JOptionPane.showMessageDialog(null, "You proceed down a long empty coridor that lookes to have walls made");
			JOptionPane.showMessageDialog(null, "out of stone and steel you eventualy come apon a room");
			dagger();
			
		}
		skeleton();
		
			JOptionPane.showMessageDialog(null, "you exit the room in triumph and proceed down the hall");
			JOptionPane.showMessageDialog(null, "at the end of the hall was a old rusted iron door\n it seems like it would not budge but when you push on it it moves easily");
			Spear();
			JOptionPane.showMessageDialog(null,"you proceed down a hall lined with book shelves");
			JOptionPane.showMessageDialog(null, "you enter a room resembling a library");
			JOptionPane.showMessageDialog(null, "a book case slides in plase behind you closeing off your escape route ");
			library();
			JOptionPane.showMessageDialog(null, "after going thruogh the door you come across an empty room");
			finalPuzzle();
		
				
			}
	
/////////////////////////////!!!Treasures!!!/////////////////////////////////////////////////////////////////////////
	public static void dagger() {
		
		 JOptionPane.showMessageDialog(null, "There was a very vibrant energy coming from the center of this room	");
		JOptionPane.showMessageDialog( null, "on a pedestal there was a dagger with a curved blade" );
		String choice3 = JOptionPane.showInputDialog("would you like to PICK UP the dagger or LEAVE it");
		if ("LEAVE".equalsIgnoreCase(choice3)) {
			JOptionPane.showMessageDialog(null, "you choose to leave the dagger behind and procced out the exit");
			JOptionPane.showMessageDialog(null, "after exiting the door it shuts and locks behind you");
		}
		if("PICK UP".equalsIgnoreCase(choice3)) {
			JOptionPane.showMessageDialog(null, "you decided to pick up the dagger it crackles with energy");
			JOptionPane.showMessageDialog(null, "as you procced to the exit you feel a gentle breeze");
			JOptionPane.showMessageDialog(null, "after exiting the room the door shuts and locks behind you");
			windDagger = true;
		}
	}
	public static void Spear() {
		
		 JOptionPane.showMessageDialog(null, "There was a bright crackling energy coming from the center of this room	");
			JOptionPane.showMessageDialog( null, "impaled into the ground was a black iron spear with bright sparks coming off of it" );
			String choice4 = JOptionPane.showInputDialog("would you like to PICK UP the Spear or LEAVE it");
			if ("LEAVE".equalsIgnoreCase(choice4)) {
				JOptionPane.showMessageDialog(null, "you choose to leave the Spear behind and procced out the exit");
				JOptionPane.showMessageDialog(null, "after exiting the door it shuts and locks behind you");
			}
			if("PICK UP".equalsIgnoreCase(choice4)) {
				JOptionPane.showMessageDialog(null, "you decided to pick up the dagger it crackles with electricity");
				JOptionPane.showMessageDialog(null, "as you procced to the exit you feel a strong breeze");
				JOptionPane.showMessageDialog(null, "after exiting the room the door shuts and locks behind you");
				lightSpear = true;
			}
	}
		
	
	
//////////////////////////!!!!!BATTLES GO HERE!!!!!/////////////////////////////////////////////////////////////////////
	public static void skeleton() {
		JOptionPane.showMessageDialog(null, "you walk into a small room with a skeleton holding a spork");
		JOptionPane.showMessageDialog(null, "there was peice of paper that went out the way you came in it got disintegrated");
		JOptionPane.showMessageDialog(null, "instantly, you realize there’s no going back that way.");
		attack = JOptionPane.showInputDialog("Do you want to ATTACK the skeleton\nDo you want to RUN past the skeleton\n do you want to try to SPOOK the skeleton");
		if("ATTACK".equalsIgnoreCase(attack) ) {
		do {
			random = 1 + (int)(Math.random() * 100);
			
			if(windDagger = true) {
				if(random < 90 && random > 50) {
					
					JOptionPane.showMessageDialog(null, "you won the fight by hiting the skeleton in the head");
					enemy = false;
				}
				else if(random <= 50 && random >=11) {
					JOptionPane.showMessageDialog(null, "you hit the wall next to the skeliton and miss");
					JOptionPane.showMessageDialog(null, "you stepped back out of the skeletons range");
					enemy = true;
				}
				
				else if(random <= 10) {
					JOptionPane.showMessageDialog(null, "you somehow not only missed but hit the floor");
					JOptionPane.showMessageDialog(null, "the skeleton hits you while your down");
					enemy = false;
					Dead.Death();
					
				}
			}
				if (windDagger = false) {
					if(random < 100 && random > 70) {
						JOptionPane.showMessageDialog(null, "you won the fight by hiting the skeleton in the head");
						enemy = false;
					}
					else if(random <= 70 && random >=31) {
						JOptionPane.showMessageDialog(null, "you hit the wall next to the skeleton and miss");
						JOptionPane.showMessageDialog(null, "you stepped back out of the skeleton's range");
						enemy = true;
					}
					else if(random <= 30) {
						JOptionPane.showMessageDialog(null, "you somehow not only missed but hit the floor");
						JOptionPane.showMessageDialog(null, "the skeleton hits you while your down");
						enemy = false;
						Dead.Death();		
				}		
		   }
			}while(enemy);
		}
				if ("RUN".equalsIgnoreCase(attack)) {
					JOptionPane.showMessageDialog(null, "youturn to run and the skeleton attacks you");
					Dead.Death();
			
		 }
				if("Spook".equalsIgnoreCase(attack)) {
					JOptionPane.showMessageDialog(null, "the skeleton finds your atemt funny then procceeds to spook you");
					JOptionPane.showMessageDialog(null, "the skeleton spooks you to death");
					Dead.Death();
		}
		}
		
			static void library() {
				JOptionPane.showMessageDialog(null, "There was a vulture flying around the library you just walked into.\n the vulture looks excited and eager to meet his new victim."
						+ " \nYou think of maybe taking a book and throwing it at it in hopes to knock it out at the very least.");
				
				JOptionPane.showMessageDialog(null, "The vulture has a keycard strapped to it’s leg so you have to fight it.");
				attack = JOptionPane.showInputDialog("Do you want to try to JUMP and attack it\nDo you want to throw a BOOK at it\n do you want to throw your SPEAR at it");
				if("Jump".equalsIgnoreCase(attack) ) {
				do {
					random = 1 + (int)(Math.random() * 100);
					
					if(windDagger = true) {
						if(random < 100 && random > 90) {
							
							JOptionPane.showMessageDialog(null, "you won the fight by hiting the vulture with your dagger");
							enemy = false;
						}
						else if(random <= 90 && random >=71) {
							JOptionPane.showMessageDialog(null, "you jump but the vulture is still flying too high");
							JOptionPane.showMessageDialog(null, "you land on the ground and continue fighting");
							enemy = true;
						}
						
						else if(random <= 70) {
							JOptionPane.showMessageDialog(null, "you jump but don't hit the vultue and it slashes you with its talons");
							JOptionPane.showMessageDialog(null, "you die from bleeding out");
							
							enemy = false;
							Dead.Death();
							
						}
					}
						if (windDagger = false) {
							if(random < 100 && random > 99) {
								JOptionPane.showMessageDialog(null, "you won the fight by hiting the vulture with your fist");
								enemy = false;
							}
							else if(random <= 98 && random >=80) {
								JOptionPane.showMessageDialog(null, "you jump but the vulture is still flying too high");
								JOptionPane.showMessageDialog(null, "you land on the ground and continue fighting");
								enemy = true;
							}
							else if(random <= 79) {
								JOptionPane.showMessageDialog(null, "you jump but don't hit the vultue and it slashes you with its talons");
								JOptionPane.showMessageDialog(null, "you die from bleeding out");
								
								enemy = false;
								Dead.Death();
										
						}		
				   }
					}while(enemy);
				}
						if ("book".equalsIgnoreCase(attack)) {
							JOptionPane.showMessageDialog(null, "you throw the book and the vulture ceches it and throws it at your head");
							JOptionPane.showMessageDialog(null, "the heavy book hits you in the head knocking you out");
							Dead.Death();
					
				 }
						if("spear".equalsIgnoreCase(attack)) {
							JOptionPane.showMessageDialog(null, "you throw the spear at it killing it apon contact");
							JOptionPane.showMessageDialog(null, "you grab the keycard off its leg and open the exit");
							
				}
				}
//////////////////////////////////////////////////////////!!!Puzzle Room!!!//////////////////////////////////////////////////////////////////////
			static void finalPuzzle() {
				JOptionPane.showMessageDialog(null, "you find that the room is empty exept one light dangling from the celing");
				do {
				JOptionPane.showMessageDialog(null, "what are you going to do?");
				String choiceFinal = JOptionPane.showInputDialog("Will you WALK around aimlessly\n ATTACK the light fixture\n TURN AROUND and go back to the library\n walk BACKWARDS back into the library");
				if("WALK".equalsIgnoreCase(choiceFinal)) {
					JOptionPane.showMessageDialog(null, "you walk arould aimlessly for 6 hours and it seems nothing is going to happen");
					player = true;
				}
				if("ATTACK".equalsIgnoreCase(choiceFinal)) {
					JOptionPane.showMessageDialog(null, "you hit the light fixture and the light breaks now its dark");
					player = true;
				}
				if("TURN AROUND".equalsIgnoreCase(choiceFinal)) {
					JOptionPane.showMessageDialog(null, "you head back into the library and pull books"
							+ "\n off the shelves to see if it will unlock a secret exit");
					JOptionPane.showMessageDialog(null, "unfortunately this is a budget dungen becase the dundgon master couldn't aford them"
							+ "\nyou head back into the empty room to think about what to do next");
					player = true;
				}
				if("BACKWARDS".equalsIgnoreCase(choiceFinal)) {
				JOptionPane.showMessageDialog(null, "you walked backwards out of the empty room and you come out not in the library\n but outside of the dungion entirely");
				Dead.finish();
				}
				
				}while(player);
			}
			}
	
	
	
	
	
		
		
	


