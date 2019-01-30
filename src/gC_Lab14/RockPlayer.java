package gC_Lab14;

// this is a concrete class
// you have to have to add the unimplemented method 
////// if you make rock player abstract you can push off
////// the responsibility for making this method down to its subclasses
public class RockPlayer extends Player {

// using the enumerator above 

// constructors so that the name we pass ends up being output 
// no argument constructor
	public RockPlayer() {
		super();
	}

// one argument constructor 
	public RockPlayer(String name) {
		super(name);
	}

// this method has to be implemented
// we override to guarantee the result of ROCK from generateRoshambo 
	@Override
	public Roshambo generateRoshambo() {

// we should return rock because this player always plays ROCK
		return Roshambo.ROCK;

	}
}
