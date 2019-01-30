package gC_Lab14;

// this is an abstract class 
public abstract class Player {

// field aka instance variable
	private String name;

// concrete subclasses must override / implement this method 
	public abstract Roshambo generateRoshambo();

// getters for name
	public String getName() {
		return name;
	}

//setters for name
	public void setName(String name) {
		this.name = name;
	}

// constructors for name
// lets me provide a name 
	public Player(String name) { // overloaded constructor
		super();
		this.name = name;
	}

// constructor  with no arugments
	public Player() {
	}

	@Override
	public String toString() {
		return "Player [name=" + name + "]";
	}

}
