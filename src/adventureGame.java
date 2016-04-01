import java.util.Scanner;//import the scanner class

public class adventureGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Welcome! What is your name? (enter your name):");
		String name = input.nextLine();

		System.out.println("Would you like to play a game? (enter 'yes' or 'no':");
		String play = input.nextLine();
		int gameOn = 1;
		String dragonName;
		while (play.equalsIgnoreCase("yes")) {
			switch (gameOn) {
			case 1:
				System.out.println(
						"Excellent! You are walking across a field and your encounter a fire-breathing dragon! What would you do? (enter 'face the beast' or 'run away':");
				String escapeDragon = input.nextLine();
				if (escapeDragon.equalsIgnoreCase("face the beast")) {
					gameOn = 2;
				} else {
					System.out.println("You decided not to play with us!");
					play = "no";
				}
				break;
			case 2:
				System.out.println("You approach the dragon. You see that he has ___ heads. (enter '1' or '2' or '3':");
				int heads = Integer.parseInt(input.nextLine());
				if (heads == 3) {
					gameOn = 3;
				} else if(heads == 1){
					System.out.println("The one headed dragon is extinct!");
					play = "no";
				}else {
					System.out.println("You scared the two headed dragon away!");
					play = "no";
				break;
				}
			case 3:
				System.out.println(
						"No one has ever faced a 3-headed dragon before! Choose your weapon. (enter 'slingshot' or 'sword' or 'bow and arrow')");
				String weapon = input.nextLine();
				if (weapon.equalsIgnoreCase("bow and arrow")) {
					gameOn = 4;
				} else if((weapon.equalsIgnoreCase("slingshot"))){
					System.out.println("You aimed, fired and bagged your Dragon, Enjoy you BBQ!");
					play = "no";
				}else {
					System.out.println("The dragon and used it as a toothpick, you better run!!");
					play = "no";
				}
				break;
			case 4:
				System.out.println(
						"Armed with your bow and arrow, you approach the dragon. You can feel its fiery breath as you get closer. It stares at you with its ___ eyes. (enter 'red' or 'blue')");
				String eyes = input.nextLine();
				if (eyes.equalsIgnoreCase("red")) {
					gameOn = 5;
				} else {
					System.out.println("You scared the blue eyed dragon away!");
					play = "no";
				}
				break;
			case 5:
				System.out.println(
						"Oh thank goodness! Red-eyed dragons are friendly. You pet it and become friends. You name the dragon _____. ('enter a name':");
				dragonName = input.nextLine();
				System.out.println(name + " and " + dragonName + " live happily ever after.");
				play = "no";
				break;
			}

		}
	}
}
