package gC_Lab14;

import java.util.Random;

public class RandomPlayer extends Player {

	// using the enumerator above

	// constructors so that the name we pass ends up being output

	// no argument constructor
	public RandomPlayer() {
		super();
	}

	// one argument constructor
	public RandomPlayer(String name) {
		super(name);
	}

	// this method has to be implemented
	// we override to guarantee the wonderfully Random result from
	// generateRoshambo()

	@Override
	public Roshambo generateRoshambo() {

		Random rand = new Random();

		int randomThrow = rand.nextInt(3);

		if (randomThrow == 0) {
			return Roshambo.ROCK;
		}
		if (randomThrow == 1) {
			return Roshambo.PAPEL;

		}
		if (randomThrow == 2) {
			return Roshambo.TIJERAS;

		}
		return generateRoshambo();

	}

}
