package gC_Lab14;

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

		// we should return a random result from the Roshambo enumerator
		return null;
	}

}
