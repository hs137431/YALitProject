package Main;
import javax.swing.JOptionPane;
public class Main {
	static int loopStop = 1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		game();
	}
	public static void game() {
		String choicePath, continueGame = "no";
		int stage = 1;
		loopStop = 0;
		String advanceText = "no";
		continueGame = JOptionPane.showInputDialog("Pre-Start note words in all CAPS are options. This "
				+ "game is based on the book series The Maze Runner by: James Dashner. The section available is that from the "
				+ "third book in the series called The Death Cure. If you understand type YES");
		if ("Yes".equalsIgnoreCase(continueGame)) {
			loopStop = 1;
		}
		else {
			System.exit(0);
	}
		String backStory = "YES";
		do {
		backStory = JOptionPane.showInputDialog(null, "Do you wish to hear a summary of the story up to the point this game takes place?"
				+ " Warning it is a bit of an info dump YES or NO");
		if ("YES".equalsIgnoreCase(backStory)) {
			System.out.println( "Background: You are Thomas you woke up one day in this huge expansive oasis of sorts "
					+ " surrounded by large stone walls. In this area there were about 20 other kids in there they introduced you to it and"
					+ "  said it was called the glade. The area beyond it was a maze that changed every night and was filled with these purple "
					+ " monsters with mechanical limbs designed to kill that came out after the maze closed for the night called Grievers. "
					+ " You are an oddball as you remembered your name right away. One week after you showed up the first girl ever showed");
			System.out.println("up with a note saying, “This is the last one ever” This is also the first time that it didn’t take a month to "
					+ " have someone new show up. She also remembers her name Teresa and you figure out you can telepathically "
					+ " communicate to one another and become close friends. You and some of the other gladers made it to the end "
					+ " but there was one that was acting strange His name was Gally and he murdered your best friend chuck so you "
					+ " beat him till he died, or so you thought. Then when you escaped some soldiers came to rescue you they put "
					+ " you on a bus to a compound where they told you that you would be safe until they could get backup, this ");
			System.out.println("area was in a desert but it was sheltered and cool. They feed you and your friends and allow you all a "
					+ " shower and fresh change of clothes and watches to tell time Teresa being the only girl gets put in a "
					+ " separate room. The next morning you wake up trapped in the room and the windows are broken with burned "
					+ " people screaming “I’m a crank kill me!” at you. When you break down the door you saw the soldiers hanging "
					+ " in the room. And the name card to Teresa’s room says Teresa “The Betrayer.” They bust in there and meet a "
					+ " person from “Group B” who says his name is Aris they talk to him and Thomas learns he can talk to him "
					+ " telepathically too and learn everyone has a tattoo unique to them, saying property of WICKED an organization "
					+ " you learned created the maze you escaped and some people have a special message. Everyone reads theirs and ");
			System.out.println("eventually you find that your friend Minho has one saying he is the leader. Yours says “To be killed by Group B.” "
					+ " Eventually when y’all go to get some sleep the corpses in the room you were just in are gone and the door "
					+ " you entered with the soldiers is gone too. When you go back to the room you slept in the windows are bricked "
					+ " in. The next day there is a man with a ratty looking face sitting at a desk reading a book and you slam into an "
					+ " invisible wall walking up to him. Then your friends tell you that there is an invisible wall and that he has "
					+ " something important to say. He tells you that you have made it through the first trial and that there is another ");
			System.out.println("in a place called the scorch, full of heat and cranks. That they need to head north several miles after finding "
					+ " “open air.”  To get there the flat trans the silver square behind him will be there for 5 minutes and they will "
					+ " need to go through or they will die. They go through and find a voice saying go back or get sliced which ends up "
					+ " meaning a hot metal gloop will encase your head and cut off your head and turn solid. Then they go to a town and "
					+ " find that there is a group of cranks not gone insane yet and they agree that the leader and their right hand woman "
					+ " can guide them. They take them to get food and then the rest of their group catches on and thinks their being "
					+ " deserted and explode the tunnel they are in. All of your group and Jorge the leader escape outside and you and ");
			System.out.println("Brenda the right hand woman escape through tunnels. Eventually you end up on the surface. You find a plaque that "
					+ " reads “Thomas is the real leader.” Some cranks take you to their club and kidnap you as they are interrogating "
					+ " you, your friends show up and subdue them. As you’re leaving you warn them they have a gun. They sneak up as"
					+ "  you make your escape and shoot you in the shoulder and you collapse. You drifted in and out of consciousness "
					+ " the thought infection crosses your mind, WICKED intervenes and cures it and patches up your wound. Then shortly ");
			System.out.println("after you get back you are kidnapped by Group B. You talk them out of killing you but eventually Teresa and Aris "
					+ "tell you they need to speak to you in private. They lead you to a chamber and tell you they need you to get in "
					+ " to be sacrificed to WICKED you resist but they make you go anyways. It gasses you and they apologize but they"
					+ "  were told that WICKED would kill everyone if not to put him in there. They eventually get to the safe zone and"
					+ "  pods open up releasing weird monsters with glowing bulbs which you quickly learn is their energy source and"
					+ "  pop easily. Then an airship takes you to WICKED’s hq where they keep you in a white room for days then reunite"
					+ "  you with your friends.");
		}
		advanceText = JOptionPane.showInputDialog("Check the console and when you are ready to continue type CONTINUE");
		if (advanceText.equalsIgnoreCase("Continue")) {
		System.out.println("WICKED tells you and your friends who is and is not immune the only one you do know that isn’t "
				+ "  immune is Newt. They then tell you all that you all are being given a choice to get your memories back or not. "
				+ " Most people agree but you and your friends Minho, and Newt agree together to not have your memories back because "
				+ " you do not trust WICKED. Ratman who tells you his name is Jansen tells you that it’s ok you have till you get to "
				+ " your room to change your mind, and that this a one time opportunity. You get to your room and a reunited with your "
				+ " friend Brenda who pulls you into a hug and tells you not to trust WICKED. You reinform Jansen that you do not wish "
				+ " to receive your memories back and your friends agree. He says alright then security is on it’s way. Then you and "
				+ " your friends whisper to each other to discuss breaking out. You will each take a guard the moment you get a chance. "
				+ " There are 5 of them all holding an odd gun. Just then Jansen pipes in, ‘These guards are armed with launchers they "
				+ " will not kill you unless they hit your head and they will disable you and you will experience the 5 most uncomfortable "
				+ " minutes of your life. You are escorted through the maze like halls to a holding cell with 2 bunk beds so there is a "
				+ " spare bed. They take you back to the operation room the next day and Jansen tells you ‘There is too much to explain "
				+ " so I’m making the decision you are getting your memories back.’ Brenda gives you a sad look, and you get on the table "
				+ " there is no way you can overpower the guards. Brenda goes to get a syringe of anesthetic once the guards hold you down. "
				+ " On her way back to you she trips and injects one of the guards holding you down.");
		advanceText = "no";
		}
		choicePath = JOptionPane.showInputDialog("Please choose do you wish to FIGHT for freedom or STAY");
		
		if ("STAY".equalsIgnoreCase(choicePath) || "l".equalsIgnoreCase(choicePath)) {
			JOptionPane.showMessageDialog(null, "You stay still and then Brenda is taken away and you are no longer trusted at all by WICKED.");
			Death.death();
			continueGame = JOptionPane.showInputDialog("Do you wish to continue? YES or NO");
			if ("No".equalsIgnoreCase(continueGame)) {
				System.exit(0);
			}
		}
		String secondChoice = "Blank";
		System.out.println("With you and Brenda armed with launchers you go to rescue Minho and Newt. You bust in and see Jansen. Before you"
				 + "react two guards are already shot by Brenda. Minho tackles the last guard and ties him up. You also nab Jansen’s Keycard");
				advanceText = JOptionPane.showInputDialog("Check the console and when you are ready to continue type CONTINUE");
				if (advanceText.equalsIgnoreCase("Continue")) {
				secondChoice = JOptionPane.showInputDialog("Do you want to SHOOT Jansen or LEAVE him");
				advanceText = "No";
				}
		if(secondChoice.equalsIgnoreCase("Fight")) {
			System.out.println("You chose to shoot Jansen with your launcher and you watch him spasm and collapse on the ground. ");
		}
		if(secondChoice.equalsIgnoreCase("Leave")) {
			System.out.println("You leave Jansen in the room, and while you start making your escape you feel a sharp pain in your side. "
					+ "Jansen stabbed you, maybe you shouldn’t have left him. He kidnaps you and threatens your life if your followed.");
			Death.death();
			continueGame = JOptionPane.showInputDialog("Do you wish to continue? YES or NO");
			if ("No".equalsIgnoreCase(continueGame)) {
				System.exit(0);
		}
		}
		String thirdChoice = "blank";
		System.out.println("You start making your way around when you find the armory which has a few guards grabbing gear. You and "
				+ "Brenda shoot one. Minho tackles another and takes their launcher and turns it on them. Newt punches the last guard "
				+ "in the mouth. They start to say something and Newt shoots them with his newly acquired launcher. Before you raid the");
				System.out.println("armory Brenda points out that there are missing spots of dust which is odd considering that all the "
						+ "guards have launchers all the time and the armory is a weapon reserve more than anything, there are also guns "
						+ "missing as well as several launchers. ");
				advanceText = JOptionPane.showInputDialog("Check the console and when you are ready to continue type CONTINUE");
				if (advanceText.equalsIgnoreCase("Continue")) {
					thirdChoice = JOptionPane.showInputDialog("You arm yourselves to the teeth with guns and launchers and then proceed"
							+ "to make a decision do you TAKE the one guard not incapacitated or do you KNOCK them out with a launcher too.");
					advanceText = "no";
				}
				if (thirdChoice.equalsIgnoreCase("Knock")) {
					System.out.println("You knock the guard out and proceed towards the hangar which Brenda tells you is where Jorge "
							+ "should be to fly you guys away. As you get to a door to a lobby on the way to the hangar an alarm sounds, "
							+ "the lights shut off, and there are red emergency lights flashing.");
				}
				if (thirdChoice.equalsIgnoreCase("Take")) {
					System.out.println("You knock the guard out and proceed towards the hangar which Brenda tells you is where Jorge "
							+ "should be to fly you guys away. As you get to a door to a lobby on the way to the hangar an alarm sounds, "
							+ "the lights shut off, and there are red emergency lights flashing.");
				}
				System.out.println("You enter the lobby and see a bunch of guards incapacitated on the floor. "
						+ "You cautiously make your way into the hangar. As you enter you see 3 spots for bergs "
						+ "and only one is empty. You search around for Jorge and find him in the corner behind a large "
						+ "crate just waking up. He tells you that everyone else escaped and they knocked him out, but they "
						+ "came in after the alarm started going off. They took another pilot and berg but they were not the "
						+ "cause of the alarm a group of Cranks must have broken in. You then take the berg and leave WICKED’s hq.");
				String endChoice = "no";
				endChoice =JOptionPane.showInputDialog("You completed this game congratulations. Do you wish the end the program? YES or NO");
				if(endChoice.equalsIgnoreCase("Yes")) {
					System.exit(0);
				}
}while(loopStop == 1);
	}
}



	