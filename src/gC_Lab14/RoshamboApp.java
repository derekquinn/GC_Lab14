package gC_Lab14;

import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {

		String playerName;
		String oppName;
		String otraVez = "yes";
		int lucyWin = 0;
		int lucyLoss = 0;
		int chupaWin = 0;
		int chupaLoss = 0;
		int humanWin = 0;
		int humanLoss = 0;

		Scanner scnr = new Scanner(System.in);

		System.out.println("Cual es tu nombre? ");
		playerName = scnr.nextLine();

		while (otraVez.startsWith("y")) {

			System.out.println("Con quien quieres jugar? Chupacabra o Loco Lucy?");
			oppName = scnr.nextLine();

			while (!(oppName.equalsIgnoreCase("Chupacabra") || oppName.equalsIgnoreCase("Loco Lucy"))) {
				System.err.println("Chupacabra y Loco Lucy están deseando jugar, por favor elija uno de ellos");
				oppName = scnr.nextLine();
			}

// passing scanner over when making a new console player so now it has access to scanner

			Player human = new ConsolePlayer(scnr, playerName);
			Roshambo humanChoice = human.generateRoshambo();
			System.out.println(human.getName() + " Tira " + humanChoice);

// if player faces LOCO LUCY this path of CRAZY conditional statements is followed 

			if (oppName.equalsIgnoreCase("Loco Lucy")) {
// create the RANDOM player
				Player opponentRandom = new RandomPlayer("Loco Lucy");
// get the RANDOM player's choice 
				Roshambo randomChoice = opponentRandom.generateRoshambo();
// TEST output RANDOM choice 
				System.out.println(opponentRandom.getName() + " tira " + randomChoice);

				if (humanChoice == Roshambo.PAPEL && randomChoice == Roshambo.TIJERAS) {
					System.out.println("Loco Lucy es el ganador!");
					lucyWin++;
					humanLoss++;

				} else if (humanChoice == Roshambo.PAPEL && randomChoice == Roshambo.ROCK) {
					System.out.println(playerName + " es el ganador!");
					humanWin++;
					lucyLoss++;

				} else if (humanChoice == Roshambo.PAPEL && randomChoice == Roshambo.PAPEL) {
					System.out.println("No hay ganador!");

				} else if (humanChoice == Roshambo.ROCK && randomChoice == Roshambo.TIJERAS) {
					System.out.println(playerName + " es el ganador!");
					humanWin++;
					lucyLoss++;

				} else if (humanChoice == Roshambo.ROCK && randomChoice == Roshambo.PAPEL) {
					System.out.println("Loco Lucy es el ganador!");
					lucyWin++;
					humanLoss++;

				} else if (humanChoice == Roshambo.ROCK && randomChoice == Roshambo.ROCK) {
					System.out.println("No hay ganador!");

				} else if (humanChoice == Roshambo.TIJERAS && randomChoice == Roshambo.ROCK) {
					System.out.println("Loco Lucy es el ganador!");
					lucyWin++;
					humanLoss++;

				} else if (humanChoice == Roshambo.TIJERAS && randomChoice == Roshambo.PAPEL) {
					System.out.println(playerName + " es el ganador!");
					humanWin++;
					lucyLoss++;

				} else if (humanChoice == Roshambo.TIJERAS && randomChoice == Roshambo.TIJERAS) {
					System.out.println("No hay ganador!");
				}

			}

// if player faces CHUPCACABRA this path of (less) crazy conditional statements is followed 
			if (oppName.equalsIgnoreCase("Chupacabra"))

			{

// create the ROCK player's choice
				Player opponentRock = new RockPlayer("Chupacabra");

// get the ROCK player's choice
				Roshambo rockChoice = opponentRock.generateRoshambo();

// Output the ROCK choice
				System.out.println(opponentRock.getName() + " Tira " + rockChoice);

				if (humanChoice == Roshambo.PAPEL) {
					System.out.println(playerName + " es el ganador!");
					humanWin++;
					chupaLoss++;

				} else if (humanChoice == Roshambo.TIJERAS) {
					System.out.println("Chupacabra es el ganador!");
					chupaWin++;
					humanLoss++;

				} else if (humanChoice == Roshambo.ROCK) {
					System.out.println("No hay ganador!");
				}

			}

			System.out.println("Quieres jugar un otra vez?");
			otraVez = scnr.nextLine();

			if (otraVez.startsWith("n")) {
				
				System.out.println("Gracias para tu jugando! ");
				System.out.println("=================STANDINGS==============");
				System.out.println(playerName + " record: " + humanWin + " - " + humanLoss);
				System.out.println("Chupacabra record: " + humanWin + " - " + humanLoss);
				System.out.println("Loco lucy record: " + lucyWin +" - " + lucyLoss);
			}

		}
	}

}
