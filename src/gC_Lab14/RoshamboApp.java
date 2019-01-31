package gC_Lab14;

import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {

		String playerName;

		Scanner scnr = new Scanner(System.in);

		System.out.println("Cual es tu nombre? ");
		playerName = scnr.nextLine(); 
		
		
		

// passing scanner over when making a new console player so now it has access to scanner
		Player human = new ConsolePlayer(scnr, "Tio");
		Roshambo humanChoice = human.generateRoshambo();
		System.out.println(human.getName() + " tira " + humanChoice);

// create the RANDOM player
		Player opponentRandom = new RandomPlayer("Loco Lucy");
// get the RANDOM player's choice 
		Roshambo randomChoice = opponentRandom.generateRoshambo();

// create the ROCK player's choice 
		Player opponentRock = new RockPlayer("Chupacabra");

// get the ROCK player's choice 
		Roshambo rockChoice = opponentRock.generateRoshambo();

// TEST output the ROCK choice 
		System.out.println(opponentRock.getName() + " tira " + rockChoice);

// TEST output RANDOM choice 

		System.out.println(opponentRandom.getName() + " tira " + randomChoice);
	}

}
